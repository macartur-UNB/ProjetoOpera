/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


public class Armadura extends Item{

    private int absorcao_Arma_Branca;
    private int absorcao_Arma_De_Fogo;
    private int penalidade;
    private char regiao_Do_Corpo;
    
    public Armadura(String nome, String descricao, int absorcao_Arma_Branca,
                    int absorcao_Arma_De_Fogo,int penalidade , char regiao_Do_Corpo,
                    boolean usando, int preco) {
        super(nome, descricao, usando, preco);
        this.absorcao_Arma_Branca  = absorcao_Arma_Branca;
        this.absorcao_Arma_De_Fogo = absorcao_Arma_De_Fogo;
        this.penalidade = penalidade;
        this.regiao_Do_Corpo = regiao_Do_Corpo;       
    }

    public Armadura(String nome, String descricao,int absorcao_Arma_Branca,
                    int absorcao_Arma_De_Fogo,int penalidade , char regiao_Do_Corpo,
                    boolean usando, int[] bonus_atributo,
                    int preco, String habilidade_Necessaria) {
        super(nome, descricao, usando, bonus_atributo, preco, habilidade_Necessaria);
        this.absorcao_Arma_Branca  = absorcao_Arma_Branca;
        this.absorcao_Arma_De_Fogo = absorcao_Arma_De_Fogo;
        this.penalidade = penalidade;
        this.regiao_Do_Corpo = regiao_Do_Corpo;
    
    }

    public void setAbsorcao_Arma_Branca(int absorcao_Arma_Branca) {
        this.absorcao_Arma_Branca = absorcao_Arma_Branca;
    }

    public int getAbsorcao_Arma_Branca() {
        return absorcao_Arma_Branca;
    }

    public void setAbsorcao_Arma_De_Fogo(int absorcao_Arma_De_Fogo) {
        this.absorcao_Arma_De_Fogo = absorcao_Arma_De_Fogo;
    }

    public int getAbsorcao_Arma_De_Fogo() {
        return absorcao_Arma_De_Fogo;
    }

    public void setRegiao_Do_Corpo(char regiao_Do_Corpo) {
        this.regiao_Do_Corpo = regiao_Do_Corpo;
    }

    public char getRegiao_Do_Corpo() {
        return regiao_Do_Corpo;
    }

    public void setPenalidade(int penalidade) {
        this.penalidade = penalidade;
    }

    public int getPenalidade() {
        return penalidade;
    }

    @Override
    public String toString() {
        return super.toString()+
               "Absorcao Arma Branca = " +this.getAbsorcao_Arma_Branca()+
               "Absorcao Arma de Fogo = "+this.getAbsorcao_Arma_De_Fogo()+
               "Penalidade = "+this.getPenalidade()+
               "Regiao do Corpo = "+this.getRegiao_Do_Corpo();
    }
    
}
