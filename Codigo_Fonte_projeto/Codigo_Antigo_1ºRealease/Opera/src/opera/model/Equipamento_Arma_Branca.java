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
public class Equipamento_Arma_Branca extends Equipamento_Arma{
    
    private int golpe, aparo, esquiva;
    
    public Equipamento_Arma_Branca(String nome, String descricao, int preco, int tipo, int golpe, int aparo, int esquiva, int danoAdicional) throws EquipamentoInvalidoException{
        super(nome, descricao, preco, tipo, danoAdicional);
        setGolpe(golpe);
        setAparo(aparo);
        setEsquiva(esquiva);
    }
    public Equipamento_Arma_Branca(String nome, String descricao, int preco, int tipo, int golpe, int aparo, int esquiva, int danoAdicional, int[] bonus_Atributo) throws EquipamentoInvalidoException{
        super(nome, descricao, preco, tipo, danoAdicional, bonus_Atributo);
        setGolpe(golpe);
        setAparo(aparo);
        setEsquiva(esquiva);
    }

    public int getGolpe() {
        return golpe;
    }

    public final void setGolpe(int golpe) throws EquipamentoInvalidoException {
        if(golpe >= 0){
            this.golpe = golpe;
        }else{
            throw new EquipamentoInvalidoException("Golpe invalido, o numero deve ser inteiro e maior ou igual a zero");
        }
    }

    public int getAparo() {
        return aparo;
    }

    public final void setAparo(int aparo) throws EquipamentoInvalidoException {
        if(aparo >= 0){
            this.aparo = aparo;
        }else{
            throw new EquipamentoInvalidoException("Aparo invalido, o numero deve ser inteiro e maior ou igual a zero");
        }
    }

    public int getEsquiva() {
        return esquiva;
    }

    public final void setEsquiva(int esquiva) throws EquipamentoInvalidoException {
        if(esquiva >= 0){
            this.esquiva = esquiva;
        }else{
            throw new EquipamentoInvalidoException("Esquiva invalida, o numero deve ser inteiro e maior ou igual a zero");
        }
    }

    @Override
    public String toString() {
        return "Equipamento_Arma_Branca{" + "golpe=" + golpe + ", aparo=" + aparo + ", esquiva=" + esquiva + '}';
    }
    
    
    
}
