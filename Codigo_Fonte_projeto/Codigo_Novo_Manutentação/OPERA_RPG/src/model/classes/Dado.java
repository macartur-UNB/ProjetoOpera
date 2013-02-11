/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.classes;

import java.io.Serializable;
import model.exception.DadoInvalidoException;


public class Dado implements Serializable {
    
    private int lados;
    private int rolagem;

    /**
     * 
     * @param lados Lados do Dado (numero de Lados que o Dado tem). O numero 
     * de Lados deve ser um numero inteiro e maior que zero(0)
     * @param rolagem Rolagem do Dado (Quantas vezes ele sera rolado). A Rolagem 
     * deve ser um numero inteiro e maior que zero(0)
     * @throws DadoInvalidoException 
     */
    public Dado(int lados, int rolagem) throws DadoInvalidoException {
        setLados(lados);
        setRolagem(rolagem);
    }

    /**
     * Altera a Rolagem do Dado
     * @param rolagem Rolagem do Dado (Quantas vezes ele sera rolado). A Rolagem 
     * deve ser um numero inteiro e maior que zero(0)
     * @throws DadoInvalidoException 
     */
    public void setRolagem(int rolagem) throws DadoInvalidoException {
        if(rolagem > 0){
    		this.rolagem = rolagem;
    	}else{
            throw new DadoInvalidoException("Rolagem Invalida, valor Abaixo "
                    + "de Zero(0)");
        }
    }

    /**
     * Retorna a Rolagem do Dado
     * @return Rolagem do Dado
     */
    public int getRolagem() {
        return rolagem;
    }

    /**
     * Altera o numero de Lados do Dado
     * @param lados Lados do Dado (numero de Lados que o Dado tem). O numero 
     * de Lados deve ser um numero inteiro e maior que zero(0)
     */
    public void setLados(int lados) throws DadoInvalidoException {
        if(lados > 0){
    		this.lados = lados;
    	}else{
            throw new DadoInvalidoException("Lados do Dado Invalido, valor Abaixo "
                    + "de Zero(0)");
        }
    }

    /**
     * Retorna o numero de Lados do Dado
     * @return Lados do Dado
     */
    public int getLados() {
        return lados;
    }

    @Override
    public String toString() {
        return +this.getRolagem()+"d"+this.getLados() ;
    }
      
    
}
