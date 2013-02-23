/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.classes;

import control.Controle_Habilidade;
import control.Controle_Jogo;
import model.exception.ItemInvalidoException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luciano
 */
public class ArmaTest {
    
    Arma instance;
    
    public ArmaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        int teste = 0;
        int nivel = 0;
        int custo = 0;
        String nome = "Habilidade";
        String tipo = "Fisica";
        
        if(!Controle_Jogo.jogoExiste("ItemTest")){
            Controle_Jogo.criarJogo("ItemTest");
            Controle_Habilidade.cadHabilidade(teste, nivel, custo, nome, tipo);
        }else{
            Controle_Jogo.abrirJogo("ItemTest");
        }
    }
    
    @AfterClass
    public static void tearDownClass() throws Exception {
        if(Controle_Jogo.jogoExiste("ItemTest")){
            Controle_Jogo.apagarJogo("ItemTest");
        }
    }
    
    @Before
    public void setUp() throws Exception{
        String nome = "Arma";
        String descricao = "Descricao da Arma";
        Dado dano = new Dado(4, 2);
        int danoAdicional = 0;
        boolean usando = false;
        int bonus_atributo[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int preco = 0;
        String habilidade_Necessaria = null;

        instance = new Arma(nome, descricao, dano, danoAdicional, usando, bonus_atributo, preco, habilidade_Necessaria);   
    }
    
    @After
    public void tearDown() {
    }

    
    /**
     * Test of constructos methods, of class Item
     */
    @Test
    public void testConstructors() throws Exception {
    	System.out.println("Constructors");
    	String nome = "Arma";
        String descricao = "Descricao da Arma";
        Dado dano = new Dado(4, 2);
        int danoAdicional = 0;
        boolean usando = false;
        int bonus_atributo[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int preco = 0;
        String habilidade_Necessaria = null;

        instance = new Arma(nome, descricao, dano, danoAdicional, usando, bonus_atributo, preco, habilidade_Necessaria);
        instance = new Arma(nome, descricao, dano, danoAdicional, usando, preco);
    	// TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    /**
     * Test of setDano method, of class Arma.
     */
    @Test
    public void testSetDano() throws Exception {
        System.out.println("setDano");
        Dado dano = new Dado(4, 4);
        instance.setDano(dano);
        
        try{
        	instance.setDano(null);
        	fail("setDano esta invalido, a excecao deveria ter pegado");
        }catch(ItemInvalidoException e){
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDano method, of class Arma.
     */
    @Test
    public void testGetDano() throws Exception {
        System.out.println("getDano");
        Dado expResult = new Dado(4, 2);
        Dado result = instance.getDano();
        assertEquals(expResult.toString(), result.toString());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDanoAdicional method, of class Arma.
     */
    @Test
    public void testSetDanoAdicional() throws Exception {
        System.out.println("setDanoAdicional");
        instance.setDanoAdicional(0);
        
        try{
        	instance.setDanoAdicional(-1);
        	fail("setDanoAdicional esta invalido, a excecao deveria ter pegado");
        }catch(ItemInvalidoException e){
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDanoAdicional method, of class Arma.
     */
    @Test
    public void testGetDanoAdicional() {
        System.out.println("getDanoAdicional");
        int expResult = 0;
        int result = instance.getDanoAdicional();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Arma.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "Nome = Arma; Descricao = Descricao da Arma; Preco = 0; Usando = false; Bonus de Atributo = [1, 2, 3, 4, 5, 6, 7, 8]; Habilidade Necessaria = null Dano = 2d4 + 0";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
}
