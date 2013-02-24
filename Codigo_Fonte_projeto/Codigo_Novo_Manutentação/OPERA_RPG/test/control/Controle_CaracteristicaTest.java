/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.FileNotFoundException;
import java.io.IOException;

import model.classes.Caracteristica;
import model.classes.Caracteristica_Especifica;
import model.exception.ArquivoInvalidoException;
import model.exception.CaracteristicaInvalidaException;

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

    
        
    String nome = "JUnit";
    String descricao = "JUNit";
    String nome_Especifico = "NomeEspecifico";
    String descricao_Especifica = "DescricaoEspecifica";    
    String tipo = "Fisica";
    int custo = 0;
    int[] modificador = {2,2,2,2,2,2,2,2};
    /**
     * Test of cadCaracteristica method, of class Controle_Caracteristica.
     */
    @Test
    public void testCadCaracteristica_4args() throws Exception {
        System.out.println("cadCaracteristica");
        Controle_Caracteristica.cadCaracteristica(nome, descricao, tipo, custo);
        try{
        	Controle_Caracteristica.cadCaracteristica(nome, descricao, tipo, custo);
        	fail("cadCaracteristica deveria ter falhado");
        } catch (CaracteristicaInvalidaException | ArquivoInvalidoException | IOException e) {
		}
        Controle_Caracteristica.removeCaracteristicaFisica(nome);
    }

    /**
     * Test of cadCaracteristica method, of class Controle_Caracteristica.
     */
    @Test
    public void testCadCaracteristica_5args() throws Exception {
        System.out.println("cadCaracteristica");
        tipo= "Racial";
        Controle_Caracteristica.cadCaracteristica(
                                     nome, descricao, tipo, custo, modificador);
        try{
        	Controle_Caracteristica.cadCaracteristica(
                    				 nome, descricao, tipo, custo, modificador);
        	fail("cadCaracteristica deveria ter falhado");
        } catch (CaracteristicaInvalidaException | ArquivoInvalidoException | IOException e) {
		}
        Controle_Caracteristica.removeCaracteristicaRacial(nome);
    }

    /**
     * Test of cadCaracteristicaEspecifica method, of class Controle_Caracteristica.
     */
    @Test
    public void testCadCaracteristicaEspecifica_6args() throws Exception {
        System.out.println("cadCaracteristicaEspecifica");
        tipo = "Psiquica";
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
        tipo = "Fisica";
        Controle_Caracteristica.cadCaracteristicaEspecifica(nome_Especifico,
                descricao_Especifica, nome, descricao, tipo, custo, modificador);
        Controle_Caracteristica.removeCaracteristicaFisica(nome_Especifico);
    }

    /**
     * Test of encontrarCaracteristica method, of class Controle_Caracteristica.
     */
    @Test
    public void testEncontrarCaracteristica_1args() throws Exception {
        System.out.println("encontrarCaracteristica");
        tipo = "Fisica";
        Controle_Caracteristica.cadCaracteristica(nome, descricao, tipo, custo);
        Caracteristica result = Controle_Caracteristica.encontrarCaracteristica(nome);
        if(result == null){
            fail("nÃ£o encontrou caracteristica especifica");
        }
        
        Controle_Caracteristica.cadCaracteristica(nome+"a", descricao, "Psiquica", custo);
        result = Controle_Caracteristica.encontrarCaracteristica(nome+"a");
        if(result == null){
            fail("nÃ£o encontrou caracteristica especifica");
        }
        
        Controle_Caracteristica.cadCaracteristica(nome+"b", descricao, "Racial", custo);
        result = Controle_Caracteristica.encontrarCaracteristica(nome+"b");
        if(result == null){
            fail("nÃ£o encontrou caracteristica especifica");
        }
        
        String expResult = null;
        result = Controle_Caracteristica.encontrarCaracteristica("Caracteristica Inexistente");
        
        assertEquals(expResult, result);
                
        Controle_Caracteristica.removeCaracteristicaFisica(nome);
        Controle_Caracteristica.removeCaracteristicaFisica(nome+"a");
        Controle_Caracteristica.removeCaracteristicaFisica(nome+"b");
    }
    
    /**
     * Test of encontrarCaracteristica method, of class Controle_Caracteristica.
     */
    @Test
    public void testEncontrarCaracteristica_2args() throws Exception {
        System.out.println("encontrarCaracteristica");
        tipo = "Fisica";
        Controle_Caracteristica.cadCaracteristica(nome, descricao, tipo, custo);
        Caracteristica result = Controle_Caracteristica.encontrarCaracteristica(nome, tipo);
        if(result == null)
        {
            fail("nÃ£o encontrou caracteristica especifica");
        }
        Controle_Caracteristica.removeCaracteristicaFisica(nome);
    }

    /**
     * Test of encontrarCaracteristica_Especifica method, of class Controle_Caracteristica.
     */
    @Test
    public void testEncontrarCaracteristica_Especifica() throws Exception {
        System.out.println("encontrarCaracteristica_Especifica");
        tipo = "Psiquica";
        Controle_Caracteristica.cadCaracteristicaEspecifica(nome_Especifico,
                descricao_Especifica, nome, descricao, tipo, custo, modificador);
        Caracteristica_Especifica result = 
        Controle_Caracteristica.encontrarCaracteristica_Especifica(nome_Especifico, tipo);
        if(result == null)
        {
            fail("NÃ£o pode encontrar caracteristica especifica");
        }
        Controle_Caracteristica.removeCaracteristicaPsiquica(nome_Especifico);
    }

    /**
     * Test of CaracteristicaExiste method, of class Controle_Caracteristica.
     */
    @Test
    public void testCaracteristicaExiste() throws Exception{
        System.out.println("CaracteristicaExiste-tipo");
        tipo = "Fisica";
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
        tipo = "Fisica";
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
        nome = "JUnit";
        descricao = "JUnit";
        tipo = "Fisica";
        custo = 1;
        Controle_Caracteristica.cadCaracteristica(nome, descricao, tipo, custo);
        nome = "JUnit2";
        descricao = "JUNit2";
        tipo = "Fisica";
        custo = 3;
        Controle_Caracteristica.cadCaracteristica(nome, descricao, tipo, custo);
        Controle_Caracteristica.removeTodasCaracteristicasFisicas();
        Caracteristica c = Controle_Caracteristica.encontrarCaracteristica("JUnit", tipo);
        Caracteristica ce = Controle_Caracteristica.encontrarCaracteristica("JUnit2", tipo);
        if(c!=null || ce!= null){
            fail("NÃ£o foi possivel remover todas as caracteristicas fisicas");
        }
        
    }

    /**
     * Test of removeTodasCaracteristicasPsiquicas method, of class Controle_Caracteristica.
     */
    @Test
    public void testRemoveTodasCaracteristicasPsiquicas() throws Exception {
        System.out.println("removeTodasCaracteristicasPsiquicas");
        nome = "JUnit";
        descricao = "JUnit";
        tipo = "Psiquica";
        custo = 2;
        Controle_Caracteristica.cadCaracteristica(nome, descricao, tipo, custo);
        nome = "JUnit2";
        descricao = "JUNit2";
        tipo = "Psiquica";
        custo = 4;
        Controle_Caracteristica.cadCaracteristica(nome, descricao, tipo, custo);
        Controle_Caracteristica.removeTodasCaracteristicasPsiquicas();
        Caracteristica c = Controle_Caracteristica.encontrarCaracteristica("JUnit", tipo);
        Caracteristica ce = Controle_Caracteristica.encontrarCaracteristica("JUnit2", tipo);
        if(c!=null || ce!= null){
            fail("NÃ£o foi possivel remover todas as caracteristicas fisicas");
        }
    }

    /**
     * Test of removeTodasCaracteristicasRacial method, of class Controle_Caracteristica.
     */
    @Test
    public void testRemoveTodasCaracteristicasRacial() throws Exception {
        System.out.println("removeTodasCaracteristicasRacial");
        nome = "JUnit";
        descricao = "JUnit";
        tipo = "Racial";
        custo = 2;
        Controle_Caracteristica.cadCaracteristica(nome, descricao, tipo, custo);
        nome = "JUnit2";
        descricao = "JUNit2";
        tipo = "Racial";
        custo = 4;
        Controle_Caracteristica.cadCaracteristica(nome, descricao, tipo, custo);
        Controle_Caracteristica.removeTodasCaracteristicasRacial();
        Caracteristica c = Controle_Caracteristica.encontrarCaracteristica("JUnit", tipo);
        Caracteristica ce = Controle_Caracteristica.encontrarCaracteristica("JUnit2", tipo);
        if(c!=null || ce!= null){
            fail("NÃ£o foi possivel remover todas as caracteristicas fisicas");
        }
    }

    /**
     * Test of removeTodasCaracteristicas method, of class Controle_Caracteristica.
     */
    @Test
    public void testRemoveTodasCaracteristicas() throws Exception {
        System.out.println("removeTodasCaracteristicas");
        
        nome = "JUnit";
        descricao = "JUnit";
        tipo = "Racial";
        custo = 2;
        Controle_Caracteristica.cadCaracteristica(nome, descricao, tipo, custo);
        nome = "JUnit2";
        descricao = "JUnit2";
        tipo = "Psiquica";
        custo = 4;
        Controle_Caracteristica.cadCaracteristica(nome, descricao, tipo, custo);
        Controle_Caracteristica.removeTodasCaracteristicas();
        Caracteristica c = Controle_Caracteristica.encontrarCaracteristica("JUnit", tipo);
        Caracteristica ce = Controle_Caracteristica.encontrarCaracteristica("JUnit2", tipo);
        if(c!=null || ce!= null){
            fail("NÃ£o foi possivel remover todas as caracteristicas fisicas");
        }
        Controle_Caracteristica.removeTodasCaracteristicas();
    }

    /**
     * Test of listarCaracteristicasFisicas method, of class Controle_Caracteristica.
     */
    @Test
    public void testListarCaracteristicasFisicas()throws Exception{
        System.out.println("listarCaracteristicasFisicas");
        tipo = "Fisica";
        Controle_Caracteristica.cadCaracteristica("JUnit1", descricao, tipo, custo);
        Controle_Caracteristica.cadCaracteristica("JUnit2", descricao, tipo, custo);
        Controle_Caracteristica.cadCaracteristica("JUnit3", descricao, tipo, custo);
        
        String[] expResult = {"JUnit1","JUnit2","JUnit3"};
        String[] result = Controle_Caracteristica.listarCaracteristicasFisicas();
        assertArrayEquals(expResult, result);
        Controle_Caracteristica.removeTodasCaracteristicasFisicas();
    }

    /**
     * Test of listarCaracteristicasPsiquicas method, of class Controle_Caracteristica.
     */
    @Test
    public void testListarCaracteristicasPsiquicas() throws Exception{
        System.out.println("listarCaracteristicasPsiquicas");
        
        tipo = "Psiquica";
        Controle_Caracteristica.cadCaracteristica("JUnit1", descricao, tipo, custo);
        Controle_Caracteristica.cadCaracteristica("JUnit2", descricao, tipo, custo);
        Controle_Caracteristica.cadCaracteristica("JUnit3", descricao, tipo, custo);
        
        String[] expResult = {"JUnit1","JUnit2","JUnit3"};
        String[] result = Controle_Caracteristica.listarCaracteristicasPsiquicas();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of listarCaracteristicasRaciais method, of class Controle_Caracteristica.
     */
    @Test
    public void testListarCaracteristicasRaciais() throws Exception{
        System.out.println("listarCaracteristicasRaciais");
        tipo = "Racial";
        Controle_Caracteristica.cadCaracteristica("JUnit1", descricao, tipo, custo);
        Controle_Caracteristica.cadCaracteristica("JUnit2", descricao, tipo, custo);
        Controle_Caracteristica.cadCaracteristica("JUnit3", descricao, tipo, custo);
        
        String[] expResult = {"JUnit1","JUnit2","JUnit3"};
        String[] result = Controle_Caracteristica.listarCaracteristicasRaciais();
        assertArrayEquals(expResult, result);
    }
}
