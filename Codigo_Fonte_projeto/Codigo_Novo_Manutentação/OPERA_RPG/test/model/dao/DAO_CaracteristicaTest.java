/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import control.Controle_Jogo;
import model.classes.Caracteristica;
import model.classes.Caracteristica_Especifica;
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
public class DAO_CaracteristicaTest {
    
    public DAO_CaracteristicaTest() {
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
        }
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of gravarCaracteristica method, of class DAO_Caracteristica.
     */
    @Test
    public void testGravarCaracteristica() throws Exception {
        System.out.println("gravarCaracteristica");
        Caracteristica caracteristica = new Caracteristica("Test", "teste", "Racial", 2);
        DAO_Caracteristica.gravarCaracteristica(caracteristica);
        Caracteristica caracteristicaf = new Caracteristica("Test", "teste", "Fisica", 2);
        DAO_Caracteristica.gravarCaracteristica(caracteristicaf);
        Caracteristica caracteristicap = new Caracteristica("Test", "teste", "Psiquica", 2);
        DAO_Caracteristica.gravarCaracteristica(caracteristicap);
        
        DAO_Caracteristica.removerTodasCaracteristicas("Fisica");
        DAO_Caracteristica.removerTodasCaracteristicas("Psiquica");
        DAO_Caracteristica.removerTodasCaracteristicas("Racial");
    }

    /**
     * Test of carregarCaracteristica method, of class DAO_Caracteristica.
     */
    @Test
    public void testCarregarCaracteristica() throws Exception {
        System.out.println("carregarCaracteristica");
        
        Caracteristica caracteristica = new Caracteristica("Test", "teste", "Racial", 2);  
        DAO_Caracteristica.gravarCaracteristica(caracteristica);
        Caracteristica result = DAO_Caracteristica.carregarCaracteristica("Test", "Racial");
        if(result == null){
            fail("não foi possivel carregar caracteristica racial");
        }
        DAO_Caracteristica.removerTodasCaracteristicas("Racial");
        
        Caracteristica caracteristicaf = new Caracteristica("Test", "teste", "Fisica", 2);
        DAO_Caracteristica.gravarCaracteristica(caracteristicaf);
        result = DAO_Caracteristica.carregarCaracteristica("Test", "Fisica");
        if(result == null){
            fail("nao foi possivel carregar caracteristica fisica");
        }
        DAO_Caracteristica.removerTodasCaracteristicas("Fisica");
        Caracteristica caracteristicap = new Caracteristica("Test", "teste", "Psiquica", 2);
        DAO_Caracteristica.gravarCaracteristica(caracteristicaf);
        result = DAO_Caracteristica.carregarCaracteristica("Test", "Psiquica");
        if(result == null){
            fail("nao foi possivel carregar caracteristica psiquica");
        }
        DAO_Caracteristica.removerTodasCaracteristicas("Psiquica");
        
    }

    /**
     * Test of carregarCaracteristica_Especifica method, of class DAO_Caracteristica.
     */
    @Test
    public void testCarregarCaracteristica_Especifica() throws Exception {
        System.out.println("carregarCaracteristica_Especifica");
        Caracteristica_Especifica ce = new Caracteristica_Especifica("Test", "Test", "Test", "Test", "Fisica", 2);
        DAO_Caracteristica.gravarCaracteristica(ce);        
        Caracteristica_Especifica result = DAO_Caracteristica.carregarCaracteristica_Especifica("Test","Fisica");
        
        if(result == null){
            fail("não pode carregar caracteristica especifica fisica");
        }
        
        ce = new Caracteristica_Especifica("Test", "Test", "Test", "Test", "Belica", 2);
        DAO_Caracteristica.gravarCaracteristica(ce);        
        result = DAO_Caracteristica.carregarCaracteristica_Especifica("Test","Belica");
        
        if(result == null){
            fail("não pode carregar caracteristica especifica fisica");
        }
        
        ce = new Caracteristica_Especifica("Test", "Test", "Test", "Test", "Psiquica", 2);
        DAO_Caracteristica.gravarCaracteristica(ce);        
        result = DAO_Caracteristica.carregarCaracteristica_Especifica("Test","Psiquica");
        
        if(result == null){
            fail("não pode carregar caracteristica especifica fisica");
        }    
        
    }

    /**
     * Test of CaracteristicaExiste method, of class DAO_Caracteristica.
     */
    @Test
    public void testCaracteristicaExiste()throws Exception{
        System.out.println("CaracteristicaExiste");
        
        Caracteristica_Especifica ce = new Caracteristica_Especifica("Test", "Test", "Test", "Test", "Fisica", 2);
        DAO_Caracteristica.gravarCaracteristica(ce);        
        boolean result = DAO_Caracteristica.CaracteristicaExiste("Test","Fisica");
        if(result == false){
            fail("não pode carregar caracteristica especifica fisica");
        }
        
        ce = new Caracteristica_Especifica("Test", "Test", "Test", "Test", "Belica", 2);
        DAO_Caracteristica.gravarCaracteristica(ce);        
        result = DAO_Caracteristica.CaracteristicaExiste("Test","Belica");
        
        if(result == false){
            fail("não pode carregar caracteristica especifica fisica");
        }
        
        ce = new Caracteristica_Especifica("Test", "Test", "Test", "Test", "Psiquica", 2);
        DAO_Caracteristica.gravarCaracteristica(ce);        
        result = DAO_Caracteristica.CaracteristicaExiste("Test","Psiquica");
        
        if(result == false){
            fail("não pode carregar caracteristica especifica fisica");
        }    
    }

    /**
     * Test of removerCaracteristica method, of class DAO_Caracteristica.
     */
    @Test
    public void testRemoverCaracteristica() throws Exception {
        System.out.println("removerCaracteristica");
        
        Caracteristica caracteristica = new Caracteristica("Test", "teste", "Racial", 2);  
        DAO_Caracteristica.gravarCaracteristica(caracteristica);
        DAO_Caracteristica.removerCaracteristica("Test", "Racial");
        Caracteristica result = DAO_Caracteristica.carregarCaracteristica("Test", "Racial");
        if(result != null){
            fail("caracteristica racial não removida");
        }
        DAO_Caracteristica.removerTodasCaracteristicas("Racial");
        
        caracteristica = new Caracteristica("Test", "teste", "Fisica", 2);
        DAO_Caracteristica.gravarCaracteristica(caracteristica);
        DAO_Caracteristica.removerCaracteristica("Test", "Fisica");
        result = DAO_Caracteristica.carregarCaracteristica("Test", "Fisica");
        if(result != null){
            fail("caracteristica fisica não removida");
        }
        DAO_Caracteristica.removerTodasCaracteristicas("Fisica");
        
        caracteristica = new Caracteristica("Test", "teste", "Psiquica", 2);
        DAO_Caracteristica.gravarCaracteristica(caracteristica);
        DAO_Caracteristica.removerCaracteristica("Test", "Psiquica");
        result = DAO_Caracteristica.carregarCaracteristica("Test", "Psiquica");
        if(result != null){
            fail("caracteristica psiquica não removida");
        }
        DAO_Caracteristica.removerTodasCaracteristicas("Psiquica");
        
    }

    /**
     * Test of removerTodasCaracteristicas method, of class DAO_Caracteristica.
     */
    @Test
    public void testRemoverTodasCaracteristicas() throws Exception {
        System.out.println("removerTodasCaracteristicas");
        String tipo = "";
        DAO_Caracteristica.removerTodasCaracteristicas(tipo);
    }

    /**
     * Test of listarCaracteristicas method, of class DAO_Caracteristica.
     */
    @Test
    public void testListarCaracteristicas() {
        System.out.println("listarCaracteristicas");
        String tipo = "";
        String[] expResult = null;
        String[] result = DAO_Caracteristica.listarCaracteristicas(tipo);
        assertArrayEquals(expResult, result);
    }
}
