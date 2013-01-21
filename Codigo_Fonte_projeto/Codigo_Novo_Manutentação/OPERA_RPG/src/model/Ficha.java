/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import exception.FichaInvalidaException;
import java.io.Serializable;


public class Ficha implements Serializable{
    
    //Constantes
    /**
     * Possui o Indice que representa o Fisico nos Atributos
     */
    public final int FISICO = 0;
    
    /**
     * Possui o Indice que representa a Destreza nos Atributos
     */
    public final int DESTREZA = 1;
    
    /**
     * Possui o Indice que representa a Inteligencia nos Atributos
     */
    public final int INTELIGENCIA = 2;
    
    /**
     * Possui o Indice que representa a Vontade nos Atributos
     */
    public final int VONTADE = 3;
    
    /**
     * Possui o Indice que representa a Percepcao nos Atributos
     */
    public final int PERCEPCAO = 4;
    
    /**
     * Possui o Indice que representa a Mana nos Atributos
     */
    public final int MANA = 5;
    
    /**
     * Possui o Indice que representa a Mente nos Atributos
     */
    public final int MENTE = 6;
    
    /**
     * Possui o Indice que representa a Sorte nos Atributos
     */
    public final int SORTE = 7;
    
    /**
     * Cada Indice da String corresponde ao Indice nos Atributos
     */
    public final String[] nomeAtributo = {"Fisico", "Destreza", "Inteligencia", 
        "Vontade", "Percepcao", "Mana", "Mente", "Sorte"};
    
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
    public Ficha(String personagem, String jogador, String tipo, String campanha,
                 int experiencia, int[] atributos, int dinheiro) 
                                                 throws FichaInvalidaException {
        this.setJogador(jogador);
        this.setPersonagem(personagem);
        this.setTipo(tipo);
        this.setCampanha(campanha);
        this.setAtributos(atributos);
        this.setExperiencia(experiencia);
        this.setDinheiro(dinheiro);
    }
    
    /**
     * Metodo Construtor para criar NPC e Monstros
     * @param personagem Nome do personagem.
     * @param tipo Tipo de personagem, podendo ser: NPC ou Monstro.
     * @param campanha Campanha do personagem.
     * @param experiencia Quantidade de experiencia do personagem.
     * @param atributos Vetor com os atributos do personagem.
     * @param dinheiro Quantidade de Dinheiro do personagem.
     */
    public Ficha(String personagem, String tipo, String campanha,
                 int experiencia, int[] atributos, int dinheiro)
                                                 throws FichaInvalidaException {
        this.setJogador("Movido Pelo Mestre");
        this.setPersonagem(personagem);
        this.setTipo(tipo);
        this.setCampanha(campanha);
        this.setAtributos(atributos);
        this.setExperiencia(experiencia);
        this.setDinheiro(dinheiro);
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
    public void setAtributos(int[] atributos) throws FichaInvalidaException {
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
    public void setExperiencia(int experiencia) throws FichaInvalidaException {
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
        return "Personagem = "+this.getPersonagem()+
               "Jogador = "+this.getJogador()+
               "Campanha = "+this.getCampanha()+
               "Tipo  = "+this.getTipo()+
               "Experiencia = "+this.getExperiencia()+
               "Dinheiro = "+this.getDinheiro();
    }
    
}
