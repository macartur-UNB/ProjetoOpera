/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.classes;

import org.junit.Test;

/**
 *
 * @author Luciano
 */
public class FichaTest {
    
    public FichaTest() {
    }
    
    /**
     * Test of setPersonagem method, of class Ficha.
     */
    @Test
    public void testSetPersonagem() throws Exception {
        System.out.println("setPersonagem");
        String personagem = "Personagem";
        Ficha instance = new Ficha();
        instance.setPersonagem(personagem);
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
        Ficha instance = new Ficha();
        instance.setTipo(tipo);
        
        tipo = "NPC";
        instance.setTipo(tipo);
        
        tipo = "Monstro";
        instance.setTipo(tipo);
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
        Ficha instance = new Ficha();
        instance.setJogador(jogador);
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
        Ficha instance = new Ficha();
        instance.setCampanha(campanha);
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
        Ficha instance = new Ficha();
        instance.setAtributos(atributos);
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
        Ficha instance = new Ficha();
        instance.setDinheiro(dinheiro);
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
        Ficha instance = new Ficha();
        instance.setExperiencia(experiencia);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
