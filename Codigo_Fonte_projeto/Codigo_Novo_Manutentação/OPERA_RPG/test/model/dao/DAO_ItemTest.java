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
    private int[] testeAtributos = {2,2,2,2,2,2,2,2};
    private int preco = 2;
    
    
    public DAO_ItemTest() {
    }
    
    public void comparaItemGenerico(Item expResult, Item result) {
        assertArrayEquals(expResult.getBonus_atributo(), result.getBonus_atributo());
        assertEquals(expResult.getDescricao(), result.getDescricao());
        assertEquals(expResult.getHabilidade_Necessaria(), result.getHabilidade_Necessaria());
        assertEquals(expResult.getNome(), result.getNome());
        assertEquals(expResult.getPreco(), result.getPreco());        
    }
    
    public void comparaItemCorpo(Arma_Corpo_A_Corpo expResult, Arma_Corpo_A_Corpo result) {
        Dado expDado = expResult.getDano();
        Dado resultDado = result.getDano();
        
        assertEquals(expResult.getAparo(), result.getAparo());
        assertArrayEquals(expResult.getBonus_atributo(), result.getBonus_atributo());
        assertEquals(expDado.getLados(), resultDado.getLados());
        assertEquals(expDado.getRolagem(), resultDado.getRolagem());
        assertEquals(expResult.getDanoAdicional(), result.getDanoAdicional());
        assertEquals(expResult.getDescricao(), result.getDescricao());
        assertEquals(expResult.getEsquiva(), result.getEsquiva());
        assertEquals(expResult.getGolpe(), result.getGolpe());
        assertEquals(expResult.getHabilidade_Necessaria(), result.getHabilidade_Necessaria());
        assertEquals(expResult.getNome(), result.getNome());
        assertEquals(expResult.getPreco(), result.getPreco());
    }
    
    public void comparaItemDistancia(Arma_A_Distancia expResult, Arma_A_Distancia result) {
        Dado expDado = expResult.getDano();
        Dado resultDado = result.getDano(); 
        
        assertArrayEquals(expResult.getBonus_atributo(), result.getBonus_atributo());
        assertEquals(expResult.getCadencia(), result.getCadencia());
        assertEquals(expDado.getLados(), resultDado.getLados());
        assertEquals(expDado.getRolagem(), resultDado.getRolagem());
        assertEquals(expResult.getDanoAdicional(), result.getDanoAdicional());
        assertEquals(expResult.getDescricao(), result.getDescricao());
        assertEquals(expResult.getHabilidade_Necessaria(), result.getHabilidade_Necessaria());
        assertEquals(expResult.getNome(), result.getNome());
        assertEquals(expResult.getPreco(), result.getPreco());
        assertEquals(expResult.getTiro_Mirado(), result.getTiro_Mirado());
        assertEquals(expResult.getTiro_Rapido(), result.getTiro_Rapido());
    }
    
    public void comparaArmadura(Armadura expResult, Armadura result) {
        assertEquals(expResult.getAbsorcao_Distancia(), result.getAbsorcao_Distancia());
        assertEquals(expResult.getAbsorcao_CorpoACorpo(), result.getAbsorcao_CorpoACorpo());
        assertArrayEquals(expResult.getBonus_atributo(), result.getBonus_atributo());
        assertEquals(expResult.getDescricao(), result.getDescricao());
        assertEquals(expResult.getHabilidade_Necessaria(), result.getHabilidade_Necessaria());
        assertEquals(expResult.getNome(), result.getNome());
        assertEquals(expResult.getPenalidade(), result.getPenalidade());
        assertEquals(expResult.getPreco(), result.getPreco());
        assertEquals(expResult.getRegiao_Do_Corpo(), result.getRegiao_Do_Corpo());
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
        DAO_Jogo.deletarJogo(jogo);
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
        Arma_Corpo_A_Corpo arma = new Arma_Corpo_A_Corpo("NomeArmaCorpo", "Descricao",dado, 2, 2, 2, 2, true, testeAtributos, preco, "TesteFisica");
        DAO_Item.gravarArma_Corpo_A_Corpo(arma);       
        File arquivo = new File(diretorio+armas+"\\"+armasCorpo, "NomeArmaCorpo.opera");
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
        Arma_Corpo_A_Corpo arma = new Arma_Corpo_A_Corpo("NomeArmaCorpo", "Descricao", dado, 2, 2, 2, 2, true, testeAtributos, preco, "TesteFisica");
        DAO_Item.gravarArma_Corpo_A_Corpo(arma);       
        File arquivo = new File(diretorio+armas+"\\"+armasCorpo, "NomeArmaCorpo.opera");        
        assertEquals(true, arquivo.exists());
        DAO_Item.removerArma_Corpo_A_Corpo("NomeArmaCorpo");
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
    */ 
    @Test
    public void testEncontrarItemGenerico() throws Exception {
        System.out.println("encontrarItemGenerico");       
        Item expResult = new Item("NomeItemGenerico", "Descricao", true, testeAtributos,preco, "TesteFisica");
        DAO_Item.gravarItem(expResult);        
        Item result = DAO_Item.encontrarItemGenerico("NomeItemGenerico");
        this.comparaItemGenerico(expResult, result);
        File arquivo = new File(diretorio+generico, "NomeItemGenerico.opera");
        arquivo.delete();
        
    }

    /**
     * Test of encontrarArma_Corpo_A_Corpo method, of class DAO_Item.
    */ 
    @Test
    public void testEncontrarArma_Corpo_A_Corpo() throws Exception {
        System.out.println("encontrarArma_Corpo_A_Corpo");
        Dado dado = new Dado(6, 1);
        Arma_Corpo_A_Corpo expResult = new Arma_Corpo_A_Corpo("NomeArmaCorpo", "Descricao", dado, 2, 2, 2, 2, true, testeAtributos, preco, "TesteFisica");
        DAO_Item.gravarArma_Corpo_A_Corpo(expResult);
        Arma_Corpo_A_Corpo result = DAO_Item.encontrarArma_Corpo_A_Corpo("NomeArmaCorpo");
        this.comparaItemCorpo(expResult, result);        
        File arquivo = new File(diretorio+armas+"\\"+armasCorpo, "NomeArmaCorpo.opera");
        arquivo.delete();
    }

    /**
     * Test of encontrarArma_A_Distancia method, of class DAO_Item.
    */ 
    @Test
    public void testEncontrarArma_A_Distancia() throws Exception {
        System.out.println("encontrarArma_A_Distancia");
        Dado dado = new Dado(6, 1);
        Arma_A_Distancia expResult = new Arma_A_Distancia("NomeArmaDistancia", "Descricao",
                                                     dado, 2, 2, 2, 2, true, 
                                                     testeAtributos, preco, "TesteFisica");
        DAO_Item.gravarArma_A_Distancia(expResult);
        Arma_A_Distancia result = DAO_Item.encontrarArma_A_Distancia("NomeArmaDistancia");
        this.comparaItemDistancia(expResult, result);
        File arquivo = new File(diretorio+armas+"\\"+armasDistancia, "NomeArmaDistancia.opera");
        arquivo.delete();
    }

    /**
     * Test of encontrarArmadura method, of class DAO_Item.
    */ 
    @Test
    public void testEncontrarArmadura() throws Exception {
        System.out.println("encontrarArmadura");
        Dado dado = new Dado(6, 1);
        Armadura expResult = new Armadura("NomeArmadura","Descricao",2,2,2,'A', true, testeAtributos, 2, "TesteFisica");
        DAO_Item.gravarArmadura(expResult);      
        Armadura result = DAO_Item.encontrarArmadura("NomeArmadura");
        this.comparaArmadura(expResult, result);
        File arquivo = new File(diretorio+armaduras, "NomeArmadura.opera");
        arquivo.delete();
    }

    /**
     * Test of ItemGenericoExiste method, of class DAO_Item.
    */ 
    @Test
    public void testItemGenericoExiste() throws Exception {
        System.out.println("ItemGenericoExiste");
        Item item = new Item("NomeItemGenerico", "Descricao", true, testeAtributos,preco, "TesteFisica");
        assertEquals(false,DAO_Item.ItemGenericoExiste("NomeItemGenerico"));
        DAO_Item.gravarItem(item);        
        assertEquals(true, DAO_Item.ItemGenericoExiste("NomeItemGenerico"));
        File arquivo = new File(diretorio+generico, "NomeItemGenerico.opera");
        assertEquals(true,arquivo.delete());
    }

    /**
     * Test of ArmaduraExiste method, of class DAO_Item.
    */ 
    @Test
    public void testArmaduraExiste() throws Exception {
        System.out.println("ArmaduraExiste");
        Dado dado = new Dado(6, 1);
        Armadura expResult = new Armadura("NomeArmadura","Descricao",2,2,2,'A', true, testeAtributos, 2, "TesteFisica");
        assertEquals(false,DAO_Item.ArmaduraExiste("NomeArmadura"));        
        DAO_Item.gravarArmadura(expResult);       
        assertEquals(true, DAO_Item.ArmaduraExiste("NomeArmadura"));
        File arquivo = new File(diretorio+armaduras, "NomeArmadura.opera");
        assertEquals(true,arquivo.delete());
    }

    /**
     * Test of ArmaCorpo_A_CorpoExiste method, of class DAO_Item.
    */ 
    @Test
    public void testArmaCorpo_A_CorpoExiste_String_String() throws Exception {        
        System.out.println("ArmaCorpo_A_CorpoExiste");
        Dado dado = new Dado(6, 1);
        Arma_Corpo_A_Corpo expResult = new Arma_Corpo_A_Corpo("NomeArmaCorpo", "Descricao", dado
                                                                , 2, 2, 2, 2, true, testeAtributos
                                                                , preco, "TesteFisica");
        assertEquals(false,DAO_Item.ArmaCorpo_A_CorpoExiste("NomeArmaCorpo"));
        DAO_Item.gravarArma_Corpo_A_Corpo(expResult);
        assertEquals(true,DAO_Item.ArmaCorpo_A_CorpoExiste("NomeArmaCorpo"));
        File arquivo = new File(diretorio+armas+"\\"+armasCorpo, "NomeArmaCorpo.opera");
        arquivo.delete();
    }
   
    /**
     * Test of Arma_A_DistanciaExiste method, of class DAO_Item.
    */ 
    @Test
    public void testArma_A_DistanciaExiste() throws Exception{
        System.out.println("Arma_A_DistanciaExiste");
        Dado dado = new Dado(6, 1);
        Arma_A_Distancia expResult = new Arma_A_Distancia("NomeArmaDistancia", "Descricao",
                                                     dado, 2, 2, 2, 2, true, 
                                                     testeAtributos, preco, "TesteFisica");
        assertEquals(false,DAO_Item.Arma_A_DistanciaExiste("NomeArmaDistancia"));
        DAO_Item.gravarArma_A_Distancia(expResult);
        assertEquals(true,DAO_Item.Arma_A_DistanciaExiste("NomeArmaDistancia"));
        File arquivo = new File(diretorio+armas+"\\"+armasDistancia, "NomeArmaDistancia.opera");
        arquivo.delete();
    }

    /**
     * Test of listarItem method, of class DAO_Item.
    */ 
    @Test
    public void testListarItem() throws Exception {
        System.out.println("listarItem");
        Dado dado = new Dado(6, 1);        
        Item item1 = new Item("NomeItemGenerico1", "Descricao1", true, testeAtributos,preco, "TesteFisica");
        Item item2 = new Item("NomeItemGenerico2", "Descricao2", true, testeAtributos,preco, "TesteFisica");
        String list[] = DAO_Item.listarItem("Generico");
        assertEquals(0,list.length);
        DAO_Item.gravarItem(item1);
        DAO_Item.gravarItem(item2);        
        list = DAO_Item.listarItem("Generico");
        assertEquals(2,list.length);
        assertTrue(list[0].equalsIgnoreCase("NomeItemGenerico1")
                   || list[1].equalsIgnoreCase("NomeItemGenerico1"));        
        assertTrue(list[0].equalsIgnoreCase("NomeItemGenerico2")
                   || list[1].equalsIgnoreCase("NomeItemGenerico2"));        
        File arquivo = new File(diretorio+generico, list[0]+".opera");
        assertTrue(arquivo.delete());
        arquivo = new File(diretorio+generico, list[1]+".opera");
        assertTrue(arquivo.delete());
        
                
        Arma_A_Distancia armaDistancia1 = new Arma_A_Distancia("NomeArmaDistancia1", "Descricao1",dado, 2, 2, 2, 2, true, testeAtributos, preco, "TesteFisica");
        Arma_A_Distancia armaDistancia2 = new Arma_A_Distancia("NomeArmaDistancia2", "Descricao2",dado,2,2,2,2,true,testeAtributos,preco,"TesteFisica");
        list = DAO_Item.listarItem("Arma a Distancia");
        assertEquals(0,list.length);
        DAO_Item.gravarArma_A_Distancia(armaDistancia1);
        DAO_Item.gravarArma_A_Distancia(armaDistancia2);
        list = DAO_Item.listarItem("Arma a Distancia");
        assertEquals(2,list.length);
        assertTrue(list[0].equalsIgnoreCase("NomeArmaDistancia1")
                   || list[1].equalsIgnoreCase("NomeArmaDistancia1"));        
        assertTrue(list[0].equalsIgnoreCase("NomeArmaDistancia2")
                   || list[1].equalsIgnoreCase("NomeArmaDistancia2"));
        arquivo = new File(diretorio+armas+"\\"+armasDistancia, list[0]+".opera");
        assertTrue(arquivo.delete());
        arquivo = new File(diretorio+armas+"\\"+armasDistancia, list[1]+".opera");
        assertTrue(arquivo.delete());
        
        Arma_Corpo_A_Corpo armaCorpo1 = new Arma_Corpo_A_Corpo("NomeArmaCorpo1", "Descricao1",dado, 2, 2, 2, 2, true, testeAtributos, preco, "TesteFisica");
        Arma_Corpo_A_Corpo armaCorpo2 = new Arma_Corpo_A_Corpo("NomeArmaCorpo2", "Descricao2",dado, 2, 2, 2, 2, true, testeAtributos, preco, "TesteFisica");        
        list = DAO_Item.listarItem("Arma Corpo a Corpo");
        assertEquals(0,list.length);
        DAO_Item.gravarArma_Corpo_A_Corpo(armaCorpo1);
        DAO_Item.gravarArma_Corpo_A_Corpo(armaCorpo2);
        list = DAO_Item.listarItem("Arma Corpo a Corpo");
        assertEquals(2,list.length);
        assertTrue(list[0].equalsIgnoreCase("NomeArmaCorpo1")
                   || list[1].equalsIgnoreCase("NomeArmaCorpo1"));        
        assertTrue(list[0].equalsIgnoreCase("NomeArmaCorpo2")
                   || list[1].equalsIgnoreCase("NomeArmaCorpo2"));
        arquivo = new File(diretorio+armas+"\\"+armasCorpo, list[0]+".opera");
        assertTrue(arquivo.delete());
        arquivo = new File(diretorio+armas+"\\"+armasCorpo, list[1]+".opera");
        assertTrue(arquivo.delete());
        
        
        Armadura armadura1 = new Armadura("NomeArmadura1","Descricao1",2,2,2,'A', true, testeAtributos, 2, "TesteFisica");
        Armadura armadura2 = new Armadura("NomeArmadura2","Descricao2",2,2,2,'A', true, testeAtributos, 2, "TesteFisica");
        list = DAO_Item.listarItem("Armadura");
        assertEquals(0,list.length);
        DAO_Item.gravarArmadura(armadura1);
        DAO_Item.gravarArmadura(armadura2);
        list = DAO_Item.listarItem("Armadura");
        assertEquals(2,list.length);
        assertTrue(list[0].equalsIgnoreCase("NomeArmadura1")
                   || list[1].equalsIgnoreCase("NomeArmadura1"));        
        assertTrue(list[0].equalsIgnoreCase("NomeArmadura2")
                   || list[1].equalsIgnoreCase("NomeArmadura2"));
        arquivo = new File(diretorio+"\\"+armaduras, list[0]+".opera");
        assertTrue(arquivo.delete());
        arquivo = new File(diretorio+"\\"+armaduras, list[1]+".opera");
        assertTrue(arquivo.delete());
        
    }
}
