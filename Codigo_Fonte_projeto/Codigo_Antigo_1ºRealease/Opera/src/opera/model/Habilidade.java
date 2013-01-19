/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opera.model;

import java.io.Serializable;
import opera.control.Validar;
import opera.exception.HabilidadeInvalidaException;

/**
 *
 * @author Macartur
 */
public class Habilidade implements Serializable{
    
    private String nome;
    private int teste;
    private int nivel;
    private int custo;

    public Habilidade(String nome, int teste, int nivel, int custo) throws HabilidadeInvalidaException {
        setNome(nome);
        setTeste(teste);
        setNivel(nivel);
        setCusto(custo);
    }

    public final void setNome(String nome) throws HabilidadeInvalidaException {
        if(Validar.validarNome(nome)){
          this.nome = nome;
        }else{
            throw new HabilidadeInvalidaException("Nome da Habilidade esta nulo ou invalida");
        }
    }

    public String getNome() {
        return nome;
    }

    public final void setTeste(int teste) throws HabilidadeInvalidaException {
        if(teste >= 0){
            this.teste = teste;
        }else{
            throw new HabilidadeInvalidaException("Teste invalido, deve ser inteiro e maior ou igual a zero");
        }
    }

    public int getTeste() {
        return teste;
    }

    public final void setCusto(int custo) throws HabilidadeInvalidaException {
        if(custo >= 0){
            this.custo = custo;
        }else{
            throw new HabilidadeInvalidaException("Custo invalido, deve ser inteiro e maior ou igual a zero");
        }
    }

    public int getCusto() {
        return custo;
    }

    public final void setNivel(int nivel) throws HabilidadeInvalidaException {
        if(nivel >= 0){
            this.nivel = nivel;
        }else{
            throw new HabilidadeInvalidaException("Nivel invalido, deve ser inteiro e maior ou igual a zero");
        }
    }

    public int getNivel() {
        return nivel;
    }

    @Override
    public String toString() {
        return " Nome: "+getNome()+
               " Nivel: "+getNivel()+
               " Custo: "+getCusto()+
               " Teste: " +getTeste();
    }    
}
