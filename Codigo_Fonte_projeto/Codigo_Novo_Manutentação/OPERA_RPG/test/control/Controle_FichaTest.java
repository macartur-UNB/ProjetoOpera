
package control;

import java.io.IOException;

import model.classes.Ficha;
import model.dao.DAO_Ficha;
import model.exception.ArquivoInvalidoException;
import model.exception.FichaInvalidaException;

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
    public void tearDown() throws Exception{
           Controle_Jogo.apagarJogo("JUnitTest");
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
        Controle_Ficha.cadJogador(
               personagem, jogador, campanha, experiencia, atributos, dinheiro);
        
        try{
        	Controle_Ficha.cadJogador(
               personagem, jogador, campanha, experiencia, atributos, dinheiro);
        	fail("cadJogador deveria ter sido pego na Excecao");
        } catch (ArquivoInvalidoException | FichaInvalidaException |
                                                                IOException e) {
	}
        
        Controle_Ficha.removerJogador(personagem);
    }

    /**
     * Test of cadNPC method, of class Controle_Ficha.
     */
    @Test
    public void testCadNPC() throws Exception {
        System.out.println("cadNPC");
        Controle_Ficha.cadNPC(personagem, campanha, experiencia, atributos, dinheiro);
        
        try{
        	Controle_Ficha.cadNPC(personagem, campanha, experiencia, atributos, dinheiro);
        	fail("cadNPC deveria ter sido pego na Excecao");
        } catch (ArquivoInvalidoException | FichaInvalidaException | 
                                                                IOException e) {
        }
        
        Controle_Ficha.removerNPC(personagem);
    }

    /**
     * Test of cadMonstro method, of class Controle_Ficha.
     */
    @Test
    public void testCadMonstro() throws Exception {
        System.out.println("cadMonstro");
        Controle_Ficha.cadMonstro(personagem, campanha, experiencia, atributos, dinheiro);
        
        try{
        	Controle_Ficha.cadMonstro(personagem, campanha, experiencia, atributos, dinheiro);
        	fail("cadMonstro deveria ter sido pego na Excecao");
        } catch (ArquivoInvalidoException | FichaInvalidaException |
                                                                IOException e) {
	}
        Controle_Ficha.removerMonstro(personagem);
    }

    /**
     * Test of encontrarJogador method, of class Controle_Ficha.
     */
    @Test
    public void testEncontrarJogador() throws Exception {
        System.out.println("encontrarJogador");
        Controle_Ficha.cadJogador(
               personagem, jogador, campanha, experiencia, atributos, dinheiro);
        Ficha result = Controle_Ficha.encontrarJogador(personagem);
        if(result == null)
        {
            fail("Jogador nÃ£o encontrado");
        }
        Controle_Ficha.removerJogador(personagem);
    }

    /**
     * Test of encontrarNPC method, of class Controle_Ficha.
     */
    @Test
    public void testEncontrarNPC() throws Exception {
        System.out.println("encontrarNPC");
        Controle_Ficha.cadNPC(
                        personagem, campanha, experiencia, atributos, dinheiro);
        Ficha result = Controle_Ficha.encontrarNPC(personagem);
        if(result == null)
        {
            fail("NPC nÃ£o encontrado");
        }
        Controle_Ficha.removeTodasFichasNPC();
    }

    /**
     * Test of encontrarMonstro method, of class Controle_Ficha.
     */
    @Test
    public void testEncontrarMonstro() throws Exception {
        System.out.println("encontrarMonstro");
        Controle_Ficha.cadMonstro(
                        personagem, campanha, experiencia, atributos, dinheiro);
        Ficha result = Controle_Ficha.encontrarMonstro(personagem);
        if(result == null)
        {
            fail("Monstro nÃ£o encontrado");
        }
        Controle_Ficha.removerMonstro(personagem);
    }

    /**
     * Test of JogadorExiste method, of class Controle_Ficha.
     */
    @Test
    public void testJogadorExiste() throws Exception{
        System.out.println("JogadorExiste");
        Controle_Ficha.cadJogador(
               personagem, jogador, campanha, experiencia, atributos, dinheiro);
        boolean expResult = true;
        boolean result = Controle_Ficha.JogadorExiste(personagem);
        assertEquals(expResult, result);
        Controle_Ficha.removerJogador(personagem);
    }

    /**
     * Test of NPCExiste method, of class Controle_Ficha.
     */
    @Test
    public void testNPCExiste() throws Exception{
        System.out.println("NPCExiste");
        Controle_Ficha.cadNPC(
                        personagem, campanha, experiencia, atributos, dinheiro);
        boolean expResult = true;
        boolean result = Controle_Ficha.NPCExiste(personagem);
        assertEquals(expResult, result);
        Controle_Ficha.removerNPC(personagem);
    }

    /**
     * Test of MonstroExiste method, of class Controle_Ficha.
     */
    @Test
    public void testMonstroExiste() throws Exception{
        System.out.println("MonstroExiste");
        Controle_Ficha.cadMonstro(
                        personagem, campanha, experiencia, atributos, dinheiro);
        boolean expResult = true;
        boolean result = Controle_Ficha.MonstroExiste(personagem);
        assertEquals(expResult, result);
        Controle_Ficha.removerMonstro(personagem);      
    }

    /**
     * Test of FichaExiste method, of class Controle_Ficha.
     */
    @Test
    public void testFichaExiste()throws Exception{
        System.out.println("FichaExiste");
        Controle_Ficha.cadMonstro(
                        personagem, campanha, experiencia, atributos, dinheiro);
        boolean expResult = true;
        boolean result = Controle_Ficha.FichaExiste(personagem);
        assertEquals(expResult, result);
        Controle_Ficha.removerMonstro(personagem);
    }

    /**
     * Test of encontrarFicha method, of class Controle_Ficha.
     */
    @Test
    public void testeEncontrarFicha() throws Exception{
    	System.out.println("encontrarFicha");
		 Controle_Ficha.cadJogador(
               personagem, jogador, campanha, experiencia, atributos, dinheiro);
		 Controle_Ficha.encontrarFicha(personagem);
	 	 Controle_Ficha.removerJogador(personagem);
		 Controle_Ficha.cadNPC(
                        personagem, campanha, experiencia, atributos, dinheiro);
		 Controle_Ficha.encontrarFicha(personagem);
	 	 Controle_Ficha.removerNPC(personagem);
		 Controle_Ficha.cadMonstro(
                        personagem, campanha, experiencia, atributos, dinheiro);
		 Controle_Ficha.encontrarFicha(personagem);
	 	 Controle_Ficha.removerMonstro(personagem);
	 	Controle_Ficha.encontrarFicha(personagem);
    }
    
    
    
    /**
     * Test of alterarJogador method, of class Controle_Ficha.
     */
    @Test
    public void testAlterarJogador() throws Exception{
    	System.out.println("alterarJogador");
    	Controle_Ficha.cadJogador(personagem, jogador, campanha, experiencia, 
                                                            atributos, dinheiro);
    	Controle_Ficha.cadJogador(personagem+"a", jogador, campanha, experiencia,
                                                           atributos, dinheiro);
    	Controle_Ficha.alterarJogador(personagem, personagem, jogador+"a", 
                                      campanha, experiencia, atributos,dinheiro);
    	Controle_Ficha.alterarJogador(personagem, personagem+"b", jogador+"a", 
                                      campanha, experiencia, atributos, dinheiro);
    	
    	try{
    		Controle_Ficha.alterarJogador(personagem, personagem+"a", 
                                              jogador, campanha, experiencia, 
                                                           atributos, dinheiro);
        	fail("alterarJogador deveria ter sido pego na Excecao");
        } catch (FichaInvalidaException e) {
		}
    }
    
    /**
     * Test of alterarNPC method, of class Controle_Ficha.
     */
    @Test
    public void testAlterarNPC() throws Exception{
    	System.out.println("alterarNPC");
    	Controle_Ficha.cadNPC(personagem, campanha,experiencia, atributos,dinheiro);
    	Controle_Ficha.cadNPC(personagem+"a", campanha, experiencia,
                                                           atributos, dinheiro);
    	Controle_Ficha.alterarNPC(personagem, personagem, campanha, experiencia,
                                                           atributos, dinheiro);
    	Controle_Ficha.alterarNPC(personagem, personagem+"b", campanha, 
                                              experiencia, atributos, dinheiro);
    	    	
    	try{
    		Controle_Ficha.alterarNPC(personagem, personagem+"a", 
                                          campanha,experiencia,atributos,dinheiro);
        	fail("alterarNPC deveria ter sido pego na Excecao");
        } catch (FichaInvalidaException e) {
		}
    }
    
    /**
     * Test of alterarMonstro method, of class Controle_Ficha.
     */
    @Test
    public void testAlterarMonstro() throws Exception{
    	System.out.println("alterarMonstro");
    	Controle_Ficha.cadMonstro(personagem, campanha, experiencia, atributos,
                                                                      dinheiro);
    	Controle_Ficha.cadMonstro(personagem+"a", campanha, experiencia, atributos,
                                                                       dinheiro);
    	Controle_Ficha.alterarMonstro(personagem, personagem, campanha, 
                                              experiencia, atributos, dinheiro);
    	Controle_Ficha.alterarMonstro(personagem, personagem+"b", campanha, 
                                              experiencia, atributos, dinheiro);
    	    	
    	try{
    		Controle_Ficha.alterarMonstro(personagem, personagem+"a", 
                                              campanha, experiencia, atributos, 
                                                                      dinheiro);
        	fail("alterarMonstro deveria ter sido pego na Excecao");
        } catch (FichaInvalidaException e) {
		}
    }
    
    /**
     * Test of removerJogador method, of class Controle_Ficha.
     */
    @Test
    public void testRemoverJogador() throws Exception {
        System.out.println("removerJogador");
        Controle_Ficha.cadJogador(personagem, jogador, campanha, experiencia, 
                                                           atributos, dinheiro);
        Controle_Ficha.removerJogador(personagem);
        if(Controle_Ficha.JogadorExiste(personagem)){
            fail("NÃ£o foi possivel remover apenas 1 jogador");
        }
    }

    /**
     * Test of removerNPC method, of class Controle_Ficha.
     */
    @Test
    public void testRemoverNPC() throws Exception {
        System.out.println("removerNPC");
        Controle_Ficha.cadNPC(personagem, campanha, experiencia, atributos, 
                                                                      dinheiro);
        Controle_Ficha.removerNPC(personagem);
         if(Controle_Ficha.NPCExiste(personagem)){
            fail("NÃ£o foi possivel remover apenas 1 NPC");
        }
    }

    /**
     * Test of removerMonstro method, of class Controle_Ficha.
     */
    @Test
    public void testRemoverMonstro() throws Exception {
        System.out.println("removerMonstro");
        Controle_Ficha.cadMonstro(personagem, campanha, experiencia, atributos,
                                                                      dinheiro);        
        Controle_Ficha.removerMonstro(personagem);
        if(Controle_Ficha.MonstroExiste(personagem)){
            fail("NÃ£o foi possivel remover apenas 1 monstro");
        }
    }

    /**
     * Test of removeTodasFichasJogador method, of class Controle_Ficha.
     */
    @Test
    public void testRemoveTodasFichasJogador() throws Exception {
        System.out.println("removeTodasFichasJogador");
        Controle_Ficha.cadJogador(personagem, jogador, campanha, experiencia, 
                                                           atributos, dinheiro);
        Controle_Ficha.removerJogador(personagem);
        if(Controle_Ficha.JogadorExiste(personagem)){
            fail("NÃ£o foi possivel remover todas as fichas jogador");
        }
    }

    /**
     * Test of removeTodasFichasNPC method, of class Controle_Ficha.
     */
    @Test
    public void testRemoveTodasFichasNPC() throws Exception {
        System.out.println("removeTodasFichasNPC");
         Controle_Ficha.cadNPC(personagem, campanha, experiencia, atributos, 
                                                                      dinheiro);
        Controle_Ficha.removeTodasFichasNPC();
        if(Controle_Ficha.NPCExiste(personagem)){
            fail("nÃ£o foi possivel remover todas fichas npc");
        }
    }

    /**
     * Test of removeTodasFichasMonstro method, of class Controle_Ficha.
     */
    @Test
    public void testRemoveTodasFichasMonstro() throws Exception {
        System.out.println("removeTodasFichasMonstro");
        Controle_Ficha.cadMonstro(personagem, campanha, experiencia, atributos,
                                                                      dinheiro);             
        Controle_Ficha.removeTodasFichasMonstro();
        if(Controle_Ficha.MonstroExiste(personagem)){
            fail("NÃ£o Ã© possivel remover todos os monstros");
        }    
    }

    /**
     * Test of removeTodasHabilidades method, of class Controle_Ficha.
     */
    @Test
    public void testRemoveTodasFichas() throws Exception {
        System.out.println("removeTodasHabilidades");
        Controle_Ficha.cadJogador("Teste2", jogador, campanha, experiencia,
                                                           atributos, dinheiro);
        Controle_Ficha.cadNPC("Teste1", campanha, experiencia, atributos, 
                                                                      dinheiro);
        Controle_Ficha.cadMonstro("Teste4", campanha, experiencia, atributos,
                                                                      dinheiro);  
        Controle_Ficha.removeTodasFichas();
        if(Controle_Ficha.MonstroExiste(personagem) ||
           Controle_Ficha.NPCExiste(personagem) ||
           Controle_Ficha.JogadorExiste(personagem)){
            fail("NÃ£o removel todas as fichas");
        }
    }

    /**
     * Test of listarFichasJogador method, of class Controle_Ficha.
     */
    @Test
    public void testListarFichasJogador()throws Exception{
        System.out.println("listarFichasJogador");
        Controle_Ficha.cadJogador(personagem, jogador, campanha, experiencia,
                                                           atributos, dinheiro);
        Controle_Ficha.cadJogador("Test2", jogador, campanha, experiencia, 
                                                           atributos, dinheiro);
        Controle_Ficha.cadJogador("Test3", jogador, campanha, experiencia, 
                                                           atributos, dinheiro);
        String[] expResult = {"Test","Test2","Test3"};
        String[] result = Controle_Ficha.listarFichasJogador();
        assertArrayEquals(expResult, result);
        Controle_Ficha.removeTodasFichasJogador();
    }

    /**
     * Test of listarFichasNPC method, of class Controle_Ficha.
     */
    @Test
    public void testListarFichasNPC()throws Exception{
        System.out.println("listarFichasNPC");
         Controle_Ficha.cadNPC(personagem, campanha, experiencia, atributos,dinheiro);
         Controle_Ficha.cadNPC("Test1", campanha, experiencia, atributos, dinheiro);
         Controle_Ficha.cadNPC("Test2", campanha, experiencia, atributos, dinheiro);
         String[] expResult = {personagem,"Test1","Test2"};
         String[] result = Controle_Ficha.listarFichasNPC();
         assertArrayEquals(expResult, result);
         Controle_Ficha.removeTodasFichasNPC();
    }

    /**
     * Test of listarFichasMonstro method, of class Controle_Ficha.
     */
    @Test
    public void testListarFichasMonstro() throws Exception{
        System.out.println("listarFichasMonstro");
        Controle_Ficha.cadMonstro(personagem, campanha, experiencia, atributos, dinheiro);  
        Controle_Ficha.cadMonstro("Test1", campanha, experiencia, atributos, dinheiro);  
        Controle_Ficha.cadMonstro("Test2", campanha, experiencia, atributos, dinheiro);  
        
        String[] expResult = {personagem,"Test1","Test2"};
        String[] result = Controle_Ficha.listarFichasMonstro();
        assertArrayEquals(expResult, result);
        Controle_Ficha.removeTodasFichasMonstro();
    }
}
