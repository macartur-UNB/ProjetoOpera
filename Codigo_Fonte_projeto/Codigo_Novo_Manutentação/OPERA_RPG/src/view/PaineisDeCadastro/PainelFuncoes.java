/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.PaineisDeCadastro;

import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
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
    
    public static void limparCamposJTextArea(JComponent componente){
        Object objeto[] = componente.getComponents();
        for(int i = 0; i < objeto.length; i++){
            if(objeto[i] instanceof JComponent){
                limparCamposJTextArea(((JComponent)objeto[i]));
            }
            if(objeto[i] instanceof JTextArea){
                ((JTextArea)objeto[i]).setText(null);
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
            if(objeto[i] instanceof JComponent){
                limparTodosOsCampos(((JComponent)objeto[i]));
            }
            if(objeto[i] instanceof JCheckBox){
                ((JCheckBox)objeto[i]).setSelected(false);
            }
            if(objeto[i] instanceof JTextField){
                ((JTextField)objeto[i]).setText(null);
            }
            if(objeto[i] instanceof JTextArea){
                ((JTextArea)objeto[i]).setText(null);
            }
            if(objeto[i] instanceof ButtonGroup){
                ((ButtonGroup)objeto[i]).clearSelection();
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
    
    public static void habilitarCampos(JComponent componente, boolean habilitar){
        Object objeto[] = componente.getComponents();
        for(int i = 0; i < objeto.length; i++){
            if(objeto[i] instanceof JPanel){
                habilitarCampos(((JPanel)objeto[i]), habilitar);
            }
            if(objeto[i] instanceof JComponent){
                habilitarCampos((JComponent)objeto[i], habilitar);
            }
            if(objeto[i] instanceof JCheckBox){
                ((JCheckBox)objeto[i]).setEnabled(habilitar);
                if(!habilitar){
                    ((JCheckBox)objeto[i]).setSelected(false);
                }
            }
            if(objeto[i] instanceof JTextField){
                ((JTextField)objeto[i]).setEnabled(habilitar);
                if(!habilitar){
                    ((JTextField)objeto[i]).setText(null);
                    ((JTextField)objeto[i]).setBorder(new LineBorder(Color.GRAY));
                }
            }
            if(objeto[i] instanceof JRadioButton){
                ((JRadioButton)objeto[i]).setEnabled(habilitar);
                if(!habilitar){
                    ((JRadioButton)objeto[i]).setForeground(Color.BLACK);
                }
            }
            if(objeto[i] instanceof JPanel){
                ((JPanel)objeto[i]).setEnabled(habilitar);
            }
            if(objeto[i] instanceof JLabel){
                ((JLabel)objeto[i]).setEnabled(habilitar);
            }
            if(objeto[i] instanceof JTextArea){
                ((JTextArea)objeto[i]).setEnabled(habilitar);
            }
            if(objeto[i] instanceof JScrollPane){
                ((JScrollPane)objeto[i]).setEnabled(habilitar);
            }
        }
    }
}
