/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opera.view;

import javax.swing.*;

/**
 *
 * @author Luciano
 */
public class MoldePaineis extends JPanel{
    
    private BotaoFecharDaTab btnFechar;

    public BotaoFecharDaTab getBtnFechar() {
        return btnFechar;
    }

    public void setBtnFechar(BotaoFecharDaTab btnFechar) {
        this.btnFechar = btnFechar;
    }
    
    
    public MoldePaineis(){
        
    }

    
    public void limparCampos(){
        limparCamposJTextField(this);
        limparCamposJCheckBox(this);
    }
    
    public void limparCamposJTextField(JComponent componente){
        Object objeto[] = componente.getComponents();
        for(int i = 0; i < objeto.length; i++){
            //System.out.println(objeto[i]);
            if(objeto[i] instanceof JComponent){
                limparCamposJTextField(((JComponent)objeto[i]));
            }
            if(objeto[i] instanceof JTextField){
                //System.out.println(((JTextField)objeto[i]).getText());
                ((JTextField)objeto[i]).setText(null);
            }
        }
    }
    
    public void limparCamposJCheckBox(JComponent componente){
        Object objeto[] = componente.getComponents();
        for(int i = 0; i < objeto.length; i++){
            //System.out.println(objeto[i]);
            if(objeto[i] instanceof JPanel){
                limparCamposJCheckBox(((JPanel)objeto[i]));
            }
            if(objeto[i] instanceof JCheckBox){
                //System.out.println(((JCheckBox)objeto[i]).getText());
                ((JCheckBox)objeto[i]).setSelected(false);
            }
        }
    }
    
    public void atualizarJComboBox(){
        
    }
    
    /*
    public void preencherCamposJTextField(Object objeto, JComponent componente){
        
        Ficha ficha = null;
        Habilidade habilidade = null;
        Caracteristica caracteristica = null;
        Equipamento equipamento = null;
        Dado dado = null;
        
        if(objeto instanceof Ficha){
            
        }
        if(objeto instanceof Habilidade){
            
        }
        if(objeto instanceof Caracteristica){
            
        }
        if(objeto instanceof Equipamento){
            
        }
        if(objeto instanceof Dado){
            
        }
        
        
        Object componentes[] = componente.getComponents();
        for(int i = 0; i < componentes.length; i++){
            //System.out.println(objeto[i]);
            if(componentes[i] instanceof JComponent){
                limparCamposJTextField(((JComponent)componentes[i]));
            }
            if(componentes[i] instanceof JTextField){
                //System.out.println(((JTextField)objeto[i]).getText());
                
                if(objeto instanceof Ficha){
                    
                }
                if(objeto instanceof Habilidade){
                    
                }
                if(objeto instanceof Caracteristica){
                    
                }
                if(objeto instanceof Equipamento){
                    
                }
                if(objeto instanceof Dado){
                    
                }
                
                
                ((JTextField)componentes[i]).setText(null);
            }
        }
        
    }
    */
}
