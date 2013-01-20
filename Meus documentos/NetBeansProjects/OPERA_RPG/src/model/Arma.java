/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class Arma extends Item{
    
    private String tipo;
    private Dado dano;
    private int danoAdicional;
    
    public Arma(String nome, String descricao,String tipo,Dado dano,
                int danoAdicional, boolean usando, int preco) {
        super(nome, descricao, usando, preco);
        this.tipo = tipo;
        this.dano = dano;
        this.danoAdicional = danoAdicional;
    }

    public Arma(String nome, String descricao,String tipo,Dado dano,
                int danoAdicional, boolean usando, int[] bonus_atributo,
                int preco, String habilidade_Necessaria) {
        super(nome, descricao, usando, bonus_atributo, preco, habilidade_Necessaria);
        this.tipo = tipo;
        this.dano = dano;
        this.danoAdicional = danoAdicional;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
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
               "Tipo = "+this.getTipo()+
               "Dano = "+this.toString()+
               " + "+this.getDanoAdicional();
    }
}
