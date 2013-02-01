/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.classes;

import java.io.Serializable;


public class Ficha implements Serializable{

    //Variaveis
    private String personagem;
    private String jogador;
    private String tipo;
    private String campanha;
    private int experiencia;
    private int atributos[];
    private int dinheiro;
 
    /**
     * Metodo Construtor para criar Personagens
     * @param personagem Nome do personagem.
     * @param jogador Nome do jogador, ou seja, nome da pessoa que possui o personagem.
     * @param tipo Tipo de personagem, podendo ser: NPC ou Monstro.
     * @param campanha Campanha do personagem.
     * @param experiencia Quantidade de experiencia do personagem.
     * @param atributos Vetor com os atributos do personagem.
     * @param dinheiro Quantidade de Dinheiro do personagem.
     */
    
    
    
    public Ficha(String personagem, String jogador, String tipo, String campanha, int experiencia, int[] atributos, int dinheiro){
        this.jogador = jogador;
        this.personagem = personagem;
        this.tipo = tipo;
        this.campanha = campanha;
        this.atributos = atributos;
        this.experiencia = experiencia;
        this.dinheiro = dinheiro;
    }
    

    /**
     * Altera o Nome do Personagem.
     * @param personagem Nome do personagem.
     */
    public void setPersonagem(String personagem){
        this.personagem = personagem;
    }

    /**
     * Retorna o Nome do Personagem.
     * @return Nome do Personagem.
     */
    public String getPersonagem(){
        return personagem;
    }

    /**
     * Altera o Tipo de Personagem (Jogador, NPC, ou Monstro).
     * @param tipo Tipo de personagem, podendo ser: NPC ou Monstro.
     */
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    /**
     * Retorna o Tipo de Ficha.
     * @return Tipo de Ficha.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Altera o Nome do Jogador.
     * @param jogador Nome do jogador, ou seja, nome da pessoa que possui
     * o personagem.
     */
    public void setJogador(String jogador){
        this.jogador = jogador;
    }

    /**
     * Retorna o Nome do Jogador.
     * @return Nome do Jogador.
     */
    public String getJogador() {
        return jogador;
    }

    /**
     * Alterar Campanha do Personagem.
     * @param campanha Capanha do Personagem.
     */
    public void setCampanha(String campanha) {
        this.campanha = campanha;
    }

    /**
     * Retorna a Campanha do Personagem.
     * @return Capanha do Personagem.
     */
    public String getCampanha() {
        return campanha;
    }

    /**
     * Altera os Atributos do Personagem.
     * @param atributos Vetor com os atributos do personagem.
     */
    public void setAtributos(int[] atributos){
        this.atributos = atributos;
    }

    
    /**
     * Retorna os Atributos do Personagem.
     * @return Atributos do Personagem.
     */
    public int[] getAtributos() {
        return atributos;
    }

    /**
     * Altera a Quantidade de Dinheiro do Personagem.
     * @param dinheiro Quantidade de Dinheiro do personagem.
     */
    public void setDinheiro(int dinheiro){
        this.dinheiro = dinheiro;
    }

    /**
     * Retorna o Dinheiro do Personagem.
     * @return Dinheiro do Personagem.
     */
    public int getDinheiro() {
        return dinheiro;
    }

    /**
     * Altera a Quantidade de Experiencia do Personagem
     * @param experiencia Quantidade de Experiencia do Personagem.
     */
    public void setExperiencia(int experiencia){
        this.experiencia = experiencia;
    }

    /**
     * Retorna a Experiencia do Personagem
     * @return Experiencia do Personagem
     */
    public int getExperiencia() {
        return experiencia;
    }

    /**
     * Retorna os Dados do Personagem
     * @return Dados do Personagem
     */
    @Override
    public String toString() {
        return "{Personagem = "+this.getPersonagem()+
               "; Jogador = "+this.getJogador()+
               "; Campanha = "+this.getCampanha()+
               "; Tipo = "+this.getTipo()+
               "; Experiencia = "+this.getExperiencia()+
               "; Dinheiro = "+this.getDinheiro() + "}";
    }
    
}
