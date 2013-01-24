/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import exception.ArquivoInvalidoException;
import exception.DeletarInvalidoException;
import exception.DiretorioInvalidoException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class DAO_Funcoes {

    private DAO_Funcoes(){
        
    }
    
    /**
     * Cria um Novo Dretorio
     * @param endereco Endereco do Diretorio a ser Criado
     * @throws DiretorioInvalidoException
     */
    public static void criarDiretorio(String endereco) throws DiretorioInvalidoException{
        File diretorio = new File(endereco);
        if(!diretorio.mkdir()){
            throw new DiretorioInvalidoException("O Diretorio - " + diretorio.getName() + " - ja existe ou"
                    + " nao pode ser criado.");
        }
    }
    
    /**
     * Remover um Diretorio
     * @param endereco Endereco do Diretorio a ser Deletado
     * @throws DiretorioInvalidoException
     */
    public static void removerDiretorio(String endereco) throws DiretorioInvalidoException, DeletarInvalidoException{
        
        File diretorio = new File(endereco);
        
        if(diretorio.exists()){
            deletarDiretorios_E_Arquivos(diretorio);
        }
    }

    /**
     * Verificar Existencia de um Diretorio
     * @param endereco Endereco do Diretorio a ser verificado
     * @return TRUE se o diretorio existe; FALSE se o diretorio nao existe
     */
    public static boolean diretorioExiste(String endereco){
        File diretorio = new File(endereco);
        if(diretorio.isDirectory()){
            return diretorio.exists();
        }else{
            return false;
        }
    }
    
    /**
     * Listar o Conteudo contido no Diretorio
     * @param endereco Endereco do Diretorio a ser Listado
     * @return Vetor de String contendo o nome de cada conteudo no diretorio
     */
    public static String[] listarDiretorio(String endereco){
        File diretorio = new File(endereco);
        
        File files[] = diretorio.listFiles();
        
        int indice = 0;
        
        for(int i = 0; i < files.length; i++){
            if(files[i].isDirectory()){
                indice++;
            }
        }
        
        if(indice > 0){
            String diretorios[] = new String[indice];
            indice = 0;
            for(int i = 0; i < files.length; i++){
                if(files[i].isDirectory()){
                    diretorios[indice] = files[i].getName();
                    indice++;
                }
            }
            
            return diretorios;
            
        }else{
            return null;
        }
    }
    
    /**
     * Verificar Existencia de um Arquivo
     * @param endereco Endereco do Diretorio que contem o arquivo
     * @param nome_arquivo Nome do Arquivo a ser Verificado
     * @return TRUE se o arquivo existe; FALSE se o arquivo nao existe
     */
    public static boolean arquivoExiste(String endereco,String nome_arquivo){
        File diretorio = new File(endereco);
        if(!nome_arquivo.endsWith(".opera")){
            nome_arquivo += ".opera";
        }
        File arquivo = new File(diretorio,nome_arquivo);
        if(arquivo.isFile()){
            return arquivo.exists();
        }else{
            return false;
        }
    }
    
    /**
     * Listar Arquivos OPERA em um Diretorio
     * @param endereco Diretorio a ser listado os Arquivos
     * @return Vetor com os Arquivos Opera
     */
    public static String[] listarArquivosOpera(String endereco){
        String arquivos[] = listarDiretorio(endereco);
        String arquivosOpera[];
        int indice = 0;
        
        if(arquivos == null) {
            return null;
        }
        
        for(int i = 0; i < arquivos.length; i++){            
            if(arquivos[i].endsWith(".opera")){
                indice++;
            }
        }
        arquivosOpera = new String[indice];
        indice = 0;
        for(int i = 0; i < arquivos.length; i++){            
            if(arquivos[i].endsWith(".opera")){
                arquivosOpera[indice] = arquivos[i];
                indice++;
            }
        }
        return arquivosOpera;
    }
    
    /**
     * Remover um Arquivo
     * @param endereco Endereco do Arquivo a ser Removido
     * @param nome_arquivo Nome do Arquivo a ser Removido
     * @throws DeletarInvalidoException 
     */
    public static void removerArquivo(String endereco, String nome_arquivo) 
            throws DeletarInvalidoException{
        
        File diretorio = new File(endereco);
        File arquivo = new File(diretorio, nome_arquivo);
        if(arquivo.isFile()){
            if(!arquivo.delete()) {
                throw new DeletarInvalidoException("O Arquivo - " + nome_arquivo + " - nao existe ou"
                        + " nao pode ser deletado. Verifique se algum programa"
                        + " esta utilizando esse diretorio.");
            }
        }
    }
    
    /**
     * Criar Novo Arquivo Opera
     * @param endereco Endereco do Arquivo a ser Criado
     * @param nomeObjeto Nome do Objeto a ser Criado o Arquivo
     * @param objeto Objeto a ser Gravado no Arquivo
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void criarArquivoOpera(String endereco, String nomeObjeto, 
            Object objeto) throws FileNotFoundException, IOException, ArquivoInvalidoException{
        
        File diretorio = new File(endereco);
        File arquivo = new File(diretorio, nomeObjeto+".opera");
        
        if(!arquivo.createNewFile()){
            throw new ArquivoInvalidoException("O arquivo - " + nomeObjeto + " - nao pode ser criado");
        }
        
        FileOutputStream fos = new FileOutputStream(arquivo);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        oos.writeObject(objeto);
        
        fos.close();
    }
    
    /**
     * Sobrescrever Arquivos Opera
     * @param endereco Endereco do Arquivo a ser Sobrescrito
     * @param nomeObjeto Nome do Objeto a ser Sobrescrito
     * @param objeto Objeto a ser Sobrescrito
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void sobrescreverArquivoOpera(String endereco, String nomeObjeto, 
            Object objeto) throws FileNotFoundException, IOException{
        
        File diretorio = new File(endereco);
        File arquivo = new File(diretorio, nomeObjeto+".opera");
        
        if(arquivoExiste(endereco, arquivo.getName())){
            FileOutputStream fos = new FileOutputStream(arquivo);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(objeto);

            fos.close();
        }
    }
    
    /**
     * Carregar Arquivo
     * @param endereco Endereco do Arquivo
     * @param nome_arquivo Nome do Arquivo (PS: Nao utilize a extensao ".opera"
     * no parametro "nome_arquivo"
     * @return Objeto contido no Arquivo
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ClassNotFoundException 
     */
    public static Object carregarArquivoOpera(String endereco, String nome_arquivo) 
            throws FileNotFoundException, IOException, ClassNotFoundException{
        
        File diretorio = new File(endereco);
        File arquivo = new File(diretorio, nome_arquivo+".opera");
        
        FileInputStream fis = new FileInputStream(arquivo);
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        Object objeto = ois.readObject();
        
        ois.close();
        fis.close();
        
        return objeto;
    }
    
    /**
     * Deletar Arquivos
     * @param endereco Endereco que contem os Arquivos a serem Deletados
     * @throws DeletarInvalidoException 
     */
    public static void deletarArquivos(String endereco) throws DeletarInvalidoException{    
        String[] arquivos = listarArquivosOpera(endereco);
        
        for(int i = 0; i < arquivos.length; i++){
            removerArquivo(endereco,arquivos[i]);
        }
    }

    /**
     * Deletar Diretorios
     * @param endereco Endereco do Diretorio a ser Deletado
     * @throws DeletarInvalidoException
     * @throws DiretorioInvalidoException 
     */
    private static void deletarDiretorio(String endereco) 
            throws DeletarInvalidoException, DiretorioInvalidoException{
        
        File diretorio= new File(endereco);
        if(!diretorio.delete()){
            throw new DiretorioInvalidoException("O Diretorio -" + diretorio.getName() + "- nao existe ou"
                    + " nao pode ser deletado. Verifique se algum programa"
                    + " esta utilizando esse diretorio, ou utilizando algo"
                    + " contido nesse diretorio.");
        }
        
    }
    
    /**
     * Deletar Diretorios e Arquivos
     * @param diretorio Endereco do Diretorio a ser Deletado. Deleta todos os
     * Diretorios e arquivos nele contido
     * @throws DeletarInvalidoException
     * @throws DiretorioInvalidoException 
     */
    private static void deletarDiretorios_E_Arquivos(File diretorio) 
            throws DeletarInvalidoException, DiretorioInvalidoException{
        
        File arquivos[] = diretorio.listFiles();
        
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
