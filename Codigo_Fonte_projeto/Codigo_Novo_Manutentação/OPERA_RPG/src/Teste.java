
import control.Controle_Caracteristica;
import control.Controle_Dado;
import control.Controle_Diretorios;
import control.Controle_Item;
import control.Controle_Jogo;
import exception.DiretorioInvalidaException;
import exception.ValidarException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Arma_A_Distancia;
import model.Arma_Corpo_A_Corpo;
import model.Armadura;
import model.Caracteristica;
import model.Dado;
import model.Item;
import model.Jogo;
import exception.JogoInvalidoException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


public class Teste {
    
    public static void main(String args[])
    {
        try {
            Controle_Jogo.getInstancia().abrirJogo("macartur");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }
    
}
