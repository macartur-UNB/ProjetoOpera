/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.classes;

import java.io.Serializable;


public class Jogo implements Serializable {
    
    private String nome;
    private String endereco;
    

    public Jogo(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }    

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
   
    @Override
    public String toString() {
        return " Jogo = "+this.getNome()+
               " Endereco = "+this.getEndereco();
    }
    
}
