/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;



public class Habilidade implements Serializable{
    
    private int teste;
    private int nivel;
    private int custo;
    private String nome;
    private String tipo;

    public Habilidade(int teste, int nivel, int custo, String nome, String tipo) {
        this.teste = teste;
        this.nivel = nivel;
        this.custo = custo;
        this.nome = nome;
        this.tipo = tipo;
    }

    public void setCusto(int custo) {
        this.custo = custo;
    }

    public int getCusto() {
        return custo;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setTeste(int teste) {
        this.teste = teste;
    }

    public int getTeste() {
        return teste;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Nome = "+this.getNome()+
               "Tipo = "+this.getTipo()+
               "Nivel = "+this.getNivel()+
               "Teste = "+this.getTeste()+
               "Custo = "+this.getCusto();
    }
    
}
