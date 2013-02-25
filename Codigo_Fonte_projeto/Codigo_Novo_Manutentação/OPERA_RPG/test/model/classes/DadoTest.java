/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.classes;

import model.exception.DadoInvalidoException;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luciano
 */
public class DadoTest {
    
    Dado instance;
    
    public DadoTest() {
    }
    
    
    @Before
    public void setUp() throws Exception {
        int lados = 4;
        int rolagem = 2;
        
        instance = new Dado(lados, rolagem);
    }


    /**
     * Test of setRolagem method, of class Dado.
     */
    @Test
    public void testSetRolagem() throws Exception {
        System.out.println("setRolagem");
        instance.setRolagem(1);
        instance.setRolagem(2);
        instance.setRolagem(3);
        
        try{
        	instance.setRolagem(0);
        	fail("setRolagem esta invalido, a excecao deveria ter pegado");
        }catch(DadoInvalidoException e){
        }
        
        try{
        	instance.setRolagem(-1);
        	fail("setRolagem esta invalido, a excecao deveria ter pegado");
        }catch(DadoInvalidoException e){
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getRolagem method, of class Dado.
     */
    @Test
    public void testGetRolagem() {
        System.out.println("getRolagem");
        int expResult = 2;
        int result = instance.getRolagem();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setLados method, of class Dado.
     */
    @Test
    public void testSetLados() throws Exception {
        System.out.println("setLados");
        instance.setLados(1);
        instance.setLados(2);
        instance.setLados(3);
        
        try{
        	instance.setLados(0);
        	fail("setLados esta invalido, a excecao deveria ter pegado");
        }catch(DadoInvalidoException e){
        }
        
        try{
        	instance.setLados(-1);
        	fail("setLados esta invalido, a excecao deveria ter pegado");
        }catch(DadoInvalidoException e){
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getLados method, of class Dado.
     */
    @Test
    public void testGetLados() {
        System.out.println("getLados");
        int expResult = 4;
        int result = instance.getLados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Dado.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "2d4";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
