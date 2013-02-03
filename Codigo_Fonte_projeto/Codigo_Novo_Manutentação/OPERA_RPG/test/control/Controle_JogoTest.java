/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

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
public class Controle_JogoTest {
    
    public Controle_JogoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of criarJogo method, of class Controle_Jogo.
     */
    /*
    @Test
    public void testCriarJogo() throws Exception {
        System.out.println("criarJogo");
        String nome = "JUnitTest";
        Controle_Jogo.criarJogo(nome);
    }
*/
    /**
     * Test of abrirJogo method, of class Controle_Jogo.
     */
    /*
    @Test
    public void testAbrirJogo() throws Exception {
        System.out.println("abrirJogo");
        String nome = "JUnitTest";
        Controle_Jogo.abrirJogo(nome);
    }

    */
    /**
     * Test of jogoExiste method, of class Controle_Jogo.
     */
    @Test
    public void testJogoExiste() {
        System.out.println("jogoExiste");
        String nome = "JUnitTest";
        boolean expResult = true;
        boolean result = Controle_Jogo.jogoExiste(nome);
        assertEquals(expResult, result);
    }

    /**
     * Test of jogosExistentes method, of class Controle_Jogo.
     */
    @Test
    public void testJogosExistentes() {
        System.out.println("jogosExistentes");
        String[] expResult = {"JUnitTest"};
        String[] result = Controle_Jogo.jogosExistentes();
        assertArrayEquals(expResult, result);
    }
    
    /**
     * Test of apagarJogo method, of class Controle_Jogo.
     */
    /*
    @Test
    public void testApagarJogo() throws Exception {
        System.out.println("apagarJogo");
        String nome = "JUnitTest";
        Controle_Jogo.apagarJogo(nome);
    }*/

}
