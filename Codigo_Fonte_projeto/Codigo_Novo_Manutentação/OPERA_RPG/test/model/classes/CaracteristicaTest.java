/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.classes;

import model.exception.CaracteristicaInvalidaException;
import model.exception.FichaInvalidaException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import control.Controle_Caracteristica;
import static org.junit.Assert.*;

/**
 *
 * @author Luciano
 */
public class CaracteristicaTest {
    
    Caracteristica instance;
	
    public CaracteristicaTest(){
    	
    }
    
    @Before
    public void setUp() {
    	String nome = "Caracteristica";
    	String descricao = "Caracteristica de um personagem";
    	String tipo = "Fisica";
    	int modificador[] = {1, 2, 3, 4, 5, 6, 7, 8};
    	int custo = 0;
    	
    	try{
    		instance = new Caracteristica(nome, descricao, tipo, modificador, custo);
    	} catch (CaracteristicaInvalidaException e) {
            fail(e.getMessage());
        }
    }
    

    /**
     * Test of setNome method, of class Caracteristica.
     */
    @Test
    public void testSetNome() throws Exception {
        System.out.println("setNome");
        instance.setNome("Valido");
        instance.setNome("Valido123");
        
        try{
        	instance.setNome("Invalido ##");
        	fail("setNome esta invalido, a excecao deveria ter pegado");
        } catch (CaracteristicaInvalidaException e) {
		}
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
    /**
     * Test of getNome method, of class Caracteristica.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        String expResult = "Caracteristica";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    /**
     * Test of setDescricao method, of class Caracteristica.
     */
    @Test
    public void testSetDescricao() throws Exception {
        System.out.println("setDescricao");
        instance.setDescricao("Descricao Valida");
        instance.setDescricao("Descricao Valida 123");
        
        try{
        	instance.setDescricao("Descricao Invalida ###");
        	fail("setDescricao esta invalido, a excecao deveria ter pegado");
        } catch (CaracteristicaInvalidaException e) {
		}
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    /**
     * Test of getDescricao method, of class Caracteristica.
     */
    @Test
    public void testGetDescricao() {
        System.out.println("getDescricao");
        String expResult = "Caracteristica de um personagem";
        String result = instance.getDescricao();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    /**
     * Test of setTipo method, of class Caracteristica.
     */
    @Test
    public void testSetTipo() throws Exception {
        System.out.println("setTipo");
        instance.setTipo("Fisica");
        instance.setTipo("Psiquica");
        instance.setTipo("Racial");
        
        try{
        	instance.setTipo("Invalido");
        	fail("setTipo esta invalido, a excecao deveria ter pegado");
        } catch (CaracteristicaInvalidaException e) {
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    /**
     * Test of getTipo method, of class Caracteristica.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        String expResult = "Fisica";
        String result = instance.getTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    /**
     * Test of setModificador method, of class Caracteristica.
     */
    @Test
    public void testSetModificador() throws Exception {
    	System.out.println("setAtributos");
        int[] modificador = null;
        instance.setModificador(modificador);
        int[] modificador1 = {1, 2, 3, 4, 5, 6, 7, 8};
        instance.setModificador(modificador1);
        try{
            int[] modificador2 = {-1, 2, 3, 4, 5, 6, 7, 8};
            instance.setModificador(modificador2);
            fail("setModificador esta invalido, a excecao deveria ter pegado");
        } catch(CaracteristicaInvalidaException e){
        }
        try{
            int[] modificador3 = {1, 2};
            instance.setModificador(modificador3);
            fail("setModificador esta invalido, a excecao deveria ter pegado");
        } catch(CaracteristicaInvalidaException e){
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    /**
     * Test of getModificador method, of class Caracteristica.
     */
    @Test
    public void testGetModificador() {
        System.out.println("getModificador");
        int[] expResult = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] result = instance.getModificador();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    /**
     * Test of setCusto method, of class Caracteristica.
     */
    @Test
    public void testSetCusto() throws Exception {
        System.out.println("setCusto");
        int custo = 0;
        instance.setCusto(custo);
        
        try{
        	instance.setCusto(-1);
        	fail("setCusto esta invalido, a excecao deveria ter pegado");
        } catch(CaracteristicaInvalidaException e){
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of getCusto method, of class Caracteristica.
     */
    @Test
    public void testGetCusto() {
        System.out.println("getCusto");
        int expResult = 0;
        int result = instance.getCusto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    /**
     * Test of toString method, of class Caracteristica.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "Nome = Caracteristica; Descricao = Caracteristica de um personagem; Tipo = Fisica; Custo = 0; Modificadores = [1, 2, 3, 4, 5, 6, 7, 8]";
        assertEquals(expResult, instance.toString());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
