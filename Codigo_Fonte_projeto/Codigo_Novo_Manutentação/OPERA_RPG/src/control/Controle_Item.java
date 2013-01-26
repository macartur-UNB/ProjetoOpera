/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO_Item;
import java.io.FileNotFoundException;
import java.io.IOException;
import model.Arma_A_Distancia;
import model.Arma_Corpo_A_Corpo;
import model.Armadura;
import model.Dado;
import model.Item;

/**
 *
 * @author Macartur
 */
public class Controle_Item {
     
    private static Controle_Item instancia;

    public Controle_Item() {
    }

    public static Controle_Item getInstancia() {
        if(instancia == null){
            instancia = new Controle_Item();
        }
        return instancia;
    }    
   
    public void cadItemGenerico(String nome,String descricao,int preco) 
                                      throws FileNotFoundException, IOException{
        Item item = new Item(nome, descricao, preco);
        DAO_Item.gravarItem(item);
    }
    public void cadItemGenerico(String nome,String descricao,Boolean usando,
                           int preco) throws IOException, FileNotFoundException{
        Item item = new Item(nome, descricao, usando,preco);
        DAO_Item.gravarItem(item);      
    }
    public void cadItemGenerico(String nome,String descricao,Boolean usando,
                                int bonus_atributo[],int preco,
                                String habilidade_Necessaria)
                                      throws FileNotFoundException, IOException{
        Item item = new Item(nome, descricao, usando, bonus_atributo,
                             preco, habilidade_Necessaria);
        DAO_Item.gravarItem(item);        
    }
    
    
    public void cadArma_Corpo_A_Corpo(String nome, String descricao,String tipo,
                Dado dano,int danoAdicional,int golpe,int aparo,int esquiva,
                boolean usando,int preco)
                                      throws FileNotFoundException, IOException{
        
        Arma_Corpo_A_Corpo arma = new Arma_Corpo_A_Corpo(nome, descricao, tipo,
                dano, danoAdicional, golpe, aparo, esquiva, usando, preco);
        DAO_Item.gravarArma_Corpo_A_Corpo(arma);
    }
    
    
     public void cadArma_Corpo_A_Corpo(String nome, String descricao,String tipo,
                Dado dano,int danoAdicional,int golpe,int aparo,int esquiva,
                boolean usando,int bonus_atributo[],int preco,
                String habilidade_Necessaria)
                                      throws FileNotFoundException, IOException{
      
         Arma_Corpo_A_Corpo arma = new Arma_Corpo_A_Corpo(nome, descricao, tipo,
                                   dano, danoAdicional, golpe, aparo, esquiva,
                                   usando, bonus_atributo, preco,
                                   habilidade_Necessaria);
         DAO_Item.gravarArma_Corpo_A_Corpo(arma);
     }
    
    
     public void cadArma_A_Distancia(String nome,String descricao,
             Dado dano,int danoAdicional,int tiro_Rapido,int tiro_Mirado,
             int cadencia,boolean usando,int preco) 
                                      throws FileNotFoundException, IOException{
         Arma_A_Distancia arma = new Arma_A_Distancia(nome, descricao, dano,
                                                      danoAdicional, tiro_Rapido,
                                                      tiro_Mirado, cadencia, 
                                                      usando, preco);
         DAO_Item.gravarArma_A_Distancia(arma);
     } 
     
     public void cadArma_A_Distancia(String nome,String descricao,
                    Dado dano,int danoAdicional,int tiro_Rapido,int tiro_Mirado,
                    int cadencia,boolean usando,int bonus_atributo[],
                    int preco,String habilidade_Necessaria) 
                                      throws FileNotFoundException, IOException{
         Arma_A_Distancia arma = new Arma_A_Distancia(nome, descricao,  dano,
                                                      danoAdicional, tiro_Rapido,
                                                      tiro_Mirado, cadencia,
                                                      usando, bonus_atributo,
                                                      preco, habilidade_Necessaria);
         DAO_Item.gravarArma_A_Distancia(arma);
     }
     
     public void cadArmadura(String nome,String descricao,int absorcao_Arma_Branca,
             int absorcao_Arma_De_Fogo,int penalidade,char regiao_Do_Corpo,
             boolean usando,int preco) 
                                      throws FileNotFoundException, IOException{
         Armadura armadura = new Armadura(nome, descricao, absorcao_Arma_Branca,
                                          absorcao_Arma_De_Fogo, penalidade,
                                          regiao_Do_Corpo, usando, preco);
         DAO_Item.gravarArmadura(armadura);
     }
     
   
       public void cadArmadura(String nome,String descricao,
                               int absorcao_Arma_Branca,int absorcao_Arma_De_Fogo,
                               int penalidade,char regiao_Do_Corpo,boolean usando,
                               int bonus_atributo[],int preco,
                               String habilidade_Necessaria) 
                                      throws FileNotFoundException, IOException{
         Armadura armadura = new Armadura(nome, descricao, absorcao_Arma_Branca,
                                          absorcao_Arma_De_Fogo, penalidade,
                                          regiao_Do_Corpo, usando, bonus_atributo,
                                          preco, habilidade_Necessaria);
         DAO_Item.gravarArmadura(armadura);
     }
     
     
    
    
    public Item encontrarItemGenerico(String nome)
            throws FileNotFoundException, ClassNotFoundException, IOException{
          return DAO_Item.encontrarItemGenerico(nome);
    }
    
    public Arma_Corpo_A_Corpo encontrarArma_Corpo_A_Corpo(String nome,String tipo)
               throws FileNotFoundException,IOException, ClassNotFoundException{
            return DAO_Item.encontrarArma_Corpo_A_Corpo(nome, tipo);
    }
    
    public Arma_A_Distancia encontrarArma_A_Distancia(String nome) 
              throws FileNotFoundException, IOException, ClassNotFoundException{
        return DAO_Item.encontrarArma_A_Distancia(nome);
    }
    public Armadura  encontrarArmadura(String nome) throws FileNotFoundException,
                                            ClassNotFoundException, IOException{
        return DAO_Item.encontrarArmadura(nome);
    }
    
    
}
