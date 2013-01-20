/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opera.model;

import opera.exception.EquipamentoInvalidoException;

/**
 *
 * @author Macartur
 */
 public class Equipamento_Armadura extends Equipamento{

    private int absorcao_Arma_Branca;
    private int absorcao_Arma_De_Fogo;
    private int penalidade;
    private char regiao_Do_Corpo;
    public Equipamento_Armadura(String nome, String descricao, int preco, int absorcao_Arma_Branca, int absorcao_Arma_De_Fogo, int penalidade, char regiao_Do_Corpo) throws EquipamentoInvalidoException {
        super(nome, descricao, preco);
        setAbsorcao_Arma_Branca(absorcao_Arma_Branca);
        setAbsorcao_Arma_De_Fogo(absorcao_Arma_De_Fogo);
        setPenalidade(penalidade);
        setRegiao_Do_Corpo(regiao_Do_Corpo);
    }
    public Equipamento_Armadura(String nome, String descricao, int preco, int absorcao_Arma_Branca, int absorcao_Arma_De_Fogo, int penalidade, char regiao_Do_Corpo, int[] bonus_Atributo) throws EquipamentoInvalidoException {
        this(nome, descricao, preco, absorcao_Arma_Branca, absorcao_Arma_De_Fogo, penalidade, regiao_Do_Corpo);
        setBonus_Atributo(bonus_Atributo);
    }


    public final void setAbsorcao_Arma_Branca(int absorcao_Arma_Branca) throws EquipamentoInvalidoException {
        if(absorcao_Arma_Branca >= 0){
            this.absorcao_Arma_Branca = absorcao_Arma_Branca;
        }else{
            throw new EquipamentoInvalidoException("Absorcao de Arma Branca invalida, deve ser numero inteiro maior ou igual a zero");
        }
    }

    public int getAbsorcao_Arma_Branca() {
        return absorcao_Arma_Branca;
    }

    public final void setAbsorcao_Arma_De_Fogo(int absorcao_Arma_De_Fogo) throws EquipamentoInvalidoException {
        if(absorcao_Arma_De_Fogo >= 0){
            this.absorcao_Arma_De_Fogo = absorcao_Arma_De_Fogo;
        }else{
            throw new EquipamentoInvalidoException("Absorcao de Arma de Fogo invalida, deve ser numero inteiro maior ou igual a zero");
        }
    }

    public int getAbsorcao_Arma_De_Fogo() {
        return absorcao_Arma_De_Fogo;
    }

    public final void setPenalidade(int penalidade) throws EquipamentoInvalidoException {
        if(penalidade >= 0){
            this.penalidade = penalidade;
        }else{
            throw new EquipamentoInvalidoException("Penalidade invalida, deve ser numero inteiro maior ou igual a zero");
        }
    }

    public int getPenalidade() {
        return penalidade;
    }

    public final void setRegiao_Do_Corpo(char regiao_Do_Corpo) {
        this.regiao_Do_Corpo = regiao_Do_Corpo;
    }

    public char getRegiao_Do_Corpo() {
        return regiao_Do_Corpo;
    }

    @Override
    public String toString() {
        return super.toString()+
                " Absorcao Arma Branca: "+getAbsorcao_Arma_Branca()+
                " Absorcao Arma de Fogo: "+getAbsorcao_Arma_De_Fogo()+
                " Penalidade: "+getPenalidade()+
                " Regiao do Corpo: "+getRegiao_Do_Corpo();
    }   
}
