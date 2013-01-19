/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opera.model;

import opera.exception.EquipamentoInvalidoException;

/**
 *
 * @author Luciano
 */
public class Equipamento_Arma_Fogo extends Equipamento_Arma{
    
    private int tiro_Rapido, tiro_Mirado, cadencia;
    
    public Equipamento_Arma_Fogo(String nome, String descricao, int preco, int tipo, int danoAdicional, int tiro_Rapido, int tiro_Mirado, int cadencia) throws EquipamentoInvalidoException{
        super(nome, descricao, preco, tipo, danoAdicional);
        setTiro_Rapido(tiro_Rapido);
        setTiro_Mirado(tiro_Mirado);
        setCadencia(cadencia);
    }
    public Equipamento_Arma_Fogo(String nome, String descricao, int preco, int tipo, int danoAdicional, int tiro_Rapido, int tiro_Mirado, int cadencia, int[] bonus_Atributo) throws EquipamentoInvalidoException{
        super(nome, descricao, preco, tipo, danoAdicional, bonus_Atributo);
        setTiro_Rapido(tiro_Rapido);
        setTiro_Mirado(tiro_Mirado);
        setCadencia(cadencia);
    }

    public int getTiro_Rapido() {
        return tiro_Rapido;
    }

    public final void setTiro_Rapido(int tiro_Rapido) throws EquipamentoInvalidoException {
        if(tiro_Rapido >= 0){
            this.tiro_Rapido = tiro_Rapido;
        }else{
            throw new EquipamentoInvalidoException("Tiro Rapido invalido, o numero deve ser inteiro e maior ou igual a zero");
        }
    }

    public int getTiro_Mirado() {
        return tiro_Mirado;
    }

    public final void setTiro_Mirado(int tiro_Mirado) throws EquipamentoInvalidoException {
        if(tiro_Mirado >= 0){
            this.tiro_Mirado = tiro_Mirado;
        }else{
            throw new EquipamentoInvalidoException("Tiro Mirado invalido, o numero deve ser inteiro e maior ou igual a zero");
        }
    }

    public int getCadencia() {
        return cadencia;
    }

    public final void setCadencia(int cadencia) throws EquipamentoInvalidoException {
        if(cadencia >= 0){
            this.cadencia = cadencia;
        }else{
            throw new EquipamentoInvalidoException("Cadencia invalida, o numero deve ser inteiro e maior ou igual a zero");
        }
    }

    @Override
    public String toString() {
        return "Equipamento_Arma_Fogo{" + "tiro_Rapido=" + tiro_Rapido + ", tiro_Mirado=" + tiro_Mirado + ", cadencia=" + cadencia + '}';
    }
    
    
}
