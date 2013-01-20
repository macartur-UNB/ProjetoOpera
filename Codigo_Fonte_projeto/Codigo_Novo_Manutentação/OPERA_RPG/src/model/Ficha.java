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
     * @exception FichaInvalidaException se algum dos Parametros for Invalido.
     */
    public Ficha(String personagem, String jogador, String tipo, String campanha, int experiencia, int[] atributos, int dinheiro) throws FichaInvalidaException {
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
     * @exception FichaInvalidaException se algum dos Parametros for Invalido.
     */
    public Ficha(String personagem, String tipo, String campanha, int experiencia, int[] atributos, int dinheiro) throws FichaInvalidaException {
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
     * Caracteres Validos: Numeros e Letras sem caracteres especiais.
     * @param personagem Nome do personagem.
     * @exception FichaInvalidaException se o Nome do Personagem for Invalido.
     */
    public void setPersonagem(String personagem) throws FichaInvalidaException {
        if(Validacoes.getInstance().validarCaracteresNome(personagem, true)){
            this.personagem = personagem;
        }
        else{
            throw new FichaInvalidaException("Nome de Personagem Invalido,"
                    + " deve conter apenas Numeros e"
                    + " Letras sem caracteres especiais");
        }
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
     * Entradas Validas: Jogador, NPC ou Monstro.
     * @param tipo Tipo de personagem, podendo ser: NPC ou Monstro.
     * @exception FichaInvalidaException se o Tipo de Personagem for Invalido.
     */
    public void setTipo(String tipo) throws FichaInvalidaException {
        if( (tipo.toLowerCase().equals("jogador")) && 
                (tipo.toLowerCase().equals("npc"))&&
                (tipo.toLowerCase().equals("monstro"))){
            this.tipo = tipo;
        }
        else{
            throw new FichaInvalidaException("Tipo de Ficha Invalido, deve ser "
                    + "Jogador, NPC ou Monstro");
        }
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
     * Caracteres Validos: Letras sem caracteres especiais.
     * @param jogador Nome do jogador, ou seja, nome da pessoa que possui
     * o personagem.
     * @exception FichaInvalidaException se o Nome do jogador for Invalido.
     */
    public void setJogador(String jogador) throws FichaInvalidaException {
        if(Validacoes.getInstance().validarCaracteresNome(jogador, false)){
            this.jogador = jogador;
        }else{
            throw new FichaInvalidaException("Nome de Jogador Invalido,"
                    + " deve conter apenas Numeros e"
                    + " Letras sem caracteres especiais");
        }
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
     * Caracteres Validos: Numeros e Letras sem caracteres especiais.
     * @param campanha Capanha do Personagem.
     * @exception FichaInvalidaException se a Campanha do Personagem
     * for Invalida.
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
     * Entradas Validas: Numeros Naturais.
     * @param atributos Vetor com os atributos do personagem.
     * @exception FichaInvalidaException se algum dos Atributos for Invalido.
     */
    public void setAtributos(int[] atributos) throws FichaInvalidaException {
        
        int indiceInvalido = -1;
        for(int i = 0; i < atributos.length; i++){
            if(atributos[i] < 0){
                indiceInvalido = i;
                continue;
            }
        }
        
        if(indiceInvalido == -1){
            this.atributos = atributos;
        }
        else{
            throw new FichaInvalidaException("Atributo " + 
                    nomeAtributo[indiceInvalido] + " Invalido, deve ser"
                    + " um Numero Natural");
        }
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
     * Entradas Validas: Numeros Naturais.
     * @param dinheiro Quantidade de Dinheiro do personagem.
     * @exception FichaInvalidaException se a Quantidade de Dinheiro 
     * for Invalida.
     */
    public void setDinheiro(int dinheiro) throws FichaInvalidaException {
        if(dinheiro >= 0){
            this.dinheiro = dinheiro;
        }
        else{
            throw new FichaInvalidaException("Dinheiro Invalido, deve ser um"
                    + " Numero Natural");
        }
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
     * Entradas Validas: Numeros Naturais.
     * @param experiencia Quantidade de Experiencia do Personagem.
     * @exception FichaInvalidaException se a Quantidade de Experiencia do
     * Personagem for Invalido.
     */
    public void setExperiencia(int experiencia) throws FichaInvalidaException {
        if(experiencia >= 0){
            this.experiencia = experiencia;
        }
        else{
            throw new FichaInvalidaException("Expericia Invalida, deve ser um"
                    + " Numero Natural");
        }
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
