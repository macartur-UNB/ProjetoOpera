/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.exception.ArquivoInvalidoException;
import model.exception.DiretorioInvalidoException;
import model.exception.JogoInvalidoException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.classes.Dado;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Macartur
 */
public class Controle_DadoTest {
    
    public Controle_DadoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        try {
            Controle_Jogo.abrirJogo("JUnitTest");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Controle_DadoTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Controle_DadoTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Controle_DadoTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JogoInvalidoException ex) {
            Logger.getLogger(Controle_DadoTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ArquivoInvalidoException ex) {
            Logger.getLogger(Controle_DadoTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of cadDado method, of class Controle_Dado.
     */
    @Test
    public void testCadDado() throws Exception {
        System.out.println("cadDado");
        int rolagem = 2;
        int lados = 2;
        Controle_Dado.cadDado(rolagem, lados);
    }

    /**
     * Test of encontrarDado method, of class Controle_Dado.
     */
    
    @Test
    public void testEncontrarDado() throws Exception {
        System.out.println("encontrarDado");
        String nome_dado = "2d2";
        Dado expResult = new Dado(2, 2);
        Dado result = Controle_Dado.encontrarDado(nome_dado);
        assertEquals(expResult.toString(), result.toString());
    }
    
    /**
     * Test of listarTodosDados method, of class Controle_Dado.
     */
    /*
    @Test
    public void testListarTodosDados() {
        System.out.println("listarTodosDados");
        String[] expResult = {"2d2"};
        String[] result = Controle_Dado.listarTodosDados();
        assertArrayEquals(expResult, result);
    }
    
    /**
     * Test of removerDado method, of class Controle_Dado.
     */
  /*
    @Test
    public void testRemoverDado() throws Exception {
        System.out.println("removerDado");
        String nome_dado = "";
        Controle_Dado.removerDado(nome_dado);
    }
  
    /**
     * Test of removerTodosDados method, of class Controle_Dado.
     */
  /*
    @Test
    public void testRemoverTodosDados() throws Exception {
        System.out.println("removerTodosDados");
        Controle_Dado.removerTodosDados();
    }
    */
}
