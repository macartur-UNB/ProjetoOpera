/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.io.IOException;
import model.classes.Jogo;
import model.exception.ArquivoInvalidoException;
import model.exception.DeletarInvalidoException;
import model.exception.DiretorioInvalidoException;
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
    public void setUp() throws Exception{
        if(DAO_Jogo.jogoExiste("JUnitTest")){
            DAO_Jogo.deletarJogo("JUnitTest");
            DAO_Jogo.deletarJogo("JUnitTest1");
        }
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
        String nome = "JUnitTest";
        DAO_Jogo.criarJogo(nome);
        DAO_Jogo.deletarJogo(nome);
    }

    /**
     * Test of carregarJogo method, of class DAO_Jogo.
     */
    @Test
    public void testCarregarJogo() throws Exception {
        System.out.println("carregarJogo");
        String nome = "JUnitTest";
        DAO_Jogo.criarJogo(nome);
        DAO_Jogo.carregarJogo(nome);
        DAO_Jogo.deletarJogo(nome);
    }

    /**
     * Test of getJogoRodando method, of class DAO_Jogo.
     */
    @Test
    public void testGetJogoRodando() throws Exception {
        System.out.println("getJogoRodando");
        String expResult = "JUnitTest";
        Jogo result = DAO_Jogo.getJogoRodando();
        assertEquals(expResult, result.getNome());
        DAO_Jogo.deletarJogo("JUnitTest");
    }

    /**
     * Test of jogosExistentes method, of class DAO_Jogo.
     */
    @Test
    public void testJogosExistentes()throws Exception {
        System.out.println("jogosExistentes");
        String[] expResult = {"JUnitTest","JUnitTest1"};
        DAO_Jogo.criarJogo("JUnitTest");
        DAO_Jogo.criarJogo("JUnitTest1");
        String[] result = DAO_Jogo.jogosExistentes();
        for(int i = 0; i < result.length; i++){
        	System.out.println(result[i]);
        }
        assertArrayEquals(expResult, result);
        DAO_Jogo.deletarJogo("JUnitTest");
        DAO_Jogo.deletarJogo("JUnitTest1");
    }

    /**
     * Test of jogoExiste method, of class DAO_Jogo.
     */
    @Test
    public void testJogoExiste() throws Exception{
        System.out.println("jogoExiste");
        String nome = "JUnitTest";
        boolean expResult = true;
        DAO_Jogo.criarJogo(nome);
        boolean result = DAO_Jogo.jogoExiste(nome);
        assertEquals(expResult, result);
        DAO_Jogo.deletarJogo(nome);
    }

    /**
     * Test of criarJogo method, of class DAO_Jogo.
     */
    @Test
    public void testCriarJogo() throws Exception {
        System.out.println("criarJogo");
        String nome = "JUnitTest";
        DAO_Jogo.criarJogo(nome);
        //DAO_Jogo.deletarJogo(nome);
    }
    
    @Test
    public void testDeletarTodosJogos() throws Exception{
        System.out.println("deletar todos jogos");
        DAO_Jogo.criarJogo("JUnitTest");
        DAO_Jogo.criarJogo("JUnitTest1");
        DAO_Jogo.deletarTodosJogos();
    }
    
    
}
