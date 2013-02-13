/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import model.classes.Habilidade;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrador
 */
public class DAO_HabilidadeTest {
    
    public DAO_HabilidadeTest() {
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
     * Test of gravarHabilidade method, of class DAO_Habilidade.
     */
    @Test
    public void testGravarHabilidade() throws Exception {
        System.out.println("gravarHabilidade");
        Habilidade habilidade = null;
        DAO_Habilidade.gravarHabilidade(habilidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of carregarHabilidade method, of class DAO_Habilidade.
     */
    @Test
    public void testCarregarHabilidade() throws Exception {
        System.out.println("carregarHabilidade");
        String nome = "";
        String tipo = "";
        Habilidade expResult = null;
        Habilidade result = DAO_Habilidade.carregarHabilidade(nome, tipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of HabilidadeExiste method, of class DAO_Habilidade.
     */
    @Test
    public void testHabilidadeExiste() {
        System.out.println("HabilidadeExiste");
        String nome = "";
        String tipo = "";
        boolean expResult = false;
        boolean result = DAO_Habilidade.HabilidadeExiste(nome, tipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerHabilidade method, of class DAO_Habilidade.
     */
    @Test
    public void testRemoverHabilidade() throws Exception {
        System.out.println("removerHabilidade");
        String nome = "";
        String tipo = "";
        DAO_Habilidade.removerHabilidade(nome, tipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerTodasHabilidades method, of class DAO_Habilidade.
     */
    @Test
    public void testRemoverTodasHabilidades() throws Exception {
        System.out.println("removerTodasHabilidades");
        String tipo = "";
        DAO_Habilidade.removerTodasHabilidades(tipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarHabilidades method, of class DAO_Habilidade.
     */
    @Test
    public void testListarHabilidades() {
        System.out.println("listarHabilidades");
        String tipo = "";
        String[] expResult = null;
        String[] result = DAO_Habilidade.listarHabilidades(tipo);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
