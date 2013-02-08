/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.classes.Ficha;
import model.dao.DAO_Ficha;
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
    public void setUp()throws Exception{
        if(!Controle_Jogo.jogoExiste("JunitTest")){
            Controle_Jogo.criarJogo("JUnitTest");
        }
        DAO_Ficha.removerTodasFichas("NPC");
        DAO_Ficha.removerTodasFichas("Jogador");
        DAO_Ficha.removerTodasFichas("Monstro");
    }
    @After
    public void tearDown() {
    }
    
    String personagem = "Test";
    String campanha = "Test";
    String jogador = "Test";
    int experiencia = 0;
    int[] atributos = {3,2,4,5,6,7,8,1};
    int dinheiro = 0;
    /**
     * Test of cadJogador method, of class Controle_Ficha.
     */
    @Test
    public void testCadJogador() throws Exception {
        System.out.println("cadJogador");
        Controle_Ficha.cadJogador(personagem, jogador, campanha, experiencia, atributos, dinheiro);
        Controle_Ficha.removerJogador(personagem);
    }

    /**
     * Test of cadNPC method, of class Controle_Ficha.
     */
    @Test
    public void testCadNPC() throws Exception {
        System.out.println("cadNPC");
        Controle_Ficha.cadNPC(personagem, campanha, experiencia, atributos, dinheiro);
        Controle_Ficha.removerNPC(personagem);
    }

    /**
     * Test of cadMonstro method, of class Controle_Ficha.
     */
    @Test
    public void testCadMonstro() throws Exception {
        System.out.println("cadMonstro");
        Controle_Ficha.cadMonstro(personagem, campanha, experiencia, atributos, dinheiro);
        Controle_Ficha.removeTodasFichasMonstro();
    }

    /**
     * Test of encontrarJogador method, of class Controle_Ficha.
     */
    @Test
    public void testEncontrarJogador() throws Exception {
        System.out.println("encontrarJogador");
        Controle_Ficha.cadJogador(personagem, jogador, campanha, experiencia, atributos, dinheiro);
        Ficha result = Controle_Ficha.encontrarJogador(personagem);
        if(result == null)
        {
            fail("Jogador não encontrado");
        }
        Controle_Ficha.removeTodasFichasJogador();
    }

    /**
     * Test of encontrarNPC method, of class Controle_Ficha.
     */
    @Test
    public void testEncontrarNPC() throws Exception {
        System.out.println("encontrarNPC");
        Controle_Ficha.cadNPC(personagem, campanha, experiencia, atributos, dinheiro);
        Ficha result = Controle_Ficha.encontrarNPC(personagem);
        if(result == null)
        {
            fail("NPC não encontrado");
        }
        Controle_Ficha.removeTodasFichasNPC();
    }

    /**
     * Test of encontrarMonstro method, of class Controle_Ficha.
     */
    @Test
    public void testEncontrarMonstro() throws Exception {
        System.out.println("encontrarMonstro");
        Controle_Ficha.cadMonstro(personagem, campanha, experiencia, atributos, dinheiro);
        Ficha result = Controle_Ficha.encontrarMonstro(personagem);
        if(result == null)
        {
            fail("Monstro não encontrado");
        }
        Controle_Ficha.removeTodasFichasMonstro();
    }

    /**
     * Test of JogadorExiste method, of class Controle_Ficha.
     */
    @Test
    public void testJogadorExiste() throws Exception{
        System.out.println("JogadorExiste");
        Controle_Ficha.cadJogador(personagem, jogador, campanha, experiencia, atributos, dinheiro);
        boolean expResult = true;
        boolean result = Controle_Ficha.JogadorExiste(personagem);
        assertEquals(expResult, result);
        Controle_Ficha.removeTodasFichas();
    }

    /**
     * Test of NPCExiste method, of class Controle_Ficha.
     */
    @Test
    public void testNPCExiste() throws Exception{
        System.out.println("NPCExiste");
        Controle_Ficha.cadNPC(personagem, campanha, experiencia, atributos, dinheiro);
        boolean expResult = true;
        boolean result = Controle_Ficha.NPCExiste(personagem);
        assertEquals(expResult, result);
        Controle_Ficha.removeTodasFichas();
    }

    /**
     * Test of MonstroExiste method, of class Controle_Ficha.
     */
    @Test
    public void testMonstroExiste() throws Exception{
        System.out.println("MonstroExiste");
        Controle_Ficha.cadMonstro(personagem, campanha, experiencia, atributos, dinheiro);
        boolean expResult = true;
        boolean result = Controle_Ficha.MonstroExiste(personagem);
        assertEquals(expResult, result);
        Controle_Ficha.removeTodasFichas();        
    }

    /**
     * Test of FichaExiste method, of class Controle_Ficha.
     */
    @Test
    public void testFichaExiste()throws Exception{
        System.out.println("FichaExiste");
        Controle_Ficha.cadMonstro(personagem, campanha, experiencia, atributos, dinheiro);
        boolean expResult = true;
        boolean result = Controle_Ficha.FichaExiste(personagem);
        assertEquals(expResult, result);
        Controle_Ficha.removeTodasFichas(); 
    }

    /**
     * Test of removerJogador method, of class Controle_Ficha.
     */
    @Test
    public void testRemoverJogador() throws Exception {
        System.out.println("removerJogador");
        Controle_Ficha.cadJogador(personagem, jogador, campanha, experiencia, atributos, dinheiro);
        Controle_Ficha.removerJogador(personagem);
    }

    /**
     * Test of removerNPC method, of class Controle_Ficha.
     */
    @Test
    public void testRemoverNPC() throws Exception {
        System.out.println("removerNPC");
        Controle_Ficha.cadNPC(personagem, campanha, experiencia, atributos, dinheiro);
        Controle_Ficha.removerNPC(personagem);
    }

    /**
     * Test of removerMonstro method, of class Controle_Ficha.
     */
    @Test
    public void testRemoverMonstro() throws Exception {
        System.out.println("removerMonstro");
        Controle_Ficha.cadMonstro(personagem, campanha, experiencia, atributos, dinheiro);        
        Controle_Ficha.removerMonstro(personagem);
    }

    /**
     * Test of removeTodasFichasJogador method, of class Controle_Ficha.
     */
    @Test
    public void testRemoveTodasFichasJogador() throws Exception {
        System.out.println("removeTodasFichasJogador");
        Controle_Ficha.cadJogador(personagem, jogador, campanha, experiencia, atributos, dinheiro);
        Controle_Ficha.removeTodasFichasJogador();
    }

    /**
     * Test of removeTodasFichasNPC method, of class Controle_Ficha.
     */
    @Test
    public void testRemoveTodasFichasNPC() throws Exception {
        System.out.println("removeTodasFichasNPC");
         Controle_Ficha.cadNPC(personagem, campanha, experiencia, atributos, dinheiro);
        Controle_Ficha.removeTodasFichasNPC();
    }

    /**
     * Test of removeTodasFichasMonstro method, of class Controle_Ficha.
     */
    @Test
    public void testRemoveTodasFichasMonstro() throws Exception {
        System.out.println("removeTodasFichasMonstro");
        Controle_Ficha.cadMonstro(personagem, campanha, experiencia, atributos, dinheiro);             
        Controle_Ficha.removeTodasFichasMonstro();
    }

    /**
     * Test of removeTodasHabilidades method, of class Controle_Ficha.
     */
    @Test
    public void testRemoveTodasFichas() throws Exception {
        System.out.println("removeTodasHabilidades");
        Controle_Ficha.cadJogador(personagem, jogador, campanha, experiencia, atributos, dinheiro);
        Controle_Ficha.cadNPC(personagem, campanha, experiencia, atributos, dinheiro);
         Controle_Ficha.cadMonstro(personagem, campanha, experiencia, atributos, dinheiro);  
        Controle_Ficha.removeTodasFichas();
    }

    /**
     * Test of listarFichasJogador method, of class Controle_Ficha.
     */
    @Test
    public void testListarFichasJogador()throws Exception{
        System.out.println("listarFichasJogador");
        Controle_Ficha.cadJogador(personagem, jogador, campanha, experiencia, atributos, dinheiro);
        Controle_Ficha.cadJogador("Test2", jogador, campanha, experiencia, atributos, dinheiro);
        Controle_Ficha.cadJogador("Test3", jogador, campanha, experiencia, atributos, dinheiro);
        String[] expResult = {"Test","Test2","Test3"};
        String[] result = Controle_Ficha.listarFichasJogador();
        assertArrayEquals(expResult, result);
        Controle_Ficha.removeTodasFichas();
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
    }
}
