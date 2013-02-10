/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.classes.Caracteristica;
import model.classes.Caracteristica_Especifica;
import model.dao.DAO_Caracteristica;
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
public class Controle_CaracteristicaTest {
    
    public Controle_CaracteristicaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws Exception{
         if(!Controle_Jogo.jogoExiste("JunitTest")){
            Controle_Jogo.criarJogo("JUnitTest");
        }
    }
    
    @After
    public void tearDown() throws Exception{
            Controle_Jogo.apagarJogo("JUnitTest");
    }

    /**
     * Test of cadCaracteristica method, of class Controle_Caracteristica.
     */
    @Test
    public void testCadCaracteristica_4args() throws Exception {
        System.out.println("cadCaracteristica");
        String nome = "";
        String descricao = "";
        String tipo = "";
        int custo = 0;
        Controle_Caracteristica.cadCaracteristica(nome, descricao, tipo, custo);
    }

    /**
     * Test of cadCaracteristica method, of class Controle_Caracteristica.
     */
    @Test
    public void testCadCaracteristica_5args() throws Exception {
        System.out.println("cadCaracteristica");
        String nome = "TestJUnit";
        String descricao = "Descricao";
        String tipo = "Fisica";
        int custo = 4;
        int[] modificador = {2,2,2,2,2,2,2,2};
        Controle_Caracteristica.cadCaracteristica(
                                     nome, descricao, tipo, custo, modificador);
    }

    /**
     * Test of cadCaracteristicaEspecifica method, of class Controle_Caracteristica.
     */
    @Test
    public void testCadCaracteristicaEspecifica_6args() throws Exception {
        System.out.println("cadCaracteristicaEspecifica");
        String nome_Especifico = "NomeEspecifico";
        String descricao_Especifica = "DescricaoEspecifica";
        String nome = "NomeCaracteristica";
        String descricao = "DescricaoCaracteristica";
        String tipo = "Caracteristica";
        int custo = 0;
        Controle_Caracteristica.cadCaracteristicaEspecifica(nome_Especifico,
                            descricao_Especifica, nome, descricao, tipo, custo);
        
    }

    /**
     * Test of cadCaracteristicaEspecifica method, of class Controle_Caracteristica.
     */
    @Test
    public void testCadCaracteristicaEspecifica_7args() throws Exception {
        System.out.println("cadCaracteristicaEspecifica");
        String nome_Especifico = "";
        String descricao_Especifica = "";
        String nome = "";
        String descricao = "";
        String tipo = "";
        int custo = 0;
        int[] modificador = null;
        Controle_Caracteristica.cadCaracteristicaEspecifica(nome_Especifico, descricao_Especifica, nome, descricao, tipo, custo, modificador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encontrarCaracteristica method, of class Controle_Caracteristica.
     */
    @Test
    public void testEncontrarCaracteristica() throws Exception {
        System.out.println("encontrarCaracteristica");
        String nome = "";
        String tipo = "";
        Caracteristica expResult = null;
        Caracteristica result = Controle_Caracteristica.encontrarCaracteristica(nome, tipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encontrarCaracteristica_Especifica method, of class Controle_Caracteristica.
     */
    @Test
    public void testEncontrarCaracteristica_Especifica() throws Exception {
        System.out.println("encontrarCaracteristica_Especifica");
        String nome = "";
        String tipo = "";
        Caracteristica_Especifica expResult = null;
        Caracteristica_Especifica result = Controle_Caracteristica.encontrarCaracteristica_Especifica(nome, tipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CaracteristicaExiste method, of class Controle_Caracteristica.
     */
    @Test
    public void testCaracteristicaExiste_String_String() {
        System.out.println("CaracteristicaExiste");
        String nome = "";
        String tipo = "";
        boolean expResult = false;
        boolean result = Controle_Caracteristica.CaracteristicaExiste(nome, tipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CaracteristicaExiste method, of class Controle_Caracteristica.
     */
    @Test
    public void testCaracteristicaExiste_String() {
        System.out.println("CaracteristicaExiste");
        String nome = "";
        boolean expResult = false;
        boolean result = Controle_Caracteristica.CaracteristicaExiste(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeCaracteristicaFisica method, of class Controle_Caracteristica.
     */
    @Test
    public void testRemoveCaracteristicaFisica() throws Exception {
        System.out.println("removeCaracteristicaFisica");
        String nome = "";
        Controle_Caracteristica.removeCaracteristicaFisica(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeCaracteristicaRacial method, of class Controle_Caracteristica.
     */
    @Test
    public void testRemoveCaracteristicaRacial() throws Exception {
        System.out.println("removeCaracteristicaRacial");
        String nome = "";
        Controle_Caracteristica.removeCaracteristicaRacial(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeCaracteristicaPsiquica method, of class Controle_Caracteristica.
     */
    @Test
    public void testRemoveCaracteristicaPsiquica() throws Exception {
        System.out.println("removeCaracteristicaPsiquica");
        String nome = "";
        Controle_Caracteristica.removeCaracteristicaPsiquica(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeTodasCaracteristicasFisicas method, of class Controle_Caracteristica.
     */
    @Test
    public void testRemoveTodasCaracteristicasFisicas() throws Exception {
        System.out.println("removeTodasCaracteristicasFisicas");
        Controle_Caracteristica.removeTodasCaracteristicasFisicas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeTodasCaracteristicasPsiquicas method, of class Controle_Caracteristica.
     */
    @Test
    public void testRemoveTodasCaracteristicasPsiquicas() throws Exception {
        System.out.println("removeTodasCaracteristicasPsiquicas");
        Controle_Caracteristica.removeTodasCaracteristicasPsiquicas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeTodasCaracteristicasRacial method, of class Controle_Caracteristica.
     */
    @Test
    public void testRemoveTodasCaracteristicasRacial() throws Exception {
        System.out.println("removeTodasCaracteristicasRacial");
        Controle_Caracteristica.removeTodasCaracteristicasRacial();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeTodasCaracteristicas method, of class Controle_Caracteristica.
     */
    @Test
    public void testRemoveTodasCaracteristicas() throws Exception {
        System.out.println("removeTodasCaracteristicas");
        Controle_Caracteristica.removeTodasCaracteristicas();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarCaracteristicasFisicas method, of class Controle_Caracteristica.
     */
    @Test
    public void testListarCaracteristicasFisicas() {
        System.out.println("listarCaracteristicasFisicas");
        String[] expResult = null;
        String[] result = Controle_Caracteristica.listarCaracteristicasFisicas();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarCaracteristicasPsiquicas method, of class Controle_Caracteristica.
     */
    @Test
    public void testListarCaracteristicasPsiquicas() {
        System.out.println("listarCaracteristicasPsiquicas");
        String[] expResult = null;
        String[] result = Controle_Caracteristica.listarCaracteristicasPsiquicas();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarCaracteristicasRaciais method, of class Controle_Caracteristica.
     */
    @Test
    public void testListarCaracteristicasRaciais() {
        System.out.println("listarCaracteristicasRaciais");
        String[] expResult = null;
        String[] result = Controle_Caracteristica.listarCaracteristicasRaciais();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
