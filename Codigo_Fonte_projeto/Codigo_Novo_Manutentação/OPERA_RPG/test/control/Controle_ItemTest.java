/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.File;
import model.classes.Arma_A_Distancia;
import model.classes.Arma_Corpo_A_Corpo;
import model.classes.Armadura;
import model.classes.Dado;
import model.classes.Habilidade;
import model.classes.Item;
import model.dao.DAO_Habilidade;
import model.dao.DAO_Item;
import model.dao.DAO_Jogo;
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
    
    private String diretorio = "C:\\Opera\\Jogos\\JUnitTest\\Itens\\";
    private String nomeItemGenerico = "NomeItemGenerico";
    private String nomeArmaDistancia = "NomeArmaDistancia";
    private String nomeArmaCorpo = "NomeArmaCorpo";
    private String nomeArmadura = "NomeArmadura";
    private String descricao = "Descricao";    
    private String jogo = "JUnitTest";
    private String armaduras = "Armaduras";   
    private String generico = "Generico";
    private String armas = "Armas";
    private String armasDistancia = "Arma_A_Distancia";
    private String armasCorpo = "Arma_Corpo_A_Corpo";    
    private char regiaoCorpo = 'A';
    private int[] bonusAtributos = {2,2,2,2,2,2,2,2};
    private int preco = 2;    
    private int danoAdicional = 2;
    private int cadencia = 2;
    private int tiroRapido = 2;
    private int tiroMirado = 2;
    private int golpe = 2;
    private int aparo = 2;
    private int esquiva = 2;
    private boolean usando = true;
    private int absorcaoDistancia = 2;
    private int absorcaoCorpo = 2;
    private int penalidade = 2;
        
    public Controle_ItemTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws Exception{
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
    public void tearDown() {
        //DAO_Jogo.deletarJogo(jogo);
    }

    /**
     * Test of cadItemGenerico method, of class Controle_Item.
     */
    @Test
    public void testCadItemGenerico_3args() throws Exception {
        System.out.println("cadItemGenerico");        
        Controle_Item.cadItemGenerico(nomeItemGenerico, descricao, preco);
        File arquivo = new File(diretorio+generico, nomeItemGenerico+".opera");        
        assertEquals(true, arquivo.exists());         
        assertEquals(true, arquivo.delete());
    }

    /**
     * Test of cadItemGenerico method, of class Controle_Item.
     */
    @Test
    public void testCadItemGenerico_4args() throws Exception {
        System.out.println("cadItemGenerico");        
        Controle_Item.cadItemGenerico(nomeItemGenerico, descricao, usando, preco);
        File arquivo = new File(diretorio+generico, nomeItemGenerico+".opera");        
        assertEquals(true, arquivo.exists());         
        assertEquals(true, arquivo.delete());
    }

    /**
     * Test of cadItemGenerico method, of class Controle_Item.
     */
    @Test
    public void testCadItemGenerico_6args() throws Exception {
        System.out.println("cadItemGenerico");        
        Controle_Item.cadItemGenerico(nomeItemGenerico, descricao, usando, bonusAtributos, preco, "TesteFisica");
        File arquivo = new File(diretorio+generico, nomeItemGenerico+".opera");        
        assertEquals(true, arquivo.exists());         
        assertEquals(true, arquivo.delete());
    }

    /**
     * Test of removerItemGenerico method, of class Controle_Item.
     */
    @Test
    public void testRemoverItemGenerico() throws Exception {        
        Controle_Item.cadItemGenerico(nomeItemGenerico, descricao, usando, bonusAtributos, preco, "TesteFisica");
        File arquivo = new File(diretorio+generico, nomeItemGenerico+".opera");        
        assertEquals(true, arquivo.exists()); 
        Controle_Item.removerItemGenerico(nomeItemGenerico);
        assertEquals(false, arquivo.exists());
        Controle_Item.removerItemGenerico(nomeItemGenerico);
    }

    /**
     * Test of removerArmaADistancia method, of class Controle_Item.
     */
    @Test
    public void testRemoverArmaADistancia() throws Exception {
        System.out.println("removerArmaADistancia");
        Dado dano = new Dado(6, 1);
        Controle_Item.cadArma_A_Distancia(nomeArmaDistancia, descricao, dano, danoAdicional, tiroRapido, tiroMirado, cadencia, usando, preco);
        File arquivo = new File(diretorio+armas+"\\"+armasDistancia, nomeArmaDistancia+".opera");
        assertEquals(true, arquivo.exists());
        Controle_Item.removerArmaADistancia(nomeArmaDistancia);
        assertEquals(false, arquivo.exists());
    }

    /**
     * Test of removerArmaCorpoACorpo method, of class Controle_Item.
     */
    @Test
    public void testRemoverArmaCorpoACorpo() throws Exception {
        System.out.println("removerArmaCorpoACorpo");
        Dado dano = new Dado(6, 1);
        Controle_Item.cadArma_Corpo_A_Corpo(nomeArmaCorpo, descricao, dano, danoAdicional, golpe, aparo, esquiva, usando, bonusAtributos, preco, "TesteFisica");
        File arquivo = new File(diretorio+armas+"\\"+armasCorpo, nomeArmaCorpo+".opera");
        assertEquals(true, arquivo.exists());
        Controle_Item.removerArmaCorpoACorpo(nomeArmaCorpo);
        assertEquals(false, arquivo.exists());
    }

    /**
     * Test of removerArmadura method, of class Controle_Item.
     */
    @Test
    public void testRemoverArmadura() throws Exception {
        System.out.println("removerArmadura");        
        Controle_Item.cadArmadura(nomeArmadura, descricao, absorcaoDistancia, absorcaoCorpo, penalidade, regiaoCorpo, usando, preco);
        File arquivo = new File(diretorio+armaduras, nomeArmadura+".opera");        
        assertEquals(true, arquivo.exists());
        Controle_Item.removerArmadura(nomeArmadura);
        assertEquals(false, arquivo.exists());
    }

    /**
     * Test of cadArma_Corpo_A_Corpo method, of class Controle_Item.
     */
    @Test
    public void testCadArma_Corpo_A_Corpo_9args() throws Exception {
        System.out.println("cadArma_Corpo_A_Corpo");
        Dado dano = new Dado(6, 1);
        Controle_Item.cadArma_Corpo_A_Corpo(nomeArmaCorpo, descricao, dano, danoAdicional, golpe, aparo, esquiva, usando, preco);
        File arquivo = new File(diretorio+armas+"\\"+armasCorpo, nomeArmaCorpo+".opera");
        assertEquals(true, arquivo.exists());
        assertEquals(true, arquivo.delete());
    }

    /**
     * Test of cadArma_Corpo_A_Corpo method, of class Controle_Item.
     */
    @Test
    public void testCadArma_Corpo_A_Corpo_11args() throws Exception {
        System.out.println("cadArma_Corpo_A_Corpo");
        Dado dano = new Dado(6, 1);
        Controle_Item.cadArma_Corpo_A_Corpo(nomeArmaCorpo, descricao, dano, danoAdicional, golpe, aparo, esquiva, usando, bonusAtributos, preco, "TesteFisica");
        File arquivo = new File(diretorio+armas+"\\"+armasCorpo, nomeArmaCorpo+".opera");
        assertEquals(true, arquivo.exists());
        assertEquals(true, arquivo.delete());
    }

    /**
     * Test of cadArma_A_Distancia method, of class Controle_Item.
     */
    @Test
    public void testCadArma_A_Distancia_9args() throws Exception {
        System.out.println("cadArma_A_Distancia");
        Dado dano = new Dado(6, 1);
        Controle_Item.cadArma_A_Distancia(nomeArmaDistancia, descricao, dano, danoAdicional, tiroRapido, tiroMirado, cadencia, usando, preco);
        File arquivo = new File(diretorio+armas+"\\"+armasDistancia, nomeArmaDistancia+".opera");
        assertEquals(true, arquivo.exists());
        assertEquals(true, arquivo.delete());
    }    
    /**
     * Test of cadArma_A_Distancia method, of class Controle_Item.
     */
    @Test
    public void testCadArma_A_Distancia_11args() throws Exception {
        System.out.println("cadArma_A_Distancia");
        Dado dano = new Dado(6, 1);
        Controle_Item.cadArma_A_Distancia(nomeArmaDistancia, descricao, dano, danoAdicional, tiroRapido, tiroMirado, cadencia, usando, bonusAtributos, preco, "TesteFisica");
        File arquivo = new File(diretorio+armas+"\\"+armasDistancia, nomeArmaDistancia+".opera");
        assertEquals(true, arquivo.exists());
        assertEquals(true, arquivo.delete());
    }

    /**
     * Test of cadArmadura method, of class Controle_Item.
     */
    @Test
    public void testCadArmadura_8args() throws Exception {
        System.out.println("cadArmadura");        
        Controle_Item.cadArmadura(nomeArmadura, descricao, absorcaoDistancia, absorcaoCorpo, penalidade, regiaoCorpo, usando, preco);
        File arquivo = new File(diretorio+armaduras, nomeArmadura+".opera");
        assertEquals(true, arquivo.exists());
        assertEquals(true, arquivo.delete());
    }

    /**
     * Test of cadArmadura method, of class Controle_Item.
     */
    @Test
    public void testCadArmadura_10args() throws Exception {
        System.out.println("cadArmadura");        
        Controle_Item.cadArmadura(nomeArmadura, descricao, absorcaoDistancia, absorcaoCorpo, penalidade, regiaoCorpo, usando, bonusAtributos, preco, "TesteFisica");
        File arquivo = new File(diretorio+armaduras, nomeArmadura+".opera");
        assertEquals(true, arquivo.exists());
        assertEquals(true, arquivo.delete());    
    }

    /**
     * Test of ItemGenericoExiste method, of class Controle_Item.
     */
    @Test
    public void testItemGenericoExiste() throws Exception {
        System.out.println("ItemGenericoExiste");
        Controle_Item.cadItemGenerico(nomeItemGenerico, descricao, usando, bonusAtributos, preco, "TesteFisica");
        File arquivo = new File(diretorio+generico, nomeItemGenerico+".opera");        
        assertEquals(true, arquivo.exists());
        assertEquals(true, Controle_Item.ItemGenericoExiste(nomeItemGenerico));
        assertEquals(true, arquivo.delete());
        
    }

    /**
     * Test of Arma_A_DistanciaExiste method, of class Controle_Item.
     */
    @Test
    public void testArma_A_DistanciaExiste() throws Exception {
        System.out.println("Arma_A_DistanciaExiste");
        Dado dano = new Dado(6, 1);
        Controle_Item.cadArma_A_Distancia(nomeArmaDistancia, descricao, dano, danoAdicional, tiroRapido, tiroMirado, cadencia, usando, bonusAtributos, preco, "TesteFisica");
        File arquivo = new File(diretorio+armas+"\\"+armasDistancia, nomeArmaDistancia+".opera");
        assertEquals(true, arquivo.exists());
        assertEquals(true,Controle_Item.Arma_A_DistanciaExiste(nomeArmaDistancia));
        assertEquals(true, arquivo.delete());
    }

    /**
     * Test of ArmaCorpo_A_CorpoExiste method, of class Controle_Item.
     */
    @Test
    public void testArmaCorpo_A_CorpoExiste() throws Exception {
        System.out.println("ArmaCorpo_A_CorpoExiste");
        Dado dano = new Dado(6, 1);
        Controle_Item.cadArma_Corpo_A_Corpo(nomeArmaCorpo, descricao, dano, danoAdicional, golpe, aparo, esquiva, usando, bonusAtributos, preco, "TesteFisica");
        File arquivo = new File(diretorio+armas+"\\"+armasCorpo, nomeArmaCorpo+".opera");
        assertEquals(true, arquivo.exists());
        assertEquals(true,Controle_Item.ArmaCorpo_A_CorpoExiste(nomeArmaCorpo));
        assertEquals(true, arquivo.delete());
    }

    /**
     * Test of ArmaduraExiste method, of class Controle_Item.
     */
    @Test
    public void testArmaduraExiste() throws Exception {
        System.out.println("ArmaduraExiste");
        Controle_Item.cadArmadura(nomeArmadura, descricao, absorcaoDistancia, absorcaoCorpo, penalidade, regiaoCorpo, usando, bonusAtributos, preco, "TesteFisica");
        File arquivo = new File(diretorio+armaduras, nomeArmadura+".opera");
        assertEquals(true, arquivo.exists());
        assertEquals(true,Controle_Item.ArmaduraExiste(nomeArmadura));
        assertEquals(true, arquivo.delete());       
    }

    /**
     * Test of encontrarItemGenerico method, of class Controle_Item.
     */
    @Test
    public void testEncontrarItemGenerico() throws Exception {
        System.out.println("encontrarItemGenerico");
        Controle_Item.cadItemGenerico(nomeItemGenerico, descricao, usando, bonusAtributos, preco, "TesteFisica");
        File arquivo = new File(diretorio+generico, nomeItemGenerico+".opera");        
        assertEquals(true, arquivo.exists());        
        Item result = Controle_Item.encontrarItemGenerico(nomeItemGenerico);
        assertEquals(nomeItemGenerico, result.getNome());
        assertEquals(descricao, result.getDescricao());
        assertEquals(true, arquivo.delete());
    }

    /**
     * Test of encontrarArma_Corpo_A_Corpo method, of class Controle_Item.
     */
    @Test
    public void testEncontrarArma_Corpo_A_Corpo() throws Exception {
        System.out.println("encontrarArma_Corpo_A_Corpo");
        Dado dano = new Dado(6, 1);
        Controle_Item.cadArma_Corpo_A_Corpo(nomeArmaCorpo, descricao, dano, danoAdicional, golpe, aparo, esquiva, usando, bonusAtributos, preco, "TesteFisica");
        File arquivo = new File(diretorio+armas+"\\"+armasCorpo, nomeArmaCorpo+".opera");
        assertEquals(true, arquivo.exists());
        Arma_Corpo_A_Corpo result = Controle_Item.encontrarArma_Corpo_A_Corpo(nomeArmaCorpo);
        assertEquals(nomeArmaCorpo, result.getNome());
        assertEquals(descricao, result.getDescricao());
        assertEquals(true, arquivo.delete());
    }

    /**
     * Test of encontrarArma_A_Distancia method, of class Controle_Item.
     */
    @Test
    public void testEncontrarArma_A_Distancia() throws Exception {
        System.out.println("encontrarArma_A_Distancia");
        Dado dano = new Dado(6, 1);
        Controle_Item.cadArma_A_Distancia(nomeArmaDistancia, descricao, dano, danoAdicional, tiroRapido, tiroMirado, cadencia, usando, bonusAtributos, preco, "TesteFisica");
        File arquivo = new File(diretorio+armas+"\\"+armasDistancia, nomeArmaDistancia+".opera");
        assertEquals(true, arquivo.exists());
        Arma_A_Distancia result = Controle_Item.encontrarArma_A_Distancia(nomeArmaDistancia);
        assertEquals(nomeArmaDistancia, result.getNome());
        assertEquals(descricao, result.getDescricao());
        assertEquals(true, arquivo.delete());
    }

    /**
     * Test of encontrarArmadura method, of class Controle_Item.
     */
    @Test
    public void testEncontrarArmadura() throws Exception {
        System.out.println("encontrarArmadura");
        Controle_Item.cadArmadura(nomeArmadura, descricao, absorcaoDistancia, absorcaoCorpo, penalidade, regiaoCorpo, usando, bonusAtributos, preco, "TesteFisica");
        File arquivo = new File(diretorio+armaduras, nomeArmadura+".opera");
        assertEquals(true, arquivo.exists());
        Armadura result = Controle_Item.encontrarArmadura(nomeArmadura);
        assertEquals(nomeArmadura, result.getNome());
        assertEquals(descricao, result.getDescricao());
        assertEquals(true, arquivo.delete());
    }

    /**
     * Test of listarItemGenerico method, of class Controle_Item.
     */
    @Test
    public void testListarItemGenerico() throws Exception {
        System.out.println("listarItemGenerico");
        
        String list[] = Controle_Item.listarItemGenerico();
        assertEquals(0, list.length); 
        Controle_Item.cadItemGenerico(nomeItemGenerico+"1", descricao+"1", usando, bonusAtributos, preco, "TesteFisica");
        Controle_Item.cadItemGenerico(nomeItemGenerico+"2", descricao+"2", usando, bonusAtributos, preco, "TesteFisica");                
        list = Controle_Item.listarItemGenerico();
        assertEquals(2, list.length);        
        assertEquals(2,list.length);
        assertTrue(list[0].equalsIgnoreCase(nomeItemGenerico+"1")
                   || list[1].equalsIgnoreCase(nomeItemGenerico+"1"));        
        assertTrue(list[0].equalsIgnoreCase(nomeItemGenerico+"2")
                   || list[1].equalsIgnoreCase(nomeItemGenerico+"2"));        
        File arquivo = new File(diretorio+generico, list[0]+".opera");
        assertTrue(arquivo.delete());
        arquivo = new File(diretorio+generico, list[1]+".opera");
        assertTrue(arquivo.delete());        
    }

    /**
     * Test of listarItemArmaADistancia method, of class Controle_Item.
     */
    @Test
    public void testListarItemArmaADistancia() throws Exception {
        System.out.println("listarItemArmaADistancia");
        Dado dano = new Dado(6, 1);
        String list[] = Controle_Item.listarItemArmaADistancia();
        assertEquals(0, list.length); 
        Controle_Item.cadArma_A_Distancia(nomeArmaDistancia+"1", descricao+"1", dano, danoAdicional, tiroRapido, tiroMirado, cadencia, usando, bonusAtributos, preco, "TesteFisica");
        Controle_Item.cadArma_A_Distancia(nomeArmaDistancia+"2", descricao+"2", dano, danoAdicional, tiroRapido, tiroMirado, cadencia, usando, bonusAtributos, preco, "TesteFisica");
        list = Controle_Item.listarItemArmaADistancia();
        assertEquals(2, list.length);        
        assertEquals(2,list.length);
        assertTrue(list[0].equalsIgnoreCase("NomeArmaDistancia1")
                   || list[1].equalsIgnoreCase("NomeArmaDistancia1"));        
        assertTrue(list[0].equalsIgnoreCase("NomeArmaDistancia2")
                   || list[1].equalsIgnoreCase("NomeArmaDistancia2"));
        File arquivo = new File(diretorio+armas+"\\"+armasDistancia, list[0]+".opera");
        assertTrue(arquivo.delete());
        arquivo = new File(diretorio+armas+"\\"+armasDistancia, list[1]+".opera");
        assertTrue(arquivo.delete());
    }

    /**
     * Test of listarItemArmaCorpoACorpo method, of class Controle_Item.
     */
    @Test
    public void testListarItemArmaCorpoACorpo() throws Exception {
        System.out.println("listarItemArmaCorpoACorpo");
        Dado dano = new Dado(6, 1);
        String list[] = Controle_Item.listarItemArmaCorpoACorpo();
        assertEquals(0, list.length);
        Controle_Item.cadArma_Corpo_A_Corpo(nomeArmaCorpo+"1", descricao+"1", dano, danoAdicional, golpe, aparo, esquiva, usando, bonusAtributos, preco, "TesteFisica");
        Controle_Item.cadArma_Corpo_A_Corpo(nomeArmaCorpo+"2", descricao+"2", dano, danoAdicional, golpe, aparo, esquiva, usando, bonusAtributos, preco, "TesteFisica");
        list = Controle_Item.listarItemArmaCorpoACorpo();
        assertEquals(2, list.length);        
        assertEquals(2,list.length);
         assertTrue(list[0].equalsIgnoreCase("NomeArmaCorpo1")
                   || list[1].equalsIgnoreCase("NomeArmaCorpo1"));        
        assertTrue(list[0].equalsIgnoreCase("NomeArmaCorpo2")
                   || list[1].equalsIgnoreCase("NomeArmaCorpo2"));
        File arquivo = new File(diretorio+armas+"\\"+armasCorpo, list[0]+".opera");
        assertTrue(arquivo.delete());
        arquivo = new File(diretorio+armas+"\\"+armasCorpo, list[1]+".opera");
        assertTrue(arquivo.delete());
    }

    /**
     * Test of listarItemArmadura method, of class Controle_Item.
     */
    @Test
    public void testListarItemArmadura() throws Exception{
        System.out.println("listarItemArmadura");
        String list[] = Controle_Item.listarItemArmadura();
        assertEquals(0, list.length);
        Controle_Item.cadArmadura(nomeArmadura+"1", descricao+"1", absorcaoDistancia, absorcaoCorpo, penalidade, regiaoCorpo, usando, bonusAtributos, preco, "TesteFisica");
        Controle_Item.cadArmadura(nomeArmadura+"2", descricao+"2", absorcaoDistancia, absorcaoCorpo, penalidade, regiaoCorpo, usando, bonusAtributos, preco, "TesteFisica");
        list = Controle_Item.listarItemArmadura();
        assertEquals(2, list.length);
        assertTrue(list[0].equalsIgnoreCase("NomeArmadura1")
                   || list[1].equalsIgnoreCase("NomeArmadura1"));        
        assertTrue(list[0].equalsIgnoreCase("NomeArmadura2")
                   || list[1].equalsIgnoreCase("NomeArmadura2"));
        File arquivo = new File(diretorio+"\\"+armaduras, list[0]+".opera");
        assertTrue(arquivo.delete());
        arquivo = new File(diretorio+"\\"+armaduras, list[1]+".opera");
        assertTrue(arquivo.delete());
    }
}
