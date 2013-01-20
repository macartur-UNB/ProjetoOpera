/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opera.model;

import java.io.Serializable;
import opera.control.Validar;
import opera.exception.EquipamentoInvalidoException;

/**
 *
 * @author Macartur
 */
public class Equipamento implements Serializable{
  
    private String nome = null;
    private String descricao = null;
    private int quantidade = 0;
    private boolean usando=false;
    private int[] bonus_Atributo = new int[8];
    private int preco=0;

    public Equipamento(String nome, String descricao , int preco) throws EquipamentoInvalidoException{
        setNome(nome);
        setDescricao(descricao);
        setPreco(preco);
    }
    
    public Equipamento(String nome, String descricao, int preco, int[] bonus_Atributo) throws EquipamentoInvalidoException {
        this(nome, descricao, preco);
        setBonus_Atributo(bonus_Atributo);
    }

    public final void setNome(String nome) throws EquipamentoInvalidoException {
        if(Validar.validarNome(nome)){
            this.nome = nome;
        }else{
            throw new EquipamentoInvalidoException("Nome invalido, nao pode ser nulo ou vazio");
        }
    }

    public String getNome() {
        return nome;
    }

    public final void setDescricao(String descricao) throws EquipamentoInvalidoException {
        if(Validar.validarNome(nome)){
            this.descricao = descricao;
        }else{
            throw new EquipamentoInvalidoException("Descricao invalida, nao pode ser nulo ou vazio");
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public final void setQuantidade(int quantidade) throws EquipamentoInvalidoException {
        if(quantidade >= 0){
            this.quantidade = quantidade;
        }else{
            throw new EquipamentoInvalidoException("Quantidade invalida, deve ser numero inteiro maior ou igual a zero");
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public final void setPreco(int preco) throws EquipamentoInvalidoException {
        if(preco >= 0){
            this.preco = preco;
        }else{
            throw new EquipamentoInvalidoException("Preco invalido, deve ser numero inteiro maior ou igual a zero");
        }
    }

    public int getPreco() {
        return preco;
    }

    public final void setBonus_Atributo(int[] bonus_Atributo) throws EquipamentoInvalidoException {
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
        
        if( (bonus_Atributo != null) && (bonus_Atributo.length == 8) ){
            for(int i = 0; i < bonus_Atributo.length; i++){
                if(bonus_Atributo[i] < 0){
                    erro = true;
                    throw new EquipamentoInvalidoException("Atributo " + atributo[i] + " invalido, deve ser numero inteiro e maior que zero");
                }
            }
            if(!erro){
                this.bonus_Atributo = bonus_Atributo;
            }
        }else{
            throw new EquipamentoInvalidoException("Erro no vetor de Atributos");
        }
    }

    public int[] getBonus_Atributo() {
        return bonus_Atributo;
    }

    public void setUsando(boolean usando) {
        this.usando = usando;
    }
   public boolean getUsando(){
       return this.usando;
   }
    @Override
    public String toString() {
        String estaUsando = (getUsando())?"Sim":"Nao";
        String tem_bonus = (getBonus_Atributo()!=null)?"Sim":"Nao";
        
        return " Nome: "+getNome()+
               " Descricao: "+getDescricao()+
               " Preco: "+getPreco()+
               " Quantidade: "+getQuantidade()+
               " Usando: "+ estaUsando+
               " Contem Bonus: "+tem_bonus;
    }
}