/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import model.classes.Arma;
import model.classes.Armadura;
import model.classes.Ficha;
import model.classes.Item;
import model.exception.ArquivoInvalidoException;
import model.exception.FichaInvalidaException;
import model.exception.ItemInvalidoException;


public class Controle_Combate {
     
    static Ficha ficha = null;
    static ArrayList auxiliar;
    
    public static void selecionarFicha(String personagem) 
                           throws FileNotFoundException, ClassNotFoundException,
                                  ArquivoInvalidoException, ArquivoInvalidoException,
                                            IOException, FichaInvalidaException{
        if(!Controle_Ficha.FichaExiste(personagem))
        {
            throw new FichaInvalidaException("Personagem {"+personagem+"} nao Existe");
        }
        ficha = Controle_Ficha.encontrarFicha(personagem);
    }
    public static Ficha pegarFicha(){
        return ficha;
    }
    
    
    public static boolean usandoAlgumaArma(){
        return usandoArma(ficha.getArmasADistancia())|| usandoArma(ficha.getArmasCorpoACorpo());           
    }
    
    public static boolean usandoArma(ArrayList colecao){
        Iterator i = colecao.iterator();
        while(i.hasNext()){
            Arma arma = (Arma)i.next();
            if(arma.isUsando()){
                return true;
            }
        }
        return false;
    }
    
    public static boolean equiparArmaCorpoACorpo(String nomeArma) 
                                      throws FileNotFoundException, IOException,
                                             ArquivoInvalidoException,
                                                          ItemInvalidoException, ItemInvalidoException, ItemInvalidoException{
        if(usandoAlgumaArma()){
              return false;
        }
        auxiliar = ficha.getArmasCorpoACorpo();  
        if( auxiliar == null||auxiliar.isEmpty()){
            return false;
        }
        if(!Controle_Integracao_Ficha.contemItem(auxiliar, nomeArma)){
           throw  new ItemInvalidoException("Não contem o item = {"+nomeArma+"} na ficha");
        }
        auxiliar = equiparItem(auxiliar, nomeArma);
        ficha.setArmasCorpoACorpo(auxiliar);
        Controle_Ficha.atualizarFicha(ficha);
        return true;
    }
    public static boolean desequiparArmaCorpoACorpo(String nomeArma) throws ItemInvalidoException, FileNotFoundException, IOException, ArquivoInvalidoException {
        auxiliar = ficha.getArmasCorpoACorpo();  
        if( auxiliar == null||auxiliar.isEmpty()){
            return false;
        }
        if(!Controle_Integracao_Ficha.contemItem(auxiliar, nomeArma)){
           throw  new ItemInvalidoException("Não contem o item = {"+nomeArma+"} na ficha");
        }
        auxiliar = desequiparItem(auxiliar, nomeArma);
        ficha.setArmasCorpoACorpo(auxiliar);
        Controle_Ficha.atualizarFicha(ficha);
        return true;
    }
    public static boolean equiparArmaADistancia(String nomeArma) 
                        throws FileNotFoundException, ArquivoInvalidoException,
                                             IOException, ItemInvalidoException{
          if(usandoAlgumaArma()){
              return false;
          }
          auxiliar = ficha.getArmasADistancia();
          if( auxiliar == null||auxiliar.isEmpty()){
            return false;
          }
          if(!Controle_Integracao_Ficha.contemItem(auxiliar, nomeArma)){
              throw  new ItemInvalidoException("Não contem o item = {"+nomeArma+"} na ficha");
          }
          auxiliar = equiparItem(auxiliar,nomeArma);
          ficha.setArmasADistancia(auxiliar);
          Controle_Ficha.atualizarFicha(ficha);
          return true;
    }
    
     public static boolean desequiparArmaADistancia(String nomeArma) 
                        throws FileNotFoundException, ArquivoInvalidoException,
                                             IOException, ItemInvalidoException{
          auxiliar = ficha.getArmasADistancia();
          if( auxiliar == null||auxiliar.isEmpty()){
            return false;
          }
          if(!Controle_Integracao_Ficha.contemItem(auxiliar, nomeArma)){
              throw  new ItemInvalidoException("Não contem o item = {"+nomeArma+"} na ficha");
          }
          auxiliar = desequiparItem(auxiliar,nomeArma);
          ficha.setArmasADistancia(auxiliar);
          Controle_Ficha.atualizarFicha(ficha);
          return true;
    }
    
    
    public static boolean equiparItemGenerico(String item) 
                                      throws FileNotFoundException, IOException,
                                             ArquivoInvalidoException,
                                                          ItemInvalidoException{
        auxiliar = ficha.getItensGenericos();
        if( auxiliar == null||auxiliar.isEmpty()){
            return false;
        }
        if(!Controle_Integracao_Ficha.contemItem(auxiliar, item)){
            throw  new ItemInvalidoException("Não contem o item = {"+item+"} na ficha");
        }
        auxiliar = equiparItem(auxiliar,item);
        ficha.setArmasADistancia(auxiliar);
        Controle_Ficha.atualizarFicha(ficha);
        return true;
    }
    
    public static boolean desequiparItemGenerico(String item) 
                                      throws FileNotFoundException, IOException,
                                             ArquivoInvalidoException,
                                                          ItemInvalidoException{
        auxiliar = ficha.getItensGenericos();
        if( auxiliar == null||auxiliar.isEmpty()){
            return false;
        }
        if(!Controle_Integracao_Ficha.contemItem(auxiliar, item)){
            throw  new ItemInvalidoException("Não contem o item = {"+item+"} na ficha");
        }
        auxiliar = desequiparItem(auxiliar,item);
        ficha.setArmasADistancia(auxiliar);
        Controle_Ficha.atualizarFicha(ficha);
        return true;
    }
    
    public static ArrayList equiparItem(ArrayList colecao, String nomeItem){
        Iterator i = colecao.iterator();
        while(i.hasNext()){
            Item item = (Item) i.next();
            if(item.getNome().equals(nomeItem)){
                if(item.getHabilidade_Necessaria()==null){
                    item.setUsando(true);
                }else                
                if(Controle_Integracao_Ficha.contemHabilidade(ficha.getHabilidades(),
                                                   item.getHabilidade_Necessaria())){
                    item.setUsando(true);
                }
            }
        }
        return colecao;
    }
   
    public static ArrayList desequiparItem(ArrayList colecao,String nomeItem){
        Iterator i = colecao.iterator();
        while(i.hasNext()){
            Item item = (Item)i.next();
            if(item.getNome().equals(nomeItem)){
                item.setUsando(false);
            }
        }
        return colecao;
    }
    
    
    
    public static boolean equiparArmadura(String nomeArmadura) 
                         throws FileNotFoundException, ArquivoInvalidoException,
                                                                    IOException{
        auxiliar = ficha.getArmaduras(); 
        if(auxiliar == null){
            return false;
        }
        if(!Controle_Integracao_Ficha.contemItem(auxiliar, nomeArmadura)){
            return false;
        }
        Iterator i = auxiliar.iterator();
        while(i.hasNext()){
            Armadura armadura= (Armadura) i.next();
            if(armadura.getNome().equals(nomeArmadura) &&
               !verificarUsandoNaRegicao_Do_Corpo(auxiliar,armadura.getRegiao_Do_Corpo())){
                    armadura.setUsando(true);
            }
        }
        ficha.setArmaduras(auxiliar);
        Controle_Ficha.atualizarFicha(ficha);
        return true;
    }
    public static boolean desequiparArmadura(String nomeArmadura) throws ItemInvalidoException, FileNotFoundException, IOException, ArquivoInvalidoException {
        auxiliar = ficha.getArmaduras(); 
        if(auxiliar == null){
            return false;
        }
        if(!Controle_Integracao_Ficha.contemItem(auxiliar, nomeArmadura)){
            throw  new ItemInvalidoException("Não contem o item = {"+nomeArmadura+"} na ficha");
        }
        auxiliar = desequiparItem(auxiliar,nomeArmadura);
        ficha.setArmasADistancia(auxiliar);
        Controle_Ficha.atualizarFicha(ficha);
        return true;
    }
    
    public static boolean ItemUsando(ArrayList colecao,String nomeItem){
        Iterator i = colecao.iterator();
        while(i.hasNext()){
            Item item = (Item)i.next();
            if(item.getNome().equals(nomeItem)){
                   return item.isUsando();
            }
        }
        return false;
    }
    
    public static boolean verificarUsandoNaRegicao_Do_Corpo(ArrayList armaduras , char regiao){
        Iterator i = armaduras.iterator();
        while(i.hasNext()){
            Armadura armadura = (Armadura) i.next();
            if(armadura.getRegiao_Do_Corpo()!=regiao){
                continue;
            }
            if(armadura.isUsando()){
                return true;
            }
        }
        return false;
    }
    
    public static String[] listarItensEquipados(ArrayList colecao){
        Iterator i = colecao.iterator();
        String s[] = new String[colecao.size()];
        int aux=0;
        while(i.hasNext()){
            Item item = (Item) i.next();
            if(item.isUsando()){
                s[aux] = item.getNome();
            }
        }
        return s;
    }
    public static String[] listarItensDesequipados(ArrayList colecao){
        Iterator i = colecao.iterator();
        String s[] = new String[colecao.size()];
        int aux=0;
        while(i.hasNext()){
            Item item = (Item) i.next();
            if(!item.isUsando()){
                s[aux] = item.getNome();
            }
        }
        return s;
    }
    
    public static Armadura encontrarArmadura(char regiao){
        Iterator i = auxiliar.iterator();
        while(i.hasNext()){
            Armadura armadura = (Armadura) i.next();
            if(armadura.isUsando() && armadura.getRegiao_Do_Corpo()==regiao){
                return armadura;
            }
        }
        return null;
    }  
}
