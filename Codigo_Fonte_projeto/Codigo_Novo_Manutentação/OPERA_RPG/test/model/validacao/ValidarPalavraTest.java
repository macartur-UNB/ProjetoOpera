package model.validacao;

import static org.junit.Assert.fail;
import model.exception.PalavraInvalidaException;


import org.junit.Test;


public class ValidarPalavraTest {


    /**
     * Test of validarPalavra method, of class Validar.
     */
    @Test
    public void testValidarPalavra_String_boolean() throws Exception {
        System.out.println("validarPalavra");
        String palavra = "Luciano";
        boolean numeros = false;
        Validar.validarPalavra(palavra, numeros);
        palavra = "Luciano 123";
        numeros = true;
        Validar.validarPalavra(palavra, numeros);
        
        try{
        	Validar.validarPalavra(null, true);
        	fail("O Tipo esta invalido, a excecao deveria ter pegado");
        } catch (PalavraInvalidaException e) {
		}
        
        try{
        	Validar.validarPalavra("", true);
        	fail("O Tipo esta invalido, a excecao deveria ter pegado");
        } catch (PalavraInvalidaException e) {
		}
        
        try{
        	Validar.validarPalavra("Invalido ##", true);
        	fail("O Tipo esta invalido, a excecao deveria ter pegado");
        } catch (PalavraInvalidaException e) {
	}
        
       
    }

    /**
     * Test of validarPalavra method, of class Validar.
     */
    @Test
    public void testValidarPalavra_3args() throws Exception {
        System.out.println("validarPalavra");
        String palavra01 = "Jogador";
        String palavra02 = "NPC";
        String palavra03 = "Monstro";
        String[] palavrasValidas = {"Jogador", "NPC", "Monstro"};
        boolean caseSensitive = false;
        
        Validar.validarPalavra(palavra01, palavrasValidas, caseSensitive);
        Validar.validarPalavra(palavra02, palavrasValidas, caseSensitive);
        Validar.validarPalavra(palavra03, palavrasValidas, !caseSensitive);
        
        try{
        	Validar.validarPalavra("Invalido **", palavrasValidas, caseSensitive);
        	fail("O Tipo esta invalido, a excecao deveria ter pegado");
        } catch (PalavraInvalidaException e) {
		}
        
        try{
        	Validar.validarPalavra(null, palavrasValidas, caseSensitive);
        	fail("O Tipo esta invalido, a excecao deveria ter pegado");
        } catch (PalavraInvalidaException e) {
		}
        
        try{
        	Validar.validarPalavra("", palavrasValidas, caseSensitive);
        	fail("O Tipo esta invalido, a excecao deveria ter pegado");
        } catch (PalavraInvalidaException e) {
		}
        
        try{
        	Validar.validarPalavra(palavra01, null, caseSensitive);
        	fail("O Tipo esta invalido, a excecao deveria ter pegado");
        } catch (PalavraInvalidaException e) {
		}
        
        try{
        	String palavrasValidasVazio[] = null;
        	Validar.validarPalavra(palavra01, palavrasValidasVazio, caseSensitive);
        	fail("O Tipo esta invalido, a excecao deveria ter pegado");
        } catch (PalavraInvalidaException e) {
		}
        
    }
    
    
    /**
     * Test of validarCaractere method, of class Validar.
     */
    @Test
    public void testvalidarCaractere() throws Exception {
        char caracteresValidos[] = {'A', 'B', 'C'};
        
        Validar.validarCaractere('A', caracteresValidos);
        Validar.validarCaractere('B', caracteresValidos);
        Validar.validarCaractere('C', caracteresValidos);
        
        try{
            Validar.validarCaractere(' ', caracteresValidos);
            fail("validarCaractere invalido, a excecao deveria ter pegado");
        } catch (PalavraInvalidaException e) {
        }
        try{
            Validar.validarCaractere('a', caracteresValidos);
            fail("validarCaractere invalido, a excecao deveria ter pegado");
        } catch (PalavraInvalidaException e) {
        }
        try{
            Validar.validarCaractere('D', caracteresValidos);
            fail("validarCaractere invalido, a excecao deveria ter pegado");
        } catch (PalavraInvalidaException e) {
        }
        try{
            Validar.validarCaractere('a', caracteresValidos);
            fail("validarCaractere invalido, a excecao deveria ter pegado");
        } catch (PalavraInvalidaException e) {
        }
    }
}
