/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.classes.Caracteristica;
import model.classes.Caracteristica_Especifica;
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
        String nome = "JUnit";
        String descricao = "JUNit";
        String tipo = "Fisica";
        int custo = 0;
        Controle_Caracteristica.cadCaracteristica(nome, descricao, tipo, custo);
        Controle_Caracteristica.removeCaracteristicaFisica(nome);
    }

    /**
     * Test of cadCaracteristica method, of class Controle_Caracteristica.
     */
    @Test
    public void testCadCaracteristica_5args() throws Exception {
        System.out.println("cadCaracteristica");
        String nome = "TestJUnit";
        String descricao = "Descricao";
        String tipo = "Racial";
        int custo = 4;
        int[] modificador = {2,2,2,2,2,2,2,2};
        Controle_Caracteristica.cadCaracteristica(
                                     nome, descricao, tipo, custo, modificador);
        Controle_Caracteristica.removeCaracteristicaRacial(nome);
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
        String tipo = "Psiquica";
        int custo = 0;
        Controle_Caracteristica.cadCaracteristicaEspecifica(nome_Especifico,
                            descricao_Especifica, nome, descricao, tipo, custo);
        Controle_Caracteristica.removeCaracteristicaPsiquica(nome_Especifico);
    }

    /**
     * Test of cadCaracteristicaEspecifica method, of class Controle_Caracteristica.
     */
    @Test
    public void testCadCaracteristicaEspecifica_7args() throws Exception {
        System.out.println("cadCaracteristicaEspecifica");
        String nome_Especifico = "JUnitTest";
        String descricao_Especifica = "DescricaoEspecifica";
        String nome = "nome";
        String descricao = "descricao";
        String tipo = "Fisica";
        int custo = 0;
        int[] modificador = {1,2,3,4,5,6,7,8};
        Controle_Caracteristica.cadCaracteristicaEspecifica(nome_Especifico,
                descricao_Especifica, nome, descricao, tipo, custo, modificador);
        Controle_Caracteristica.removeCaracteristicaFisica(nome_Especifico);
    }

    /**
     * Test of encontrarCaracteristica method, of class Controle_Caracteristica.
     */
    @Test
    public void testEncontrarCaracteristica() throws Exception {
        System.out.println("encontrarCaracteristica");
            
        String nome = "JUnit";
        String descricao = "JUNit";
        String tipo = "Fisica";
        int custo = 0;
        Controle_Caracteristica.cadCaracteristica(nome, descricao, tipo, custo);
        Caracteristica result = Controle_Caracteristica.encontrarCaracteristica(nome, tipo);
        if(result == null)
        {
            fail("não encontrou caracteristica especifica");
        }
        Controle_Caracteristica.removeCaracteristicaFisica(nome);
    }

    /**
     * Test of encontrarCaracteristica_Especifica method, of class Controle_Caracteristica.
     */
    @Test
    public void testEncontrarCaracteristica_Especifica() throws Exception {
        System.out.println("encontrarCaracteristica_Especifica");
        String nome_Especifico = "JUnitTest";
        String descricao_Especifica = "DescricaoEspecifica";
        String nome = "nome";
        String descricao = "descricao";
        String tipo = "Psiquica";
        int custo = 0;
        int[] modificador = {1,2,3,4,5,6,7,8};
        Controle_Caracteristica.cadCaracteristicaEspecifica(nome_Especifico,
                descricao_Especifica, nome, descricao, tipo, custo, modificador);
        Caracteristica_Especifica result = Controle_Caracteristica.encontrarCaracteristica_Especifica(nome, tipo);
        if(result == null)
        {
            fail("Não pode encontrar caracteristica especifica");
        }
        Controle_Caracteristica.removeCaracteristicaPsiquica(nome_Especifico);
    }

    /**
     * Test of CaracteristicaExiste method, of class Controle_Caracteristica.
     */
    @Test
    public void testCaracteristicaExiste() throws Exception{
        System.out.println("CaracteristicaExiste-tipo");
         String nome = "JUnit";
        String descricao = "JUNit";
        String tipo = "Fisica";
        int custo = 0;
        Controle_Caracteristica.cadCaracteristica(nome, descricao, tipo, custo);
        boolean expResult = true;
        boolean result = Controle_Caracteristica.CaracteristicaExiste(nome, tipo);
        assertEquals(expResult, result);
    }

    /**
     * Test of CaracteristicaExiste method, of class Controle_Caracteristica.
     */
    @Test
    public void testCaracteristicaExiste_String() throws Exception{
        System.out.println("CaracteristicaExiste-todas");
         String nome = "JUnit";
        String descricao = "JUNit";
        String tipo = "Fisica";
        int custo = 0;
        Controle_Caracteristica.cadCaracteristica(nome, descricao, tipo, custo);
        boolean expResult = true;
        boolean result = Controle_Caracteristica.CaracteristicaExiste(nome);
        assertEquals(expResult, result);
    }

     /**
     * Test of removeTodasCaracteristicasFisicas method, of class Controle_Caracteristica.
     */
    @Test
    public void testRemoveTodasCaracteristicasFisicas() throws Exception {
        System.out.println("removeTodasCaracteristicasFisicas");
        Controle_Caracteristica.removeTodasCaracteristicasFisicas();
    }

    /**
     * Test of removeTodasCaracteristicasPsiquicas method, of class Controle_Caracteristica.
     */
    @Test
    public void testRemoveTodasCaracteristicasPsiquicas() throws Exception {
        System.out.println("removeTodasCaracteristicasPsiquicas");
        Controle_Caracteristica.removeTodasCaracteristicasPsiquicas();
    }

    /**
     * Test of removeTodasCaracteristicasRacial method, of class Controle_Caracteristica.
     */
    @Test
    public void testRemoveTodasCaracteristicasRacial() throws Exception {
        System.out.println("removeTodasCaracteristicasRacial");
        Controle_Caracteristica.removeTodasCaracteristicasRacial();
    }

    /**
     * Test of removeTodasCaracteristicas method, of class Controle_Caracteristica.
     */
    @Test
    public void testRemoveTodasCaracteristicas() throws Exception {
        System.out.println("removeTodasCaracteristicas");
        Controle_Caracteristica.removeTodasCaracteristicas();
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
    }
}
