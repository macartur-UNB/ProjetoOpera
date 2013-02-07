/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import model.classes.Jogo;
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
public class DAO_JogoTest {
    
    public DAO_JogoTest() {
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
     * Test of deletarJogo method, of class DAO_Jogo.
     */
    @Test
    public void testDeletarJogo() throws Exception {
        System.out.println("deletarJogo");
        String nome = "";
        DAO_Jogo.deletarJogo(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    

    /**
     * Test of carregarJogo method, of class DAO_Jogo.
     */
    @Test
    public void testCarregarJogo() throws Exception {
        System.out.println("carregarJogo");
        String nome = "";
        DAO_Jogo.carregarJogo(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJogoRodando method, of class DAO_Jogo.
     */
    @Test
    public void testGetJogoRodando() {
        System.out.println("getJogoRodando");
        Jogo expResult = null;
        Jogo result = DAO_Jogo.getJogoRodando();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of jogosExistentes method, of class DAO_Jogo.
     */
    @Test
    public void testJogosExistentes() {
        System.out.println("jogosExistentes");
        String[] expResult = null;
        String[] result = DAO_Jogo.jogosExistentes();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of jogoExiste method, of class DAO_Jogo.
     */
    @Test
    public void testJogoExiste() {
        System.out.println("jogoExiste");
        String nome = "";
        boolean expResult = false;
        boolean result = DAO_Jogo.jogoExiste(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of criarJogo method, of class DAO_Jogo.
     */
    @Test
    public void testCriarJogo() throws Exception {
        System.out.println("criarJogo");
        String nome = "JUnitTest";
        DAO_Jogo.criarJogo(nome);
    }
}
