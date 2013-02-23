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
    private String fisica = "Fisica";
    private String psiquica = "Psiquica";
    private String belica = "Belica";
    private String testeFisica = "TesteFisica";
    private String testePsiquica = "TestePsiquica";
    private String testeBelica = "TesteBelica";
    
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
        Habilidade habilidade = new Habilidade(2,2,2, testeFisica,fisica);
        DAO_Habilidade.gravarHabilidade(habilidade);        
        File arquivo = new File(diretorio+fisica, testeFisica+".opera");
        boolean expResult = true;
        boolean result = arquivo.exists(); 
        assertEquals(expResult, result);         
        assertEquals(expResult, arquivo.delete());
                
        habilidade = new Habilidade(2,2,2,testePsiquica,psiquica);
        DAO_Habilidade.gravarHabilidade(habilidade);        
        arquivo = new File(diretorio+psiquica, testePsiquica+".opera");
        result = arquivo.exists();
        assertEquals(expResult, result);
        assertEquals(expResult, arquivo.delete());
                        
        habilidade = new Habilidade(2,2,2,testeBelica,belica);
        DAO_Habilidade.gravarHabilidade(habilidade);        
        arquivo = new File(diretorio+belica, testeBelica+".opera");
        result = arquivo.exists();
        assertEquals(expResult, result);
        assertEquals(expResult, arquivo.delete());
        
    }

    /**
     * Test of carregarHabilidade method, of class DAO_Habilidade.
    */
    @Test
    public void testCarregarHabilidade() throws Exception {
        System.out.println("carregarHabilidade"); 
        
        //Habilidade Fisica
        Habilidade expResult = new Habilidade(2,2,2,testeFisica,fisica);        
        DAO_Habilidade.gravarHabilidade(expResult);
        Habilidade result = DAO_Habilidade.carregarHabilidade(testeFisica, fisica);        
        this.comparaObjetos(expResult, result);
        File arquivo = new File(diretorio+fisica,testeFisica+".opera");
        assertEquals(true, arquivo.delete());
        
        //Habilidade Psiquica
        expResult = new Habilidade(2,2,2,testePsiquica,psiquica);
        DAO_Habilidade.gravarHabilidade(expResult);
        result = DAO_Habilidade.carregarHabilidade(testePsiquica,psiquica);        
        this.comparaObjetos(expResult, result);
        arquivo = new File(diretorio+psiquica,testePsiquica+".opera");
        assertEquals(true, arquivo.delete());
        
        //Habilidade Belica
        expResult = new Habilidade(2,2,2,testeBelica,belica);
        DAO_Habilidade.gravarHabilidade(expResult);
        result = DAO_Habilidade.carregarHabilidade(testeBelica,belica);        
        this.comparaObjetos(expResult, result);
        arquivo = new File(diretorio+belica,testeBelica+".opera");
        assertEquals(true, arquivo.delete());
        
        
    }

    /**
     * Test of HabilidadeExiste method, of class DAO_Habilidade.
    */ 
    @Test
    public void testHabilidadeExiste() throws Exception {
        System.out.println("HabilidadeExiste");
        Habilidade habilidade = new Habilidade(2,2,2,testeFisica,fisica);
        DAO_Habilidade.gravarHabilidade(habilidade);
        File arquivo = new File(diretorio+fisica, testeFisica+".opera");
        boolean expResult;
        boolean result;
        expResult = arquivo.exists();        
        result = DAO_Habilidade.HabilidadeExiste(testeFisica,fisica);
        assertEquals(expResult, result);
        assertEquals(true, arquivo.delete());
        result = DAO_Habilidade.HabilidadeExiste(testeFisica,fisica);
        assertEquals(false,result);
        
        habilidade = new Habilidade(2,2,2,testePsiquica, psiquica);
        DAO_Habilidade.gravarHabilidade(habilidade);
        arquivo = new File(diretorio+psiquica, testePsiquica+".opera");
        expResult = arquivo.exists();
        result = DAO_Habilidade.HabilidadeExiste(testePsiquica,psiquica);
        assertEquals(expResult, result);
        assertEquals(true, arquivo.delete());
        result = DAO_Habilidade.HabilidadeExiste(testePsiquica,psiquica);
        assertEquals(false,result);
        
        habilidade = new Habilidade(2,2,2,testeBelica, belica);
        DAO_Habilidade.gravarHabilidade(habilidade);
        arquivo = new File(diretorio+belica, testeBelica+".opera");
        expResult = arquivo.exists();
        result = DAO_Habilidade.HabilidadeExiste(testeBelica,belica);
        assertEquals(expResult, result);
        assertEquals(true, arquivo.delete());
        result = DAO_Habilidade.HabilidadeExiste(testeBelica,belica);
        assertEquals(false,result);
        
    }

    /**
     * Test of removerHabilidade method, of class DAO_Habilidade.
    */ 
    @Test
    public void testRemoverHabilidade() throws Exception {
        System.out.println("removerHabilidade");
        boolean expResult;
        boolean result;
        Habilidade habilidade = new Habilidade(2,2,2,testeFisica,fisica);
        DAO_Habilidade.gravarHabilidade(habilidade);
        File arquivo = new File(diretorio+fisica, testeFisica+".opera");        
        assertEquals(true,arquivo.exists());
        DAO_Habilidade.removerHabilidade(testeFisica, fisica);
        expResult = false;
        result = arquivo.exists();
        assertEquals(expResult,result);
       
        habilidade = new Habilidade(2,2,2,testePsiquica,psiquica);
        DAO_Habilidade.gravarHabilidade(habilidade);
        arquivo = new File(diretorio+psiquica, testePsiquica+".opera");
        assertEquals(true,arquivo.exists());
        DAO_Habilidade.removerHabilidade(testePsiquica, psiquica);        
        result = arquivo.exists();
        assertEquals(expResult,result);
        
        habilidade = new Habilidade(2,2,2,testeBelica,belica);
        DAO_Habilidade.gravarHabilidade(habilidade);
        arquivo = new File(diretorio+belica, testeBelica+".opera");
        assertEquals(true,arquivo.exists());
        DAO_Habilidade.removerHabilidade(testeBelica, belica);        
        result = arquivo.exists();
        assertEquals(expResult,result);
        
    }

    /**
     * Test of removerTodasHabilidades method, of class DAO_Habilidade.
    */ 
    @Test    
    public void testRemoverTodasHabilidades() throws Exception {
        System.out.println("removerTodasHabilidades");
        Habilidade habilidade1 = new Habilidade(2,2,2,testeFisica,fisica);
        Habilidade habilidade2 = new Habilidade(3,3,3,testeFisica+"2",fisica);
        DAO_Habilidade.gravarHabilidade(habilidade1);
        DAO_Habilidade.gravarHabilidade(habilidade2);
        File arquivo = new File(diretorio+fisica);
        String[] list = arquivo.list();
        assertEquals(2,list.length);
        DAO_Habilidade.removerTodasHabilidades(fisica);
        list = arquivo.list();
        assertEquals(0,list.length);
        
        habilidade1 = new Habilidade(2,2,2,testePsiquica,psiquica);
        habilidade2 = new Habilidade(3,3,3,testePsiquica+"2",psiquica);
        DAO_Habilidade.gravarHabilidade(habilidade1);
        DAO_Habilidade.gravarHabilidade(habilidade2);
        arquivo = new File(diretorio+psiquica);
        list = arquivo.list();
        assertEquals(2,list.length);
        DAO_Habilidade.removerTodasHabilidades(psiquica);
        list = arquivo.list();
        assertEquals(0,list.length);
        
        habilidade1 = new Habilidade(2,2,2,testeBelica,belica);
        habilidade2 = new Habilidade(3,3,3,testeBelica+"2",belica);
        DAO_Habilidade.gravarHabilidade(habilidade1);
        DAO_Habilidade.gravarHabilidade(habilidade2);
        arquivo = new File(diretorio+belica);
        list = arquivo.list();
        assertEquals(2,list.length);
        DAO_Habilidade.removerTodasHabilidades(belica);
        list = arquivo.list();
        assertEquals(0,list.length);
    }

    /**
     * Test of listarHabilidades method, of class DAO_Habilidade.
    */ 
    @Test
    public void testListarHabilidades() throws Exception {
        System.out.println("listarHabilidades");
        Habilidade habilidade1 = new Habilidade(2,2,2,testeFisica,fisica);
        Habilidade habilidade2 = new Habilidade(3,3,3,testeFisica+"2",fisica);
        DAO_Habilidade.gravarHabilidade(habilidade1);
        DAO_Habilidade.gravarHabilidade(habilidade2);
        File arquivo = new File(diretorio+fisica);                
        String[] result = DAO_Habilidade.listarHabilidades(fisica);
        assertEquals(2, result.length);
        boolean expResult;
        expResult = result[0].equalsIgnoreCase(testeFisica) || 
                            result[1].equalsIgnoreCase(testeFisica);
        assertTrue(expResult);
        expResult = result[0].equalsIgnoreCase(testeFisica+"2") || 
                    result[1].equalsIgnoreCase(testeFisica+"2");
        assertTrue(expResult);
        
        habilidade1 = new Habilidade(2,2,2,testePsiquica,psiquica);
        habilidade2 = new Habilidade(3,3,3,testePsiquica+"2",psiquica);
        DAO_Habilidade.gravarHabilidade(habilidade1);
        DAO_Habilidade.gravarHabilidade(habilidade2);
        arquivo = new File(diretorio+psiquica);                
        result = DAO_Habilidade.listarHabilidades(psiquica);
        assertEquals(2, result.length);        
        expResult = result[0].equalsIgnoreCase(testePsiquica) || 
                            result[1].equalsIgnoreCase(testePsiquica);
        assertTrue(expResult);
        expResult = result[0].equalsIgnoreCase(testePsiquica+"2") || 
                    result[1].equalsIgnoreCase(testePsiquica+"2");
        assertTrue(expResult);
        
        habilidade1 = new Habilidade(2,2,2,testeBelica,belica);
        habilidade2 = new Habilidade(3,3,3,testeBelica+"2",belica);
        DAO_Habilidade.gravarHabilidade(habilidade1);
        DAO_Habilidade.gravarHabilidade(habilidade2);
        arquivo = new File(diretorio+belica);                
        result = DAO_Habilidade.listarHabilidades(belica);
        assertEquals(2, result.length);        
        expResult = result[0].equalsIgnoreCase(testeBelica) || 
                            result[1].equalsIgnoreCase(testeBelica);
        assertTrue(expResult);
        expResult = result[0].equalsIgnoreCase(testeBelica+"2") || 
                    result[1].equalsIgnoreCase(testeBelica+"2");
        assertTrue(expResult);
    }
}