/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.io.File;
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
public class DAO_FuncaoTest {
    
    private static String testDirectory = "C://Opera";
    
    public DAO_FuncaoTest() {
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
     * Test of criarDiretorio method, of class DAO_Funcao.
     */
    @Test
    public void testCriarDiretorio() throws Exception {
        System.out.println("criarDiretorio");
        String endereco = testDirectory;
        DAO_Funcao.criarDiretorio(endereco);
        File diretorio = new File(endereco);
        boolean expResult = diretorio.exists();
        assertEquals(expResult, true);        
    }

    /**
     * Test of removerDiretorio method, of class DAO_Funcao.
     */
    @Test
    public void testRemoverDiretorio() throws Exception {
        System.out.println("removerDiretorio");
        String endereco = testDirectory;
        DAO_Funcao.removerDiretorio(endereco);
        File diretorio = new File(endereco);
        boolean expResult = diretorio.exists();
        assertEquals(expResult, false);
        
    }

    /**
     * Test of diretorioExiste method, of class DAO_Funcao.
     */
    @Test
    public void testDiretorioExiste() throws Exception {
        System.out.println("diretorioExiste");
        String endereco = testDirectory;
        DAO_Funcao.criarDiretorio(endereco);
        File diretorio = new File(endereco);
        boolean expResult = diretorio.isDirectory();
        boolean result = DAO_Funcao.diretorioExiste(endereco);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of listarDiretorio method, of class DAO_Funcao.
     */
    @Test
    public void testListarDiretorio() {
        System.out.println("listarDiretorio");
        String endereco = "";
        String[] expResult = null;
        String[] result = DAO_Funcao.listarDiretorio(endereco);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");        
    }

    /**
     * Test of arquivoOperaExiste method, of class DAO_Funcao.
     */
    @Test
    public void testArquivoOperaExiste() {
        System.out.println("arquivoOperaExiste");
        String endereco = "";
        String nome_arquivo = "";
        boolean expResult = false;
        boolean result = DAO_Funcao.arquivoOperaExiste(endereco, nome_arquivo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarArquivosOpera method, of class DAO_Funcao.
     */
    @Test
    public void testListarArquivosOpera() {
        System.out.println("listarArquivosOpera");
        String endereco = "";
        String[] expResult = null;
        String[] result = DAO_Funcao.listarArquivosOpera(endereco);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removerArquivo method, of class DAO_Funcao.
     */
    @Test
    public void testRemoverArquivo() throws Exception {
        System.out.println("removerArquivo");
        String endereco = "";
        String nome_arquivo = "";
        DAO_Funcao.removerArquivo(endereco, nome_arquivo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of criarArquivoOpera method, of class DAO_Funcao.
     */
    @Test
    public void testCriarArquivoOpera() throws Exception {
        System.out.println("criarArquivoOpera");
        String endereco = "";
        String nomeObjeto = "";
        Object objeto = null;
        DAO_Funcao.criarArquivoOpera(endereco, nomeObjeto, objeto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sobrescreverArquivoOpera method, of class DAO_Funcao.
     */
    @Test
    public void testSobrescreverArquivoOpera() throws Exception {
        System.out.println("sobrescreverArquivoOpera");
        String endereco = "";
        String nomeObjeto = "";
        Object objeto = null;
        DAO_Funcao.sobrescreverArquivoOpera(endereco, nomeObjeto, objeto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of carregarArquivoOpera method, of class DAO_Funcao.
     */
    @Test
    public void testCarregarArquivoOpera() throws Exception {
        System.out.println("carregarArquivoOpera");
        String endereco = "";
        String nome_arquivo = "";
        Object expResult = null;
        Object result = DAO_Funcao.carregarArquivoOpera(endereco, nome_arquivo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletarArquivos method, of class DAO_Funcao.
     */
    @Test
    public void testDeletarArquivos() throws Exception {
        System.out.println("deletarArquivos");
        String endereco = "";
        DAO_Funcao.deletarArquivos(endereco);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
