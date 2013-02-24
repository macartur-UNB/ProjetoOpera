/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import model.classes.Arma_A_Distancia;
import model.classes.Arma_Corpo_A_Corpo;
import model.classes.Armadura;
import model.classes.Item;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrador
 */
public class DAO_ItemTest {
    
    public DAO_ItemTest() {
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
     * Test of gravarItem method, of class DAO_Item.
     
    @Test
    public void testGravarItem() throws Exception {
        System.out.println("gravarItem");
        Item item = null;
        DAO_Item.gravarItem(item);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gravarArma_Corpo_A_Corpo method, of class DAO_Item.
     
    @Test
    public void testGravarArma_Corpo_A_Corpo() throws Exception {
        System.out.println("gravarArma_Corpo_A_Corpo");
        Arma_Corpo_A_Corpo arma = null;
        DAO_Item.gravarArma_Corpo_A_Corpo(arma);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gravarArma_A_Distancia method, of class DAO_Item.
     
    @Test
    public void testGravarArma_A_Distancia() throws Exception {
        System.out.println("gravarArma_A_Distancia");
        Arma_A_Distancia arma = null;
        DAO_Item.gravarArma_A_Distancia(arma);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gravarArmadura method, of class DAO_Item.
     
    @Test
    public void testGravarArmadura() throws Exception {
        System.out.println("gravarArmadura");
        Armadura armadura = null;
        DAO_Item.gravarArmadura(armadura);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerItemGenerico method, of class DAO_Item.
     
    @Test
    public void testRemoverItemGenerico() throws Exception {
        System.out.println("removerItemGenerico");
        String nome = "";
        DAO_Item.removerItemGenerico(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerArma_A_Distancia method, of class DAO_Item.
     
    @Test
    public void testRemoverArma_A_Distancia() throws Exception {
        System.out.println("removerArma_A_Distancia");
        String nome = "";
        DAO_Item.removerArma_A_Distancia(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerArma_Corpo_A_Corpo method, of class DAO_Item.
     
    @Test
    public void testRemoverArma_Corpo_A_Corpo() throws Exception {
        System.out.println("removerArma_Corpo_A_Corpo");
        String nome = "";
        String tipo = "";
        DAO_Item.removerArma_Corpo_A_Corpo(nome, tipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerArmadura method, of class DAO_Item.
     
    @Test
    public void testRemoverArmadura() throws Exception {
        System.out.println("removerArmadura");
        String nome = "";
        DAO_Item.removerArmadura(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encontrarItemGenerico method, of class DAO_Item.
     
    @Test
    public void testEncontrarItemGenerico() throws Exception {
        System.out.println("encontrarItemGenerico");
        String nome = "";
        Item expResult = null;
        Item result = DAO_Item.encontrarItemGenerico(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encontrarArma_Corpo_A_Corpo method, of class DAO_Item.
     
    @Test
    public void testEncontrarArma_Corpo_A_Corpo() throws Exception {
        System.out.println("encontrarArma_Corpo_A_Corpo");
        String nome = "";
        String tipo = "";
        Arma_Corpo_A_Corpo expResult = null;
        Arma_Corpo_A_Corpo result = DAO_Item.encontrarArma_Corpo_A_Corpo(nome, tipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encontrarArma_A_Distancia method, of class DAO_Item.
     
    @Test
    public void testEncontrarArma_A_Distancia() throws Exception {
        System.out.println("encontrarArma_A_Distancia");
        String nome = "";
        Arma_A_Distancia expResult = null;
        Arma_A_Distancia result = DAO_Item.encontrarArma_A_Distancia(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encontrarArmadura method, of class DAO_Item.
     
    @Test
    public void testEncontrarArmadura() throws Exception {
        System.out.println("encontrarArmadura");
        String nome = "";
        Armadura expResult = null;
        Armadura result = DAO_Item.encontrarArmadura(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ItemGenericoExiste method, of class DAO_Item.
     
    @Test
    public void testItemGenericoExiste() {
        System.out.println("ItemGenericoExiste");
        String item = "";
        boolean expResult = false;
        boolean result = DAO_Item.ItemGenericoExiste(item);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ArmaduraExiste method, of class DAO_Item.
     
    @Test
    public void testArmaduraExiste() {
        System.out.println("ArmaduraExiste");
        String armadura = "";
        boolean expResult = false;
        boolean result = DAO_Item.ArmaduraExiste(armadura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ArmaCorpo_A_CorpoExiste method, of class DAO_Item.
     
    @Test
    public void testArmaCorpo_A_CorpoExiste_String() {
        System.out.println("ArmaCorpo_A_CorpoExiste");
        String arma = "";
        boolean expResult = false;
        boolean result = DAO_Item.ArmaCorpo_A_CorpoExiste(arma);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ArmaCorpo_A_CorpoExiste method, of class DAO_Item.
     
    @Test
    public void testArmaCorpo_A_CorpoExiste_String_String() {
        System.out.println("ArmaCorpo_A_CorpoExiste");
        String arma = "";
        String tipo = "";
        boolean expResult = false;
        boolean result = DAO_Item.ArmaCorpo_A_CorpoExiste(arma, tipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of tipoArmaCorpo_A_Corpo method, of class DAO_Item.
     
    @Test
    public void testTipoArmaCorpo_A_Corpo() {
        System.out.println("tipoArmaCorpo_A_Corpo");
        String arma = "";
        String expResult = "";
        String result = DAO_Item.tipoArmaCorpo_A_Corpo(arma);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Arma_A_DistanciaExiste method, of class DAO_Item.
     
    @Test
    public void testArma_A_DistanciaExiste() {
        System.out.println("Arma_A_DistanciaExiste");
        String arma = "";
        boolean expResult = false;
        boolean result = DAO_Item.Arma_A_DistanciaExiste(arma);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarItem method, of class DAO_Item.
     
    @Test
    public void testListarItem() {
        System.out.println("listarItem");
        String tipo = "";
        String[] expResult = null;
        String[] result = DAO_Item.listarItem(tipo);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
}
