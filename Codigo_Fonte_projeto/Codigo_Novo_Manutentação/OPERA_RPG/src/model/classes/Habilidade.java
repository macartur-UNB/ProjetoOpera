/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.classes;

import java.io.Serializable;
import model.exception.HabilidadeInvalidaException;
import model.exception.PalavraInvalidaException;
import model.validacao.ValidarPalavra;



public class Habilidade implements Serializable{
    
    private int teste;
    private int nivel;
    private int custo;
    private String nome;
    private String tipo;

    /**
     * Metodo Construtor para Criar Habilidades.
     * @param teste Teste da Habilidade. O Teste deve ser um numero inteiro 
     * e maior que zero(0)
     * @param nivel Nivel da Habilidade. O Nivel deve ser um numero inteiro 
     * e maior que zero(0)
     * @param custo Custo necessario para ter a Habilidade. O Custo deve ser
     * um numero inteiro e maior que zero(0)
     * @param nome Nome da Habilidade. Deve conter apenas caracteres
     * Alfa-Numericos (A-Z, a-z e 0-9)".
     * @param tipo Tipo de Habilidade. Pode ser: Fisica, Psiquica ou Belica.
     * @throws HabilidadeInvalidaException
     */
    public Habilidade(int teste, int nivel, int custo, String nome, String tipo) throws HabilidadeInvalidaException {
        setTeste(teste);
        setNivel(nivel);
        setCusto(custo);
        setNome(nome);
        setTipo(tipo);
    }

    /**
     * Altera o Custo da Habilidade
     * @param custo Custo necessario para ter a Habilidade. O Custo deve ser
     * um numero inteiro e maior que zero(0)
     * @throws HabilidadeInvalidaException
     */
    public void setCusto(int custo) throws HabilidadeInvalidaException {
    	if(custo >= 0){
    		this.custo = custo;
    	}else{
            throw new HabilidadeInvalidaException("Custo Invalido, valor Abaixo "
                    + "de Zero(0)");
        }
    }

    /**
     * Retorna o Custo da Habilidade.
     * @return Custo da Habilidade.
     */
    public int getCusto() {
        return custo;
    }

    /**
     * Altera o Nivel da Habilidade.
     * @param nivel Nivel da Habilidade. O Nivel deve ser um numero inteiro 
     * e maior que zero(0)
     * @throws HabilidadeInvalidaException
     */
    public void setNivel(int nivel) throws HabilidadeInvalidaException{
        if(nivel >= 0){
    		this.nivel = nivel;
    	}else{
            throw new HabilidadeInvalidaException("Custo Invalido, valor Abaixo "
                    + "de Zero(0)");
        }
    }

    /**
     * Retorna o Nivel da Habilidade.
     * @return Nivel da Habilidade.
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * Altera o Nome da Habilidade
     * @param nome Nome da Habilidade. Deve conter apenas caracteres
     * Alfa-Numericos (A-Z, a-z e 0-9)".
     * @throws HabilidadeInvalidaException
     */
    public void setNome(String nome) throws HabilidadeInvalidaException{
    	try{
            ValidarPalavra.validarPalavra(nome, true);
            this.nome = nome;
        } catch(PalavraInvalidaException e){
            throw new HabilidadeInvalidaException("Nome de Habilidade Invalido."
                    + "\nO Nome deve receber apenas caracteres Alfa-Numericos (A-Z, a-z e 0-9)"
                    + "\n" + e.getMessage());
        }
    }

    /**
     * Retorna o Nome da Habilidade
     * @return Nome da Habilidade
     */
    public String getNome() {
        return nome;
    }

    /**
     * Altera o Teste da Habilidade
     * @param teste Teste da Habilidade. O Teste deve ser um numero inteiro 
     * e maior que zero(0)
     */
    public void setTeste(int teste) throws HabilidadeInvalidaException {
        if(teste >= 0){
    		this.teste = teste;
    	}else{
            throw new HabilidadeInvalidaException("Teste Invalido, valor Abaixo "
                    + "de Zero(0)");
        }
    }

    /**
     * Retorna o Teste da Habilidade
     * @return Teste
     */
    public int getTeste() {
        return teste;
    }

    /**
     * Altera o Tipo da Habilidade
     * @param tipo Tipo de Habilidade. Pode ser: Fisica, Psiquica ou Belica.
     * @throws HabilidadeInvalidaException
     */
    public void setTipo(String tipo) throws HabilidadeInvalidaException {
        try{
            String tiposValidos[] = {"Fisica", "Psiquica", "Belica"};
            ValidarPalavra.validarPalavra(tipo, tiposValidos, true);
            this.tipo = tipo;
        } catch(PalavraInvalidaException e){
            throw new HabilidadeInvalidaException("Tipo de Habilidade Invalido."
                    + "\nDeve ser: 'Fisica', 'Psiquica' ou 'Belica'");
        }
    }

    /**
     * Retorna o Tipo da Habilidade
     * @return Tipo da Habilidade
     */
    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Nome = "+this.getNome()+
               "; Tipo = "+this.getTipo()+
               "; Nivel = "+this.getNivel()+
               "; Teste = "+this.getTeste()+
               "; Custo = "+this.getCusto();
    }
    
}
