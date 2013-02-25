/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.classes;

import model.exception.ItemInvalidoException;


public class Arma_Corpo_A_Corpo extends Arma {
    private int golpe;
    private int aparo;
    private int esquiva;
    
    public Arma_Corpo_A_Corpo(String nome, String descricao, 
                              Dado dano, int danoAdicional,
                              int golpe,int aparo,int esquiva,
                              boolean usando, int preco) throws ItemInvalidoException {
        super(nome, descricao, dano, danoAdicional, usando, preco);
        this.aparo = aparo;
        this.esquiva = esquiva;
        this.golpe = golpe;        
    }

    public Arma_Corpo_A_Corpo(String nome, String descricao,
                              Dado dano, int danoAdicional,
                              int golpe,int aparo,int esquiva,                              
                              boolean usando,
                              int[] bonus_atributo, int preco,
                              String habilidade_Necessaria) throws ItemInvalidoException {
        
        super(nome, descricao, dano, danoAdicional, usando,
              bonus_atributo, preco, habilidade_Necessaria);
        this.aparo = aparo;
        this.esquiva = esquiva;
        this.golpe = golpe;
    }

    public void setAparo(int aparo) {
        this.aparo = aparo;
    }

    public int getAparo() {
        return aparo;
    }

    public void setGolpe(int golpe) {
        this.golpe = golpe;
    }

    public int getGolpe() {
        return golpe;
    }

    public void setEsquiva(int esquiva) {
        this.esquiva = esquiva;
    }

    public int getEsquiva() {
        return esquiva;
    }

    @Override
    public String toString() {
        return super.toString()+
               " Golpe = "+this.getGolpe()+
               " Aparo = "+this.getAparo()+
               " Esquiva = "+this.getEsquiva();
    }
}
