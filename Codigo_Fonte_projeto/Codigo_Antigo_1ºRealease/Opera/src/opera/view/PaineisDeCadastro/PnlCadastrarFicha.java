/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opera.view.PaineisDeCadastro;

import opera.view.MoldePaineis;


/**
 *
 * @author Luciano
 */
public class PnlCadastrarFicha extends MoldePaineis{
    
    
    private PnlCadastrarFichaParte01 pnlCadastrarFichaParte01;
    private PnlCadastrarFichaParte02 pnlCadastrarFichaParte02;
    
    /**
     * Getters and Setters
     */
     public PnlCadastrarFichaParte01 getPnlCadastrarFichaParte01(){
         return pnlCadastrarFichaParte01;
     }
     public PnlCadastrarFichaParte02 getPnlCadastrarFichaParte02(){
         return pnlCadastrarFichaParte02;
     }
     
    
    public PnlCadastrarFicha(){
        pnlCadastrarFichaParte01 = new PnlCadastrarFichaParte01();
        pnlCadastrarFichaParte02 = new PnlCadastrarFichaParte02();
        
        //pnlCadastrarFichaParte02.setVisible(false);
        
        this.add(pnlCadastrarFichaParte01);
        this.add(pnlCadastrarFichaParte02);
    }
    
    
}
