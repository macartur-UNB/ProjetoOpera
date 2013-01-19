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
public class Equipamento_Item extends Equipamento{
    
    public Equipamento_Item(String nome, String descricao, int preco) throws EquipamentoInvalidoException{
        super(nome, descricao, preco);
    }
    
    public Equipamento_Item(String nome, String descricao, int preco, int[] bonus_Atributo) throws EquipamentoInvalidoException{
        super(nome, descricao, preco, bonus_Atributo);
    }
}
