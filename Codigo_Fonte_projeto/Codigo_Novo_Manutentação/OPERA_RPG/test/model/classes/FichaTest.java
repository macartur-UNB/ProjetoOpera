/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.classes;

import java.util.logging.Level;
import java.util.logging.Logger;
import model.exception.FichaInvalidaException;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Luciano
 */
public class FichaTest{
    
    Ficha instance;
    
    public FichaTest(){
        
    }
    
    @Before
    public void setUP(){
        String personagem = "Personagem";
        String jogador = "Luciano";
        String tipo = "Jogador";
        String campanha = "Camapanha";
        int experiencia = 0;;
        int atributos[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int dinheiro = 0;
        try {
            instance = new Ficha(personagem, jogador, tipo, campanha, experiencia, atributos, dinheiro);
        } catch (FichaInvalidaException e) {
            fail(e.getMessage());
        }
    }
    
    /**
     * Test of setPersonagem method, of class Ficha.
     */
    @Test
    public void testSetPersonagem() throws Exception {
        System.out.println("setPersonagem");
        String personagem = "Personagem";
        instance.setPersonagem(personagem);
        try{
            personagem = "Personagem Invalido ##";
            instance.setPersonagem(personagem);
            fail("O Personagem esta invalido, a excecao deveria ter pegado");
        } catch(FichaInvalidaException e){
            
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTipo method, of class Ficha.
     */
    @Test
    public void testSetTipo() throws Exception {
        System.out.println("setTipo");
        String tipo = "Jogador";
        instance.setTipo(tipo);
        tipo = "NPC";
        instance.setTipo(tipo);
        tipo = "Monstro";
        instance.setTipo(tipo);
        try{
            tipo = "Tipo Invalido";
            instance.setTipo(tipo);
            fail("O Tipo esta invalido, a excecao deveria ter pegado");
        } catch(FichaInvalidaException e){
            
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setJogador method, of class Ficha.
     */
    @Test
    public void testSetJogador() throws Exception {
        System.out.println("setJogador");
        String jogador = "Jogador";
        instance.setJogador(jogador);
        try{
            jogador = "Jogador Invalido ##";
            instance.setJogador(jogador);
            fail("O Jogador esta invalido, a excecao deveria ter pegado");
        } catch(FichaInvalidaException e){
            
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCampanha method, of class Ficha.
     */
    @Test
    public void testSetCampanha() throws Exception {
        System.out.println("setCampanha");
        String campanha = "Campanha da Ficha";
        instance.setCampanha(campanha);
        try{
            campanha = "Campanha Invalida ##";
            instance.setCampanha(campanha);
            fail("A Campanha esta invalida, a excecao deveria ter pegado");
        } catch(FichaInvalidaException e){
            
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setAtributos method, of class Ficha.
     */
    @Test
    public void testSetAtributos() throws Exception {
        System.out.println("setAtributos");
        int[] atributos = {1, 2, 3, 4, 5, 6, 7, 8};
        instance.setAtributos(atributos);
        atributos = null;
        instance.setAtributos(atributos);
        try{
            int[] atributos1 = {-1, 2, 3, 4, 5, 6, 7, 8};
            instance.setAtributos(atributos1);
            fail("O Atributo esta invalido, a excecao deveria ter pegado");
        } catch(FichaInvalidaException e){
        }
        try{
            int[] atributos3 = {1, 2};
            instance.setAtributos(atributos3);
            fail("O Atributo esta invalido, a excecao deveria ter pegado");
        } catch(FichaInvalidaException e){
        }
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDinheiro method, of class Ficha.
     */
    @Test
    public void testSetDinheiro() throws Exception {
        System.out.println("setDinheiro");
        int dinheiro = 0;
        instance.setDinheiro(dinheiro);
        try{
            dinheiro = -1;
            instance.setDinheiro(dinheiro);
            fail("O Dinheiro esta invalido, a excecao deveria ter pegado");
        } catch(FichaInvalidaException e){
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of setExperiencia method, of class Ficha.
     */
    @Test
    public void testSetExperiencia() throws Exception {
        System.out.println("setExperiencia");
        int experiencia = 0;
        instance.setExperiencia(experiencia);
        try{
            experiencia = -1;
            instance.setExperiencia(experiencia);
            fail("A Experiencia esta invalida, a excecao deveria ter pegado");
        } catch(FichaInvalidaException e){
            
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of toString method, of class Ficha.
     */
    @Test
    public void testToString() throws Exception {
    	String expected = "{Personagem = Personagem; Jogador = Luciano; Campanha = Camapanha; Tipo = Jogador; Experiencia = 0; Dinheiro = 0}";
    	assertEquals(expected, instance.toString());
    }

}
