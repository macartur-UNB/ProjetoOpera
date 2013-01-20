/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import exception.HabilidadeInvalidaException;
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
     * Entradas Validas: Numeros Naturais.
     * @param custo Custo da Habildiade.
     * @exception HabilidadeInvalidaException se o Custo da Habilidade for 
     * invalido.
     */
    public void setCusto(int custo) throws HabilidadeInvalidaException {
        if(custo >= 0){
            this.custo = custo;
        }
        else{
            throw new HabilidadeInvalidaException("Custo Invalido, deve ser um"
                    + " Numero Natural");
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
     * Entradas Validas: Numeros Naturais.
     * @param nivel Nivel da Habilidade.
     * @exception HabilidadeInvalidaException se a Habilidade for invalida.
     */
    public void setNivel(int nivel) throws HabilidadeInvalidaException {
        if(nivel >= 0){
            this.nivel = nivel;
        }
        else{
            throw new HabilidadeInvalidaException("Nivel Invalido, deve ser um"
                    + " Numero Natural");
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
     * Altera o Nome da Habilidade.
     * Caracteres Validos: Numeros e Letras sem caracteres especiais.
     * @param nome Nome da Habilidade.
     * @exception HabilidadeInvalidaException se o Nome da Habilidade for
     * invalido.
     */
    public void setNome(String nome) throws HabilidadeInvalidaException {
        if(Validacoes.getInstance().validarCaracteresNome(nome, true)){
            this.nome = nome;
        }
        else{
            throw new HabilidadeInvalidaException("Nome Invalido, deve ser um"
                    + " deve conter apenas Numeros e"
                    + " Letras sem caracteres especiais");
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
