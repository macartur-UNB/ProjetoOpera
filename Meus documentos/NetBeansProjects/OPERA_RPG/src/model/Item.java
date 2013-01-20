/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

public class Item implements Serializable {

    private String nome;
    private String descricao;
    private boolean usando;
    private int[] bonus_atributo;  
    private int preco;
    private String habilidade_Necessaria;

    
    public Item(String nome, String descricao, int preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }
    
     public Item(String nome, String descricao, boolean usando, int preco) {
        this(nome,descricao,preco);
        this.usando = usando;
    }
    
    public Item(String nome, String descricao, boolean usando, int[] bonus_atributo,
                int preco, String habilidade_Necessaria) {
        this(nome,descricao,preco);
        this.usando = usando;
        this.bonus_atributo = bonus_atributo;
        this.habilidade_Necessaria = habilidade_Necessaria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setUsando(boolean usando) {
        this.usando = usando;
    }

   
    public boolean getUsando(){
       return this.usando;
    }    

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getPreco() {
        return preco;
    }

    public void setBonus_atributo(int[] bonus_atributo) {
        this.bonus_atributo = bonus_atributo;
    }

    public int[] getBonus_atributo() {
        return bonus_atributo;
    }

    public void setHabilidade_Necessaria(String habilidade_Necessaria) {
        this.habilidade_Necessaria = habilidade_Necessaria;
    }

    public String getHabilidade_Necessaria() {
        return habilidade_Necessaria;
    }

    @Override
    public String toString() {
        return "Nome  = "+this.getNome()+
               "Descricao = "+this.getDescricao()+
               "Preco = "+this.getPreco()+
               "Usando ="+this.getUsando()+
               "Bonus de Atributo = "+this.getBonus_atributo()+
               "Habilidade Necessaria ="+this.getHabilidade_Necessaria();
    }    
}
