/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.io.File;
import model.classes.Arma;
import model.classes.Arma_A_Distancia;
import model.classes.Arma_Corpo_A_Corpo;
import model.classes.Armadura;
import model.classes.Dado;
import model.classes.Habilidade;
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
    
    private String diretorio = "C:\\Opera\\Jogos\\JUnitTest\\Itens\\";
    private String jogo = "JUnitTest";
    private String armaduras = "Armaduras";   
    private String generico = "Generico";
    private String armas = "Armas";
    private String armasDistancia = "Arma_A_Distancia";
    private String armasCorpo = "Arma_Corpo_A_Corpo";
    private String armasBranca = "Branca";
    private String armasFogo = "De_Fogo"; 
    private String testeItem = "TesteItem";
    private int[] testeAtributos = {2,2,2,2,2,2,2,2};
    private int preco = 2;
    
    
    public DAO_ItemTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws Exception {
         if(DAO_Jogo.jogoExiste(jogo)) {
            DAO_Jogo.deletarJogo(jogo);
            DAO_Jogo.criarJogo(jogo);            
        }else {
            DAO_Jogo.criarJogo(jogo);
        }
         
         Habilidade habilidade = new Habilidade(2, 2, 2, "TesteFisica", "Fisica");
         DAO_Habilidade.gravarHabilidade(habilidade);
         File arquivo = new File("C:\\Opera\\Jogos\\JUnitTest\\Habilidades\\Fisica"
                                ,"TesteFisica.opera");
         assertEquals(true,arquivo.exists());  
    }
    
    @After
    public void tearDown() throws Exception {
        //DAO_Jogo.deletarJogo(jogo);
    }

    /**
     * Test of gravarItem method, of class DAO_Item.
    */ 
    @Test
    public void testGravarItem() throws Exception {
        System.out.println("gravarItem");        
        Item item = new Item("NomeItemGenerico", "Descricao", true, testeAtributos,preco, "TesteFisica");
        DAO_Item.gravarItem(item);        
        File arquivo = new File(diretorio+generico, "NomeItemGenerico.opera");
        boolean expResult = true;
        boolean result = arquivo.exists(); 
        assertEquals(expResult, result);         
        assertEquals(expResult, arquivo.delete());
    }

    /**
     * Test of gravarArma_Corpo_A_Corpo method, of class DAO_Item.
    */ 
    @Test
    public void testGravarArma_Corpo_A_Corpo() throws Exception {
        System.out.println("gravarArma_Corpo_A_Corpo");
        Dado dado = new Dado(6, 1);
        Arma_Corpo_A_Corpo arma = new Arma_Corpo_A_Corpo("NomeArmaCorpo", "Descricao", "Branca", dado, 2, 2, 2, 2, true, testeAtributos, preco, "TesteFisica");
        DAO_Item.gravarArma_Corpo_A_Corpo(arma);       
        File arquivo = new File(diretorio+armas+"\\"+armasCorpo+"\\"+armasBranca, "NomeArmaCorpo.opera");
        boolean expResult = true;
        boolean result = arquivo.exists(); 
        assertEquals(expResult, result);         
        assertEquals(expResult, arquivo.delete());
    }

    /**
     * Test of gravarArma_A_Distancia method, of class DAO_Item.
    */ 
    @Test
    public void testGravarArma_A_Distancia() throws Exception {
        System.out.println("gravarArma_A_Distancia");
        Dado dado = new Dado(6, 1);
        Arma_A_Distancia arma = new Arma_A_Distancia("NomeArmaDistancia", "Descricao",
                                                     dado, 2, 2, 2, 2, true, 
                                                     testeAtributos, preco, "TesteFisica");
        DAO_Item.gravarArma_A_Distancia(arma);      
        File arquivo = new File(diretorio+armas+"\\"+armasDistancia, "NomeArmaDistancia.opera");
        boolean expResult = true;
        boolean result = arquivo.exists(); 
        assertEquals(expResult, result);         
        assertEquals(expResult, arquivo.delete());
    }

    /**
     * Test of gravarArmadura method, of class DAO_Item.
    */ 
    @Test
    public void testGravarArmadura() throws Exception {
        System.out.println("gravarArmadura");
        Dado dado = new Dado(6, 1);
        Armadura arma = new Armadura("NomeArmadura","Descricao",2,2,2,'A', true, testeAtributos, 2, "TesteFisica");
        DAO_Item.gravarArmadura(arma);      
        File arquivo = new File(diretorio+armaduras, "NomeArmadura.opera");
        boolean expResult = true;
        boolean result = arquivo.exists(); 
        assertEquals(expResult, result);         
        assertEquals(expResult, arquivo.delete());
    }

    /**
     * Test of removerItemGenerico method, of class DAO_Item.
    */ 
    @Test
    public void testRemoverItemGenerico() throws Exception {
        System.out.println("removerItemGenerico");
        Item item = new Item("NomeItemGenerico", "Descricao", true, testeAtributos,preco, "TesteFisica");
        DAO_Item.gravarItem(item);        
        File arquivo = new File(diretorio+generico, "NomeItemGenerico.opera");        
        assertEquals(true, arquivo.exists());
        DAO_Item.removerItemGenerico("NomeItemGenerico");
        assertEquals(false, arquivo.exists());
    }

    /**
     * Test of removerArma_A_Distancia method, of class DAO_Item.
    */ 
    @Test
    public void testRemoverArma_A_Distancia() throws Exception {
        System.out.println("removerArma_A_Distancia");
        Dado dado = new Dado(6, 1);
        Arma_A_Distancia arma = new Arma_A_Distancia("NomeArmaDistancia", "Descricao",
                                                     dado, 2, 2, 2, 2, true, 
                                                     testeAtributos, preco, "TesteFisica");
        DAO_Item.gravarArma_A_Distancia(arma);      
        File arquivo = new File(diretorio+armas+"\\"+armasDistancia, "NomeArmaDistancia.opera");
        assertEquals(true, arquivo.exists());
        DAO_Item.removerArma_A_Distancia("NomeArmaDistancia");
        assertEquals(false, arquivo.exists());
    }

    /**
     * Test of removerArma_Corpo_A_Corpo method, of class DAO_Item.
    */ 
    @Test
    public void testRemoverArma_Corpo_A_Corpo() throws Exception {
        System.out.println("removerArma_Corpo_A_Corpo");
        Dado dado = new Dado(6, 1);
        Arma_Corpo_A_Corpo arma = new Arma_Corpo_A_Corpo("NomeArmaCorpo", "Descricao", "Branca", dado, 2, 2, 2, 2, true, testeAtributos, preco, "TesteFisica");
        DAO_Item.gravarArma_Corpo_A_Corpo(arma);       
        File arquivo = new File(diretorio+armas+"\\"+armasCorpo+"\\"+armasBranca, "NomeArmaCorpo.opera");        
        assertEquals(true, arquivo.exists());
        DAO_Item.removerArma_Corpo_A_Corpo("NomeArmaCorpo", "Branca");
        assertEquals(false, arquivo.exists());
    }

    /**
     * Test of removerArmadura method, of class DAO_Item.
    */ 
    @Test
    public void testRemoverArmadura() throws Exception {
        System.out.println("removerArmadura");
        Dado dado = new Dado(6, 1);
        Armadura arma = new Armadura("NomeArmadura","Descricao",2,2,2,'A', true, testeAtributos, 2, "TesteFisica");
        DAO_Item.gravarArmadura(arma);      
        File arquivo = new File(diretorio+armaduras, "NomeArmadura.opera");
        assertEquals(true, arquivo.exists());
        DAO_Item.removerArmadura("NomeArmadura");
        assertEquals(false, arquivo.exists());
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
