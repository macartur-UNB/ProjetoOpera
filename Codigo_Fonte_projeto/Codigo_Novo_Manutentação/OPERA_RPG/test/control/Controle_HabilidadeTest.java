/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.classes.Habilidade;
import model.dao.DAO_Habilidade;
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
public class Controle_HabilidadeTest {
    
    public Controle_HabilidadeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp()throws Exception{
        if(!Controle_Jogo.jogoExiste("JunitTest")){
            Controle_Jogo.criarJogo("JUnitTest");
        }
    }
    @After
    public void tearDown()throws Exception{
        Controle_Jogo.apagarJogo("JUnitTest");
        
    }
        int teste = 7;
        int nivel = 3;
        int custo = 5;
        String nome = "NOmeHabilidade";
        String tipo = "Fisica";
    /**
     * Test of cadHabilidade method, of class Controle_Habilidade.
     */
    @Test
    public void testCadHabilidade() throws Exception {
        System.out.println("cadHabilidade");
        nome = "Habilidade1";
        tipo = "Fisica";
        Controle_Habilidade.cadHabilidade(teste, nivel, custo, nome, tipo);
        if(!Controle_Habilidade.HabilidadeExiste(nome))
        {
            fail("Habilidade nao cadastrada");
        }else{
            Controle_Habilidade.removeHabilidadeFisica(nome);
        }
        
    }

    /**
     * Test of encontrarHabilidade method, of class Controle_Habilidade.
     */
    @Test
    public void testEncontrarHabilidade() throws Exception {
        System.out.println("encontrarHabilidade");
        
        nome = "Habilidade1";
        tipo = "Fisica";
        Controle_Habilidade.cadHabilidade(teste, nivel, custo, nome, tipo);
        Habilidade result = Controle_Habilidade.encontrarHabilidade(nome, tipo);
        Controle_Habilidade.removeHabilidadeFisica(nome);
        
        nome = "Habilidade2";
        tipo = "Psiquica";  
        Controle_Habilidade.cadHabilidade(teste, nivel, custo, nome, tipo);
        result = Controle_Habilidade.encontrarHabilidade(nome, tipo);
        Controle_Habilidade.removeHabilidadePsiquica(nome);
       
        nome = "Habilidade3";
        tipo = "Belica";      
        Controle_Habilidade.cadHabilidade(teste, nivel, custo, nome, tipo);
        result = Controle_Habilidade.encontrarHabilidade(nome, tipo);
        Controle_Habilidade.removeHabilidadeBelica(nome);
        
         
    }

    /**
     * Test of HabilidadeExiste method, of class Controle_Habilidade.
     */
    @Test
    public void testHabilidadeExiste_String_String()throws Exception{
        System.out.println("HabilidadeExiste");
        nome = "JUnitTest";
        tipo = "Fisica";
        boolean expResult = true;
        Controle_Habilidade.cadHabilidade(teste, nivel, custo, nome, tipo);
        boolean result = Controle_Habilidade.HabilidadeExiste(nome, tipo);
        assertEquals(expResult, result);
        Controle_Habilidade.removeHabilidadeFisica(nome);
    }

    /**
     * Test of getTipoHabildiade method, of class Controle_Habilidade.
     */
    @Test
    public void testGetTipoHabildiade() throws Exception {
        System.out.println("getTipoHabildiade");
        nome = "JUnitTest";
        tipo="Belica";
        Controle_Habilidade.cadHabilidade(teste, nivel, custo, nome, tipo);
        String expResult = "Belica";
        String result = Controle_Habilidade.getTipoHabildiade(nome);
        assertEquals(expResult, result);
        Controle_Habilidade.removeHabilidadeBelica(nome);
    }

    /**
     * Test of removeHabilidadeFisica method, of class Controle_Habilidade.
     */
    @Test
    public void testRemoveHabilidadeFisica() throws Exception {
        System.out.println("removeHabilidadeFisica");
        nome = "JUnitTest";
        tipo="Fisica";
        Controle_Habilidade.cadHabilidade(teste, nivel, custo, nome, tipo);
        if(Controle_Habilidade.HabilidadeExiste(nome)){
            Controle_Habilidade.removeHabilidadeFisica(nome);
            if(Controle_Habilidade.HabilidadeExiste(nome)){
                fail("Não foi possivel remover habilidade");
            }
        }else{
            fail("Não pode ser criada a habilidade Remover Habilidade Fisica");
        }
        
    }

    /**
     * Test of removeHabilidadeBelica method, of class Controle_Habilidade.
     */
    @Test
    public void testRemoveHabilidadeBelica() throws Exception {
        System.out.println("removeHabilidadeBelica");
        nome = "JUnitTest";
        tipo="Belica";
        Controle_Habilidade.cadHabilidade(teste, nivel, custo, nome, tipo);
        if(Controle_Habilidade.HabilidadeExiste(nome)){
            Controle_Habilidade.removeHabilidadeBelica(nome);
            if(Controle_Habilidade.HabilidadeExiste(nome)){
                fail("Não foi possivel remover habilidade");
            }
        }else{
            fail("Não pode ser criada a habilidade Remover Habilidade Fisica");
        }
        
    }

    /**
     * Test of removeHabilidadePsiquica method, of class Controle_Habilidade.
     */
    @Test
    public void testRemoveHabilidadePsiquica() throws Exception {
        System.out.println("removeHabilidadePsiquica");
        nome = "JUnitTest";
        tipo="Psiquica";
        Controle_Habilidade.cadHabilidade(teste, nivel, custo, nome, tipo);
        if(Controle_Habilidade.HabilidadeExiste(nome)){
            Controle_Habilidade.removeHabilidadePsiquica(nome);
        }else{
            fail("Não pode ser criada a habilidade Remover Habilidade Fisica");
        }
        if(Controle_Habilidade.HabilidadeExiste(nome)){
                fail("Não foi possivel remover habilidade");
                DAO_Habilidade.removerTodasHabilidades(tipo);
        }
    }

    /**
     * Test of removeTodasHabilidadesFisicas method, of class Controle_Habilidade.
     */
    @Test
    public void testRemoveTodasHabilidadesFisicas() throws Exception {
        System.out.println("removeTodasHabilidadesFisicas");
        nome = "Habilidade1";
        tipo="Fisica";
        Controle_Habilidade.cadHabilidade(teste, nivel, custo, nome, tipo);
        nome = "Habilidade2";
        Controle_Habilidade.cadHabilidade(teste, nivel, custo, nome, tipo);
        nome = "Habilidade3";
        Controle_Habilidade.cadHabilidade(teste, nivel, custo, nome, tipo);
        Controle_Habilidade.removeTodasHabilidadesFisicas();
        if(Controle_Habilidade.HabilidadeExiste("Habilidade1")||
           Controle_Habilidade.HabilidadeExiste("Habilidade2")||
           Controle_Habilidade.HabilidadeExiste("Habilidade3"))
        {
                fail("Ao menos uma habilidade fisica não foi removida");
        }
    }

    /**
     * Test of removeTodasHabilidadesPsiquicas method, of class Controle_Habilidade.
     */
    @Test
    public void testRemoveTodasHabilidadesPsiquicas() throws Exception {
        System.out.println("removeTodasHabilidadesPsiquicas");
        
        nome = "Habilidade1";
        tipo="Psiquica";
        Controle_Habilidade.cadHabilidade(teste, nivel, custo, nome, tipo);
        nome = "Habilidade2";
        Controle_Habilidade.cadHabilidade(teste, nivel, custo, nome, tipo);
        nome = "Habilidade3";
        Controle_Habilidade.cadHabilidade(teste, nivel, custo, nome, tipo);
        Controle_Habilidade.removeTodasHabilidadesPsiquicas();
        
        if(Controle_Habilidade.HabilidadeExiste("Habilidade1")||
           Controle_Habilidade.HabilidadeExiste("Habilidade2")||
           Controle_Habilidade.HabilidadeExiste("Habilidade3"))
        {
                fail("Ao menos uma habilidade psiquica não foi removida");
        }
    }

    /**
     * Test of removeTodasHabilidadesBelicas method, of class Controle_Habilidade.
     */
    @Test
    public void testRemoveTodasHabilidadesBelicas() throws Exception {
        System.out.println("removeTodasHabilidadesBelicas");
        
        nome = "Habilidade1";
        tipo="Belica";
        Controle_Habilidade.cadHabilidade(teste, nivel, custo, nome, tipo);
        nome = "Habilidade2";
        Controle_Habilidade.cadHabilidade(teste, nivel, custo, nome, tipo);
        nome = "Habilidade3";
        Controle_Habilidade.cadHabilidade(teste, nivel, custo, nome, tipo);
        
        Controle_Habilidade.removeTodasHabilidadesBelicas();
        
        if(Controle_Habilidade.HabilidadeExiste("Habilidade1")||
           Controle_Habilidade.HabilidadeExiste("Habilidade2")||
           Controle_Habilidade.HabilidadeExiste("Habilidade3"))
        {
                fail("Ao menos uma habilidade belica não foi removida");
        }
    }

    /**
     * Test of removeTodasHabilidades method, of class Controle_Habilidade.
     */
    @Test
    public void testRemoveTodasHabilidades() throws Exception {
        System.out.println("removeTodasHabilidades");
        nome = "Habilidade1";
        tipo="Belica";
        Controle_Habilidade.cadHabilidade(teste, nivel, custo, nome, tipo);
        nome = "Habilidade2";
        tipo = "Psiquica";
        Controle_Habilidade.cadHabilidade(teste, nivel, custo, nome, tipo);
        nome = "Habilidade3";
        tipo="Fisica";
        Controle_Habilidade.cadHabilidade(teste, nivel, custo, nome, tipo);
        
        Controle_Habilidade.removeTodasHabilidades();
        
        if(Controle_Habilidade.HabilidadeExiste("Habilidade1")){
                     fail("A habilidade belica não foi removida de todas as habilidades");
        }
        if(Controle_Habilidade.HabilidadeExiste("Habilidade2")){
             fail("Ao menos uma habilidade psiquica não foi removida de todas as habilidades");
        }
        if(Controle_Habilidade.HabilidadeExiste("Habilidade3"))
        {
                fail("Ao menos uma habilidade fisica  não foi removida de todas as habilidades");
        }
    }

    /**
     * Test of listarHabilidadeFisicas method, of class Controle_Habilidade.
     */
    @Test
    public void testListarHabilidadeFisicas() {
        System.out.println("listarHabilidadeFisicas");
        String[] expResult = null;
        String[] result = Controle_Habilidade.listarHabilidadeFisicas();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of listarHabilidadesPsiquicas method, of class Controle_Habilidade.
     */
    @Test
    public void testListarHabilidadesPsiquicas() {
        System.out.println("listarHabilidadesPsiquicas");
        String[] expResult = null;
        String[] result = Controle_Habilidade.listarHabilidadesPsiquicas();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of listarHabilidadesBelicas method, of class Controle_Habilidade.
     */
    @Test
    public void testListarHabilidadesBelicas() {
        System.out.println("listarHabilidadesBelicas");
        String[] expResult = null;
        String[] result = Controle_Habilidade.listarHabilidadesBelicas();
        assertArrayEquals(expResult, result);
    }
}
