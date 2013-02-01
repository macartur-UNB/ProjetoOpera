/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.classes;

import model.exception.HabilidadeInvalidaException;
import java.io.Serializable;



public class Habilidade implements Serializable{
    
    private int teste;
    private int nivel;
    private int custo;
    private String nome;
    private String tipo;

    /**
     * Metodo Construtor para Criar Habilidades.
     * @param teste 
     * @param nivel Nivel da Habilidade.
     * @param custo Custo da Habilidade.
     * @param nome Nome da Habilidade.
     * @param tipo Tipo da Habilidade.
     */
    public Habilidade(int teste, int nivel, int custo, String nome, String tipo) {
        this.teste = teste;
        this.nivel = nivel;
        this.custo = custo;
        this.nome = nome;
        this.tipo = tipo;
    }

    /**
     * Altera o Custo da Habilidade.
     * @param custo Custo da Habildiade.
     */
    public void setCusto(int custo) throws HabilidadeInvalidaException {
        this.custo = custo;
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
     * @param nivel Nivel da Habilidade.
     */
    public void setNivel(int nivel){
        this.nivel = nivel;
    }

    /**
     * Retorna o Nivel da Habilidade.
     * @return Nivel da Habilidade.
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * Altera o Nome da Habilidade.
     * @param nome Nome da Habilidade.
     */
    public void setNome(String nome) throws HabilidadeInvalidaException {
        this.nome = nome;
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
     * @param teste 
     */
    public void setTeste(int teste) {
        this.teste = teste;
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
     * @param Tipo da Habilidade
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
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
               "Tipo = "+this.getTipo()+
               "Nivel = "+this.getNivel()+
               "Teste = "+this.getTeste()+
               "Custo = "+this.getCusto();
    }
    
}
