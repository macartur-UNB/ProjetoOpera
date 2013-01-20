/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;


public class Jogo implements Serializable {
    
    private String nome;

    public Jogo(String nome) {
        this.nome = nome;
    }    

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Jogo = "+this.getNome();
    }
    
}
