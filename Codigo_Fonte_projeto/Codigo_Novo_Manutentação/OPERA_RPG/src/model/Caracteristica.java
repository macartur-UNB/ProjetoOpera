/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;


public class Caracteristica  implements Serializable{
    private String nome;
    private String descricao;
    private String tipo;
    private int[] modificador;
    private int custo;

    public Caracteristica(String nome, String descricao, String tipo, int custo) {
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
        this.custo = custo;
    }

    public Caracteristica(String nome, String descricao, String tipo, int[] modificador, int custo) {
        this(nome,descricao,tipo,custo);
        this.modificador = modificador;
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

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setModificador(int[] modificador) {
        this.modificador = modificador;
    }

    public int[] getModificador() {
        return modificador;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }

    public int getCusto() {
        return custo;
    }

    @Override
    public String toString() {
        String tem_modificador = (this.getModificador() == null)?"não":"sim";
        return "Nome ="+this.getNome()+
               "Descricao = "+this.getDescricao()+
               "Tipo = "+this.getTipo()+
               "Tem modificador ="+ tem_modificador+
                "Custo = "+this.getCusto();
    }
    
    
    
}
