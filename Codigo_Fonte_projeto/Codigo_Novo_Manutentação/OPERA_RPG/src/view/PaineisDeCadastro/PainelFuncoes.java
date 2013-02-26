package view.PaineisDeCadastro;

import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

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
                ((JTextField)objeto[i]).setToolTipText(null);
            }
            if(objeto[i] instanceof JTextArea){
                ((JTextArea)objeto[i]).setText(null);
                ((JTextArea)objeto[i]).setToolTipText(null);
            }
            if(objeto[i] instanceof ButtonGroup){
                ((ButtonGroup)objeto[i]).clearSelection();
            }
            if(objeto[i] instanceof JRadioButton){
                ((JRadioButton)objeto[i]).setSelected(false);
            }
        }
    }
    
    
    public static void definirCorDaBordaJTextField(JComponent componente,Color cor){
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
        
        if(componente instanceof JPanel){
            ((JPanel)componente).setEnabled(habilitar);
        }
        
        for(int i = 0; i < objeto.length; i++){
            
            if(objeto[i] instanceof JComponent){
                habilitarCampos((JComponent)objeto[i], habilitar);
            }
            if(objeto[i] instanceof JCheckBox){
                ((JCheckBox)objeto[i]).setEnabled(habilitar);
                if(!habilitar){
                    ((JCheckBox)objeto[i]).setSelected(false);
                }
            }
            if(objeto[i] instanceof JComboBox){
                ((JComboBox)objeto[i]).setEnabled(habilitar);
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
                    ((JRadioButton)objeto[i]).setForeground(Color.GRAY);
                }else{
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
            if(objeto[i] instanceof JButton){
                ((JButton)objeto[i]).setEnabled(habilitar);
            }
            if(objeto[i] instanceof JList){
                ((JList)objeto[i]).setEnabled(habilitar);
            }
        }
    }
    
    public static void habilitarEdicaoDeCampos(JComponent componente, 
                                                            boolean habilitar){
        Object objeto[] = componente.getComponents();
        
                for(int i = 0; i < objeto.length; i++){
            
            if(objeto[i] instanceof JComponent){
                habilitarEdicaoDeCampos((JComponent)objeto[i], habilitar);
            }
            if(objeto[i] instanceof JCheckBox){
                ((JCheckBox)objeto[i]).setEnabled(habilitar);
                if(!habilitar){
                    ((JCheckBox)objeto[i]).setEnabled(false);
                }
            }
            if(objeto[i] instanceof JComboBox){
                ((JComboBox)objeto[i]).setEnabled(habilitar);
            }
            if(objeto[i] instanceof JTextField){
                ((JTextField)objeto[i]).setEditable(habilitar);
            }
            if(objeto[i] instanceof JRadioButton){
                ((JRadioButton)objeto[i]).setEnabled(habilitar);
            }
            if(objeto[i] instanceof JTextArea){
                ((JTextArea)objeto[i]).setEditable(habilitar);
            }
        }
    }
}
