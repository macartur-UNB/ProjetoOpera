/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.classes;

import model.exception.ItemInvalidoException;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import control.Controle_Habilidade;
import control.Controle_Jogo;
import static org.junit.Assert.*;

/**
 *
 * @author Luciano
 */
public class ItemTest {
    
    Item instance;
    
    public ItemTest() {
        
    }
    
    @BeforeClass
    public static void setUpClass() {
    	int teste = 0;
        int nivel = 0;
        int custo = 0;
        String nome = "Habilidade";
        String tipo = "Fisica";
        
        try{
        	if(!Controle_Jogo.jogoExiste("ItemTest")){
	        	Controle_Jogo.criarJogo("ItemTest");
	        	Controle_Habilidade.cadHabilidade(teste, nivel, custo, nome, tipo);
        	}else{
        		Controle_Jogo.abrirJogo("ItemTest");
        	}
        } catch (Exception e){
            fail(e.getMessage());
        }
    }
    
    @AfterClass
    public static void tearDownClass() {
    	try{
    		if(Controle_Jogo.jogoExiste("ItemTest")){
    			Controle_Jogo.apagarJogo("ItemTest");
    		}
    	} catch (Exception e){
            fail(e.getMessage());
        }
    }
    
    @Before
    public void setUp() {
        String nome = "Item";
        String descricao = "Descricao do Item";
        boolean usando = false;
        int[] bonus_atributo = {1, 2, 3, 4, 5, 6, 7, 8};
        int preco = 0;
        String habilidade_Necessaria = null;
        
        try{
            instance = new Item(nome, descricao, usando, bonus_atributo, preco, habilidade_Necessaria); 
        } catch(ItemInvalidoException e){
            fail(e.getMessage());
        }
    }
    
    
    /**
     * Test of constructos methods, of class Item
     */
    @Test
    public void testConstructors() throws Exception {
    	System.out.println("Constructors");
    	String nome = "Item";
        String descricao = "Descricao do Item";
        boolean usando = false;
        int[] bonus_atributo = {1, 2, 3, 4, 5, 6, 7, 8};
        int preco = 0;
        String habilidade_Necessaria = null;
        
        try{
            Item item = new Item(nome, descricao, usando, bonus_atributo, preco, habilidade_Necessaria); 
            item = new Item(nome, descricao, usando, preco);
            item = new Item(nome, descricao, preco);
        } catch(ItemInvalidoException e){
            fail(e.getMessage());
        }
    }

    /**
     * Test of setNome method, of class Item.
     */
    @Test
    public void testSetNome() throws Exception {
        System.out.println("setNome");
        instance.setNome("Habilidade");
        
        try{
        	instance.setNome("Invalido ##&&(!");
        	fail("setNome esta invalido, a excecao deveria ter pegado");
        } catch (ItemInvalidoException e) {
        }
    }

    
    /**
     * Test of getNome method, of class Item.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        String expResult = "Item";
        String result = instance.getNome();
        assertEquals(expResult, result);
    }
    
    
    /**
     * Test of setDescricao method, of class Item.
     */
    @Test
    public void testSetDescricao() throws Exception {
        System.out.println("setDescricao");
        instance.setDescricao("Nova Descricao do Item");
        
        try{
        	instance.setDescricao("Invalido @#*(&");
        	fail("setDescricao esta invalido, a excecao deveria ter pegado");
        } catch (ItemInvalidoException e) {
	}
    }
    
    
    /**
     * Test of getDescricao method, of class Item.
     */
    @Test
    public void testGetDescricao() {
        System.out.println("getDescricao");
        String expResult = "Descricao do Item";
        String result = instance.getDescricao();
        assertEquals(expResult, result);
    }
    
    
    /**
     * Test of setUsando method, of class Item.
     */
    @Test
    public void testSetUsando() {
        System.out.println("setUsando");
        instance.setUsando(true);
        instance.setUsando(false);
    }
    
    
    /**
     * Test of isUsando method, of class Item.
     */
    @Test
    public void testIsUsando() {
        System.out.println("isUsando");
        boolean expResult = false;
        boolean result = instance.isUsando();
        assertEquals(expResult, result);
    }
    
    
    /**
     * Test of setPreco method, of class Item.
     */
    @Test
    public void testSetPreco() throws Exception {
        System.out.println("setPreco");
        instance.setPreco(0);
        
        try{
        	instance.setPreco(-1);
        	fail("setPreco esta invalido, a excecao deveria ter pegado");
        } catch (ItemInvalidoException e) {
	}
    }
    
    
    /**
     * Test of getPreco method, of class Item.
     */
    @Test
    public void testGetPreco() {
        System.out.println("getPreco");
        int expResult = 0;
        int result = instance.getPreco();
        assertEquals(expResult, result);
    }
    
    
    /**
     * Test of setBonus_atributo method, of class Item.
     */
    @Test
    public void testSetBonus_atributo() throws Exception {
    	int[] bonus_atributo = null;
        instance.setBonus_atributo(bonus_atributo);
        int[] bonus_atributo1 = {1, 2, 3, 4, 5, 6, 7, 8};
        instance.setBonus_atributo(bonus_atributo1);
        try{
            int[] bonus_atributo2 = {-1, 2, 3, 4, 5, 6, 7, 8};
            instance.setBonus_atributo(bonus_atributo2);
            fail("setBonus_atributo esta invalido, a excecao deveria ter pegado");
        } catch(ItemInvalidoException e){
        }
        try{
            int[] bonus_atributo3 = {1, 2};
            instance.setBonus_atributo(bonus_atributo3);
            fail("setBonus_atributo esta invalido, a excecao deveria ter pegado");
        } catch(ItemInvalidoException e){
        }
    }
    
    
    /**
     * Test of getBonus_atributo method, of class Item.
     */
    @Test
    public void testGetBonus_atributo() {
        System.out.println("getBonus_atributo");
        int[] expResult = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] result = instance.getBonus_atributo();
        assertArrayEquals(expResult, result);
    }
    
    
    /**
     * Test of setHabilidade_Necessaria method, of class Item.
     */
    @Test
    public void testSetHabilidade_Necessaria() throws Exception {
        System.out.println("setHabilidade_Necessaria");
        instance.setHabilidade_Necessaria(null);
        instance.setHabilidade_Necessaria("Habilidade");
        
        try{
        	instance.setHabilidade_Necessaria("Habilidade Inexistente");
        	fail("setHabilidade_Necessaria esta invalido, a excecao deveria ter pegado");
        } catch(ItemInvalidoException e){
        }
    }
    
    
    /**
     * Test of getHabilidade_Necessaria method, of class Item.
     */
    @Test
    public void testGetHabilidade_Necessaria() {
        System.out.println("getHabilidade_Necessaria");
        String expResult = null;
        String result = instance.getHabilidade_Necessaria();
        assertEquals(expResult, result);
    }
    
    
    /**
     * Test of toString method, of class Item.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "Nome = Item; Descricao = Descricao do Item; Preco = 0; Usando = false; Bonus de Atributo = [1, 2, 3, 4, 5, 6, 7, 8]; Habilidade Necessaria = null";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
}
