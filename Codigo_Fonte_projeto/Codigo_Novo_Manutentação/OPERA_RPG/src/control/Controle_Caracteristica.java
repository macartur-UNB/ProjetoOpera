package control;

import java.io.FileNotFoundException;
import java.io.IOException;
import model.classes.Caracteristica;
import model.classes.Caracteristica_Especifica;
import model.dao.DAO_Caracteristica;
import model.exception.ArquivoInvalidoException;
import model.exception.CaracteristicaInvalidaException;
import model.exception.DeletarInvalidoException;


public class Controle_Caracteristica {

    
    public static void cadCaracteristica(
    String nome,String descricao,String tipo,int custo)
                                      throws FileNotFoundException, IOException,
                                                       ArquivoInvalidoException,
                                                CaracteristicaInvalidaException{
       
        if(CaracteristicaExiste(nome)){
            throw new CaracteristicaInvalidaException("A Caracteristica { "+nome+" } ja Existe");
        }
        
        Caracteristica c = new Caracteristica(nome, descricao, tipo, custo);
        DAO_Caracteristica.gravarCaracteristica(c);        
    }
    
    public static void cadCaracteristica(
    String nome,String descricao,String tipo,int custo,int modificador[])
                                      throws FileNotFoundException, IOException,
                                                        ArquivoInvalidoException,
                                                CaracteristicaInvalidaException{
    
        if(CaracteristicaExiste(nome)){
            throw new CaracteristicaInvalidaException("A Caracteristica { "+nome+" } ja Existe");
        }
        
        Caracteristica c = new Caracteristica(nome, descricao, tipo, modificador,custo);
        DAO_Caracteristica.gravarCaracteristica(c);  
    }
    
    public static void cadCaracteristicaEspecifica(
    String nome_Especifico,String descricao_Especifica,
    String nome,String descricao,String tipo,int custo) 
    throws FileNotFoundException, IOException, ArquivoInvalidoException,
                                                CaracteristicaInvalidaException{
    
        Caracteristica ce = new Caracteristica_Especifica(
        nome_Especifico,descricao_Especifica,nome, descricao, tipo,custo);
        DAO_Caracteristica.gravarCaracteristica(ce);  
    }
    
    public static void cadCaracteristicaEspecifica(
    String nome_Especifico,String descricao_Especifica,
    String nome,String descricao,String tipo,int custo,int modificador[])
    throws FileNotFoundException,FileNotFoundException, IOException,IOException,
                      ArquivoInvalidoException, CaracteristicaInvalidaException{
        
        Caracteristica_Especifica ce;
        ce = new Caracteristica_Especifica(nome_Especifico, descricao_Especifica,
                                           nome, descricao, tipo, modificador,custo);
        DAO_Caracteristica.gravarCaracteristica(ce);  
    }
    
    
    public static Caracteristica encontrarCaracteristica(String nome,String tipo) 
            throws FileNotFoundException, ClassNotFoundException, IOException,
                                                       ArquivoInvalidoException{
            return DAO_Caracteristica.carregarCaracteristica(nome, tipo);
    }   
    
    public static Caracteristica_Especifica encontrarCaracteristica_Especifica(
    String nome,String tipo)
    throws FileNotFoundException, FileNotFoundException, IOException,
    IOException, ClassNotFoundException,
    ArquivoInvalidoException{
        return (Caracteristica_Especifica)DAO_Caracteristica.carregarCaracteristica(nome, tipo);
    }
    
    public static Caracteristica encontrarCaracteristica(String nome) 
    throws FileNotFoundException, ClassNotFoundException, IOException,
                                          IOException, ArquivoInvalidoException{
        if(Controle_Caracteristica.CaracteristicaExiste(nome, "Fisica")){
            return Controle_Caracteristica.encontrarCaracteristica(nome,"Fisica");
        }else
        if(Controle_Caracteristica.CaracteristicaExiste(nome, "Racial")){
            return Controle_Caracteristica.encontrarCaracteristica(nome,"Racial");
        }else
        if(Controle_Caracteristica.CaracteristicaExiste(nome, "Psiquica")){
            return Controle_Caracteristica.encontrarCaracteristica(nome,"Psiquica");
        }
        return null;
    }
    
    
    public static boolean CaracteristicaExiste(String nome,String tipo){
        return DAO_Caracteristica.CaracteristicaExiste(nome, tipo);
    }
    
    public static boolean CaracteristicaExiste(String nome){
        boolean status = false;
        if(CaracteristicaExiste(nome, "Fisica")  ||
           CaracteristicaExiste(nome,"Psiquica") ||
           CaracteristicaExiste(nome,"Racial")){
            status = true;
        }
        return status;      
    }
       
    public static void removeCaracteristicaFisica(String nome) 
                                   throws DeletarInvalidoException, IOException,
                                                       ArquivoInvalidoException{
        DAO_Caracteristica.removerCaracteristica(nome, "Fisica");
    }
    
    public static void removeCaracteristicaRacial(String nome) 
                                    throws DeletarInvalidoException, IOException,
                                                        ArquivoInvalidoException{
        DAO_Caracteristica.removerCaracteristica(nome, "Racial");
    }
    
    public static void removeCaracteristicaPsiquica(String nome)
                                   throws DeletarInvalidoException, IOException,
                                                       ArquivoInvalidoException{
        DAO_Caracteristica.removerCaracteristica(nome, "Psiquica");
    }
    
    public static void removeTodasCaracteristicasFisicas() 
                                   throws DeletarInvalidoException, IOException,
                                                       ArquivoInvalidoException{
        DAO_Caracteristica.removerTodasCaracteristicas("Fisica");
    }
    
    public static void removeTodasCaracteristicasPsiquicas() 
                                   throws DeletarInvalidoException, IOException,
                                                       ArquivoInvalidoException{
        DAO_Caracteristica.removerTodasCaracteristicas("Psiquica");
    }
    
    public static void removeTodasCaracteristicasRacial() 
                                   throws DeletarInvalidoException, IOException,
                                                       ArquivoInvalidoException{
        DAO_Caracteristica.removerTodasCaracteristicas("Racial");
    }   
    
    public static void removeTodasCaracteristicas() 
                                   throws DeletarInvalidoException, IOException,
                                                       ArquivoInvalidoException{
        removeTodasCaracteristicasFisicas();
        removeTodasCaracteristicasRacial();
        removeTodasCaracteristicasPsiquicas();
    }
    
    public static String[] listarCaracteristicasFisicas(){
       return DAO_Caracteristica.listarCaracteristicas("Fisica"); 
    }
    
    public static String[] listarCaracteristicasPsiquicas(){
        return DAO_Caracteristica.listarCaracteristicas("Psiquica");
    }
    
    public static String[] listarCaracteristicasRaciais(){
        return DAO_Caracteristica.listarCaracteristicas("Racial");
    }    
    
    
}
