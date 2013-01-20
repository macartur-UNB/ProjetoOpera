/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;


public class Ficha implements Serializable{
    
    private String personagem;
    private String jogador;
    private String tipo;
    private String campanha;
    private int experiencia;
    private int atributos[];
    private int dinheiro;

    /**
     * metodo para criar NPC e Monstros
     * @param personagem
     * @param tipo
     * @param campanha
     * @param experiencia
     * @param atributos
     * @param dinheiro 
     */
    public Ficha(String personagem, String tipo, String campanha, int experiencia, int[] atributos, int dinheiro) {
        this.jogador = "movido pelo mestre.";
        this.personagem = personagem;
        this.tipo = tipo;
        this.campanha = campanha;
        this.atributos = atributos;
        this.experiencia = experiencia;
        this.dinheiro = dinheiro;
    }
    /**
     * Metodo para criar Personagens
     * @param personagem
     * @param jogador
     * @param tipo
     * @param campanha
     * @param experiencia
     * @param atributos
     * @param dinheiro 
     */
    public Ficha(String personagem, String jogador, String tipo, String campanha, int experiencia, int[] atributos, int dinheiro) {
        this.personagem = personagem;
        this.tipo = tipo;
        this.campanha = campanha;
        this.atributos = atributos;
        this.experiencia = experiencia;
        this.dinheiro = dinheiro;
        this.jogador = jogador;
    }

    public void setPersonagem(String personagem) {
        this.personagem = personagem;
    }

    public String getPersonagem() {
        return personagem;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setJogador(String jogador) {
        this.jogador = jogador;
    }

    public String getJogador() {
        return jogador;
    }

    public void setCampanha(String campanha) {
        this.campanha = campanha;
    }

    public String getCampanha() {
        return campanha;
    }

    public void setAtributos(int[] atributos) {
        this.atributos = atributos;
    }

    public int[] getAtributos() {
        return atributos;
    }

    public void setDinheiro(int dinheiro) {
        this.dinheiro = dinheiro;
    }

    public int getDinheiro() {
        return dinheiro;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getExperiencia() {
        return experiencia;
    }

    @Override
    public String toString() {
        return "Campanha = "+this.getCampanha()+
               "Tipo  = "+this.getTipo()+
               "Personagem = "+this.getPersonagem()+
               "Jogador = "+this.getJogador()+
               "Experiencia = "+this.getExperiencia()+
               "Dinheiro = "+this.getDinheiro();
    }
    
    
    
}
