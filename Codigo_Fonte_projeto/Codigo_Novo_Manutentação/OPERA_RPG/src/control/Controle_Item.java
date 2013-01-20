/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.FileNotFoundException;
import java.io.IOException;
import model.Arma_A_Distancia;
import model.Arma_Corpo_A_Corpo;
import model.Armadura;
import model.Dado;
import model.Item;


public class Controle_Item {
    
    private static Controle_Item instancia;
    private String endereco;

    public Controle_Item() {
    }

    public static Controle_Item getInstancia() {
        if(instancia == null){
            instancia = new Controle_Item();
        }
        return instancia;
    }
    
    
    
   
    /**
     * colocar codigo de controle item aqui
     */
   
    public void cadItemGenerico(String nome,String descricao,int preco) 
                                      throws FileNotFoundException, IOException{
        Item item = new Item(nome, descricao, preco);
        gravarItem(item);       
    }
    public void cadItemGenerico(String nome,String descricao,Boolean usando,
                           int preco) throws IOException, FileNotFoundException{
        Item item = new Item(nome, descricao, usando,preco);
        gravarItem(item);       
    }
    public void cadItemGenerico(String nome,String descricao,Boolean usando,
                                int bonus_atributo[],int preco,
                                String habilidade_Necessaria)
                                      throws FileNotFoundException, IOException{
        Item item = new Item(nome, descricao, usando, bonus_atributo,
                             preco, habilidade_Necessaria);
        gravarItem(item);       
    }
    
    
    public void cadArma_Corpo_A_Corpo(String nome, String descricao,String tipo,
                Dado dano,int danoAdicional,int golpe,int aparo,int esquiva,
                boolean usando,int preco)
                                      throws FileNotFoundException, IOException{
        
        Arma_Corpo_A_Corpo arma = new Arma_Corpo_A_Corpo(nome, descricao, tipo,
                dano, danoAdicional, golpe, aparo, esquiva, usando, preco);
        gravarArma_Corpo_A_Corpo(arma);
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
         gravarArma_Corpo_A_Corpo(arma);
     }
    
    
     public void cadArma_A_Distancia(String nome,String descricao,
             Dado dano,int danoAdicional,int tiro_Rapido,int tiro_Mirado,
             int cadencia,boolean usando,int preco) 
                                      throws FileNotFoundException, IOException{
         Arma_A_Distancia arma = new Arma_A_Distancia(nome, descricao, dano,
                                                      danoAdicional, tiro_Rapido,
                                                      tiro_Mirado, cadencia, 
                                                      usando, preco);
         gravarArma_A_Distancia(arma);
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
         gravarArma_A_Distancia(arma);
     }
     
     public void cadArmadura(String nome,String descricao,int absorcao_Arma_Branca,
             int absorcao_Arma_De_Fogo,int penalidade,char regiao_Do_Corpo,
             boolean usando,int preco) 
                                      throws FileNotFoundException, IOException{
         Armadura armadura = new Armadura(nome, descricao, absorcao_Arma_Branca,
                                          absorcao_Arma_De_Fogo, penalidade,
                                          regiao_Do_Corpo, usando, preco);
         gravarArmadura(armadura);
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
         gravarArmadura(armadura);
     }
     
     
     private void gravarItem(Item item) throws FileNotFoundException,
                                              FileNotFoundException,IOException{
        endereco = Controle_Jogo.getInstancia().enderecoJogoRodando()+"\\Itens\\Generico";
        Controle_Diretorios.getInstancia().gravarArquivo(endereco, item.getNome(), item);
    }
    
    private void gravarArma_Corpo_A_Corpo(Arma_Corpo_A_Corpo arma)
                                      throws FileNotFoundException, IOException{
        endereco = Controle_Jogo.getInstancia().enderecoJogoRodando()+
                   "\\Itens\\Armas\\Arma_Corpo_A_Corpo\\"+arma.getTipo()+"\\";
        Controle_Diretorios.getInstancia().gravarArquivo(endereco, arma.getNome(), arma);
    }
    private void gravarArma_A_Distancia(Arma_A_Distancia arma)
                                      throws FileNotFoundException, IOException{
        endereco = Controle_Jogo.getInstancia().enderecoJogoRodando()+
                   "\\Itens\\Armas\\Arma_A_Distancia\\";
        Controle_Diretorios.getInstancia().gravarArquivo(endereco, arma.getNome(), arma);
    }
    private void gravarArmadura(Armadura armadura) 
                                      throws FileNotFoundException, IOException{
        endereco = Controle_Jogo.getInstancia().enderecoJogoRodando()+
                   "\\Itens\\Armaduras";
        Controle_Diretorios.getInstancia().gravarArquivo(endereco, armadura.getNome(), armadura);
    }
    
    public void removeItemGenerico(String nome){
            endereco = Controle_Jogo.getInstancia().enderecoJogoRodando()+"\\Itens\\Generico";
            Controle_Diretorios.getInstancia().removeArquivo(endereco, nome);
    }
    public void removeArma_A_Distancia(String nome){
            endereco = Controle_Jogo.getInstancia().enderecoJogoRodando()+
                   "\\Itens\\Armas\\Arma_A_Distancia\\";
            Controle_Diretorios.getInstancia().removeArquivo(endereco, nome);
    }
    
    public void removeArma_Corpo_A_Corpo(String nome,String tipo){
         endereco = Controle_Jogo.getInstancia().enderecoJogoRodando()+
                    "\\Itens\\Armas\\Arma_Corpo_A_Corpo\\"+tipo+"\\";
           Controle_Diretorios.getInstancia().removeArquivo(endereco, nome);
    }
    
    public void removeArmadura(String nome){
        endereco = Controle_Jogo.getInstancia().enderecoJogoRodando()+
                   "\\Itens\\Armaduras";
        Controle_Diretorios.getInstancia().removeArquivo(endereco, nome);
    }
    
    public Item encontrarItemGenerico(String nome) 
              throws FileNotFoundException, ClassNotFoundException, IOException{
           endereco = Controle_Jogo.getInstancia().enderecoJogoRodando()+"\\Itens\\Generico";
           return (Item) Controle_Diretorios.getInstancia().carregarArquivo(endereco, nome);
    }
    
    public Arma_Corpo_A_Corpo encontrarArma_Corpo_A_Corpo(String nome,String tipo)
               throws FileNotFoundException,IOException, ClassNotFoundException{
            endereco = Controle_Jogo.getInstancia().enderecoJogoRodando()+
                    "\\Itens\\Armas\\Arma_Corpo_A_Corpo\\"+tipo+"\\";
            return (Arma_Corpo_A_Corpo)Controle_Diretorios.getInstancia().carregarArquivo(endereco, nome);
    }
    
    public Arma_A_Distancia encontrarArma_A_Distancia(String nome) 
              throws FileNotFoundException, IOException, ClassNotFoundException{
        endereco = Controle_Jogo.getInstancia().enderecoJogoRodando()+
                   "\\Itens\\Armas\\Arma_A_Distancia\\";
        return (Arma_A_Distancia)Controle_Diretorios.getInstancia().carregarArquivo(endereco, nome);
    }
    public Armadura  encontrarArmadura(String nome) throws FileNotFoundException,
                                            ClassNotFoundException, IOException{
        endereco = Controle_Jogo.getInstancia().enderecoJogoRodando()+
                   "\\Itens\\Armaduras";
        return (Armadura)Controle_Diretorios.getInstancia().carregarArquivo(endereco, nome);
    }
    
    
}
