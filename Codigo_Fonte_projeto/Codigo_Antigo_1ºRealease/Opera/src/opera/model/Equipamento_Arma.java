/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opera.model;

import opera.exception.EquipamentoInvalidoException;

/**
 *
 * @author Macartur
 */
public class Equipamento_Arma extends Equipamento{

    private int tipo;//arma de fogo ou arma branca sendo fogo = 1 branca  = 0
    private Dado dano;//valor de dano pelo dado
    private int danoAdicional;//valor de dano valor inteiro
    
    public Equipamento_Arma(String nome, String descricao, int preco, int tipo, int danoAdicional) throws EquipamentoInvalidoException {
        super(nome, descricao, preco);
        setTipo(tipo);
        setDanoAdicional(danoAdicional);
    }
    public Equipamento_Arma(String nome, String descricao, int preco, int tipo, int danoAdicional, int[] bonus_Atributo) throws EquipamentoInvalidoException {
        this(nome, descricao, preco, tipo, danoAdicional);
        setBonus_Atributo(bonus_Atributo);
    }

    /*
    public Equipamento_Arma( String nome, String descricao, int quantidade, int preco,int tipo, Dado dano, int danoAdicional) {
        super(nome, descricao, quantidade, preco);
        this.tipo = tipo;
        this.dano = dano;
        this.danoAdicional = danoAdicional;
    }
    */

    public final void setTipo(int tipo) throws EquipamentoInvalidoException {
        if(tipo >= 0){
            this.tipo = tipo;
        }else{
            throw new EquipamentoInvalidoException("Tipo invalido, deve ser numero inteiro maior ou igual a zero");
        }
    }

    public int getTipo() {
        return tipo;
    }

    public void setDano(Dado dano) {
        this.dano = dano;
    }

    public Dado getDano() {
        return dano;
    }

    public final void setDanoAdicional(int danoAdicional) throws EquipamentoInvalidoException {
        if(danoAdicional >= 0){
            this.danoAdicional = danoAdicional;
        }else{
            throw new EquipamentoInvalidoException("Dano Adicional invalido, deve ser numero inteiro maior ou igual a zero");
        }
    }

    public int getDanoAdicional() {
        return danoAdicional;
    }

    @Override
    public String toString() {
        String imprimir_tipo = (tipo == 1)?"Arma de Fogo":"Arma Branca";
        return super.toString() + 
                " Tipo: "+ imprimir_tipo +
                " Dano: "+ getDano().getRolagem()+"d"+getDano().getLados()+" + "+getDanoAdicional();
    }
}
