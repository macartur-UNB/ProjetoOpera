/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import control.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.exception.ArquivoInvalidoException;
import model.exception.CaracteristicaInvalidaException;
import model.exception.DeletarInvalidoException;
import model.exception.DiretorioInvalidoException;
import model.exception.FichaInvalidaException;
import model.exception.HabilidadeInvalidaException;
import model.exception.JogoInvalidoException;
/**
 *
 * @author Macartur
 */
public class TesteIntegracao {
    public static void main(String args[]){
        
            try {
                Controle_Jogo.abrirJogo("Macartur");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(TesteIntegracao.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(TesteIntegracao.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(TesteIntegracao.class.getName()).log(Level.SEVERE, null, ex);
            } catch (JogoInvalidoException ex) {
                Logger.getLogger(TesteIntegracao.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ArquivoInvalidoException ex) {
                Logger.getLogger(TesteIntegracao.class.getName()).log(Level.SEVERE, null, ex);
            }
        try {
            Controle_Integracao_Ficha.selecionarFicha("macartur");
            Controle_Integracao_Ficha.colocarHabilidade("nadar");
        } catch (HabilidadeInvalidaException ex) {
            Logger.getLogger(TesteIntegracao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ArquivoInvalidoException ex) {
            Logger.getLogger(TesteIntegracao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DeletarInvalidoException ex) {
            Logger.getLogger(TesteIntegracao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FichaInvalidaException ex) {
            Logger.getLogger(TesteIntegracao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TesteIntegracao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TesteIntegracao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TesteIntegracao.class.getName()).log(Level.SEVERE, null, ex);
        }
           
        String s[] =Controle_Integracao_Ficha.listarHabilidades();
        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i]);
        }
           
    }
}
