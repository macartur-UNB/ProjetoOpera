/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.classes;


public class Arma extends Item{
    
    private Dado dano;
    private int danoAdicional;
    
    public Arma(String nome, String descricao,Dado dano,
                int danoAdicional, boolean usando, int preco) {
        super(nome, descricao, usando, preco);
        this.dano = dano;
        this.danoAdicional = danoAdicional;
    }

    public Arma(String nome, String descricao,Dado dano,
                int danoAdicional, boolean usando, int[] bonus_atributo,
                int preco, String habilidade_Necessaria) {
        super(nome, descricao, usando, bonus_atributo, preco, habilidade_Necessaria);
        this.dano = dano;
        this.danoAdicional = danoAdicional;
    }

   

    public void setDano(Dado dano) {
        this.dano = dano;
    }

    public Dado getDano() {
        return dano;
    }

    public void setDanoAdicional(int danoAdicional) {
        this.danoAdicional = danoAdicional;
    }

    public int getDanoAdicional() {
        return danoAdicional;
    }

    @Override
    public String toString() {
        return super.toString()+
               " Dano = "+this.getDano()+
               " + "+this.getDanoAdicional();
    }
}
