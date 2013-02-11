/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.classes;

import model.exception.ItemInvalidoException;
import model.exception.PalavraInvalidaException;
import model.validacao.ValidarPalavra;


public class Armadura extends Item{

    private int absorcao_Arma_Branca;
    private int absorcao_Arma_De_Fogo;
    private int penalidade;
    private char regiao_Do_Corpo;
    
    /**
     * 
     * @param nome Nome da Armadura. Deve conter apenas caracteres
     * Alfa-Numericos (A-Z, a-z e 0-9)".
     * @param descricao Descricao da Armadura. Deve conter apenas caracteres
     * Alfa-Numericos (A-Z, a-z e 0-9)".
     * @param absorcao_Arma_Branca Absorcao de Arma Branca deve ser um numero
     * inteiro e maior que zero(0)
     * @param absorcao_Arma_De_Fogo Absorcao de Arma de Fogo deve ser um numero
     * inteiro e maior que zero(0)
     * @param penalidade Penalidade deve ser um numero inteiro 
     * e maior que zero(0)
     * @param regiao_Do_Corpo Regiao do Corpo, deve ser: A, B, C, D, E, 
     * F, G ou H
     * @param usando Define se a Armadura esta sendo Usada, TRUE - Sim. FALSE - Nao
     * @param preco O Preco deve ser um numero inteiro e 
     * maior que zero(0)
     * @throws ItemInvalidoException 
     */
    public Armadura(String nome, String descricao, int absorcao_Arma_Branca,
                    int absorcao_Arma_De_Fogo,int penalidade , char regiao_Do_Corpo,
                    boolean usando, int preco) throws ItemInvalidoException {
        super(nome, descricao, usando, preco);
        setAbsorcao_Arma_Branca(absorcao_Arma_Branca);
        setAbsorcao_Arma_De_Fogo(absorcao_Arma_De_Fogo);
        setPenalidade(penalidade);
        setRegiao_Do_Corpo(regiao_Do_Corpo);    
    }

    /**
     * 
     * @param Nome da Armadura. Deve conter apenas caracteres
     * Alfa-Numericos (A-Z, a-z e 0-9)".
     * @param descricao Descricao da Armadura. Deve conter apenas caracteres
     * Alfa-Numericos (A-Z, a-z e 0-9)".
     * @param absorcao_Arma_Branca Absorcao de Arma Branca deve ser um numero
     * inteiro e maior que zero(0)
     * @param absorcao_Arma_De_Fogo Absorcao de Arma de Fogo deve ser um numero
     * inteiro e maior que zero(0)
     * @param penalidade Penalidade deve ser um numero inteiro 
     * e maior que zero(0)
     * @param regiao_Do_Corpo Regiao do Corpo, deve ser: A, B, C, D, E, 
     * F, G ou H
     * @param usando Define se a Armadura esta sendo Usada, TRUE - Sim. FALSE - Nao
     * @param bonus_atributo Vetor com os Valores dos Bonus de Atributo da Armadura. 
     * Todos os valores devem ser maiores ou iguais a zero(0).
     * @param preco O Preco deve ser um numero inteiro e 
     * maior que zero(0)
     * @param habilidade_Necessaria Habilidade Necessaria para se usar a Armadura
     * @throws ItemInvalidoException 
     */
    public Armadura(String nome, String descricao,int absorcao_Arma_Branca,
                    int absorcao_Arma_De_Fogo,int penalidade , char regiao_Do_Corpo,
                    boolean usando, int[] bonus_atributo,
                    int preco, String habilidade_Necessaria) throws ItemInvalidoException {
        super(nome, descricao, usando, bonus_atributo, preco, habilidade_Necessaria);
        setAbsorcao_Arma_Branca(absorcao_Arma_Branca);
        setAbsorcao_Arma_De_Fogo(absorcao_Arma_De_Fogo);
        setPenalidade(penalidade);
        setRegiao_Do_Corpo(regiao_Do_Corpo); 
    
    }

    /**
     * Altera a Absorcao de Arma Branca da Armadura
     * @param absorcao_Arma_Branca Absorcao de Arma Branca deve ser um numero
     * inteiro e maior que zero(0)
     * @throws ItemInvalidoException
     */
    public void setAbsorcao_Arma_Branca(int absorcao_Arma_Branca) throws ItemInvalidoException {
        if(absorcao_Arma_Branca >= 0){
    		this.absorcao_Arma_Branca = absorcao_Arma_Branca;
    	}else{
            throw new ItemInvalidoException("Absorcao de Arma Branca Invalida,"
                    + " valor Abaixo de Zero(0)");
        }
    }

    /**
     * Retorna a Absorcao de Arma Branca da Armadura
     * @return Absorcao de Arma Branca
     */
    public int getAbsorcao_Arma_Branca() {
        return absorcao_Arma_Branca;
    }

    /**
     * Altera a Absorcao de Arma de Fogo da Armadura
     * @param absorcao_Arma_De_Fogo Absorcao de Arma de Fogo deve ser um numero
     * inteiro e maior que zero(0)
     * @throws ItemInvalidoException 
     */
    public void setAbsorcao_Arma_De_Fogo(int absorcao_Arma_De_Fogo) throws ItemInvalidoException {
        if(absorcao_Arma_De_Fogo >= 0){
    		this.absorcao_Arma_De_Fogo = absorcao_Arma_De_Fogo;
    	}else{
            throw new ItemInvalidoException("Absorcao de Arma de Fogo Invalida,"
                    + " valor Abaixo de Zero(0)");
        }
    }

    /**
     * Retorna a Absorcao de Arma de Fogo da Armadura
     * @return Absorcao de Arma de Fogo
     */
    public int getAbsorcao_Arma_De_Fogo() {
        return absorcao_Arma_De_Fogo;
    }

    /**
     * Altera a Regiao do Corpo da Armadura
     * @param regiao_Do_Corpo Regiao do Corpo, deve ser: A, B, C, D, E, 
     * F, G ou H
     * @throws ItemInvalidoException
     */
    public void setRegiao_Do_Corpo(char regiao_Do_Corpo) throws ItemInvalidoException {
        try{
            char caracteresValidos[] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
            ValidarPalavra.validarCaractere(regiao_Do_Corpo, caracteresValidos);
            this.regiao_Do_Corpo = regiao_Do_Corpo;
        } catch(PalavraInvalidaException e){
            throw new ItemInvalidoException("Regiao do Corpo"
                    + "{" + regiao_Do_Corpo + "} Invalida."
                    + "\nDeve ser: 'A', 'B', 'C', 'D', 'E', 'F', 'G' ou 'H'");
        }
        
    }

    /**
     * Retorna a Regiao do Corpo da Armadura
     * @return Regiao do Corpo
     */
    public char getRegiao_Do_Corpo() {
        return regiao_Do_Corpo;
    }

    /**
     * Altera a Penalidade da Armadura
     * @param penalidade Penalidade deve ser um numero inteiro 
     * e maior que zero(0)
     */
    public void setPenalidade(int penalidade) throws ItemInvalidoException {
        if(penalidade >= 0){
    		this.penalidade = penalidade;
    	}else{
            throw new ItemInvalidoException("Penalidade Invalida,"
                    + " valor Abaixo de Zero(0)");
        }
    }

    /**
     * Retorna a Penalidade da Armadura
     * @return Penalidade
     */
    public int getPenalidade() {
        return penalidade;
    }

    @Override
    public String toString() {
        return super.toString()+
               "; Absorcao Arma Branca = " +this.getAbsorcao_Arma_Branca()+
               "; Absorcao Arma de Fogo = "+this.getAbsorcao_Arma_De_Fogo()+
               "; Penalidade = "+this.getPenalidade()+
               "; Regiao do Corpo = "+this.getRegiao_Do_Corpo();
    }
    
}
