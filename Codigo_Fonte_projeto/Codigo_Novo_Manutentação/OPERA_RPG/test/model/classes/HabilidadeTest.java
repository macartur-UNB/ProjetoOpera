/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.classes;

import model.exception.HabilidadeInvalidaException;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luciano
 */
public class HabilidadeTest {
    
    Habilidade instance;
    
    public HabilidadeTest() {
        
    }

    @Before
    public void setUp() {
        int teste = 0;
        int nivel = 0;
        int custo = 0;
        String nome = "Habilidade";
        String tipo = "Fisica";
        
        try{
            instance = new Habilidade(teste, nivel, custo, nome, tipo); 
        } catch (HabilidadeInvalidaException e){
            fail(e.getMessage());
        }
    }


    /**
     * Test of setCusto method, of class Habilidade.
     */
    @Test
    public void testSetCusto() throws Exception {
        System.out.println("setCusto");
        instance.setCusto(0);
        
        try{
        	instance.setCusto(-1);
        	fail("setCusto esta invalido, a excecao deveria ter pegado");
        } catch (HabilidadeInvalidaException e) {
	}
    }
    
    
    /**
     * Test of getCusto method, of class Habilidade.
     */
    @Test
    public void testGetCusto() {
        System.out.println("getCusto");
        int expResult = 0;
        int result = instance.getCusto();
        assertEquals(expResult, result);
    }
    
    
    /**
     * Test of setNivel method, of class Habilidade.
     */
    @Test
    public void testSetNivel() throws Exception {
        System.out.println("setNivel");
        instance.setNivel(0);
        
        try{
        	instance.setNivel(-1);
        	fail("setNivel esta invalido, a excecao deveria ter pegado");
        } catch (HabilidadeInvalidaException e) {
	}
    }

    
    /**
     * Test of getNivel method, of class Habilidade.
     */
    @Test
    public void testGetNivel() {
        System.out.println("getNivel");
        int expResult = 0;
        int result = instance.getNivel();
        assertEquals(expResult, result);
    }
    
    
    /**
     * Test of setNome method, of class Habilidade.
     */
    @Test
    public void testSetNome() throws Exception {
        System.out.println("setNome");
        instance.setNome("Habilidade");
        
        try{
        	instance.setNome("Habilidade Invalida ##");
        	fail("setNome esta invalido, a excecao deveria ter pegado");
        } catch (HabilidadeInvalidaException e) {
	}
    }
    
    
    /**
     * Test of getNome method, of class Habilidade.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        String expResult = "Habilidade";
        String result = instance.getNome();
        assertEquals(expResult, result);
    }
    
    
    /**
     * Test of setTeste method, of class Habilidade.
     */
    @Test
    public void testSetTeste() throws Exception {
        System.out.println("setTeste");
        instance.setTeste(0);
        try{
        	instance.setTeste(-1);
        	fail("setTeste esta invalido, a excecao deveria ter pegado");
        } catch (HabilidadeInvalidaException e) {
	}
    }
    
    
    /**
     * Test of getTeste method, of class Habilidade.
     */
    @Test
    public void testGetTeste() {
        System.out.println("getTeste");
        int expResult = 0;
        int result = instance.getTeste();
        assertEquals(expResult, result);
    }

    
    /**
     * Test of setTipo method, of class Habilidade.
     */
    @Test
    public void testSetTipo() throws Exception {
        System.out.println("setTipo");
        instance.setTipo("Fisica");
        instance.setTipo("Psiquica");
        instance.setTipo("Belica");
        
        try{
        	instance.setTipo("Invalido");
        	fail("setTeste esta invalido, a excecao deveria ter pegado");
        } catch (HabilidadeInvalidaException e) {
		}
    }
    
    
    /**
     * Test of getTipo method, of class Habilidade.
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
     * Test of toString method, of class Habilidade.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "Nome = Habilidade; Tipo = Fisica; Nivel = 0; Teste = 0; Custo = 0";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
