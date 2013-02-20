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
    
    private String diretorio = "C:\\Opera\\Jogos\\JUnitTest\\Habilidades\\";
    private String jogo = "JUnitTest";
    
    public DAO_HabilidadeTest() {
    }
    
    public void comparaObjetos(Habilidade expResult, Habilidade result) {
        assertEquals(expResult.getCusto(), result.getCusto());
        assertEquals(expResult.getNivel(), result.getNivel());
        assertEquals(expResult.getNome(), result.getNome());
        assertEquals(expResult.getTeste(), result.getTeste());
        assertEquals(expResult.getTipo(), result.getTipo());        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws Exception {               
        if(Controle_Jogo.jogoExiste(jogo)) {
            Controle_Jogo.apagarJogo(jogo);
            Controle_Jogo.criarJogo(jogo);            
        }else {
            Controle_Jogo.criarJogo(jogo);
        }
            
        
    }
    
    @After
    public void tearDown() throws Exception {
       Controle_Jogo.apagarJogo(jogo);
    }

    /**
     * Test of gravarHabilidade method, of class DAO_Habilidade.
     */
    @Test
    public void testGravarHabilidade() throws Exception {
        System.out.println("gravarHabilidade");        
        Habilidade habilidade = new Habilidade(2,2,2, "TesteFisica","Fisica");
        DAO_Habilidade.gravarHabilidade(habilidade);        
        File arquivo = new File(diretorio+"Fisica", "TesteFisica.opera");
        boolean expResult = true;
        boolean result = arquivo.exists(); 
        assertEquals(expResult, result);         
        assertEquals(true, arquivo.delete());
                
        habilidade = new Habilidade(2,2,2,"TestePsiquica","Psiquica");
        DAO_Habilidade.gravarHabilidade(habilidade);        
        arquivo = new File(diretorio+"Psiquica", "TestePsiquica.opera");
        result = arquivo.exists();
        assertEquals(expResult, result);
        assertEquals(true, arquivo.delete());
                        
        habilidade = new Habilidade(2,2,2,"TesteBelica","Belica");
        DAO_Habilidade.gravarHabilidade(habilidade);        
        arquivo = new File(diretorio+"Belica", "TesteBelica.opera");
        result = arquivo.exists();
        assertEquals(expResult, result);
        assertEquals(true, arquivo.delete());
        
    }

    /**
     * Test of carregarHabilidade method, of class DAO_Habilidade.
    */
    @Test
    public void testCarregarHabilidade() throws Exception {
        System.out.println("carregarHabilidade"); 
        
        //Habilidade Fisica
        Habilidade expResult = new Habilidade(2,2,2,"TesteFisica","Fisica");        
        DAO_Habilidade.gravarHabilidade(expResult);
        Habilidade result = DAO_Habilidade.carregarHabilidade("TesteFisica", "Fisica");        
        this.comparaObjetos(expResult, result);
        File arquivo = new File(diretorio+"Fisica","TesteFisica.opera");
        assertEquals(true, arquivo.delete());
        
        //Habilidade Psiquica
        expResult = new Habilidade(2,2,2,"TestePsiquica","Psiquica");
        DAO_Habilidade.gravarHabilidade(expResult);
        result = DAO_Habilidade.carregarHabilidade("TestePsiquica","Psiquica");        
        this.comparaObjetos(expResult, result);
        arquivo = new File(diretorio+"Psiquica","TestePsiquica.opera");
        assertEquals(true, arquivo.delete());
        
        //Habilidade Belica
        expResult = new Habilidade(2,2,2,"TesteBelica","Belica");
        DAO_Habilidade.gravarHabilidade(expResult);
        result = DAO_Habilidade.carregarHabilidade("TesteBelica","Belica");        
        this.comparaObjetos(expResult, result);
        arquivo = new File(diretorio+"Belica","TesteBelica.opera");
        assertEquals(true, arquivo.delete());
        
        
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