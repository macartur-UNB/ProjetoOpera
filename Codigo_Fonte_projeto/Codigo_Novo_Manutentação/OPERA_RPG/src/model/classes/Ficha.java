/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import model.exception.FichaInvalidaException;
import model.exception.PalavraInvalidaException;
import model.validacao.Validar;


public class Ficha implements Serializable{

    //Variaveis
    private String personagem;
    private String jogador;
    private String tipo;
    private String campanha;
    private int experiencia;
    private int atributos[];
    private int dinheiro;
    private ArrayList habilidades=null,caracteristicas=null,
            itensGenericos=null, armasADistancia=null, armasCorpoACorpo=null, armaduras=null;
    
    
    /**
     * Metodo Construtor para criar Fichas
     * @param personagem Nome do personagem. Deve conter apenas caracteres
     * Alfa-Numericos (A-Z, a-z e 0-9)".
     * @param jogador Nome do jogador, ou seja, nome da pessoa que possui
     * o personagem. Deve conter apenas caracteres do Alfabeto (A-Z e a-z)".
     * @param tipo Tipo de personagem, podendo ser: Jogador, NPC ou Monstro.
     * @param campanha Capanha do Personagem. Deve conter apenas caracteres 
     * Alfa-Numericos (A-Z, a-z e 0-9)".
     * @param experiencia Quantidade de Experiencia do Personagem. O valor deve ser
     * maior ou igual a zero(0).
     * @param atributos Vetor com os Valores dos Atributos do personagem. Todos
     * os valores devem ser maiores ou iguais a zero(0).
     * @param dinheiro Quantidade de Dinheiro do personagem. O valor deve ser
     * maior ou igual a zero(0).
     */
    public Ficha(String personagem, String jogador, String tipo, String campanha, int experiencia, int[] atributos, int dinheiro) throws FichaInvalidaException{
        setPersonagem(personagem);
        setJogador(jogador);
        setTipo(tipo);
        setCampanha(campanha);
        setExperiencia(experiencia);
        setAtributos(atributos);
        setDinheiro(dinheiro);
    }
        

    /**
     * Altera o Nome do Personagem.
     * @param personagem Nome do personagem. Deve conter apenas caracteres
     * Alfa-Numericos (A-Z, a-z e 0-9)".
     * @throws FichaInvalidaException
     */
    public void setPersonagem(String personagem) throws FichaInvalidaException{
        try{
            Validar.validarPalavra(personagem, true);
            this.personagem = personagem;
        } catch(PalavraInvalidaException e){
            throw new FichaInvalidaException("Nome de Personagem Invalido."
                    + "\nO Nome deve receber apenas caracteres Alfa-Numericos (A-Z, a-z e 0-9)"
                    + "\n" + e.getMessage());
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
     * @param tipo Tipo de personagem, podendo ser: Jogador, NPC ou Monstro.
     * @throws FichaInvalidaException
     */
    public void setTipo(String tipo) throws FichaInvalidaException{
        try{
            String tiposValidos[] = {"Jogador", "NPC", "Monstro"};
            Validar.validarPalavra(tipo, tiposValidos, true);
            this.tipo = tipo;
        } catch(PalavraInvalidaException e){
            throw new FichaInvalidaException("Tipo de Ficha"
                    + "{" + tipo + "} Invalido."
                    + "\nDeve ser: 'Jogador', 'NPC' ou 'Monstro'");
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
     * @param jogador Nome do jogador, ou seja, nome da pessoa que possui
     * o personagem. Deve conter apenas caracteres do Alfabeto (A-Z e a-z)".
     * @throws FichaInvalidaException
     */
    public void setJogador(String jogador) throws FichaInvalidaException{
        try{
            Validar.validarPalavra(jogador, false);
            this.jogador = jogador;
        } catch(PalavraInvalidaException e){
            throw new FichaInvalidaException("Nome de Jogador Invalido."
                    + "\nO Nome deve receber apenas caracteres Alfa-Numericos (A-Z, a-z e 0-9)"
                    + "\n" + e.getMessage());
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
     * @param campanha Capanha do Personagem. Deve conter apenas caracteres 
     * Alfa-Numericos (A-Z, a-z e 0-9)".
     * @throws FichaInvalidaException
     */
    public void setCampanha(String campanha) throws FichaInvalidaException {
        try{
            Validar.validarPalavra(campanha, true);
            this.campanha = campanha;
        } catch(PalavraInvalidaException e){
            throw new FichaInvalidaException("Campanha Invalida."
                    + "\nA Campanha deve receber apenas caracteres Alfa-Numericos (A-Z, a-z e 0-9)"
                    + "\n" + e.getMessage());
        }
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
     * @param atributos Vetor com os Valores dos Atributos do personagem. Todos
     * os valores devem ser maiores ou iguais a zero(0).
     * @throws FichaInvalidaException
     */
    public void setAtributos(int[] atributos) throws FichaInvalidaException{
        if(atributos == null){
            this.atributos = atributos;
        }else if(atributos.length == 8){
            for(int i = 0; i < atributos.length; i++){
                if(atributos[i] < 0){
                    throw new FichaInvalidaException("Atributo " + Constante_Atributo.ATRIBUTO[i]
                            + " Invalido, valor Abaixo de Zero(0)");
                }
            }
            this.atributos = atributos;
        }else{
            throw new FichaInvalidaException("O campo Atribubos deve receber apenas 8 atributos."
                    + "\nForam recebidos: " + atributos.length);
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
     * @param dinheiro Quantidade de Dinheiro do personagem. O valor deve ser
     * maior ou igual a zero(0).
     * @throws FichaInvalidaException
     */
    public void setDinheiro(int dinheiro) throws FichaInvalidaException{
        if(dinheiro >= 0){
            this.dinheiro = dinheiro;
        }else{
            throw new FichaInvalidaException("Dinheiro Invalido, valor Abaixo "
                    + "de Zero(0)");
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
     * @param experiencia Quantidade de Experiencia do Personagem. O valor deve ser
     * maior ou igual a zero(0).
     * @throws FichaInvalidaException
     */
    public void setExperiencia(int experiencia) throws FichaInvalidaException{
        if(experiencia >= 0){
            this.experiencia = experiencia;
        }else{
            throw new FichaInvalidaException("Experiencia Invalida, valor Abaixo "
                    + "de Zero(0)");
        }
    }

    /**
     * Retorna a Experiencia do Personagem
     * @return Experiencia do Personagem
     */
    public int getExperiencia() {
        return experiencia;
    }

    /*get e set para integracao*/
    public void setCaracteristicas(ArrayList caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public ArrayList getCaracteristicas() {
        return caracteristicas;
    }

    public void setHabilidades(ArrayList habilidades) {
        this.habilidades = habilidades;
    }

    public ArrayList getHabilidades() {
        return habilidades;
    }

    public ArrayList getItensGenericos() {
        return itensGenericos;
    }

    public void setItensGenericos(ArrayList itensGenericos) {
        this.itensGenericos = itensGenericos;
    }

    public ArrayList getArmasADistancia() {
        return armasADistancia;
    }

    public void setArmasADistancia(ArrayList armasADistancia) {
        this.armasADistancia = armasADistancia;
    }

    public ArrayList getArmasCorpoACorpo() {
        return armasCorpoACorpo;
    }

    public void setArmasCorpoACorpo(ArrayList armasCorpoACorpo) {
        this.armasCorpoACorpo = armasCorpoACorpo;
    }

    public ArrayList getArmaduras() {
        return armaduras;
    }

    public void setArmaduras(ArrayList armaduras) {
        this.armaduras = armaduras;
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
               "; Dinheiro = "+this.getDinheiro() +
               "; Atributos = " + Arrays.toString(this.getAtributos())+ "}";
    }
    
}