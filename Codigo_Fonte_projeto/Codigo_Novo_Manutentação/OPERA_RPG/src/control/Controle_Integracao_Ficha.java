/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import model.classes.Caracteristica;
import model.classes.Ficha;
import model.classes.Habilidade;
import model.exception.ArquivoInvalidoException;
import model.exception.DeletarInvalidoException;
import model.exception.FichaInvalidaException;
import model.exception.HabilidadeInvalidaException;


public class Controle_Integracao_Ficha {
    
    private static Ficha ficha ; 
    private static ArrayList auxiliar;
    
    public static boolean selecionarFicha(String personagem) throws FileNotFoundException, ClassNotFoundException, IOException, ArquivoInvalidoException{
        if(!Controle_Ficha.FichaExiste(personagem))
        {
            return false;
        }
        ficha = Controle_Ficha.encontrarFicha(personagem);
        return true;
    }
    
    
    public static boolean colocarCaracteristica(String caracteristica) 
                        throws FileNotFoundException, IOException, IOException,
                               ArquivoInvalidoException, ClassNotFoundException,
                               DeletarInvalidoException, FichaInvalidaException{
            Caracteristica c;
            if(!Controle_Caracteristica.CaracteristicaExiste(caracteristica)){       
                return false;
            }
            c = Controle_Caracteristica.encontrarCaracteristica(caracteristica);
            auxiliar = ficha.getCaracteristicas();
            if(auxiliar == null)
            {
                auxiliar  = new ArrayList();
            }
            auxiliar.add(c);
            ficha.setCaracteristicas(auxiliar);
            Controle_Ficha.atualizarFicha(ficha);
            return true;
    }
    public static boolean removerCaracteristica(String caracteristica) 
                               throws FileNotFoundException, IOException,
                               ArquivoInvalidoException, ClassNotFoundException,
                               DeletarInvalidoException, FichaInvalidaException{
         Caracteristica c;
         
         if(!Controle_Caracteristica.CaracteristicaExiste(caracteristica)){       
                return false;
            }
         c = Controle_Caracteristica.encontrarCaracteristica(caracteristica);
         auxiliar = ficha.getCaracteristicas();
         if(auxiliar==null){
             return false;
         }
         auxiliar.remove(c);
         ficha.setCaracteristicas(auxiliar);
         Controle_Ficha.atualizarFicha(ficha);
         return true;
    }
    
    
    public static String[] listarCaracteristicas(){
        String caracteristicas[] ;
        int aux=0;
        auxiliar = ficha.getCaracteristicas();
        if(auxiliar == null){
            return null;
        }
        caracteristicas = new String[auxiliar.size()];
        Iterator i = auxiliar.iterator();
        while(i.hasNext()){
            Caracteristica c = (Caracteristica)i.next();
            caracteristicas[aux] = c.getNome();      
            aux++;
        }
        return caracteristicas;
    }
    
    public static boolean colocarHabilidade(String habilidade) 
                     throws HabilidadeInvalidaException, ClassNotFoundException,
                     IOException, FileNotFoundException, ArquivoInvalidoException,
                     ArquivoInvalidoException, DeletarInvalidoException,
                                                         FichaInvalidaException{
            Habilidade h;
            if(!Controle_Habilidade.HabilidadeExiste(habilidade)){ 
                return false;
            }
            h = Controle_Habilidade.encontrarHabilidade(
                    habilidade,Controle_Habilidade.getTipoHabildiade(habilidade));
            auxiliar = ficha.getHabilidades();
            if(auxiliar == null)
            {
                auxiliar  = new ArrayList();
            }
            auxiliar.add(h);
            ficha.setHabilidades(auxiliar);
            Controle_Ficha.atualizarFicha(ficha);
            return true;
    
    }
   
    public static boolean removerHabilidade(String habilidade) 
            throws FileNotFoundException, IOException, ArquivoInvalidoException,
            ArquivoInvalidoException, HabilidadeInvalidaException,
            ClassNotFoundException{
         Habilidade h;
         
         if(!Controle_Habilidade.HabilidadeExiste(habilidade)){
                return false;
            }
         h = Controle_Habilidade.encontrarHabilidade(habilidade, Controle_Habilidade.getTipoHabildiade(habilidade));
         auxiliar = ficha.getHabilidades();
         if(auxiliar==null){
             return false;
         }
         auxiliar.remove(h);
         ficha.setHabilidades(auxiliar);
         Controle_Ficha.atualizarFicha(ficha);
         return true;
    }
    
    public static String[] listarHabilidades(){
        String habilidades[] ;
        int aux=0;
        auxiliar = ficha.getHabilidades();
        if(auxiliar == null){
            return null;
        }
        habilidades = new String[auxiliar.size()];
        Iterator i = auxiliar.iterator();
        while(i.hasNext()){
            Habilidade h = (Habilidade)i.next();
            habilidades[aux] = h.getNome();      
            aux++;
        }
        return habilidades;
    }
    
    public static void colocarItem(){}
    public static void removerItem(){}
    public static void equiparItem(){}
    public static void desequiparItem(){}
    
    
}
