package model.dao;


import model.classes.Jogo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class DAO_JogoTest {
    
    public DAO_JogoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() throws Exception{
        if(DAO_Jogo.jogoExiste("JUnitTest")){
            DAO_Jogo.deletarJogo("JUnitTest");
            DAO_Jogo.deletarJogo("JUnitTest1");
        }
    }
    
    @After
    public void tearDown() throws Exception{
        DAO_Jogo.deletarJogo("JUnitTest");
        DAO_Jogo.deletarJogo("JUnitTest1");
    }

    
    /**
     * Test of deletarJogo method, of class DAO_Jogo.
     */
    @Test
    public void testDeletarJogo() throws Exception {
        System.out.println("deletarJogo");
        String nome = "JUnitTest";
        DAO_Jogo.criarJogo(nome);
        DAO_Jogo.deletarJogo(nome);
    }

    /**
     * Test of carregarJogo method, of class DAO_Jogo.
     */
    @Test
    public void testCarregarJogo() throws Exception {
        System.out.println("carregarJogo");
        String nome = "JUnitTest";
        DAO_Jogo.criarJogo(nome);
        DAO_Jogo.carregarJogo(nome);
        DAO_Jogo.deletarJogo(nome);
    }

    /**
     * Test of getJogoRodando method, of class DAO_Jogo.
     */
    @Test
    public void testGetJogoRodando() throws Exception {
        System.out.println("getJogoRodando");
        String expResult = "JUnitTest";
        Jogo result = DAO_Jogo.getJogoRodando();
        assertEquals(expResult, result.getNome());
        DAO_Jogo.deletarJogo("JUnitTest");
    }

    /**
     * Test of jogosExistentes method, of class DAO_Jogo.
     */
    @Test
    public void testJogosExistentes()throws Exception {
        System.out.println("jogosExistentes");
        String[] expResult = {"JUnitTest","JUnitTest1"};
        DAO_Jogo.criarJogo("JUnitTest");
        DAO_Jogo.criarJogo("JUnitTest1");
        String[] result = DAO_Jogo.jogosExistentes();
        for(int i = 0; i < result.length; i++){
        	System.out.println(result[i]);
        }
        assertArrayEquals(expResult, result);
        DAO_Jogo.deletarJogo("JUnitTest");
        DAO_Jogo.deletarJogo("JUnitTest1");
    }

    /**
     * Test of jogoExiste method, of class DAO_Jogo.
     */
    @Test
    public void testJogoExiste() throws Exception{
        System.out.println("jogoExiste");
        String nome = "JUnitTest";
        boolean expResult = true;
        DAO_Jogo.criarJogo(nome);
        boolean result = DAO_Jogo.jogoExiste(nome);
        assertEquals(expResult, result);
        DAO_Jogo.deletarJogo(nome);
    }

    /**
     * Test of criarJogo method, of class DAO_Jogo.
     */
    @Test
    public void testCriarJogo() throws Exception {
        System.out.println("criarJogo");
        String nome = "JUnitTest";
        DAO_Jogo.criarJogo(nome);
        DAO_Jogo.deletarJogo(nome);
    }
    
    /**
     * Test of deletarTodosJogos method, of class DAO_Jogo.
     */
    @Test
    public void testDeletarTodosJogos() throws Exception{
        System.out.println("deletar todos jogos");
        DAO_Jogo.criarJogo("JUnitTest");
        DAO_Jogo.criarJogo("JUnitTest1");
        DAO_Jogo.deletarTodosJogos();
    }
    
    /**
     * Test of removerArquivosJogo method, of class DAO_Jogo.
     */
    @Test
    public void testRemoverArquivosJogo() throws Exception{
        System.out.println("removerArquivosJogo");
        DAO_Jogo.criarJogo("JUnitTest");
        Jogo jogo = DAO_Jogo.getJogoRodando();
        DAO_Jogo.removerArquivosJogo(jogo);
    }
    
    /**
     * Test of removerDiretorioJogo method, of class DAO_Jogo.
     */
    @Test
    public void testRemoverDiretorioJogo() throws Exception{
        System.out.println("removerDiretorioJogo");
        DAO_Jogo.criarJogo("JUnitTest");
        Jogo jogo = DAO_Jogo.getJogoRodando();
        DAO_Jogo.removerDiretorioJogo(jogo);
    }
    
    /**
     * Test of removerArquivosFichas method, of class DAO_Jogo.
     */
    @Test
    public void testRemoverArquivosFichas() throws Exception{
        System.out.println("removerArquivosFichas");
        DAO_Jogo.criarJogo("JUnitTest");
        Jogo jogo = DAO_Jogo.getJogoRodando();
        DAO_Jogo.removerArquivosFichas(jogo);
    }
    
    /**
     * Test of removerDiretorioFichas method, of class DAO_Jogo.
     */
    @Test
    public void testRemoverDiretorioFichas() throws Exception{
        System.out.println("removerDiretorioFichas");
        DAO_Jogo.criarJogo("JUnitTest");
        Jogo jogo = DAO_Jogo.getJogoRodando();
        DAO_Jogo.removerDiretorioFichas(jogo);
    }
    
    /**
     * Test of removerArquivosHabilidades method, of class DAO_Jogo.
     */
    @Test
    public void testRemoverArquivosHabilidades() throws Exception{
        System.out.println("removerArquivosHabilidades");
        DAO_Jogo.criarJogo("JUnitTest");
        Jogo jogo = DAO_Jogo.getJogoRodando();
        DAO_Jogo.removerArquivosHabilidades(jogo);
    }
    
    /**
     * Test of removerDiretorioHabilidades method, of class DAO_Jogo.
     */
    @Test
    public void testRemoverDiretorioHabilidades() throws Exception{
        System.out.println("removerDiretorioHabilidades");
        DAO_Jogo.criarJogo("JUnitTest");
        Jogo jogo = DAO_Jogo.getJogoRodando();
        DAO_Jogo.removerDiretorioHabilidades(jogo);
    }
    
    /**
     * Test of removerArquivosCaracteristicas method, of class DAO_Jogo.
     */
    @Test
    public void testRemoverArquivosCaracteristicas() throws Exception{
        System.out.println("removerArquivosCaracteristicas");
        DAO_Jogo.criarJogo("JUnitTest");
        Jogo jogo = DAO_Jogo.getJogoRodando();
        DAO_Jogo.removerArquivosCaracteristicas(jogo);
    }
    
    /**
     * Test of removerDiretorioCaracteristicas method, of class DAO_Jogo.
     */
    @Test
    public void testRemoverDiretorioCaracteristicas() throws Exception{
        System.out.println("removerDiretorioCaracteristicas");
        DAO_Jogo.criarJogo("JUnitTest");
        Jogo jogo = DAO_Jogo.getJogoRodando();
        DAO_Jogo.removerDiretorioCaracteristicas(jogo);
    }
    
    /**
     * Test of removerArquivosItens method, of class DAO_Jogo.
     */
    @Test
    public void testRemoverArquivosItens() throws Exception{
        System.out.println("removerArquivosItens");
        DAO_Jogo.criarJogo("JUnitTest");
        Jogo jogo = DAO_Jogo.getJogoRodando();
        DAO_Jogo.removerArquivosItens(jogo);
    }
    
    /**
     * Test of removerDiretorioItens method, of class DAO_Jogo.
     */
    @Test
    public void testRemoverDiretorioItens() throws Exception{
        System.out.println("removerDiretorioItens");
        DAO_Jogo.criarJogo("JUnitTest");
        Jogo jogo = DAO_Jogo.getJogoRodando();
        DAO_Jogo.removerDiretoriosItens(jogo);
    }
    
    /**
     * Test of removerArquivosItens method, of class DAO_Jogo.
     */
    @Test
    public void testRemoverArquivosDados() throws Exception{
        System.out.println("removerArquivosDados");
        DAO_Jogo.criarJogo("JUnitTest");
        Jogo jogo = DAO_Jogo.getJogoRodando();
        DAO_Jogo.removerArquivosDados(jogo);
    }
    
    /**
     * Test of removerDiretorioItens method, of class DAO_Jogo.
     */
    @Test
    public void testRemoverDiretorioDados() throws Exception{
        System.out.println("removerDiretorioDados");
        DAO_Jogo.criarJogo("JUnitTest");
        Jogo jogo = DAO_Jogo.getJogoRodando();
        DAO_Jogo.removerDiretorioDados(jogo);
    }
    
}
