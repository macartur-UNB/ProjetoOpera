/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.classes;

import java.io.Serializable;
import java.util.Arrays;

import model.exception.CaracteristicaInvalidaException;
import model.exception.PalavraInvalidaException;
import model.validacao.Validar;


public class Caracteristica  implements Serializable{
    private String nome;
    private String descricao;
    private String tipo;
    private int[] modificador = null;
    private int custo;

    /**
     * 
     * @param nome Nome da Caracteristica. Deve conter apenas caracteres
     * Alfa-Numericos (A-Z, a-z e 0-9)".
     * @param descricao Descricao da Caracteristica. Deve conter apenas caracteres
     * Alfa-Numericos (A-Z, a-z e 0-9)".
     * @param tipo Tipo de Caracteristica, podendo ser: Fisica, Psiquica ou Racial.
     * @param custo Custo necessario para ter a Caracteristica. O custo deve ser
     * um numero inteiro e maior ou igual a zero(0)
     * @throws CaracteristicaInvalidaException 
     */
    public Caracteristica(String nome, String descricao, String tipo, int custo) throws CaracteristicaInvalidaException {
        setNome(nome);
        setDescricao(descricao);
        setTipo(tipo);
        setCusto(custo);
    }

    /**
     * 
     * @param nome Nome da Caracteristica. Deve conter apenas caracteres
     * Alfa-Numericos (A-Z, a-z e 0-9)".
     * @param descricao Descricao da Caracteristica. Deve conter apenas caracteres
     * Alfa-Numericos (A-Z, a-z e 0-9)".
     * @param tipo Tipo de Caracteristica, podendo ser: Fisica, Psiquica ou Racial.
     * @param modificador Vetor com os Valores dos Modificadores da Caracteristica. Todos
     * os valores devem ser maiores ou iguais a zero(0).
     * @param custo Custo necessario para ter a Caracteristica
     * @throws CaracteristicaInvalidaException 
     */
    public Caracteristica(String nome, String descricao, String tipo, int[] modificador, int custo) throws CaracteristicaInvalidaException {
        this(nome,descricao,tipo,custo);
        setModificador(modificador);
     }
    
    /**
     * Altera o Nome da Caracteristica
     * @param nome Nome da Caracteristica. Deve conter apenas caracteres
     * Alfa-Numericos (A-Z, a-z e 0-9)".
     * @throws CaracteristicaInvalidaException
     */
    public void setNome(String nome) throws CaracteristicaInvalidaException{
    	try{
            Validar.validarPalavra(nome, true);
            this.nome = nome;
        } catch(PalavraInvalidaException e){
            throw new CaracteristicaInvalidaException("Nome de Caracteristica Invalido."
                    + "\nO Nome deve receber apenas caracteres Alfa-Numericos (A-Z, a-z e 0-9)"
                    + "\n" + e.getMessage());
        }
    }

    /**
     * Retorna o Nome da Caracteristica
     * @return Nome da Caracteristica
     */
    public String getNome() {
        return nome;
    }

    
    /**
     * Altera a Descricao da Caracteristica
     * @param descricao Descricao da Caracteristica. Deve conter apenas caracteres
     * Alfa-Numericos (A-Z, a-z e 0-9)".
     * @throws CaracteristicaInvalidaException
     */
    public void setDescricao(String descricao) throws CaracteristicaInvalidaException {
    	try{
            Validar.validarPalavra(descricao, true);
            this.descricao = descricao;
        } catch(PalavraInvalidaException e){
            throw new CaracteristicaInvalidaException("Nome de Caracteristica Invalido."
                    + "\nO Nome deve receber apenas caracteres Alfa-Numericos (A-Z, a-z e 0-9)"
                    + "\n" + e.getMessage());
        }
    }

    /**
     * Retorna a Descricao da Caracteristica
     * @return Descricao da Caracteristica
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Altera o Tipo da Caracteristica (Fisica, Psiquica, ou Racial).
     * @param tipo Tipo de Caracteristica, podendo ser: Fisica, Psiquica ou Racial.
     * @throws CaracteristicaInvalidaException
     */
    public void setTipo(String tipo) throws CaracteristicaInvalidaException {
    	try{
            String tiposValidos[] = {"Fisica", "Psiquica", "Racial"};
            Validar.validarPalavra(tipo, tiposValidos, true);
            this.tipo = tipo;
        } catch(PalavraInvalidaException e){
            throw new CaracteristicaInvalidaException("Tipo de Ficha"
                    + "{" + tipo + "} Invalido."
                    + "\nDeve ser: 'Fisica', 'Psiquica' ou 'Racial'");
        }
    }

    /**
     * Retorna o Tipo da Caracteristica
     * @return Tipo da Caracteristica
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Altera os Modificadores da Caracteristica.
     * @param modificador Vetor com os Valores dos Modificadores da Caracteristica. Todos
     * os valores devem ser maiores ou iguais a zero(0).
     * @throws CaracteristicaInvalidaException
     */
    public void setModificador(int[] modificador) throws CaracteristicaInvalidaException {
    	if(modificador == null){
            this.modificador = modificador;
        }else if(modificador.length == 8){
            for(int i = 0; i < modificador.length; i++){
                if(modificador[i] < 0){
                    throw new CaracteristicaInvalidaException("Modificador " + Constante_Atributo.ATRIBUTO[i]
                            + " Invalido, valor Abaixo de Zero(0)");
                }
            }
            this.modificador = modificador;
        }else{
            throw new CaracteristicaInvalidaException("O campo Modificadores deve receber apenas 8 modificadores."
                    + "\nForam recebidos: " + modificador.length);
        }
    }

    /**
     * Retorna os Modificadores da Caracteristica
     * @return Modificadores da Caracteristica
     */
    public int[] getModificador() {
        return modificador;
    }

    /**
     * Altera o Custo da Caracteristica
     * @param custo Custo necessario para ter a Caracteristica. O custo deve ser
     * um numero inteiro e maior ou igual a zero(0)
     * @throws CaracteristicaInvalidaException
     */
    public void setCusto(int custo) throws CaracteristicaInvalidaException {
    	if(custo >= 0){
    		this.custo = custo;
    	}else{
            throw new CaracteristicaInvalidaException("Custo Invalido, valor Abaixo "
                    + "de Zero(0)");
        }
    }

    /**
     * Retorna o Custo da Caracteristica
     * @return Custo da Caracteristica
     */
    public int getCusto() {
        return custo;
    }

    @Override
    public String toString() {
        return "Nome = "+this.getNome()+
               "; Descricao = "+this.getDescricao()+
               "; Tipo = "+this.getTipo()+
               "; Custo = "+this.getCusto()+
               "; Modificadores = " + Arrays.toString(this.getModificador());
    }
    
}
