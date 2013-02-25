/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.classes;

import model.exception.ItemInvalidoException;
import model.exception.PalavraInvalidaException;
import model.validacao.Validar;


public class Armadura extends Item{

    private int absorcao_Distancia;
    private int absorcao_CorpoACorpo;
    private int penalidade;
    private char regiao_Do_Corpo;
    
    /**
     * 
     * @param nome Nome da Armadura. Deve conter apenas caracteres
     * Alfa-Numericos (A-Z, a-z e 0-9)".
     * @param descricao Descricao da Armadura. Deve conter apenas caracteres
     * Alfa-Numericos (A-Z, a-z e 0-9)".
     * @param absorcao_Distancia Absorcao de Arma a Distancia deve ser um numero
     * inteiro e maior ou igual a zero(0)
     * @param absorcao_CorpoACorpo Absorcao de Arma de Fogo deve ser um numero
     * inteiro e maior ou igual a zero(0)
     * @param penalidade Penalidade deve ser um numero inteiro 
     * e maior ou igual a zero(0)
     * @param regiao_Do_Corpo Regiao do Corpo, deve ser: A, B, C, D, E, 
     * F, G ou H
     * @param usando Define se a Armadura esta sendo Usada, TRUE - Sim. FALSE - Nao
     * @param preco O Preco deve ser um numero inteiro e 
     * maior ou igual a zero(0)
     * @throws ItemInvalidoException 
     */
    public Armadura(String nome, String descricao, int absorcao_Distancia,
                    int absorcao_CorpoACorpo,int penalidade , char regiao_Do_Corpo,
                    boolean usando, int preco) throws ItemInvalidoException {
        super(nome, descricao, usando, preco);
        setAbsorcao_Distancia(absorcao_Distancia);
        setAbsorcao_CorpoACorpo(absorcao_CorpoACorpo);
        setPenalidade(penalidade);
        setRegiao_Do_Corpo(regiao_Do_Corpo);    
    }

    /**
     * 
     * @param Nome da Armadura. Deve conter apenas caracteres
     * Alfa-Numericos (A-Z, a-z e 0-9)".
     * @param descricao Descricao da Armadura. Deve conter apenas caracteres
     * Alfa-Numericos (A-Z, a-z e 0-9)".
     * @param absorcao_Distancia Absorcao de Arma Distancia deve ser um numero
     * inteiro e maior ou igual a zero(0)
     * @param absorcao_CorpoACorpo Absorcao de Arma de corpo a corpo deve ser um numero
     * inteiro e maior ou igual a zero(0)
     * @param penalidade Penalidade deve ser um numero inteiro 
     * e maior ou igual a zero(0)
     * @param regiao_Do_Corpo Regiao do Corpo, deve ser: A, B, C, D, E, 
     * F, G ou H
     * @param usando Define se a Armadura esta sendo Usada, TRUE - Sim. FALSE - Nao
     * @param bonus_atributo Vetor com os Valores dos Bonus de Atributo da Armadura. 
     * Todos os valores devem ser maiores ou iguais a zero(0).
     * @param preco O Preco deve ser um numero inteiro e 
     * maior ou igual a zero(0)
     * @param habilidade_Necessaria Habilidade Necessaria para se usar a Armadura
     * @throws ItemInvalidoException 
     */
    public Armadura(String nome, String descricao,int absorcao_Distancia,
                    int absorcao_CorpoACorpo,int penalidade , char regiao_Do_Corpo,
                    boolean usando, int[] bonus_atributo,
                    int preco, String habilidade_Necessaria) throws ItemInvalidoException {
        super(nome, descricao, usando, bonus_atributo, preco, habilidade_Necessaria);
        setAbsorcao_Distancia(absorcao_Distancia);
        setAbsorcao_CorpoACorpo(absorcao_CorpoACorpo);
        setPenalidade(penalidade);
        setRegiao_Do_Corpo(regiao_Do_Corpo); 
    
    }

    /**
     * Altera a Absorcao de Arma Branca da Armadura
     * @param absorcao_Distancia Absorcao de Arma Branca deve ser um numero
     * inteiro e maior ou igual a zero(0)
     * @throws ItemInvalidoException
     */
    public void setAbsorcao_Distancia(int absorcao_Distancia) throws ItemInvalidoException {
        if(absorcao_Distancia >= 0){
    		this.absorcao_Distancia = absorcao_Distancia;
    	}else{
            throw new ItemInvalidoException("Absorcao de Arma Distancia Invalida,"
                    + " valor Abaixo de Zero(0)");
        }
    }

    /**
     * Retorna a Absorcao de Arma Branca da Armadura
     * @return Absorcao de Arma Branca
     */
    public int getAbsorcao_Distancia() {
        return absorcao_Distancia;
    }

    /**
     * Altera a Absorcao de Arma de Fogo da Armadura
     * @param aabsorcao_CorpoACorpo Absorcao de Arma de corpo a corpo deve ser um numero
     * inteiro e maior ou igual a zero(0)
     * @throws ItemInvalidoException 
     */
    public void setAbsorcao_CorpoACorpo(int absorcao_Arma_De_Fogo) throws ItemInvalidoException {
        if(absorcao_Arma_De_Fogo >= 0){
    		this.absorcao_CorpoACorpo = absorcao_Arma_De_Fogo;
    	}else{
            throw new ItemInvalidoException("Absorcao de Arma de  Corpo a Corpo Invalida,"
                    + " valor Abaixo de Zero(0)");
        }
    }

    /**
     * Retorna a Absorcao de Arma de Fogo da Armadura
     * @return Absorcao de Arma de Fogo
     */
    public int getAbsorcao_CorpoACorpo() {
        return absorcao_CorpoACorpo;
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
            Validar.validarCaractere(regiao_Do_Corpo, caracteresValidos);
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
     * e maior ou igual a zero(0)
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
               "; Absorcao Arma Distancia = " +this.getAbsorcao_Distancia()+
               "; Absorcao Arma de Corpo a Corpo = "+this.getAbsorcao_CorpoACorpo()+
               "; Penalidade = "+this.getPenalidade()+
               "; Regiao do Corpo = "+this.getRegiao_Do_Corpo();
    }
    
}
