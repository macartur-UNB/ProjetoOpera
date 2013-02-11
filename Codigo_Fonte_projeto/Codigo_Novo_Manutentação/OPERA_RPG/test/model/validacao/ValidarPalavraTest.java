/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.validacao;

import static org.junit.Assert.fail;
import model.exception.PalavraInvalidaException;

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
        
        try{
        	ValidarPalavra.validarPalavra(null, true);
        	fail("O Tipo esta invalido, a excecao deveria ter pegado");
        } catch (PalavraInvalidaException e) {
		}
        
        try{
        	ValidarPalavra.validarPalavra("", true);
        	fail("O Tipo esta invalido, a excecao deveria ter pegado");
        } catch (PalavraInvalidaException e) {
		}
        
        try{
        	ValidarPalavra.validarPalavra("Invalido ##", true);
        	fail("O Tipo esta invalido, a excecao deveria ter pegado");
        } catch (PalavraInvalidaException e) {
		}
        
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
        ValidarPalavra.validarPalavra(palavra03, palavrasValidas, !caseSensitive);
        
        try{
        	ValidarPalavra.validarPalavra("Invalido **", palavrasValidas, caseSensitive);
        	fail("O Tipo esta invalido, a excecao deveria ter pegado");
        } catch (PalavraInvalidaException e) {
		}
        
        try{
        	ValidarPalavra.validarPalavra(null, palavrasValidas, caseSensitive);
        	fail("O Tipo esta invalido, a excecao deveria ter pegado");
        } catch (PalavraInvalidaException e) {
		}
        
        try{
        	ValidarPalavra.validarPalavra("", palavrasValidas, caseSensitive);
        	fail("O Tipo esta invalido, a excecao deveria ter pegado");
        } catch (PalavraInvalidaException e) {
		}
        
        try{
        	ValidarPalavra.validarPalavra(palavra01, null, caseSensitive);
        	fail("O Tipo esta invalido, a excecao deveria ter pegado");
        } catch (PalavraInvalidaException e) {
		}
        
        try{
        	String palavrasValidasVazio[] = null;
        	ValidarPalavra.validarPalavra(palavra01, palavrasValidasVazio, caseSensitive);
        	fail("O Tipo esta invalido, a excecao deveria ter pegado");
        } catch (PalavraInvalidaException e) {
		}
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    /**
     * Test of validarCaractere method, of class ValidarPalavra.
     */
    @Test
    public void testvalidarCaractere() throws Exception {
        char caracteresValidos[] = {'A', 'B', 'C'};
        
        ValidarPalavra.validarCaractere('A', caracteresValidos);
        ValidarPalavra.validarCaractere('B', caracteresValidos);
        ValidarPalavra.validarCaractere('C', caracteresValidos);
        
        try{
            ValidarPalavra.validarCaractere(' ', caracteresValidos);
            fail("validarCaractere invalido, a excecao deveria ter pegado");
        } catch (PalavraInvalidaException e) {
        }
        try{
            ValidarPalavra.validarCaractere('a', caracteresValidos);
            fail("validarCaractere invalido, a excecao deveria ter pegado");
        } catch (PalavraInvalidaException e) {
        }
        try{
            ValidarPalavra.validarCaractere('D', caracteresValidos);
            fail("validarCaractere invalido, a excecao deveria ter pegado");
        } catch (PalavraInvalidaException e) {
        }
        try{
            ValidarPalavra.validarCaractere('a', caracteresValidos);
            fail("validarCaractere invalido, a excecao deveria ter pegado");
        } catch (PalavraInvalidaException e) {
        }
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
