/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opera.model;

import java.io.Serializable;
import opera.exception.DadoInvalidoException;


/**
 *
 * @author Macartur
 */
public class Dado implements Serializable{
   private int lados;
   private int rolagem;

    public Dado(int lados) throws DadoInvalidoException {
        setLados(lados);
        //this.rolagem = rolagem;
    }

    public final void setLados(int lados) throws DadoInvalidoException {
        if(lados >= 4){
            this.lados = lados;
        }else{
            throw new DadoInvalidoException("Lados invalido, o numero deve ser inteiro e maior ou igual a zero");
        }
    }

    public int getLados() {
        return lados;
    }

    public void setRolagem(int rolagem) throws DadoInvalidoException {
        if(rolagem >= 0){
            this.rolagem = rolagem;
        }else{
            throw new DadoInvalidoException("Rolagem invalido, o numero deve ser inteiro e maior ou igual a zero");
        }
    }

    public int getRolagem() {
        return rolagem;
    }
   
    public int rolarDado(){
        int valor=0,i;
        for(i=0;i<getRolagem();i++){//faz rolar num de rolagens
                valor += (Math.random() * 100 )%getLados() + 1;
        }
        return valor;
    }
   
    @Override
    public String toString(){
        return "Lados: " + getLados() +
               "Numero de Rolagem:" + getRolagem();
    }
   
}
