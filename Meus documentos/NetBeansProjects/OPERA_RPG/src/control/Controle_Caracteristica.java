/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.FileNotFoundException;
import java.io.IOException;
import model.Caracteristica;
import model.Caracteristica_Especifica;


public class Controle_Caracteristica {
    
    private static Controle_Caracteristica instancia;
    private String endereco;
    public Controle_Caracteristica() {
    }

    public static Controle_Caracteristica getInstancia() {
        if(instancia == null){
            instancia = new Controle_Caracteristica();
        }
        
        return instancia;
    }
    
    
    public void cadCaracteristica(
    String nome,String descricao,String tipo,int custo)
    throws FileNotFoundException,FileNotFoundException, IOException, IOException{
       
        Caracteristica c = new Caracteristica(nome, descricao, tipo, custo);
        gravarCaracteristica(c);        
    
    }
    
    public void cadCaracteristica(
    String nome,String descricao,String tipo,int custo,int modificador[])
    throws FileNotFoundException,FileNotFoundException, IOException, IOException{
    
        Caracteristica c = new Caracteristica(nome, descricao, tipo, modificador,custo);
        gravarCaracteristica(c);
    
    }
    
    public void cadCaracteristicaEspecifica(
    String nome_Especifico,String descricao_Especifica,
    String nome,String descricao,String tipo,int custo) 
    throws FileNotFoundException,FileNotFoundException, IOException,IOException{
    
        Caracteristica c = new Caracteristica_Especifica(
        nome_Especifico,descricao_Especifica,nome, descricao, tipo,custo);
        gravarCaracteristica(c);        
    
    }
    
    public void cadCaracteristicaEspecifica(
    String nome_Especifico,String descricao_Especifica,
    String nome,String descricao,String tipo,int custo,int modificador[])
    throws FileNotFoundException,FileNotFoundException, IOException,IOException{
        
        Caracteristica_Especifica ce;
        ce = new Caracteristica_Especifica(nome_Especifico, descricao_Especifica,
                                           nome, descricao, tipo, modificador,custo);
        gravarCaracteristica(ce);
    }
    
    
    private void gravarCaracteristica(Caracteristica caracteristica)
    throws FileNotFoundException,FileNotFoundException, IOException,IOException{
        
        endereco = Controle_Jogo.getInstancia().enderecoJogoRodando()+"\\Caracteristicas\\"+caracteristica.getTipo()+"s\\";
        Controle_Diretorios.getInstancia().gravarArquivo(endereco, caracteristica.getNome(), caracteristica);
    
    }
    
    public Caracteristica encontrarCaracteristica(String nome,String tipo)
    throws FileNotFoundException, IOException, IOException, ClassNotFoundException{
    
        Caracteristica c;
        endereco = Controle_Jogo.getInstancia().enderecoJogoRodando()+"\\Caracteristicas\\"+tipo+"s\\";
        c = (Caracteristica) Controle_Diretorios.getInstancia().carregarArquivo(endereco, nome);
        return c;
    
    }   
    
    public Caracteristica_Especifica encontrarCaracteristica_Especifica(
    String nome,String tipo)
    throws FileNotFoundException, FileNotFoundException, IOException,
    IOException, ClassNotFoundException{
        return (Caracteristica_Especifica) encontrarCaracteristica(nome, tipo);
    }
    
    public boolean CaracteristicaExiste(String nome,String tipo){
        endereco = Controle_Jogo.getInstancia().enderecoJogoRodando()+"\\Caracteristicas\\"+tipo+"s\\";
        return Controle_Diretorios.getInstancia().arquivoExiste(endereco, nome);       
    }
    
    public boolean CaracteristicaExiste(String nome){
        boolean status = false;
        if(CaracteristicaExiste(nome, "Fisica")  ||
           CaracteristicaExiste(nome,"Psiquica") ||
           CaracteristicaExiste(nome,"Belica")){
            status = true;
        }
        return status;      
    }
    
    public void removeCaracteristicaFisica(String nome){
        removeCaracteristica(nome, "Fisica");
    }
    public void removeCaracteristicaBelica(String nome){
        removeCaracteristica(nome, "Belica");
    }
    public void removeCaracteristicaPsiquica(String nome){
        removeCaracteristica(nome, "Psiquica");
    }
    public void removeTodasCaracteristicasFisicas(){
            endereco = Controle_Jogo.getInstancia().enderecoJogoRodando()+"\\Caracteristicas\\Fisicas\\";
            Controle_Diretorios.getInstancia().deletarArquivos(endereco);
    }
    public void removeTodasCaracteristicasPsiquicas(){
            endereco = Controle_Jogo.getInstancia().enderecoJogoRodando()+"\\Caracteristicas\\Psiquicas\\";
            Controle_Diretorios.getInstancia().deletarArquivos(endereco);
    }
    public void removeTodasCaracteristicasBelicas(){
            endereco = Controle_Jogo.getInstancia().enderecoJogoRodando()+"\\Caracteristicas\\Belicas\\";
            Controle_Diretorios.getInstancia().deletarArquivos(endereco);
    }   
    public void removeTodasCaracteristicas(){
        removeTodasCaracteristicasFisicas();
        removeTodasCaracteristicasBelicas();
        removeTodasCaracteristicasPsiquicas();
    }
    public void removeCaracteristica(String nome,String tipo){
        endereco = Controle_Jogo.getInstancia().enderecoJogoRodando()+"\\Caracteristicas\\"+tipo+"s\\";
        Controle_Diretorios.getInstancia().removeArquivo(endereco, nome);  
    }
    
    public String[] listarCaracteristicasFisicas(){
        endereco = Controle_Jogo.getInstancia().enderecoJogoRodando()+"\\Caracteristicas\\Fisicas\\"; 
        return Controle_Diretorios.getInstancia().listarArquivos(endereco);
    }
    
    public String[] listarCaracteristicasPsiquicas(){
        endereco = Controle_Jogo.getInstancia().enderecoJogoRodando()+"\\Caracteristicas\\Psiquicas\\"; 
        return Controle_Diretorios.getInstancia().listarArquivos(endereco);
    }
    
    public String[] listarCaracteristicasBelicas(){
        endereco = Controle_Jogo.getInstancia().enderecoJogoRodando()+"\\Caracteristicas\\Belicas\\"; 
        return Controle_Diretorios.getInstancia().listarArquivos(endereco);
    }    
    
}
