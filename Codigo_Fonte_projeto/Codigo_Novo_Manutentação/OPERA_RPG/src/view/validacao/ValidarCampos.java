/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.validacao;

import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import model.exception.CaractereInvalidoException;
import model.exception.JTextAreaInvalidoException;
import model.exception.JTextFieldInvalidoException;
import model.exception.NomeInvalidoException;
import model.exception.NumeroInteiroInvalidoException;
import model.exception.TextoInvalidoException;

/**
 *
 * @author Luciano
 */
public class ValidarCampos {
    
    
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
    
    public static int validarCampoInteiro(JTextField txtField) throws JTextFieldInvalidoException{
        try {
            ValidarNumero.validarNumeroInteiro(txtField.getText());
            txtField.setBorder(new LineBorder(Color.GRAY));
            txtField.setToolTipText("A entrada: " + txtField.getText() + ". esta Valida.");
            return Integer.parseInt(txtField.getText());
        } catch (NumeroInteiroInvalidoException e) {
            txtField.setBorder(new LineBorder(Color.RED));
            txtField.setToolTipText(e.getMessage());
            throw new JTextFieldInvalidoException(e.getMessage());
        }
    }
    
    
    public static String validarCampoAreaDeTexto(JTextArea txtArea) throws JTextAreaInvalidoException{
        return validarCampoAreaDeTexto(txtArea, null);
    }
    
    public static String validarCampoAreaDeTexto(JTextArea txtArea, String maisCaracteresValidos) throws JTextAreaInvalidoException{
        try{
            ValidarNome.validarTexto(txtArea.getText(), maisCaracteresValidos);
            txtArea.setBorder(new LineBorder(Color.GRAY));
            txtArea.setToolTipText("O Texto esta Valido.");
        } catch(TextoInvalidoException e){
            txtArea.setBorder(new LineBorder(Color.RED));
            txtArea.setToolTipText(e.getMessage());
            throw new JTextAreaInvalidoException(e.getMessage());
        }
        return txtArea.getText();
        }
    
    public static char validarCampoCaractere(JTextField txtField) throws JTextFieldInvalidoException{
        try{
            if(txtField.getText().length() == 1){
                ValidarNome.validarCaractere(txtField.getText().charAt(0));
                txtField.setBorder(new LineBorder(Color.GRAY));
                txtField.setToolTipText("A entrada: " + txtField.getText() + ". esta Valida.");
                return txtField.getText().charAt(0);
            }else{
                txtField.setBorder(new LineBorder(Color.RED));
                txtField.setToolTipText("A entrada: " + txtField.getText() + ""
                        + ". Deve ser de  UM Caractere.");
                throw new JTextFieldInvalidoException("A entrada: " + txtField.getText() + ""
                        + ". Deve ser de  UM Caractere.");
            }
        } catch (CaractereInvalidoException e) {
            txtField.setBorder(new LineBorder(Color.RED));
            txtField.setToolTipText(e.getMessage());
            throw new JTextFieldInvalidoException(e.getMessage());
        }
    }
    
}
