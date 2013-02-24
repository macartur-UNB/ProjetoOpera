/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.FileNotFoundException;
import java.io.IOException;
import model.classes.Arma_A_Distancia;
import model.classes.Arma_Corpo_A_Corpo;
import model.classes.Armadura;
import model.classes.Dado;
import model.classes.Item;
import model.dao.DAO_Item;
import model.exception.ArquivoInvalidoException;
import model.exception.DeletarInvalidoException;
import model.exception.ItemInvalidoException;


public class Controle_Item {    
    
   
    public static void cadItemGenerico(String nome,String descricao,int preco) 
                                      throws FileNotFoundException, IOException, ArquivoInvalidoException, ItemInvalidoException{
        Item item = new Item(nome, descricao, preco);
        DAO_Item.gravarItem(item);
    }
    public static void cadItemGenerico(String nome,String descricao,Boolean usando,
                           int preco) throws IOException, FileNotFoundException, ArquivoInvalidoException, ItemInvalidoException{
        Item item = new Item(nome, descricao, usando,preco);
        DAO_Item.gravarItem(item);      
    }
    public static void cadItemGenerico(String nome,String descricao,Boolean usando,
                                int bonus_atributo[],int preco,
                                String habilidade_Necessaria)
                                      throws FileNotFoundException, IOException, ArquivoInvalidoException, ItemInvalidoException{
        Item item = new Item(nome, descricao, usando, bonus_atributo,
                             preco, habilidade_Necessaria);
        DAO_Item.gravarItem(item);        
    }
    
    public static void removerItemGenerico(String nome) throws DeletarInvalidoException, IOException, ArquivoInvalidoException{
        DAO_Item.removerItemGenerico(nome);
    }
    
    public static void removerArmaADistancia(String nome) throws DeletarInvalidoException, IOException, ArquivoInvalidoException{
        DAO_Item.removerArma_A_Distancia(nome);
    }
    
    public static void removerArmaCorpoACorpo(String nome) throws DeletarInvalidoException, IOException, ArquivoInvalidoException{
        DAO_Item.removerArma_Corpo_A_Corpo(nome, "");
    }
    
    public static void removerArmadura(String nome) throws DeletarInvalidoException, IOException, ArquivoInvalidoException{
        DAO_Item.removerArmadura(nome);
    }
    
    public static void cadArma_Corpo_A_Corpo(String nome, String descricao,String tipo,
                Dado dano,int danoAdicional,int golpe,int aparo,int esquiva,
                boolean usando,int preco)
                                      throws FileNotFoundException, IOException, ArquivoInvalidoException, ItemInvalidoException{
        
        Arma_Corpo_A_Corpo arma = new Arma_Corpo_A_Corpo(nome, descricao, tipo,
                dano, danoAdicional, golpe, aparo, esquiva, usando, preco);
        DAO_Item.gravarArma_Corpo_A_Corpo(arma);
    }
    
    
     public static void cadArma_Corpo_A_Corpo(String nome, String descricao,String tipo,
                Dado dano,int danoAdicional,int golpe,int aparo,int esquiva,
                boolean usando,int bonus_atributo[],int preco,
                String habilidade_Necessaria)
                                      throws FileNotFoundException, IOException, ArquivoInvalidoException, ItemInvalidoException{
      
         Arma_Corpo_A_Corpo arma = new Arma_Corpo_A_Corpo(nome, descricao, tipo,
                                   dano, danoAdicional, golpe, aparo, esquiva,
                                   usando, bonus_atributo, preco,
                                   habilidade_Necessaria);
         DAO_Item.gravarArma_Corpo_A_Corpo(arma);
     }
    
    
     public static void cadArma_A_Distancia(String nome,String descricao,
             Dado dano,int danoAdicional,int tiro_Rapido,int tiro_Mirado,
             int cadencia,boolean usando,int preco) 
                                      throws FileNotFoundException, IOException, ArquivoInvalidoException, ItemInvalidoException{
         Arma_A_Distancia arma = new Arma_A_Distancia(nome, descricao, dano,
                                                      danoAdicional, tiro_Rapido,
                                                      tiro_Mirado, cadencia, 
                                                      usando, preco);
         DAO_Item.gravarArma_A_Distancia(arma);
     } 
     
     public static void cadArma_A_Distancia(String nome,String descricao,
                    Dado dano,int danoAdicional,int tiro_Rapido,int tiro_Mirado,
                    int cadencia,boolean usando,int bonus_atributo[],
                    int preco,String habilidade_Necessaria) 
                                      throws FileNotFoundException, IOException, ArquivoInvalidoException, ItemInvalidoException{
         Arma_A_Distancia arma = new Arma_A_Distancia(nome, descricao,  dano,
                                                      danoAdicional, tiro_Rapido,
                                                      tiro_Mirado, cadencia,
                                                      usando, bonus_atributo,
                                                      preco, habilidade_Necessaria);
         DAO_Item.gravarArma_A_Distancia(arma);
     }
     
     public static void cadArmadura(String nome,String descricao,int absorcao_Arma_Branca,
             int absorcao_Arma_De_Fogo,int penalidade,char regiao_Do_Corpo,
             boolean usando,int preco) 
                                      throws FileNotFoundException, IOException, ArquivoInvalidoException, ItemInvalidoException{
         Armadura armadura = new Armadura(nome, descricao, absorcao_Arma_Branca,
                                          absorcao_Arma_De_Fogo, penalidade,
                                          regiao_Do_Corpo, usando, preco);
         DAO_Item.gravarArmadura(armadura);
     }
     
   
       public static void cadArmadura(String nome,String descricao,
                               int absorcao_Arma_Branca,int absorcao_Arma_De_Fogo,
                               int penalidade,char regiao_Do_Corpo,boolean usando,
                               int bonus_atributo[],int preco,
                               String habilidade_Necessaria) 
                                      throws FileNotFoundException, IOException, ArquivoInvalidoException, ItemInvalidoException{
         Armadura armadura = new Armadura(nome, descricao, absorcao_Arma_Branca,
                                          absorcao_Arma_De_Fogo, penalidade,
                                          regiao_Do_Corpo, usando, bonus_atributo,
                                          preco, habilidade_Necessaria);
         DAO_Item.gravarArmadura(armadura);
     }
       
     public static boolean ItemGenericoExiste(String item){
         return DAO_Item.ItemGenericoExiste(item);
     }  
     public static boolean Arma_A_DistanciaExiste(String arma){
         return DAO_Item.Arma_A_DistanciaExiste(arma);
     }
    /* public static boolean ArmaCorpo_A_CorpoExiste(String arma){
         return DAO_Item.ArmaCorpo_A_CorpoExiste(arma);
     }*/
     public static boolean ArmaCorpo_A_CorpoExiste(String arma,String tipo){
         return DAO_Item.ArmaCorpo_A_CorpoExiste(arma, tipo);
     }
     public static boolean ArmaduraExiste(String armadura){
         return DAO_Item.ArmaduraExiste(armadura);
     }
     
     /*public static String tipoArmaCorpo_A_Corpo(String arma){
         return DAO_Item.tipoArmaCorpo_A_Corpo(arma);
     }*/ 
     
    public static Item encontrarItemGenerico(String nome)
            throws FileNotFoundException, ClassNotFoundException, IOException, ArquivoInvalidoException{
          return DAO_Item.encontrarItemGenerico(nome);
    }
    
    public static Arma_Corpo_A_Corpo encontrarArma_Corpo_A_Corpo(String nome,String tipo)
               throws FileNotFoundException,IOException, ClassNotFoundException, ArquivoInvalidoException{
            return DAO_Item.encontrarArma_Corpo_A_Corpo(nome, tipo);
    }
    
    public static Arma_A_Distancia encontrarArma_A_Distancia(String nome) 
              throws FileNotFoundException, IOException, ClassNotFoundException, ArquivoInvalidoException{
        return DAO_Item.encontrarArma_A_Distancia(nome);
    }
    public static Armadura  encontrarArmadura(String nome) throws FileNotFoundException,
                                            ClassNotFoundException, IOException,
                                            ArquivoInvalidoException{
        return DAO_Item.encontrarArmadura(nome);
    }
    
    public static String[] listarItemGenerico(){
        return DAO_Item.listarItem("Generico");
    }
    
    public static String[] listarItemArmaADistancia(){
        return DAO_Item.listarItem("Arma a Distancia");
    }
    
    public static String[] listarItemArmaCorpoACorpo(){
        return DAO_Item.listarItem("Arma Corpo a Corpo");
    }
    
    public static String[] listarItemArmadura(){
        return DAO_Item.listarItem("Armadura");
    }
    
}
