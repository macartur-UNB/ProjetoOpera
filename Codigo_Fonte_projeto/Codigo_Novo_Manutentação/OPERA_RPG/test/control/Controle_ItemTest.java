/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.classes.Arma_A_Distancia;
import model.classes.Arma_Corpo_A_Corpo;
import model.classes.Armadura;
import model.classes.Dado;
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
public class Controle_ItemTest {
    
    public Controle_ItemTest() {
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
     * Test of cadItemGenerico method, of class Controle_Item.
     */
    @Test
    public void testCadItemGenerico_3args() throws Exception {
        System.out.println("cadItemGenerico");
        String nome = "";
        String descricao = "";
        int preco = 0;
        Controle_Item.cadItemGenerico(nome, descricao, preco);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cadItemGenerico method, of class Controle_Item.
     */
    @Test
    public void testCadItemGenerico_4args() throws Exception {
        System.out.println("cadItemGenerico");
        String nome = "";
        String descricao = "";
        Boolean usando = null;
        int preco = 0;
        Controle_Item.cadItemGenerico(nome, descricao, usando, preco);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cadItemGenerico method, of class Controle_Item.
     */
    @Test
    public void testCadItemGenerico_6args() throws Exception {
        System.out.println("cadItemGenerico");
        String nome = "";
        String descricao = "";
        Boolean usando = null;
        int[] bonus_atributo = null;
        int preco = 0;
        String habilidade_Necessaria = "";
        Controle_Item.cadItemGenerico(nome, descricao, usando, bonus_atributo, preco, habilidade_Necessaria);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerItemGenerico method, of class Controle_Item.
     */
    @Test
    public void testRemoverItemGenerico() throws Exception {
        System.out.println("removerItemGenerico");
        String nome = "";
        Controle_Item.removerItemGenerico(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerArmaADistancia method, of class Controle_Item.
     */
    @Test
    public void testRemoverArmaADistancia() throws Exception {
        System.out.println("removerArmaADistancia");
        String nome = "";
        Controle_Item.removerArmaADistancia(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerArmaCorpoACorpo method, of class Controle_Item.
     */
    @Test
    public void testRemoverArmaCorpoACorpo() throws Exception {
        System.out.println("removerArmaCorpoACorpo");
        String nome = "";
        Controle_Item.removerArmaCorpoACorpo(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerArmadura method, of class Controle_Item.
     */
    @Test
    public void testRemoverArmadura() throws Exception {
        System.out.println("removerArmadura");
        String nome = "";
        Controle_Item.removerArmadura(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cadArma_Corpo_A_Corpo method, of class Controle_Item.
     */
    @Test
    public void testCadArma_Corpo_A_Corpo_9args() throws Exception {
        System.out.println("cadArma_Corpo_A_Corpo");
        String nome = "";
        String descricao = "";
        Dado dano = null;
        int danoAdicional = 0;
        int golpe = 0;
        int aparo = 0;
        int esquiva = 0;
        boolean usando = false;
        int preco = 0;
        Controle_Item.cadArma_Corpo_A_Corpo(nome, descricao, dano, danoAdicional, golpe, aparo, esquiva, usando, preco);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cadArma_Corpo_A_Corpo method, of class Controle_Item.
     */
    @Test
    public void testCadArma_Corpo_A_Corpo_11args() throws Exception {
        System.out.println("cadArma_Corpo_A_Corpo");
        String nome = "";
        String descricao = "";
        Dado dano = null;
        int danoAdicional = 0;
        int golpe = 0;
        int aparo = 0;
        int esquiva = 0;
        boolean usando = false;
        int[] bonus_atributo = null;
        int preco = 0;
        String habilidade_Necessaria = "";
        Controle_Item.cadArma_Corpo_A_Corpo(nome, descricao, dano, danoAdicional, golpe, aparo, esquiva, usando, bonus_atributo, preco, habilidade_Necessaria);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cadArma_A_Distancia method, of class Controle_Item.
     */
    @Test
    public void testCadArma_A_Distancia_9args() throws Exception {
        System.out.println("cadArma_A_Distancia");
        String nome = "";
        String descricao = "";
        Dado dano = null;
        int danoAdicional = 0;
        int tiro_Rapido = 0;
        int tiro_Mirado = 0;
        int cadencia = 0;
        boolean usando = false;
        int preco = 0;
        Controle_Item.cadArma_A_Distancia(nome, descricao, dano, danoAdicional, tiro_Rapido, tiro_Mirado, cadencia, usando, preco);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cadArma_A_Distancia method, of class Controle_Item.
     */
    @Test
    public void testCadArma_A_Distancia_11args() throws Exception {
        System.out.println("cadArma_A_Distancia");
        String nome = "";
        String descricao = "";
        Dado dano = null;
        int danoAdicional = 0;
        int tiro_Rapido = 0;
        int tiro_Mirado = 0;
        int cadencia = 0;
        boolean usando = false;
        int[] bonus_atributo = null;
        int preco = 0;
        String habilidade_Necessaria = "";
        Controle_Item.cadArma_A_Distancia(nome, descricao, dano, danoAdicional, tiro_Rapido, tiro_Mirado, cadencia, usando, bonus_atributo, preco, habilidade_Necessaria);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cadArmadura method, of class Controle_Item.
     */
    @Test
    public void testCadArmadura_8args() throws Exception {
        System.out.println("cadArmadura");
        String nome = "";
        String descricao = "";
        int absorcao_Distancia = 0;
        int absorcao_CorpoACorpo = 0;
        int penalidade = 0;
        char regiao_Do_Corpo = ' ';
        boolean usando = false;
        int preco = 0;
        Controle_Item.cadArmadura(nome, descricao, absorcao_Distancia, absorcao_CorpoACorpo, penalidade, regiao_Do_Corpo, usando, preco);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cadArmadura method, of class Controle_Item.
     */
    @Test
    public void testCadArmadura_10args() throws Exception {
        System.out.println("cadArmadura");
        String nome = "";
        String descricao = "";
        int absorcao_Distancia = 0;
        int absorcao_CorpoACorpo = 0;
        int penalidade = 0;
        char regiao_Do_Corpo = ' ';
        boolean usando = false;
        int[] bonus_atributo = null;
        int preco = 0;
        String habilidade_Necessaria = "";
        Controle_Item.cadArmadura(nome, descricao, absorcao_Distancia, absorcao_CorpoACorpo, penalidade, regiao_Do_Corpo, usando, bonus_atributo, preco, habilidade_Necessaria);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ItemGenericoExiste method, of class Controle_Item.
     */
    @Test
    public void testItemGenericoExiste() {
        System.out.println("ItemGenericoExiste");
        String item = "";
        boolean expResult = false;
        boolean result = Controle_Item.ItemGenericoExiste(item);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Arma_A_DistanciaExiste method, of class Controle_Item.
     */
    @Test
    public void testArma_A_DistanciaExiste() {
        System.out.println("Arma_A_DistanciaExiste");
        String arma = "";
        boolean expResult = false;
        boolean result = Controle_Item.Arma_A_DistanciaExiste(arma);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ArmaCorpo_A_CorpoExiste method, of class Controle_Item.
     */
    @Test
    public void testArmaCorpo_A_CorpoExiste() {
        System.out.println("ArmaCorpo_A_CorpoExiste");
        String arma = "";
        boolean expResult = false;
        boolean result = Controle_Item.ArmaCorpo_A_CorpoExiste(arma);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ArmaduraExiste method, of class Controle_Item.
     */
    @Test
    public void testArmaduraExiste() {
        System.out.println("ArmaduraExiste");
        String armadura = "";
        boolean expResult = false;
        boolean result = Controle_Item.ArmaduraExiste(armadura);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encontrarItemGenerico method, of class Controle_Item.
     */
    @Test
    public void testEncontrarItemGenerico() throws Exception {
        System.out.println("encontrarItemGenerico");
        String nome = "";
        Item expResult = null;
        Item result = Controle_Item.encontrarItemGenerico(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encontrarArma_Corpo_A_Corpo method, of class Controle_Item.
     */
    @Test
    public void testEncontrarArma_Corpo_A_Corpo() throws Exception {
        System.out.println("encontrarArma_Corpo_A_Corpo");
        String nome = "";
        Arma_Corpo_A_Corpo expResult = null;
        Arma_Corpo_A_Corpo result = Controle_Item.encontrarArma_Corpo_A_Corpo(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encontrarArma_A_Distancia method, of class Controle_Item.
     */
    @Test
    public void testEncontrarArma_A_Distancia() throws Exception {
        System.out.println("encontrarArma_A_Distancia");
        String nome = "";
        Arma_A_Distancia expResult = null;
        Arma_A_Distancia result = Controle_Item.encontrarArma_A_Distancia(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encontrarArmadura method, of class Controle_Item.
     */
    @Test
    public void testEncontrarArmadura() throws Exception {
        System.out.println("encontrarArmadura");
        String nome = "";
        Armadura expResult = null;
        Armadura result = Controle_Item.encontrarArmadura(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarItemGenerico method, of class Controle_Item.
     */
    @Test
    public void testListarItemGenerico() {
        System.out.println("listarItemGenerico");
        String[] expResult = null;
        String[] result = Controle_Item.listarItemGenerico();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarItemArmaADistancia method, of class Controle_Item.
     */
    @Test
    public void testListarItemArmaADistancia() {
        System.out.println("listarItemArmaADistancia");
        String[] expResult = null;
        String[] result = Controle_Item.listarItemArmaADistancia();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarItemArmaCorpoACorpo method, of class Controle_Item.
     */
    @Test
    public void testListarItemArmaCorpoACorpo() {
        System.out.println("listarItemArmaCorpoACorpo");
        String[] expResult = null;
        String[] result = Controle_Item.listarItemArmaCorpoACorpo();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarItemArmadura method, of class Controle_Item.
     */
    @Test
    public void testListarItemArmadura() {
        System.out.println("listarItemArmadura");
        String[] expResult = null;
        String[] result = Controle_Item.listarItemArmadura();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
