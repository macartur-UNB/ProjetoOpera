/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import model.classes.Ficha;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import control.*;
import static org.junit.Assert.*;

/**
 *
 * @author Macartur
 */
public class DAO_FichaTest {
    
    public DAO_FichaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws Exception{
        if(!Controle_Jogo.jogoExiste("JunitTest")){
            Controle_Jogo.criarJogo("JUnitTest");
            Controle_Ficha.removeTodasFichas();
        }
    }
    
    @After
    public void tearDown()throws Exception{
        Controle_Jogo.apagarJogo("JUnitTest");
    }

    /**
     * Test of gravarFicha method, of class DAO_Ficha.
     */
    @Test
    public void testGravarFicha() throws Exception {
        System.out.println("gravarFicha");
        int n[] = {0,0,0,0,0,0,0,0};
        Ficha f = new Ficha("Test", "Test", "Monstro", "teste", 2,n,2);       
        DAO_Ficha.gravarFicha(f);
        DAO_Ficha.removerFicha("Test", "Monstro");
        f.setTipo("Jogador");
        DAO_Ficha.gravarFicha(f);
        DAO_Ficha.removerFicha("Test", "Jogador");
        f.setTipo("NPC");
        DAO_Ficha.gravarFicha(f);
        DAO_Ficha.removerFicha("Test", "NPC");
        
    }

    /**
     * Test of carregarFicha method, of class DAO_Ficha.
     */
    @Test
    public void testCarregarFicha() throws Exception {
        System.out.println("carregarFicha");
        String personagem = "Test";
        String tipo = "NPC";
        int n[] = {2,3,4,5,6,7,8,8};
        Ficha f = new Ficha(personagem, "Test", tipo, "test", 2, n, 2);
        String expResult = f.toString();
        DAO_Ficha.gravarFicha(f);
        String result = DAO_Ficha.carregarFicha(personagem, tipo).toString();
        assertEquals(expResult, result);
        DAO_Ficha.removerFicha(personagem, tipo);
    }

    /**
     * Test of fichaExiste method, of class DAO_Ficha.
     */
    @Test
    public void testFichaExiste() throws Exception{
        System.out.println("fichaExiste");
        String personagem = "Test";
        String tipo = "NPC";
        int n[] = {2,3,4,5,6,7,8,8};
        Ficha f = new Ficha(personagem, "Test", tipo, "test", 2, n, 2);
        DAO_Ficha.gravarFicha(f);
        boolean expResult = true;
        boolean result = DAO_Ficha.fichaExiste(personagem, tipo);
        assertEquals(expResult, result);
        DAO_Ficha.removerTodasFichas(tipo);
    }

    /**
     * Test of removerFicha method, of class DAO_Ficha.
     */
    @Test
    public void testRemoverFicha() throws Exception {
        System.out.println("removerFicha");
        String personagem = "Test";
        String tipo = "Monstro";
        int n[] = {2,3,4,5,6,7,8,8};
        Ficha f = new Ficha(personagem, "Test", tipo, "test", 2, n, 2);
        DAO_Ficha.gravarFicha(f);
        DAO_Ficha.removerFicha(personagem, tipo);
    }

    /**
     * Test of removerTodasFichas method, of class DAO_Ficha.
     */
    @Test
    public void testRemoverTodasFichas() throws Exception {
        System.out.println("removerTodasFichas");
        String tipo = "NPC";
        int n[] = {2,3,4,5,6,7,8,8};
        Ficha f = new Ficha("Test", "Test", tipo, "test", 2, n, 2);
        DAO_Ficha.gravarFicha(f);
        DAO_Ficha.removerTodasFichas(tipo);
    }

    /**
     * Test of listarFichas method, of class DAO_Ficha.
     */
    @Test
    public void testListarFichas() throws Exception{
        System.out.println("listarFichas");
        String tipo = "Jogador";
        DAO_Ficha.removerTodasFichas("Jogador");
        int n[] = {3,4,5,6,7,8,7,9};
        Ficha f = new Ficha("Test", "Jogador", "Jogador", "Test", 2,n , 3);
        DAO_Ficha.gravarFicha(f);
        
        Ficha f1 = new Ficha("Test1", "Jogador", "Jogador", "Test", 2,n , 3);
        DAO_Ficha.gravarFicha(f1);
        
        Ficha f2 = new Ficha("Test2", "Jogador", "Jogador", "Test", 2,n , 3);
        DAO_Ficha.gravarFicha(f2);
        
        String[] expResult = {f.getPersonagem(),f1.getPersonagem(),f2.getPersonagem()};
        String[] result = DAO_Ficha.listarFichas(tipo);
        assertArrayEquals(expResult, result);
    }
}
