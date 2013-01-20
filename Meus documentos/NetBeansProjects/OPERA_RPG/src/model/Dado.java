/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;


public class Dado implements Serializable {
    
    private int lados;
    private int rolagem;

    public Dado(int rolagem, int lados) {
        this.lados = lados;
        this.rolagem = rolagem;
    }

    public void setRolagem(int rolagem) {
        this.rolagem = rolagem;
    }

    public int getRolagem() {
        return rolagem;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }

    public int getLados() {
        return lados;
    }

    @Override
    public String toString() {
        return +this.getRolagem()+"d"+this.getLados() ;
    }
      
    
}
