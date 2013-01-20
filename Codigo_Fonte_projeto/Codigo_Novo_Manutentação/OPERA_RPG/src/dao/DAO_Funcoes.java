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


public class DAO_Funcoes {
    
    private FileInputStream arquivo_Entrada;
    private FileOutputStream arquivo_Saida;
    private ObjectInputStream objeto_Entrada;
    private ObjectOutputStream objeto_Saida;
    private File diretorio;
    private File arquivo;
    private boolean status;
    private static DAO_Funcoes instancia;

    public DAO_Funcoes() {
    }

    public static DAO_Funcoes getInstancia() {
        if(instancia == null){
            instancia = new DAO_Funcoes();
        }
        return instancia;
    }
    
    
    
    
    public boolean criarDiretorio(String endereco){
        status = false;
        diretorio = new File(endereco);
        status = diretorio.mkdir();
        return status;
    }
    
    public boolean removerDiretorio(String endereco){
        status = false;
        diretorio= new File(endereco);
        status = diretorio.delete();
        return status;
    }

    public boolean diretorioExiste(String endereco){
        diretorio = new File(endereco);
        return diretorio.exists();
    }
    public String[] listarDiretorios(String endereco){
        diretorio = new File(endereco);
        return diretorio.list();
    }
    
    public boolean arquivoExiste(String endereco,String nome_arquivo){
        status = false;
        diretorio = new File(endereco);
        arquivo = new File(diretorio,nome_arquivo+".opera");
        if(arquivo.exists()){
            status  = true;
        }
        return status;
    }
    
    public String[] listarArquivos(String endereco){
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
    
    private File[] retornarArquivos(String endereco){
        diretorio = new File(endereco);
        return diretorio.listFiles();     
    }
    
    
    public boolean removerArquivo(String endereco,String nome_arquivo){
        status = false;
        diretorio = new File(endereco);
        arquivo = new File(diretorio,nome_arquivo+".opera");
        if(arquivo.exists()){
            status = arquivo.delete();
        }    
        return status;
    }
    
    public void criarArquivo(String endereco,String nome_arquivo,Object objeto) throws FileNotFoundException
                                                                    , IOException{
        diretorio = new File(endereco);
        arquivo = new File(diretorio,nome_arquivo+".opera");
        
        arquivo_Saida = new FileOutputStream(arquivo);
        objeto_Saida = new ObjectOutputStream(arquivo_Saida);
        objeto_Saida.writeObject(objeto);
        
        arquivo_Saida.close();        
        objeto_Saida.close();
        
    }
    public Object carregarArquivo(String endereco,String nome_arquivo)
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
    
    public boolean deletarArquivos(String endereco){    
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

    
    
}
