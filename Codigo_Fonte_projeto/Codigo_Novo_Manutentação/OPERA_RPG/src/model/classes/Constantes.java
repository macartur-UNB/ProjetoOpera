/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.classes;

/**
 *
 * @author Luciano
 */
public class Constantes {
    
    public class Atributos{

       public static final int FISICO = 0;

       public static final int DESTREZA = 1;

       public static final int INTELIGENCIA = 2;

       public static final int VONTADE = 3;

       public static final int PERCEPCAO = 4;

       public static final int MANA = 5;

       public static final int MENTE = 6;

       public static final int SORTE = 7;
        
    }
    
    
    public class Endereco{
                
        public static final String FICHA = "\\Fichas";
        public static final String FICHA_JOGADOR = FICHA+"\\Jogador";
        public static final String FICHA_NPC = FICHA+"\\NPC";
        public static final String FICHA_MONSTRO = FICHA+"\\Monstro";
        
        public static final String HABILIDADE = "\\Habilidades";
        public static final String HABILIDADE_FISICA = HABILIDADE + "\\Fisica";
        public static final String HABILIDADE_PSIQUICA = HABILIDADE + "\\Psiquica";
        public static final String HABILIDADE_BELICA = HABILIDADE + "\\Belica";
        
        public static final String CARACTERISTICA = "\\Caracteristicas";
        public static final String CARACTERISTICA_FISICA = CARACTERISTICA + "\\Fisica";
        public static final String CARACTERISTICA_PSIQUICA = CARACTERISTICA + "\\Psiquica";
        public static final String CARACTERISTICA_RACIAL = CARACTERISTICA + "\\Racial";
                
        public static final String ITEM = "\\Itens";
        public static final String ITEM_GENERICO = ITEM + "\\Generico";
        public static final String ITEM_ARMA = ITEM + "\\Armas";
        public static final String ITEM_ARMA_CORPO_A_CORPO = ITEM_ARMA + "\\Arma_Corpo_A_Corpo";
        public static final String ITEM_ARMA_CORPO_A_CORPO_BRANCA = ITEM_ARMA_CORPO_A_CORPO + "\\Branca";
        public static final String ITEM_ARMA_CORPO_A_CORPO_DE_FOGO = ITEM_ARMA_CORPO_A_CORPO + "\\De_Fogo";
        public static final String ITEM_ARMA_A_DISTANCIA = ITEM_ARMA + "\\Arma_A_Distancia";
        public static final String ITEM_ARMADURA = ITEM + "\\Armaduras";
        
        public static final String DADO = "\\Dados";
        
        
    }
    
}
