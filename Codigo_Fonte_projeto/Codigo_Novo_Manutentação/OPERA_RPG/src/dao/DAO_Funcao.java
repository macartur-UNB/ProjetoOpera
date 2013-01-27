/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import exception.*;

public class DAO_Funcao {
    
    private static FileInputStream arquivo_Entrada;
    private static FileOutputStream arquivo_Saida;
    private static ObjectInputStream objeto_Entrada;
    private static ObjectOutputStream objeto_Saida;
    private static File diretorio;
    private static File arquivo;
    private static boolean status;
   
    
    public static void criarDiretorio(String endereco) throws DiretorioInvalidoException{
        diretorio = new File(endereco);
       if(!diretorio.mkdir()){
           throw new DiretorioInvalidoException("O Diretorio - " + diretorio.getName() + " - ja existe ou"
                    + " nao pode ser criado.");
       }
    }
    
    public static void removerDiretorio(String endereco)
            throws DeletarInvalidoException,
              DiretorioInvalidoException, IOException, ArquivoInvalidoException{
        diretorio= new File(endereco);
        if(diretorio.exists()){
            deletarDiretorios_E_Arquivos(diretorio);
        }
    }

    public static boolean diretorioExiste(String endereco){
        diretorio = new File(endereco);
        if(diretorio.isDirectory()){
            return diretorio.exists();
        }else{
            return false;
        }
    }
    public static String[] listarDiretorios(String endereco){
        diretorio = new File(endereco);
        return diretorio.list();
    }
    
    public static boolean arquivoExiste(String endereco,String nome_arquivo){
        status = false;
        diretorio = new File(endereco);
        arquivo = new File(diretorio,nome_arquivo+".opera");
        if(arquivo.exists()){
            status  = true;
        }
        return status;
    }
    
    public static String[] listarArquivos(String endereco){
        File[] f = retornarArquivos(endereco);
        if(f == null){
            return null;
        }
        String s[] = new String[f.length];
        for(int i = 0;i < f.length;i++){
              String s_completo = f[i].getName();
              s[i] = s_completo.replace(".opera", "");
        }
        return s;
    }
    
    private static File[] retornarArquivos(String endereco){
        diretorio = new File(endereco);
        return diretorio.listFiles();     
    }
    
    
    public static void removerArquivo(String endereco,String nome_arquivo) 
                                                throws ArquivoInvalidoException{
         diretorio = new File(endereco);
        arquivo = new File(diretorio,nome_arquivo+".opera");
        if(arquivo.exists()){
            status = arquivo.delete();
        }    
        if(status==false){
             throw new ArquivoInvalidoException("O Arquivo - " + nome_arquivo
                    + " nao pode ser deletado. "
                    + "Verifique se esta sendo usado em outro processo");
        }
    }
    
    public static void criarArquivo(String endereco,String nome_arquivo,Object objeto) 
                                       throws FileNotFoundException, IOException{
        diretorio = new File(endereco);
        arquivo = new File(diretorio,nome_arquivo+".opera");
        
        arquivo_Saida = new FileOutputStream(arquivo);
        objeto_Saida = new ObjectOutputStream(arquivo_Saida);
        objeto_Saida.writeObject(objeto);
        
        arquivo_Saida.close();        
        objeto_Saida.close();
        
    }
    public static Object carregarArquivo(String endereco,String nome_arquivo)
                                    throws FileNotFoundException,IOException,
                                                    ClassNotFoundException{
        Object o;
        diretorio = new File(endereco);
        arquivo = new File(diretorio,nome_arquivo+".opera");
        arquivo_Entrada = new FileInputStream(arquivo);
        objeto_Entrada = new ObjectInputStream(arquivo_Entrada);
        o = objeto_Entrada.readObject();
         
        arquivo_Entrada.close();
        objeto_Entrada.close();
        
        return o;
    }
    
    public static boolean deletarArquivos(String endereco) throws ArquivoInvalidoException{    
        diretorio = new File(endereco);
        String[] arquivos = listarArquivos(endereco);
   
        if(arquivos == null){
            return false;
        }            
        for(int i=0; i < arquivos.length;i++){
                removerArquivo(endereco,arquivos[i]);
        }
        return true;
    }
     private static void deletarDiretorio(String endereco) 
            throws DeletarInvalidoException, DiretorioInvalidoException{
        
        diretorio= new File(endereco);
        if(!diretorio.delete()){
            throw new DiretorioInvalidoException("O Diretorio -" + diretorio.getName() + "- nao existe ou"
                    + " nao pode ser deletado. Verifique se algum programa"
                    + " esta utilizando esse diretorio, ou utilizando algo"
                    + " contido nesse diretorio.");
        }
        
    }
    
    private static void deletarDiretorios_E_Arquivos(File diretorio) 
            throws DeletarInvalidoException, DiretorioInvalidoException, IOException, ArquivoInvalidoException{
        
        File[] arquivos = diretorio.listFiles();
        
        for(int i = 0; i < arquivos.length; i++){
            removerArquivo(diretorio.getAbsolutePath(), arquivos[i].getName());
        }
        
        String diretorios[] = diretorio.list();
        diretorio.getAbsolutePath();
        for(int i = 0; i < diretorios.length; i++){
            deletarDiretorios_E_Arquivos(new File(diretorio.getAbsolutePath() + "\\" + diretorios[i]));
        }
        
        deletarDiretorio(diretorio.getAbsolutePath());
    }
    
    
    
    
}
