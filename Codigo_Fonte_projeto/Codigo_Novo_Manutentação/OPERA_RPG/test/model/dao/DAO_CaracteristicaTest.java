/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import control.Controle_Jogo;
import java.io.File;
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
    
    private String diretorio = "C:\\Opera\\Jogos\\JUnitTest\\Caracteristicas\\";
    private String jogo = "JUnitTest";
    private String fisica = "Fisica";
    private String psiquica = "Psiquica";
    private String racial = "Racial";
    private String testeFisica = "TesteFisica";
    private String testePsiquica = "TestePsiquica";
    private String testeRacial = "TesteRacial";
    
    public DAO_CaracteristicaTest() {
    }
    
    public void comparaObjetos(Caracteristica expResult, Caracteristica result) {
        assertEquals(expResult.getCusto(), result.getCusto());
        assertEquals(expResult.getDescricao(), result.getDescricao());
        assertArrayEquals(expResult.getModificador(), result.getModificador());
        assertEquals(expResult.getNome(), result.getNome());
        assertEquals(expResult.getTipo(), result.getTipo());        
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws Exception{
        if(Controle_Jogo.jogoExiste(jogo)) {
            Controle_Jogo.apagarJogo(jogo);
            Controle_Jogo.criarJogo(jogo);            
        }else {
            Controle_Jogo.criarJogo(jogo);
        }
    }
    
    @After
    public void tearDown()throws Exception{
        //Controle_Jogo.apagarJogo(jogo);
    }

    /**
     * Test of gravarCaracteristica method, of class DAO_Caracteristica.
     */
    @Test
    public void testGravarCaracteristica() throws Exception {
        System.out.println("gravarCaracteristica");                
        Caracteristica caracteristica = new Caracteristica(testeFisica, testeFisica, fisica, 2);        
        DAO_Caracteristica.gravarCaracteristica(caracteristica);        
        File arquivo = new File(diretorio+fisica, testeFisica+".opera");
        boolean expResult = true;
        boolean result = arquivo.exists(); 
        assertEquals(expResult, result);         
        assertEquals(expResult, arquivo.delete());
                
        Caracteristica_Especifica caracteristicaEs = new Caracteristica_Especifica(testeFisica+"Es", "DescricaoEs", testeFisica+"Es", "Descricao", fisica, 2);
        DAO_Caracteristica.gravarCaracteristica(caracteristicaEs);
        arquivo = new File(diretorio+fisica, testeFisica+"Es.opera");
        expResult = true;
        result = arquivo.exists();
        assertEquals(expResult, result);         
        assertEquals(expResult, arquivo.delete());
        
        caracteristica = new Caracteristica(testePsiquica, testePsiquica, psiquica, 2);
        DAO_Caracteristica.gravarCaracteristica(caracteristica);        
        arquivo = new File(diretorio+psiquica, testePsiquica+".opera");
        expResult = true;
        result = arquivo.exists(); 
        assertEquals(expResult, result);         
        assertEquals(expResult, arquivo.delete());
        
        caracteristica = new Caracteristica(testeRacial, testeRacial, racial, 2);
        DAO_Caracteristica.gravarCaracteristica(caracteristica);        
        arquivo = new File(diretorio+racial, testeRacial+".opera");
        expResult = true;
        result = arquivo.exists(); 
        assertEquals(expResult, result);         
        assertEquals(expResult, arquivo.delete());
       
    }

    /**
     * Test of carregarCaracteristica method, of class DAO_Caracteristica.
    */ 
    @Test
    public void testCarregarCaracteristica() throws Exception {
        System.out.println("carregarCaracteristica");
        
        Caracteristica expResult = new Caracteristica(testeFisica, testeFisica, fisica, 2);        
        DAO_Caracteristica.gravarCaracteristica(expResult);
        Caracteristica result = DAO_Caracteristica.carregarCaracteristica(testeFisica, fisica);        
        this.comparaObjetos(expResult, result);
        File arquivo = new File(diretorio+fisica,testeFisica+".opera");
        assertEquals(true, arquivo.delete());
        
        expResult = new Caracteristica(testePsiquica, testePsiquica, psiquica, 2);        
        DAO_Caracteristica.gravarCaracteristica(expResult);
        result = DAO_Caracteristica.carregarCaracteristica(testePsiquica, psiquica);        
        this.comparaObjetos(expResult, result);
        arquivo = new File(diretorio+psiquica,testePsiquica+".opera");
        assertEquals(true, arquivo.delete());
        
        expResult = new Caracteristica(testeRacial, testeRacial, racial, 2);        
        DAO_Caracteristica.gravarCaracteristica(expResult);
        result = DAO_Caracteristica.carregarCaracteristica(testeRacial, racial);        
        this.comparaObjetos(expResult, result);
        arquivo = new File(diretorio+racial,testeRacial+".opera");
        assertEquals(true, arquivo.delete());
    }

    /**
     * Test of carregarCaracteristica_Especifica method, of class DAO_Caracteristica.
    */ 
    @Test
    public void testCarregarCaracteristica_Especifica() throws Exception {
        System.out.println("carregarCaracteristica_Especifica");
        
        Caracteristica_Especifica expResult = new Caracteristica_Especifica(testeFisica, "DescricaoEs", testeFisica, "Descricao", fisica, 2);
        DAO_Caracteristica.gravarCaracteristica(expResult);
        Caracteristica_Especifica result = DAO_Caracteristica.carregarCaracteristica_Especifica(testeFisica, fisica);
        this.comparaObjetos(expResult, result);
        File arquivo = new File(diretorio+fisica,testeFisica+".opera");
        assertEquals(true, arquivo.delete());
        
        expResult = new Caracteristica_Especifica(testePsiquica, "DescricaoEs", testePsiquica, "Descricao", psiquica, 2);
        DAO_Caracteristica.gravarCaracteristica(expResult);
        result = DAO_Caracteristica.carregarCaracteristica_Especifica(testePsiquica, psiquica);
        this.comparaObjetos(expResult, result);
        arquivo = new File(diretorio+psiquica,testePsiquica+".opera");
        assertEquals(true, arquivo.delete());
        
        expResult = new Caracteristica_Especifica(testeRacial, "DescricaoEs", testeRacial, "Descricao", racial, 2);
        DAO_Caracteristica.gravarCaracteristica(expResult);
        result = DAO_Caracteristica.carregarCaracteristica_Especifica(testeRacial, racial);
        this.comparaObjetos(expResult, result);
        arquivo = new File(diretorio+racial,testeRacial+".opera");
        assertEquals(true, arquivo.delete());
    }

    /**
     * Test of CaracteristicaExiste method, of class DAO_Caracteristica.
    */ 
    @Test
    public void testCaracteristicaExiste()throws Exception{
        System.out.println("CaracteristicaExiste");
        
        Caracteristica caracteristica = new Caracteristica(testeFisica, testeFisica, fisica, 2);        
        DAO_Caracteristica.gravarCaracteristica(caracteristica);
        File arquivo = new File(diretorio+fisica, testeFisica+".opera");
        boolean expResult;
        boolean result;
        expResult = arquivo.exists();        
        result = DAO_Caracteristica.CaracteristicaExiste(testeFisica,fisica);
        assertEquals(expResult, result);
        assertEquals(true, arquivo.delete());
        result = DAO_Caracteristica.CaracteristicaExiste(testeFisica,fisica);
        assertEquals(false,result);
        
        Caracteristica_Especifica caracteristicaEs = new Caracteristica_Especifica(testeFisica+"Es", "DescricaoEs", testeFisica+"Es", "Descricao", fisica, 2);
        DAO_Caracteristica.gravarCaracteristica(caracteristicaEs);
        arquivo = new File(diretorio+fisica, testeFisica+"Es.opera");
        expResult = arquivo.exists();        
        result = DAO_Caracteristica.CaracteristicaExiste(testeFisica+"Es",fisica);
        assertEquals(expResult, result);
        assertEquals(true, arquivo.delete());
        result = DAO_Caracteristica.CaracteristicaExiste(testeFisica+"Es",fisica);
        assertEquals(false,result);
                
        caracteristica = new Caracteristica(testePsiquica, testePsiquica, psiquica, 2);        
        DAO_Caracteristica.gravarCaracteristica(caracteristica);
        arquivo = new File(diretorio+psiquica, testePsiquica+".opera");        
        expResult = arquivo.exists();        
        result = DAO_Caracteristica.CaracteristicaExiste(testePsiquica,psiquica);
        assertEquals(expResult, result);
        assertEquals(true, arquivo.delete());
        result = DAO_Caracteristica.CaracteristicaExiste(testePsiquica,psiquica);
        assertEquals(false,result);
        
        caracteristica = new Caracteristica(testeRacial, testeRacial, racial, 2);        
        DAO_Caracteristica.gravarCaracteristica(caracteristica);
        arquivo = new File(diretorio+racial, testeRacial+".opera");        
        expResult = arquivo.exists();        
        result = DAO_Caracteristica.CaracteristicaExiste(testeRacial,racial);
        assertEquals(expResult, result);
        assertEquals(true, arquivo.delete());
        result = DAO_Caracteristica.CaracteristicaExiste(testeRacial,racial);
        assertEquals(false,result);
        
    }

    /**
     * Test of removerCaracteristica method, of class DAO_Caracteristica.
    */ 
    @Test
    public void testRemoverCaracteristica() throws Exception {
        System.out.println("removerCaracteristica");
        
        boolean expResult = false;
        boolean result;
        Caracteristica caracteristica = new Caracteristica(testeFisica, testeFisica, fisica, 2);        
        DAO_Caracteristica.gravarCaracteristica(caracteristica);
        File arquivo = new File(diretorio+fisica, testeFisica+".opera");        
        assertEquals(true,arquivo.exists());
        DAO_Caracteristica.removerCaracteristica(testeFisica, fisica);        
        result = arquivo.exists();
        assertEquals(expResult,result);
        
        caracteristica = new Caracteristica(testePsiquica, testePsiquica, psiquica, 2);        
        DAO_Caracteristica.gravarCaracteristica(caracteristica);
        arquivo = new File(diretorio+psiquica, testePsiquica+".opera");        
        assertEquals(true,arquivo.exists());
        DAO_Caracteristica.removerCaracteristica(testePsiquica, psiquica);        
        result = arquivo.exists();
        assertEquals(expResult,result);
        
        caracteristica = new Caracteristica(testeRacial, testeRacial, racial, 2);        
        DAO_Caracteristica.gravarCaracteristica(caracteristica);
        arquivo = new File(diretorio+racial, testeRacial+".opera");        
        assertEquals(true,arquivo.exists());
        DAO_Caracteristica.removerCaracteristica(testeRacial, racial);        
        result = arquivo.exists();
        assertEquals(expResult,result);        
    }
    
    /**
     * Test of removerTodasHabilidades method, of class DAO_Habilidade.
    */ 
    @Test    
    public void testRemoverTodasCaracteristicas() throws Exception {
        System.out.println("removerTodasCaracteristicas");
        Caracteristica caracteristica1 = new Caracteristica(testeFisica+"1", testeFisica+"1", fisica, 2);
        Caracteristica caracteristica2 = new Caracteristica(testeFisica+"2", testeFisica+"2", fisica, 2);
        DAO_Caracteristica.gravarCaracteristica(caracteristica1);
        DAO_Caracteristica.gravarCaracteristica(caracteristica2);
        File arquivo = new File(diretorio+fisica);
        String[] list = arquivo.list();
        assertEquals(2,list.length);
        DAO_Caracteristica.removerTodasCaracteristicas(fisica);
        list = arquivo.list();
        assertEquals(0,list.length);
        
        caracteristica1 = new Caracteristica(testePsiquica+"1", testePsiquica+"1", psiquica, 2);
        caracteristica2 = new Caracteristica(testePsiquica+"2", testePsiquica+"2", psiquica, 2);
        DAO_Caracteristica.gravarCaracteristica(caracteristica1);
        DAO_Caracteristica.gravarCaracteristica(caracteristica2);        
        arquivo = new File(diretorio+psiquica);        
        list = arquivo.list();
        assertEquals(2,list.length);
        DAO_Caracteristica.removerTodasCaracteristicas(psiquica);
        list = arquivo.list();        
        assertEquals(0,list.length);
        
        caracteristica1 = new Caracteristica(testeRacial+"1", testeRacial+"1", racial, 2);
        caracteristica2 = new Caracteristica(testeRacial+"2", testeRacial+"2", racial, 2);
        DAO_Caracteristica.gravarCaracteristica(caracteristica1);
        DAO_Caracteristica.gravarCaracteristica(caracteristica2);
        arquivo = new File(diretorio+racial);
        list = arquivo.list();
        assertEquals(2,list.length);
        DAO_Caracteristica.removerTodasCaracteristicas(racial);
        list = arquivo.list();
        assertEquals(0,list.length);
    }

    /**
     * Test of listarCaracteristicas method, of class DAO_Caracteristica.
    */ 
    @Test
    public void testListarCaracteristicas() throws Exception{
        System.out.println("listarCaracteristicas");
        Caracteristica caracteristica1 = new Caracteristica(testeFisica+"1", testeFisica+"1", fisica, 2);
        Caracteristica caracteristica2 = new Caracteristica(testeFisica+"2", testeFisica+"2", fisica, 2);
        DAO_Caracteristica.gravarCaracteristica(caracteristica1);
        DAO_Caracteristica.gravarCaracteristica(caracteristica2);
        File arquivo = new File(diretorio+fisica);                
        String[] result = DAO_Caracteristica.listarCaracteristicas(fisica);
        assertEquals(2, result.length);
        boolean expResult;
        expResult = result[0].equalsIgnoreCase(testeFisica+"1") || 
                            result[1].equalsIgnoreCase(testeFisica+"2");
        assertTrue(expResult);
        expResult = result[0].equalsIgnoreCase(testeFisica+"1") || 
                    result[1].equalsIgnoreCase(testeFisica+"2");
        assertTrue(expResult);
        
        caracteristica1 = new Caracteristica(testePsiquica+"1", testePsiquica+"1", psiquica, 2);
        caracteristica2 = new Caracteristica(testePsiquica+"2", testePsiquica+"2", psiquica, 2);
        DAO_Caracteristica.gravarCaracteristica(caracteristica1);
        DAO_Caracteristica.gravarCaracteristica(caracteristica2);
        arquivo = new File(diretorio+psiquica);                
        result = DAO_Caracteristica.listarCaracteristicas(psiquica);
        assertEquals(2, result.length);        
        expResult = result[0].equalsIgnoreCase(testePsiquica+"1") || 
                            result[1].equalsIgnoreCase(testePsiquica+"2");
        assertTrue(expResult);
        expResult = result[0].equalsIgnoreCase(testePsiquica+"1") || 
                    result[1].equalsIgnoreCase(testePsiquica+"2");
        assertTrue(expResult);
        
        caracteristica1 = new Caracteristica(testeRacial+"1", testeRacial+"1", racial, 2);
        caracteristica2 = new Caracteristica(testeRacial+"2", testeRacial+"2", racial, 2);
        DAO_Caracteristica.gravarCaracteristica(caracteristica1);
        DAO_Caracteristica.gravarCaracteristica(caracteristica2);
        arquivo = new File(diretorio+racial);                
        result = DAO_Caracteristica.listarCaracteristicas(racial);
        assertEquals(2, result.length);        
        expResult = result[0].equalsIgnoreCase(testeRacial+"1") || 
                            result[1].equalsIgnoreCase(testeRacial+"2");
        assertTrue(expResult);
        expResult = result[0].equalsIgnoreCase(testeRacial+"1") || 
                    result[1].equalsIgnoreCase(testeRacial+"2");
        assertTrue(expResult);
    }
}
