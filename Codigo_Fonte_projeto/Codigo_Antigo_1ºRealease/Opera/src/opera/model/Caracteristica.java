/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opera.model;

import java.io.Serializable;
import opera.control.Validar;
import opera.exception.CaracteristicaInvalidaException;

/**
 *
 * @author Macartur
 */
public class Caracteristica implements Serializable{
    
    private String nome;
    private String descricao;
    private int custo;
    private int modificador[] = new int[8];

    
    public Caracteristica(String nome, String descricao, int custo) throws CaracteristicaInvalidaException {
        setNome(nome);
        setDescricao(descricao);
        setCusto(custo);
        
        for(int i = 0; i < modificador.length; i++){
            modificador[i] = 0;
        }
    }
    
    public Caracteristica(String nome, String descricao, int custo, int[] modificador) throws CaracteristicaInvalidaException {
        this(nome, descricao, custo);
        setModificador(modificador);
    }

    public final void setNome(String nome) throws CaracteristicaInvalidaException {
        if(Validar.validarNome(nome)){
            this.nome = nome;
        }else{
            throw new CaracteristicaInvalidaException("Nome invalido, nao pode ser nulo ou vazio");
        }
    }

    public String getNome() {
        return nome;
    }

    public final void setDescricao(String descricao) throws CaracteristicaInvalidaException {
        if(Validar.validarNome(descricao)){
            this.descricao = descricao;
        }else{
            throw new CaracteristicaInvalidaException("Descricao invalida, nao pode ser nulo ou vazio");
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public final void setCusto(int custo) throws CaracteristicaInvalidaException {
        if(custo >= 0){
            this.custo = custo;
        }else{
            throw new CaracteristicaInvalidaException("Custo invalido, deve ser numero inteiro maior ou igual a zero e diferente de nulo");
        }
    }

    public int getCusto() {
        return custo;
    }

    public final void setModificador(int[] modificador) throws CaracteristicaInvalidaException {
        boolean erro = false;
        String atributo[] = new String[8];
        atributo[0] = "Fisico";
        atributo[1] = "Destreza";
        atributo[2] = "Inteligencia";
        atributo[3] = "Vontade";
        atributo[4] = "Percepcao";
        atributo[5] = "Mente";
        atributo[6] = "Mana";
        atributo[7] = "Sorte";
        
        if( (modificador != null) && (modificador.length == 8) ){
            for(int i = 0; i < modificador.length; i++){
                if(modificador[i] < 0){
                    erro = true;
                    throw new CaracteristicaInvalidaException("Atributo " + atributo[i] + " invalido, deve ser numero inteiro e maior que zero");
                }
            }
            if(!erro){
                this.modificador = modificador;
            }
        }else{
            throw new CaracteristicaInvalidaException("Erro no vetor de Atributos");
        }
    }

    public int[] getModificador() {
        return modificador;
    }

    @Override
    public String toString() {
        String tem_mod = (modificador != null)?"Sim":"nao";
        return " Nome: "+ getNome()+
               " Descricao: "+ getDescricao()+
               " Custo: "+ getCusto()+" Tem modificador: "+ tem_mod;
    }
    
}