/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import control.Controle_Jogo;
import java.io.File;
import model.classes.Habilidade;
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
public class DAO_HabilidadeTest {
    
    private String diretorio = "C:\\Opera\\Jogos\\JUnitTest";
    
    public DAO_HabilidadeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws Exception {               
        if(Controle_Jogo.jogoExiste("JUnitTest")) {
            Controle_Jogo.apagarJogo("JUnitTest");
            Controle_Jogo.criarJogo("JUnitTest");            
        }else {
            Controle_Jogo.criarJogo("JUnitTest");
        }
            
        
    }
    
    @After
    public void tearDown() throws Exception {
       // Controle_Jogo.apagarJogo("JUnitTest");
    }

    /**
     * Test of gravarHabilidade method, of class DAO_Habilidade.
     */
    @Test
    public void testGravarHabilidade() throws Exception {
        System.out.println("gravarHabilidade");        
        boolean expResult = true;         
        Habilidade habilidadeF = new Habilidade(2,2,2, "Teste","Fisica");
        DAO_Habilidade.gravarHabilidade(habilidadeF);
        String dire = "C:\\Opera\\Jogos\\JUnitTest\\Habilidades\\Fisica\\";
        File arquivo = new File(dire, "Teste.opera");
        boolean result = arquivo.exists(); 
        assertEquals(expResult, result);
                
        Habilidade habilidadeP = new Habilidade(2,2,2,"Teste","Psiquica");
        DAO_Habilidade.gravarHabilidade(habilidadeP);
        dire = "C:\\Opera\\Jogos\\JUnitTest\\Habilidades\\Psiquica\\";
        arquivo = new File(dire, "Teste.opera");
        result = arquivo.exists();
        assertEquals(expResult, result);
        
        
        arquivo = new File(diretorio+"\\Habilidades\\Belica", "Teste");
        Habilidade habilidadeB = new Habilidade(2,2,2,"Teste","Belica");
        DAO_Habilidade.gravarHabilidade(habilidadeB);
        assertEquals(expResult, result);               
        
    }

    /**
     * Test of carregarHabilidade method, of class DAO_Habilidade.
     
    @Test
    public void testCarregarHabilidade() throws Exception {
        System.out.println("carregarHabilidade");
        String nome = "Teste";
        String tipo = "Fisica";
        Habilidade expResult = new Habilidade(2,2,2,"Teste","Fisica");
        Habilidade result = DAO_Habilidade.carregarHabilidade(nome, tipo);
        assertEquals(expResult, result);
        
        tipo = "Psiquica";
        expResult = new Habilidade(2,2,2,"Teste","Psiquica");
        result = DAO_Habilidade.carregarHabilidade(nome, tipo);
        assertEquals(expResult, result);
        
        tipo = "Belica";
        expResult = new Habilidade(2,2,2,"Teste","Belica");
        result = DAO_Habilidade.carregarHabilidade(nome, tipo);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of HabilidadeExiste method, of class DAO_Habilidade.
     
    @Test
    public void testHabilidadeExiste() {
        System.out.println("HabilidadeExiste");
        String nome = "Teste";
        String tipo = "Fisica";
        boolean expResult = true;
        boolean result = DAO_Habilidade.HabilidadeExiste(nome, tipo);
        assertEquals(expResult, result);
        
        tipo = "Psiquica";
        result = DAO_Habilidade.HabilidadeExiste(nome, tipo);
        assertEquals(expResult, result);
        
        tipo = "Belica";
        result = DAO_Habilidade.HabilidadeExiste(nome, tipo);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of removerHabilidade method, of class DAO_Habilidade.
     
    @Test
    public void testRemoverHabilidade() throws Exception {
        System.out.println("removerHabilidade");
        String nome = "";
        String tipo = "";
        DAO_Habilidade.removerHabilidade(nome, tipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerTodasHabilidades method, of class DAO_Habilidade.
     
    @Test
    public void testRemoverTodasHabilidades() throws Exception {
        System.out.println("removerTodasHabilidades");
        String tipo = "";
        DAO_Habilidade.removerTodasHabilidades(tipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarHabilidades method, of class DAO_Habilidade.
     
    @Test
    public void testListarHabilidades() {
        System.out.println("listarHabilidades");
        String tipo = "";
        String[] expResult = null;
        String[] result = DAO_Habilidade.listarHabilidades(tipo);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }*/
}
