/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Luciano
 */
public class ValidarPalavraTest {
    
    public ValidarPalavraTest() {
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
     * Test of validarPalavra method, of class ValidarPalavra.
     */
    @Test
    public void testValidarPalavra_String_boolean() throws Exception {
        System.out.println("validarPalavra");
        String palavra = "Luciano";
        boolean numeros = false;
        ValidarPalavra.validarPalavra(palavra, numeros);
        palavra = "Luciano 123";
        numeros = true;
        ValidarPalavra.validarPalavra(palavra, numeros);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of validarPalavra method, of class ValidarPalavra.
     */
    @Test
    public void testValidarPalavra_3args() throws Exception {
        System.out.println("validarPalavra");
        String palavra01 = "Jogador";
        String palavra02 = "NPC";
        String palavra03 = "Monstro";
        String[] palavrasValidas = {"Jogador", "NPC", "Monstro"};
        boolean caseSensitive = false;
        ValidarPalavra.validarPalavra(palavra01, palavrasValidas, caseSensitive);
        ValidarPalavra.validarPalavra(palavra02, palavrasValidas, caseSensitive);
        ValidarPalavra.validarPalavra(palavra03, palavrasValidas, caseSensitive);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
