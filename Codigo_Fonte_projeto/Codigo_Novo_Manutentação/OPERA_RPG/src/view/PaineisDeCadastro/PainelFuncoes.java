/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.PaineisDeCadastro;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author Luciano
 */
public class PainelFuncoes {
    
    
    public static void limparCamposJTextField(JComponent componente){
        Object objeto[] = componente.getComponents();
        for(int i = 0; i < objeto.length; i++){
            if(objeto[i] instanceof JComponent){
                limparCamposJTextField(((JComponent)objeto[i]));
            }
            if(objeto[i] instanceof JTextField){
                ((JTextField)objeto[i]).setText(null);
            }
        }
    }
    
    public static void limparCamposJCheckBox(JComponent componente){
        Object objeto[] = componente.getComponents();
        for(int i = 0; i < objeto.length; i++){
            if(objeto[i] instanceof JPanel){
                limparCamposJCheckBox(((JPanel)objeto[i]));
            }
            if(objeto[i] instanceof JCheckBox){
                ((JCheckBox)objeto[i]).setSelected(false);
            }
        }
    }
    
    
    public static void limparTodosOsCampos(JComponent componente){
        Object objeto[] = componente.getComponents();
        for(int i = 0; i < objeto.length; i++){
            if(objeto[i] instanceof JPanel){
                limparTodosOsCampos(((JPanel)objeto[i]));
            }
            if(objeto[i] instanceof JCheckBox){
                ((JCheckBox)objeto[i]).setSelected(false);
            }
            if(objeto[i] instanceof JTextField){
                ((JTextField)objeto[i]).setText(null);
            }
        }
    }
    
    
    public static void definirCorDaBordaJTextField(JComponent componente, Color cor){
        Object objeto[] = componente.getComponents();
        for(int i = 0; i < objeto.length; i++){
            if(objeto[i] instanceof JComponent){
                definirCorDaBordaJTextField(((JComponent)objeto[i]), cor);
            }
            if(objeto[i] instanceof JTextField){
                ((JTextField)objeto[i]).setBorder(new LineBorder(cor));
            }
        }
    }
}
