/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package validacao;

import exception.InteiroInvalidoException;
import exception.JTextFieldInvalidoException;
import exception.NomeInvalidoException;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author Luciano
 */
public class ValidarJTextField {
    
    
    public static String validarCampoTexto(JTextField txtField, boolean numero, String maisCaracteresValidos) throws JTextFieldInvalidoException{
        try{
            ValidarNome.validarNome(txtField.getText(), numero, maisCaracteresValidos);
            txtField.setBorder(new LineBorder(Color.GRAY));
            txtField.setToolTipText("A entrada: " + txtField.getText() + ". esta Valida.");
        } catch(NomeInvalidoException e){
            txtField.setBorder(new LineBorder(Color.RED));
            txtField.setToolTipText(e.getMessage());
            throw new JTextFieldInvalidoException(e.getMessage());
        }
        return txtField.getText();
    }
    
    public static String validarCampoTexto(JTextField txtField, boolean numero) throws JTextFieldInvalidoException{
        validarCampoTexto(txtField, numero, "");
        return txtField.getText();
    }
    
    public static int validarCampoInteiro(JTextField txtField){
        try {
            ValidarInteiro.validarInteiro(txtField.getText());
            txtField.setBorder(new LineBorder(Color.GRAY));
            txtField.setToolTipText("A entrada: " + txtField.getText() + ". esta Valida.");
            return Integer.parseInt(txtField.getText());
        } catch (InteiroInvalidoException e) {
            txtField.setBorder(new LineBorder(Color.RED));
            txtField.setToolTipText(e.getMessage());
        }
        return 0;
    }
    
    
    
}
