/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opera.model;

import java.io.Serializable;
import opera.control.Validar;
import opera.exception.JogoInvalidoException;

/**
 *
 * @author Luciano
 */
public class Jogo implements Serializable{
    private String nome;

    
    public Jogo(String nome) throws JogoInvalidoException{
        setNome(nome);
    }
    
    
    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) throws JogoInvalidoException {
        if(Validar.validarNome(nome)){
            this.nome = nome;
        }else{
            throw new JogoInvalidoException("Jogo invalido, o nome do jogo nao eh valido");
        }
    }

    @Override
    public String toString() {
        return "Jogo{" + "nome=" + nome + '}';
    }
    
}
