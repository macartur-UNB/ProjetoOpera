/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opera.view.PaineisDeCadastro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import opera.view.MoldePaineis;

/**
 *
 * @author Luciano
 */
public class PnlCadastrarEquipamento extends MoldePaineis implements ActionListener {

    private PnlCadastrarEquipamento_Geral pnlCadastrarEquipamento_Geral;
    private PnlCadastrarEquipamento_Arma pnlCadastrarEquipamento_Arma;
    private PnlCadastrarEquipamento_Armadura pnlCadastrarEquipamento_Armadura;
    
    /**
     * Getters and Setters
     */
    public PnlCadastrarEquipamento_Geral getPnlCadastrarEquipamento_Geral(){
        return pnlCadastrarEquipamento_Geral;
    }
    public PnlCadastrarEquipamento_Arma getPnlCadastrarEquipamento_Arma(){
        return pnlCadastrarEquipamento_Arma;
    }
    public PnlCadastrarEquipamento_Armadura getPnlCadastrarEquipamento_Armadura(){
        return pnlCadastrarEquipamento_Armadura;
    }
    
    
    public PnlCadastrarEquipamento(){
        pnlCadastrarEquipamento_Geral = new PnlCadastrarEquipamento_Geral();
        pnlCadastrarEquipamento_Arma = new PnlCadastrarEquipamento_Arma();
        pnlCadastrarEquipamento_Armadura = new PnlCadastrarEquipamento_Armadura();
        
        pnlCadastrarEquipamento_Geral.setVisible(true);
        pnlCadastrarEquipamento_Arma.setVisible(false);
        pnlCadastrarEquipamento_Armadura.setVisible(false);
        
        this.add(pnlCadastrarEquipamento_Geral);
        this.add(pnlCadastrarEquipamento_Arma);
        this.add(pnlCadastrarEquipamento_Armadura);
        
        inicializarEventos();
    }
    
    
    
    
    private void inicializarEventos(){
        pnlCadastrarEquipamento_Geral.getBtnCadastrar().addActionListener(this);
        
        pnlCadastrarEquipamento_Arma.getBtnVoltar().addActionListener(this);
        
        pnlCadastrarEquipamento_Armadura.getBtnVoltar().addActionListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent event) {
        Object origem = event.getSource();
        
        /**
         * Botoes do "pnlCadastrarEquipamento_Geral"
         */
        //Botao CADASTRAR / PROSSEGUIR
        if(origem.equals(pnlCadastrarEquipamento_Geral.getBtnCadastrar())){
            //   Se "rdbItem" esta selecionado nada acontece
            //pois o Cadastro é realizado em outra classe, aqui 
            //só muda o JPANEL
            
            //se "rdbArma" esta selecionado aparece a area de cadastro de Arma
            if(pnlCadastrarEquipamento_Geral.getRdbArma().isSelected()){
                pnlCadastrarEquipamento_Geral.setVisible(false);
                pnlCadastrarEquipamento_Arma.setVisible(true);
            }
            //se "rdbArmamento" esta selecionado aparece a area de cadastro de Armamento
            if(pnlCadastrarEquipamento_Geral.getRdbArmadura().isSelected()){
                pnlCadastrarEquipamento_Geral.setVisible(false);
                pnlCadastrarEquipamento_Armadura.setVisible(true);
            }
            
        }
    
        
        /**
         * Botoes do "pnlCadastrarEquipamento_Arma"
         */
        //Botao VOLTAR
        if(origem.equals(pnlCadastrarEquipamento_Arma.getBtnVoltar())){
            pnlCadastrarEquipamento_Arma.setVisible(false);
            pnlCadastrarEquipamento_Geral.setVisible(true);
        }
        
        /**
         * Botoes do "pnlCadastrarEquipamento_Armadura"
         */
        //Botao VOLTAR
        if(origem.equals(pnlCadastrarEquipamento_Armadura.getBtnVoltar())){
            pnlCadastrarEquipamento_Armadura.setVisible(false);
            pnlCadastrarEquipamento_Geral.setVisible(true);
        }
        
        
        //throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
