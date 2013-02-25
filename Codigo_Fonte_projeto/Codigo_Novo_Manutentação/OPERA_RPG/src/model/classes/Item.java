/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.classes;

import control.Controle_Habilidade;
import java.io.Serializable;
import java.util.Arrays;

import model.exception.ItemInvalidoException;
import model.exception.PalavraInvalidaException;
import model.validacao.Validar;

public class Item implements Serializable {

    private String nome;
    private String descricao;
    private boolean usando = false;
    private int[] bonus_atributo = null;  
    private int preco;
    private String habilidade_Necessaria = null;

    /**
     * 
     * @param nome Nome do Item. Deve conter apenas caracteres
     * Alfa-Numericos (A-Z, a-z e 0-9)".
     * @param descricao Descricao do Item. Deve conter apenas caracteres
     * Alfa-Numericos (A-Z, a-z e 0-9)".
     * @param preco  O Preco deve ser um numero inteiro e 
     * maior ou igual a zero(0)
     * @throws ItemInvalidoException 
     */
    public Item(String nome, String descricao, int preco) throws ItemInvalidoException {
        setNome(nome);
        setDescricao(descricao);
        setPreco(preco);
    }
    
    /**
     * 
     * @param Nome do Item. Deve conter apenas caracteres
     * Alfa-Numericos (A-Z, a-z e 0-9)".
     * @param descricao Descricao do Item. Deve conter apenas caracteres
     * Alfa-Numericos (A-Z, a-z e 0-9)".
     * @param usando Define se o Item esta sendo Usado, TRUE - Sim. FALSE - Nao
     * @param preco Preco do Item. Deve ser um numero inteiro e 
     * maior ou igual a zero(0)
     * @throws ItemInvalidoException 
     */
     public Item(String nome, String descricao, boolean usando, int preco) throws ItemInvalidoException {
        this(nome,descricao,preco);
        setUsando(usando);
    }
    
    /**
     * 
     * @param nome Nome do Item. Deve conter apenas caracteres
     * Alfa-Numericos (A-Z, a-z e 0-9)".
     * @param descricao Descricao do Item. Deve conter apenas caracteres
     * Alfa-Numericos (A-Z, a-z e 0-9)".
     * @param usando Define se o Item esta sendo Usado, TRUE - Sim. FALSE - Nao
     * @param bonus_atributo Vetor com os Valores dos Bonus de Atributo do Item. 
     * Todos os valores devem ser maiores ou iguais a zero(0).
     * @param preco O Preco deve ser um numero inteiro e 
     * maior ou igual a zero(0)
     * @param habilidade_Necessaria Habilidade Necessaria para se usar o Item
     * @throws ItemInvalidoException 
     */
    public Item(String nome, String descricao, boolean usando, int[] bonus_atributo,
                int preco, String habilidade_Necessaria) throws ItemInvalidoException {
        this(nome,descricao,preco);
        setUsando(usando);
        setBonus_atributo(bonus_atributo);
        setHabilidade_Necessaria(habilidade_Necessaria);
    }

    /**
     * Altera o Nome do Item
     * @param nome Nome do Item. Deve conter apenas caracteres
     * Alfa-Numericos (A-Z, a-z e 0-9)".
     * @throws ItemInvalidoException
     */
    public void setNome(String nome) throws ItemInvalidoException {
        try{
            Validar.validarPalavra(nome, true);
            this.nome = nome;
        } catch(PalavraInvalidaException e){
            throw new ItemInvalidoException("Nome do Item Invalido."
                    + "\nO Nome deve receber apenas caracteres Alfa-Numericos (A-Z, a-z e 0-9)"
                    + "\n" + e.getMessage());
        }
    }

    /**
     * Retorna o Nome do Item
     * @return Nome do Item
     */
    public String getNome() {
        return nome;
    }

    /**
     * Altera a Descricao do Item
     * @param descricao Descricao do Item. Deve conter apenas caracteres
     * Alfa-Numericos (A-Z, a-z e 0-9)".
     * @throws ItemInvalidoException
     */
    public void setDescricao(String descricao) throws ItemInvalidoException {
        try{
            Validar.validarPalavra(descricao, true);
            this.descricao = descricao;
        } catch(PalavraInvalidaException e){
            throw new ItemInvalidoException("Descricao do Item Invalida."
                    + "\nO Nome deve receber apenas caracteres Alfa-Numericos (A-Z, a-z e 0-9)"
                    + "\n" + e.getMessage());
        }
    }

    /**
     * Retorna a Descricao do Item
     * @return Descricao do Item
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Altera o estado do Item, quanto a Se esta Usando
     * @param usando Define se o Item esta sendo Usado, TRUE - Sim. FALSE - Nao
     */
    public void setUsando(boolean usando) {
        this.usando = usando;
    }

   
    /**
     * Retorna se o Item esta sendo Usado
     * @return item esta sendo usado? TRUE - Sim. FALSE - Nao
     */
    public boolean isUsando(){
       return this.usando;
    }    

    /**
     * Altera o Preco do Item
     * @param preco Preco do Item. O Preco deve ser um numero inteiro e 
     * maior ou igual a zero(0)
     * @throws ItemInvalidoException
     */
    public void setPreco(int preco) throws ItemInvalidoException {
        if(preco >=0){
    		this.preco = preco;
    	}else{
            throw new ItemInvalidoException("Preco Invalido, valor Abaixo "
                    + "de Zero(0)");
        }
    }

    /**
     * Retorna o Preco do Item
     * @return Preco do Item
     */
    public int getPreco() {
        return preco;
    }

    /**
     * Altera o Bonus de Atributo do Item
     * @param bonus_atributo Vetor com os Valores dos Bonus de Atributo do Item. 
     * Todos os valores devem ser maiores ou iguais a zero(0).
     * @throws ItemInvalidoException
     */
    public void setBonus_atributo(int[] bonus_atributo) throws ItemInvalidoException {
        if(bonus_atributo == null){
            this.bonus_atributo = bonus_atributo;
        }else if(bonus_atributo.length == 8){
            for(int i = 0; i < bonus_atributo.length; i++){
                if(bonus_atributo[i] < 0){
                    throw new ItemInvalidoException("Atributo " + Constante_Atributo.ATRIBUTO[i]
                            + " Invalido, valor Abaixo de Zero(0)");
                }
            }
            this.bonus_atributo = bonus_atributo;
        }else{
            throw new ItemInvalidoException("O campo Bonus de Atributo deve receber 8 modificadores."
                    + "\nForam recebidos: " + bonus_atributo.length);
        }
    }

    /**
     * Retorna o Bonus de Atributo do Item
     * @return Bonus de Atributo
     */
    public int[] getBonus_atributo() {
        return bonus_atributo;
    }

    /**
     * Altera a o nome da Habilidade Necessaria para Usar o item
     * @param habilidade_Necessaria Habilidade Necessaria para se usar o Item, 
     * se nao estver usando Item deve receber "Nenhuma" como parametro
     * @throws ItemInvalidoException
     */
    public void setHabilidade_Necessaria(String habilidade_Necessaria) throws ItemInvalidoException {
                
        if(habilidade_Necessaria != null){
            if( (Controle_Habilidade.HabilidadeExiste(habilidade_Necessaria)) || (habilidade_Necessaria.equals("Nenhuma"))){
                this.habilidade_Necessaria = habilidade_Necessaria;
            }else{
                throw new ItemInvalidoException("habilidade_Necessaria para o Item Invalida."
                        + "\nA Habilidade {" + habilidade_Necessaria + "} nao existe.");
            }
        }else{
            this.habilidade_Necessaria = habilidade_Necessaria;
        }
    }

    /**
     * Retorna o nome da Habilidade Necessaria para Usar o Item
     * @return nome da Habilidade Necessaria para Usar o Item
     */
    public String getHabilidade_Necessaria() {
        return habilidade_Necessaria;
    }

    @Override
    public String toString() {
        return "Nome = "+this.getNome()+
               "; Descricao = "+this.getDescricao()+
               "; Preco = "+this.getPreco()+
               "; Usando = "+this.isUsando()+
               "; Bonus de Atributo = "+ Arrays.toString(getBonus_atributo())+
               "; Habilidade Necessaria = "+this.getHabilidade_Necessaria();
    }    
}
