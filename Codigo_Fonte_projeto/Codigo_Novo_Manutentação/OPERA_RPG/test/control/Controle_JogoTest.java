/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.dao.DAO_Jogo;
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
    public void setUp()throws Exception{
        DAO_Jogo.deletarTodosJogos();        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of criarJogo method, of class Controle_Jogo.
     */
    @Test
    public void testCriarJogo() throws Exception {
        System.out.println("criarJogo");
        String nome = "JUnitTest";
        Controle_Jogo.criarJogo(nome);
        DAO_Jogo.deletarJogo(nome);
    }

    /**
     * Test of abrirJogo method, of class Controle_Jogo.
     */
    @Test
    public void testAbrirJogo() throws Exception {
        System.out.println("abrirJogo");
        String nome = "JUnitTest";
        DAO_Jogo.criarJogo(nome);
        Controle_Jogo.abrirJogo(nome);
        DAO_Jogo.deletarJogo(nome);
    }

    /**
     * Test of apagarJogo method, of class Controle_Jogo.
     */
    @Test
    public void testApagarJogo() throws Exception {
        System.out.println("apagarJogo");
        String nome = "JUnitTest";
        DAO_Jogo.criarJogo(nome);
        Controle_Jogo.apagarJogo(nome);
        if(DAO_Jogo.jogoExiste(nome)){
            fail("Jogo não apagado");
            DAO_Jogo.deletarJogo(nome);
        }
    }

    /**
     * Test of jogoExiste method, of class Controle_Jogo.
     */
    @Test
    public void testJogoExiste()throws Exception{
        System.out.println("jogoExiste");
        String nome = "JUnitTest";
        DAO_Jogo.criarJogo(nome);
        boolean expResult = true;
        boolean result = Controle_Jogo.jogoExiste(nome);
        assertEquals(expResult, result);
        DAO_Jogo.deletarJogo(nome);
    }

    /**
     * Test of jogosExistentes method, of class Controle_Jogo.
     */
    @Test
    public void testJogosExistentes() throws Exception{
        System.out.println("jogosExistentes");
        DAO_Jogo.criarJogo("JUnitTest");
        DAO_Jogo.criarJogo("JUnitTest1");
        String[] expResult = {"JUnitTest","JUnitTest1"};
        String[] result = Controle_Jogo.jogosExistentes();
        assertArrayEquals(expResult, result);
        DAO_Jogo.deletarTodosJogos();
    }
}
