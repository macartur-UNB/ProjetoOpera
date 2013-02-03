/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.classes;

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
public class DadoTest {
    
    public DadoTest() {
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
     * Test of setRolagem method, of class Dado.
     */
    @Test
    public void testRolagem() {
        System.out.println("setRolagem");
        int rolagem = 0;
        Dado instance = null;
        instance.setRolagem(rolagem);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRolagem method, of class Dado.
     */
    @Test
    public void testGetRolagem() {
        System.out.println("getRolagem");
        Dado instance = null;
        int expResult = 0;
        int result = instance.getRolagem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLados method, of class Dado.
     */
    @Test
    public void testSetLados() {
        System.out.println("setLados");
        int lados = 0;
        Dado instance = null;
        instance.setLados(lados);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLados method, of class Dado.
     */
    @Test
    public void testGetLados() {
        System.out.println("getLados");
        Dado instance = null;
        int expResult = 0;
        int result = instance.getLados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Dado.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Dado instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
