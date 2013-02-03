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
public class JogoTest {
    
    public JogoTest() {
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

    
    @Test
    public void testNome() {
        System.out.println("Nome ");
        String nome = "JUnit";
        String endereco = "";
        Jogo instance = new Jogo(nome, endereco);
        assertEquals(nome, instance.getNome());
    }

     @Test
    public void testEndereco() {
        System.out.println("Endereco ");
        String nome = "JUnit";
        String endereco = "endereco";
        Jogo instance = new Jogo(nome, endereco);
        assertEquals(endereco, instance.getEndereco());
    }
    
    
    /**
     * Test of toString method, of class Jogo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Jogo instance = new Jogo("JUnit", "endereco");
        String expResult = " Jogo = JUnit Endereco = endereco";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}
