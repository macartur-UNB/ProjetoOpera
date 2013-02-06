/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.classes;

import java.io.Serializable;
import model.exception.FichaInvalidaException;
import model.exception.PalavraInvalidaException;
import model.validacao.ValidarPalavra;


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
     * Metodo Construtor para criar Fichas
     * @param personagem Nome do personagem.
     * @param jogador Nome do jogador, ou seja, nome da pessoa que possui o personagem.
     * @param tipo Tipo de personagem, podendo ser: NPC ou Monstro.
     * @param campanha Campanha do personagem.
     * @param experiencia Quantidade de experiencia do personagem.
     * @param stringAtributos Vetor com os stringAtributos do personagem.
     * @param dinheiro Quantidade de Dinheiro do personagem.
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
    
    public Ficha(){
        
    }
    

    /**
     * Altera o Nome do Personagem.
     * @param personagem Nome do personagem. Deve conter apenas caracteres
     * Alfa-Numericos (A-Z, a-z e 0-9)".
     * @throws FichaInvalidaException
     */
    public void setPersonagem(String personagem) throws FichaInvalidaException{
        try{
            ValidarPalavra.validarPalavra(personagem, true);
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
            ValidarPalavra.validarPalavra(tipo, tiposValidos, true);
            this.tipo = tipo;
        } catch(PalavraInvalidaException e){
            throw new FichaInvalidaException("Tipo de Ficha Invalido."
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
     * o personagem. Deve conter apenas caracteres Alfabeto (A-Z e a-z)".
     * @throws FichaInvalidaException
     */
    public void setJogador(String jogador) throws FichaInvalidaException{
        try{
            ValidarPalavra.validarPalavra(jogador, false);
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
            ValidarPalavra.validarPalavra(campanha, true);
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
     * os valores devem ser maiores ou iguais a zero(0), e o Vetor deve ter
     * tamanho igual a oito(8), pois sao 8 Tipos de Atributos na Ficha
     * @throws FichaInvalidaException
     */
    public void setAtributos(int[] atributos) throws FichaInvalidaException{
        try{
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
        } catch(NumberFormatException | NullPointerException e){
            throw new FichaInvalidaException("Atributos invalidos, certifique-se de que os valores"
                    + "\ndos Atributos sao Numericos Maiores ou Iguais a Zero, "
                    + "Inteiros, e que sao Oito Atributos.");
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
        try{
            if(dinheiro >= 0){
                this.dinheiro = dinheiro;
            }else{
                throw new FichaInvalidaException("Dinheiro Invalido, valor Abaixo"
                        + "de Zero(0)");
            }
        } catch(NumberFormatException e){
            throw new FichaInvalidaException("Dinheiro Invalido, certifique-se de que o"
                    + "Valor do Dinheiro eh Numerico, Maior ou Igual a Zero e Inteiro.");
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
        try{
            if(experiencia >= 0){
                this.experiencia = experiencia;
            }else{
                throw new FichaInvalidaException("Experiencia Invalida, valor Abaixo"
                        + "de Zero(0)");
            }
        } catch(NumberFormatException e){
            throw new FichaInvalidaException("Experiencia Invalida, certifique-se de que o"
                    + "Valor da Experiencia eh Numerico, Maior ou Igual a Zero e Inteiro.");
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
        return "{Personagem = "+this.getPersonagem()+
               "; Jogador = "+this.getJogador()+
               "; Campanha = "+this.getCampanha()+
               "; Tipo = "+this.getTipo()+
               "; Experiencia = "+this.getExperiencia()+
               "; Dinheiro = "+this.getDinheiro() + "}";
    }
    
}
