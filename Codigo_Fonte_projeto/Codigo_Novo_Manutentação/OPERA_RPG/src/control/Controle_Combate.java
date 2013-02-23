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
    
    public static boolean usarArmaCorpo_A_Corpo(String nomeArma) throws FileNotFoundException, IOException, ArquivoInvalidoException{
           if(usandoArma(ficha.getArmasADistancia())|| usandoArma(ficha.getArmasCorpoACorpo())){
               return false;
           }
          auxiliar = usarItem(auxiliar, nomeArma);
          ficha.setArmasCorpoACorpo(auxiliar);
          Controle_Ficha.atualizarFicha(ficha);
          return true;
    }
    public static void usarArma_A_Distancia(){}
    public static void usarItemGenerico(){}
    
    public static ArrayList usarItem(ArrayList colecao, String nomeItem){
        Iterator i = colecao.iterator();
        while(i.hasNext()){
            Item item = (Item) i.next();
            if(item.getNome().equals(nomeItem)){
                item.setUsando(true);
            }
        }
        return colecao;
    }
    /**
     * coloca para utilizar uma armadura
     * @param nomeArmadura
     * @return true or false
     * @throws FileNotFoundException
     * @throws ArquivoInvalidoException
     * @throws IOException 
     */
    public static boolean usarArmadura(String nomeArmadura) throws FileNotFoundException, ArquivoInvalidoException, IOException{
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
               verificarUsandoNaRegicao_Do_Corpo(armadura.getRegiao_Do_Corpo())){
                armadura.setUsando(true);
            }
        }
        ficha.setArmaduras(auxiliar);
        Controle_Ficha.atualizarFicha(ficha);
        return true;
    }
    /**
     * verifica se esta usando um determinado item
     * @param colecao
     * @param nomeItem
     * @return true or false
     */
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
    /**
     * verifica se está utilizando a regiao do corpo em com uma armadura
     * @param regiao
     * @return true or false;
     */
    public static boolean verificarUsandoNaRegicao_Do_Corpo(char regiao){
        Iterator i = auxiliar.iterator();
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
    
    /**
     * verifica se está usando pelo menos 1 arma
     * @return true or false
     */
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
}
