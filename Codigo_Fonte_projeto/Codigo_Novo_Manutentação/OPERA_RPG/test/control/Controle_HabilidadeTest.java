/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.FileNotFoundException;
import java.io.IOException;

import model.classes.Habilidade;
import model.exception.ArquivoInvalidoException;
import model.exception.HabilidadeInvalidaException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luciano
 */
public class Controle_HabilidadeTest {
    
    public Controle_HabilidadeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception{
    	Controle_Jogo.criarJogo("ControleHabilidadeTest");
    }
    
    @AfterClass
    public static void tearDownClass() throws Exception {
    	Controle_Jogo.apagarJogo("ControleHabilidadeTest");
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() throws Exception {
    	Controle_Habilidade.removeTodasHabilidades();
    }

    /**
     * Test of cadHabilidade method, of class Controle_Habilidade.
     */
    @Test
    public void testCadHabilidade() throws Exception {
        System.out.println("cadHabilidade");
        int teste = 0;
        int nivel = 0;
        int custo = 0;
        String nome = "testCadHabilidade";
        String tipo = "Fisica";
        Controle_Habilidade.cadHabilidade(teste, nivel, custo, nome, tipo);
        
        try{
        	Controle_Habilidade.cadHabilidade(teste, nivel, custo, nome, tipo);
        	fail("cadHabilidade esta invalido, a excecao deveria ter pegado");
        } catch (ArquivoInvalidoException | HabilidadeInvalidaException | IOException e) {
		}
    }
    
    /**
     * Test of encontrarHabilidade method, of class Controle_Habilidade.
     */
    @Test
    public void testEncontrarHabilidade() throws Exception {
        System.out.println("encontrarHabilidade");
        Controle_Habilidade.cadHabilidade(1, 1, 1, "encontrarHabilidade", "Fisica");
        String nome = "encontrarHabilidade";
        String tipo = "Fisica";
        String expResult = "encontrarHabilidade";
        String result = Controle_Habilidade.encontrarHabilidade(nome, tipo).getNome();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of HabilidadeExiste method, of class Controle_Habilidade.
     */
    @Test
    public void testHabilidadeExiste_String_String() {
        System.out.println("HabilidadeExiste");
        String nome = "";
        String tipo = "";
        boolean expResult = false;
        boolean result = Controle_Habilidade.HabilidadeExiste(nome, tipo);
        assertEquals(expResult, result);
    }

    /**
     * Test of HabilidadeExiste method, of class Controle_Habilidade.
     */
    @Test
    public void testHabilidadeExiste_String() throws Exception {
        System.out.println("HabilidadeExiste");
        String nome = "";
        boolean expResult = false;
        boolean result = Controle_Habilidade.HabilidadeExiste(nome);
        assertEquals(expResult, result);
        Controle_Habilidade.cadHabilidade(1, 1, 1, "encontrarHabilidadeFisica", "Fisica");
        result = Controle_Habilidade.HabilidadeExiste("encontrarHabilidadeFisica");
        assertEquals(true, result);
        Controle_Habilidade.cadHabilidade(1, 1, 1, "encontrarHabilidadePsiquica", "Psiquica");
        result = Controle_Habilidade.HabilidadeExiste("encontrarHabilidadePsiquica");
        assertEquals(true, result);
        Controle_Habilidade.cadHabilidade(1, 1, 1, "encontrarHabilidadeBelica", "Belica");
        result = Controle_Habilidade.HabilidadeExiste("encontrarHabilidadeBelica");
        assertEquals(true, result);
    }
    
    /**
     * Test of getTipoHabildiade method, of class Controle_Habilidade.
     */
    @Test
    public void testGetTipoHabildiade() throws Exception {
        System.out.println("getTipoHabildiade");

        Controle_Habilidade.cadHabilidade(1, 1, 1, "HabilidadeFisica", "Fisica");
        String result = Controle_Habilidade.getTipoHabildiade("HabilidadeFisica");
        assertEquals("Fisica", result);
        Controle_Habilidade.cadHabilidade(1, 1, 1, "HabilidadePsiquica", "Psiquica");
        result = Controle_Habilidade.getTipoHabildiade("HabilidadePsiquica");
        assertEquals("Psiquica", result);
        Controle_Habilidade.cadHabilidade(1, 1, 1, "HabilidadeBelica", "Belica");
        result = Controle_Habilidade.getTipoHabildiade("HabilidadeBelica");
        assertEquals("Belica", result);
        
        try{
        	Controle_Habilidade.getTipoHabildiade("Inexistente");
        	fail("getTipoHabildiade invalido, a excecao deveria ter pegado");
        } catch (HabilidadeInvalidaException e) {
		}
    }
    
    /**
     * Test of removeHabilidadeFisica method, of class Controle_Habilidade.
     */
    @Test
    public void testRemoveHabilidadeFisica() throws Exception {
        System.out.println("removeHabilidadeFisica");
        Controle_Habilidade.cadHabilidade(1, 1, 1, "removeHabilidadeFisica", "Fisica");
        Controle_Habilidade.removeHabilidadeFisica("removeHabilidadeFisica");
    }
    
    /**
     * Test of removeHabilidadeBelica method, of class Controle_Habilidade.
     */
    @Test
    public void testRemoveHabilidadeBelica() throws Exception {
        System.out.println("removeHabilidadeBelica");
        Controle_Habilidade.cadHabilidade(1, 1, 1, "removeHabilidadeBelica", "Belica");
        Controle_Habilidade.removeHabilidadeBelica("removeHabilidadeBelica");
    }

    /**
     * Test of removeHabilidadePsiquica method, of class Controle_Habilidade.
     */
    @Test
    public void testRemoveHabilidadePsiquica() throws Exception {
        System.out.println("removeHabilidadePsiquica");
        Controle_Habilidade.cadHabilidade(1, 1, 1, "removeHabilidadePsiquica", "Psiquica");
        Controle_Habilidade.removeHabilidadePsiquica("removeHabilidadePsiquica");
    }
    
    /**
     * Test of listarHabilidadesFisicas method, of class Controle_Habilidade.
     */
    @Test
    public void testListarHabilidadesFisicas() throws Exception {
        System.out.println("listarHabilidadesFisicas");
        Controle_Habilidade.cadHabilidade(1, 1, 1, "listarHabilidadesFisicas", "Fisica");
        String[] expResult = {"listarHabilidadesFisicas"};
        String[] result = Controle_Habilidade.listarHabilidadesFisicas();
        assertArrayEquals(expResult, result);
    }
    
    /**
     * Test of listarHabilidadesPsiquicas method, of class Controle_Habilidade.
     */
    @Test
    public void testListarHabilidadesPsiquicas() throws Exception {
        System.out.println("listarHabilidadesPsiquicas");
        Controle_Habilidade.cadHabilidade(1, 1, 1, "listarHabilidadesPsiquicas", "Psiquica");
        String[] expResult = {"listarHabilidadesPsiquicas"};
        String[] result = Controle_Habilidade.listarHabilidadesPsiquicas();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of listarHabilidadesBelicas method, of class Controle_Habilidade.
     */
    @Test
    public void testListarHabilidadesBelicas() throws Exception {
        System.out.println("listarHabilidadesBelicas");
        Controle_Habilidade.cadHabilidade(1, 1, 1, "listarHabilidadesBelicas", "Belica");
        String[] expResult = {"listarHabilidadesBelicas"};
        String[] result = Controle_Habilidade.listarHabilidadesBelicas();
        assertArrayEquals(expResult, result);
    }
    
}
