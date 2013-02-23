/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.classes;

import model.exception.CaracteristicaInvalidaException;


public class Caracteristica_Especifica extends Caracteristica{

    private String nome_Especifico;
    private String descricao_Especifica;
    
    public Caracteristica_Especifica(String nome_Especifico,String descricao_Especifica,String nome, String descricao, String tipo, int custo) throws CaracteristicaInvalidaException {
        super(nome, descricao, tipo, custo);
        this.nome_Especifico = nome_Especifico;
        this.descricao_Especifica = descricao_Especifica;
    }

    public Caracteristica_Especifica(String nome_Especifico,String descricao_Especifica,String nome, String descricao, String tipo, int[] modificador, int custo) throws CaracteristicaInvalidaException {
        super(nome, descricao, tipo, modificador, custo);
        this.nome_Especifico = nome_Especifico;
        this.descricao_Especifica = descricao_Especifica;
    }

    public void setNome_Especifico(String nome_Especifico) {
        this.nome_Especifico = nome_Especifico;
    }

    public void setDescricao_Especifica(String descricao_Especifica) {
        this.descricao_Especifica = descricao_Especifica;
    }

    public String getNome_Especifico() {
        return nome_Especifico;
    }

    public String getDescricao_Especifica() {
        return descricao_Especifica;
    }
    

    @Override
    public String toString() {
        return "Nome Especifico = "+this.getNome_Especifico()+
               "Descricao Especifica = "+this.getDescricao_Especifica()+
                super.toString();
    }   
}
