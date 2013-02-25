package control;

import java.io.FileNotFoundException;
import java.io.IOException;
import model.classes.Habilidade;
import model.dao.DAO_Habilidade;
import model.exception.ArquivoInvalidoException;
import model.exception.DeletarInvalidoException;
import model.exception.HabilidadeInvalidaException;

/**
 *
 * @author Macartur
 */
public class Controle_Habilidade {

    public static void cadHabilidade(int teste, int nivel, int custo, 
                                     String nome,String tipo)
                                      throws FileNotFoundException, IOException, 
                                             ArquivoInvalidoException, 
                                                    HabilidadeInvalidaException{
       
        if(HabilidadeExiste(nome)){
            throw new HabilidadeInvalidaException("A Habilidade {"+nome+
                                                                 "} ja Existe");
        }
        
        Habilidade h = new Habilidade(teste, nivel, custo, nome, tipo);
        DAO_Habilidade.gravarHabilidade(h);        
    }    
        
    public  static Habilidade encontrarHabilidade(String nome,String tipo) 
                                                   throws FileNotFoundException, 
                                                          ClassNotFoundException, 
                                                          IOException, 
                                                       ArquivoInvalidoException{
            return DAO_Habilidade.carregarHabilidade(nome, tipo);
    }    
    
    public static  boolean HabilidadeExiste(String nome,String tipo){
        return DAO_Habilidade.HabilidadeExiste(nome, tipo);
    }
    
    public static  boolean HabilidadeExiste(String nome){
        boolean status = false;
        if(HabilidadeExiste(nome, "Fisica")  ||
           HabilidadeExiste(nome,"Psiquica") ||
           HabilidadeExiste(nome,"Belica")){
            status = true;
        }
        return status;      
    }
    
    public static String getTipoHabildiade(String nome) 
                                             throws HabilidadeInvalidaException{
        String habilidade = "Habilidade Nao Existe";
        if(HabilidadeExiste(nome, "Fisica")){
            habilidade = "Fisica";
        }
        if(HabilidadeExiste(nome, "Psiquica")){
            habilidade = "Psiquica";
        }
        if(HabilidadeExiste(nome, "Belica")){
            habilidade = "Belica";
        }
        
        if(habilidade.equals("Habilidade Nao Existe")){
            throw new HabilidadeInvalidaException("A Habilidade: " + nome + 
                                                                ", Nao Existe.");
        }else{
            return habilidade;
        }
    }
       
    public static  void removeHabilidadeFisica(String nome) 
                                                throws ArquivoInvalidoException, 
                                                       DeletarInvalidoException, 
                                                                    IOException{
        DAO_Habilidade.removerHabilidade(nome, "Fisica");
    }
    
    public static  void removeHabilidadeBelica(String nome)
                                                throws ArquivoInvalidoException, 
                                                       DeletarInvalidoException, 
                                                                    IOException{
        DAO_Habilidade.removerHabilidade(nome, "Belica");
    }
    
    public static  void removeHabilidadePsiquica(String nome) 
                                                throws ArquivoInvalidoException, 
                                                       DeletarInvalidoException, 
                                                                    IOException{
        DAO_Habilidade.removerHabilidade(nome, "Psiquica");
    }
    
    public static  void removeTodasHabilidadesFisicas() 
                                                throws ArquivoInvalidoException, 
                                                       DeletarInvalidoException, 
                                                                    IOException{
        DAO_Habilidade.removerTodasHabilidades("Fisica");
    }
    
    public static  void removeTodasHabilidadesPsiquicas() 
                                                throws ArquivoInvalidoException, 
                                                       DeletarInvalidoException, 
                                                                    IOException{
        DAO_Habilidade.removerTodasHabilidades("Psiquica");
    }
    
    public  static void removeTodasHabilidadesBelicas() 
                                                throws ArquivoInvalidoException, 
                                                       DeletarInvalidoException, 
                                                                    IOException{
        DAO_Habilidade.removerTodasHabilidades("Belica");
    }   
    
    public  static void removeTodasHabilidades() 
                                                throws ArquivoInvalidoException, 
                                                       DeletarInvalidoException, 
                                                                    IOException{
        removeTodasHabilidadesFisicas();
        removeTodasHabilidadesBelicas();
        removeTodasHabilidadesPsiquicas();
    }
    
    public  static String[] listarHabilidadesFisicas(){
       return DAO_Habilidade.listarHabilidades("Fisica"); 
    }
    
    public static  String[] listarHabilidadesPsiquicas(){
        return DAO_Habilidade.listarHabilidades("Psiquica");
    }
    
    public static  String[] listarHabilidadesBelicas(){
        return DAO_Habilidade.listarHabilidades("Belica");
    }    
    
}
