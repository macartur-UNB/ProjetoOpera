/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.classes.Ficha;
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
public class Controle_FichaTest {
    
    public Controle_FichaTest() {
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
     * Test of cadJogador method, of class Controle_Ficha.
     */
    @Test
    public void testCadJogador() throws Exception {
        System.out.println("cadJogador");
        String personagem = "";
        String jogador = "";
        String campanha = "";
        int experiencia = 0;
        int[] atributos = null;
        int dinheiro = 0;
        Controle_Ficha.cadJogador(personagem, jogador, campanha, experiencia, atributos, dinheiro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cadNPC method, of class Controle_Ficha.
     */
    @Test
    public void testCadNPC() throws Exception {
        System.out.println("cadNPC");
        String personagem = "";
        String campanha = "";
        int experiencia = 0;
        int[] atributos = null;
        int dinheiro = 0;
        Controle_Ficha.cadNPC(personagem, campanha, experiencia, atributos, dinheiro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cadMonstro method, of class Controle_Ficha.
     */
    @Test
    public void testCadMonstro() throws Exception {
        System.out.println("cadMonstro");
        String personagem = "";
        String campanha = "";
        int experiencia = 0;
        int[] atributos = null;
        int dinheiro = 0;
        Controle_Ficha.cadMonstro(personagem, campanha, experiencia, atributos, dinheiro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encontrarJogador method, of class Controle_Ficha.
     */
    @Test
    public void testEncontrarJogador() throws Exception {
        System.out.println("encontrarJogador");
        String nome = "";
        Ficha expResult = null;
        Ficha result = Controle_Ficha.encontrarJogador(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encontrarNPC method, of class Controle_Ficha.
     */
    @Test
    public void testEncontrarNPC() throws Exception {
        System.out.println("encontrarNPC");
        String nome = "";
        Ficha expResult = null;
        Ficha result = Controle_Ficha.encontrarNPC(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encontrarMonstro method, of class Controle_Ficha.
     */
    @Test
    public void testEncontrarMonstro() throws Exception {
        System.out.println("encontrarMonstro");
        String nome = "";
        Ficha expResult = null;
        Ficha result = Controle_Ficha.encontrarMonstro(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of JogadorExiste method, of class Controle_Ficha.
     */
    @Test
    public void testJogadorExiste() {
        System.out.println("JogadorExiste");
        String personagem = "";
        boolean expResult = false;
        boolean result = Controle_Ficha.JogadorExiste(personagem);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of NPCExiste method, of class Controle_Ficha.
     */
    @Test
    public void testNPCExiste() {
        System.out.println("NPCExiste");
        String nome = "";
        boolean expResult = false;
        boolean result = Controle_Ficha.NPCExiste(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of MonstroExiste method, of class Controle_Ficha.
     */
    @Test
    public void testMonstroExiste() {
        System.out.println("MonstroExiste");
        String nome = "";
        boolean expResult = false;
        boolean result = Controle_Ficha.MonstroExiste(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of FichaExiste method, of class Controle_Ficha.
     */
    @Test
    public void testFichaExiste() {
        System.out.println("FichaExiste");
        String nome = "";
        boolean expResult = false;
        boolean result = Controle_Ficha.FichaExiste(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerJogador method, of class Controle_Ficha.
     */
    @Test
    public void testRemoverJogador() throws Exception {
        System.out.println("removerJogador");
        String personagem = "";
        Controle_Ficha.removerJogador(personagem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerNPC method, of class Controle_Ficha.
     */
    @Test
    public void testRemoverNPC() throws Exception {
        System.out.println("removerNPC");
        String personagem = "";
        Controle_Ficha.removerNPC(personagem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerMonstro method, of class Controle_Ficha.
     */
    @Test
    public void testRemoverMonstro() throws Exception {
        System.out.println("removerMonstro");
        String personagem = "";
        Controle_Ficha.removerMonstro(personagem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeTodasFichasJogador method, of class Controle_Ficha.
     */
    @Test
    public void testRemoveTodasFichasJogador() throws Exception {
        System.out.println("removeTodasFichasJogador");
        Controle_Ficha.removeTodasFichasJogador();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeTodasFichasNPC method, of class Controle_Ficha.
     */
    @Test
    public void testRemoveTodasFichasNPC() throws Exception {
        System.out.println("removeTodasFichasNPC");
        Controle_Ficha.removeTodasFichasNPC();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeTodasFichasMonstro method, of class Controle_Ficha.
     */
    @Test
    public void testRemoveTodasFichasMonstro() throws Exception {
        System.out.println("removeTodasFichasMonstro");
        Controle_Ficha.removeTodasFichasMonstro();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeTodasHabilidades method, of class Controle_Ficha.
     */
    @Test
    public void testRemoveTodasHabilidades() throws Exception {
        System.out.println("removeTodasHabilidades");
        Controle_Ficha.removeTodasHabilidades();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarFichasJogador method, of class Controle_Ficha.
     */
    @Test
    public void testListarFichasJogador() {
        System.out.println("listarFichasJogador");
        String[] expResult = null;
        String[] result = Controle_Ficha.listarFichasJogador();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarFichasNPC method, of class Controle_Ficha.
     */
    @Test
    public void testListarFichasNPC() {
        System.out.println("listarFichasNPC");
        String[] expResult = null;
        String[] result = Controle_Ficha.listarFichasNPC();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarFichasMonstro method, of class Controle_Ficha.
     */
    @Test
    public void testListarFichasMonstro() {
        System.out.println("listarFichasMonstro");
        String[] expResult = null;
        String[] result = Controle_Ficha.listarFichasMonstro();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
