/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opera.model;

import java.io.Serializable;

/**
 *
 * @author Macartur
 */
public class Caracteristica_Especifica implements Serializable{
    private String nome;
    private String descricao;
    private Caracteristica caracteristica=null;

    public Caracteristica_Especifica(String nome, String descricao,Caracteristica caracteristica) {
        this.nome = nome;
        this.descricao = descricao;
        this.caracteristica = caracteristica;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setCaracteristica(Caracteristica caracteristica) {
        this.caracteristica = caracteristica;
    }

    public Caracteristica getCaracteristica() {
        return caracteristica;
    }

    @Override
    public String toString() {
        return " Nome: "+ getNome()+
               " Descricao: "+ getDescricao()+
               " Caracteristica especifica de: " + getCaracteristica().getNome();
    }
    
    
    
}
