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
    
    /**
     * seleciona uma ficha
     * @param personagem
     * @throws FileNotFoundException
     * @throws ClassNotFoundException
     * @throws ArquivoInvalidoException
     * @throws ArquivoInvalidoException
     * @throws IOException
     * @throws FichaInvalidaException 
     */
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
    /**
     * retorna uma ficha selecionada
     * @return 
     */
    public static Ficha pegarFicha(){
        return ficha;
    }
    
    /**
     * retorna se tem alguma arma sendo utilizada
     * @return 
     */
    public static boolean usandoAlgumaArma(){
        return usandoArma(ficha.getArmasADistancia())|| usandoArma(ficha.getArmasCorpoACorpo());           
    }
    /**
     * retorna se esta utilizando alguma arma da colecao
     * @param colecao
     * @return 
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
    /**
     * equipa uma arma corpo a corpo
     * @param nomeArma
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ArquivoInvalidoException
     * @throws ItemInvalidoException
     * @throws ItemInvalidoException
     * @throws ItemInvalidoException 
     */
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
    /**
     * equipa uma arma a distancia
     * @param nomeArma
     * @return
     * @throws FileNotFoundException
     * @throws ArquivoInvalidoException
     * @throws IOException
     * @throws ItemInvalidoException 
     */
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
    /**
     * desequipa uma arma a distancia
     * @param nomeArma
     * @return
     * @throws FileNotFoundException
     * @throws ArquivoInvalidoException
     * @throws IOException
     * @throws ItemInvalidoException 
     */
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
    
    /**
     * equipa um item generico para alterar os modificadores
     * @param item
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ArquivoInvalidoException
     * @throws ItemInvalidoException 
     */
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
    
    /**
     * desequipa um item generico
     * @param item
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ArquivoInvalidoException
     * @throws ItemInvalidoException 
     */
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
    /**
     * equipar item 
     * @param colecao
     * @param nomeItem
     * @return 
     */
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
   /**
    * desequipar um item
    * @param colecao
    * @param nomeItem
    * @return 
    */
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
    
    
    /**
     * equipar uma armadura
     * @param nomeArmadura
     * @return
     * @throws FileNotFoundException
     * @throws ArquivoInvalidoException
     * @throws IOException 
     */
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
    /**
     * desequipar uma armadura
     * @param nomeArmadura
     * @return
     * @throws ItemInvalidoException
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ArquivoInvalidoException 
     */
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
    /**
     * verificar se um item esta sendo utilizado em uma colecao
     * @param colecao
     * @param nomeItem
     * @return 
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
     * verificar se a regiao do corpo esta equipada
     * @param armaduras
     * @param regiao
     * @return 
     */
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
    
    /**
     * listar itens equipados na ficha
     * @param colecao
     * @return 
     */
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
    /**
     * listar itens desequipados da ficha
     * @param colecao
     * @return 
     */
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
    /**
     * encontrar armadura da ficha
     * @param regiao
     * @return 
     */
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
    /**
     * calcular bonus modificador de uma ficha
     * @return 
     */
    public static int[] totalBonus(){
        int mod[] = new int[7];    
        int bonusArmaCAC[] = calcularBonusArmaCorpoACorpo();
        int bonusArmaAD[] = calcularBonusArmaADistancia();
        int bonusArmadura[] = calcularBonusArmadura();
        int bonusItemGenerico[] = calcularBonusItensGenerico();
        for(int i=0;i<7;i++){
           mod[i] += bonusArmaCAC[i] + bonusArmaAD[i]+bonusArmadura[i]+bonusItemGenerico[i];
        }
        return mod;
    }
    /**
     * calcular bonus de item generico
     * @return 
     */
    public static int[] calcularBonusItensGenerico(){
        auxiliar = ficha.getItensGenericos();
        return calcularModificador(auxiliar);
    }
    /**
     * calcular bonus de armadura
     * @return 
     */
    public static int[] calcularBonusArmadura(){
        auxiliar = ficha.getArmaduras();
        return calcularModificador(auxiliar);
    }
    /**
     * calcular bonus de arma a distancia
     * @return 
     */
    public static int[] calcularBonusArmaADistancia(){
        auxiliar = ficha.getArmasADistancia();
        return calcularModificador(auxiliar);
    
    }
    /**
     * calcular bonus de arma corpo a corpo
     * @return 
     */
    public static int[] calcularBonusArmaCorpoACorpo(){
        auxiliar = ficha.getArmasCorpoACorpo();
        return calcularModificador(auxiliar);
    }
    /**
     * calcular vetor modificador
     * @param colecao
     * @return 
     */
    public static int[] calcularModificador(ArrayList colecao){
        Iterator i = colecao.iterator();
        int mod[] = new int[7];
        int auxmod[] ;
        while(i.hasNext()){
            Item item = (Item) i.next();
            if(item.getBonus_atributo()!=null && item.isUsando()){
                auxmod = item.getBonus_atributo();
                mod[0] += auxmod[0];
                mod[1] += auxmod[1];
                mod[2] += auxmod[2];
                mod[3] += auxmod[3];
                mod[4] += auxmod[4];
                mod[5] += auxmod[5];
                mod[6] += auxmod[6];
                mod[7] += auxmod[7];
            }                
        }
        return mod;
    }
}
