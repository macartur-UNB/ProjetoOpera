/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.classes;

import control.Controle_Habilidade;
import control.Controle_Jogo;
import model.exception.ItemInvalidoException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luciano
 */
public class ArmaduraTest {
    
    Armadura instance;
    
    public ArmaduraTest() {
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
        String nome = "Armadura";
        String descricao = "Descricao da Armadura";
        int absorcao_Distancia = 0;
        int absorcao_CorpoACorpo = 0;
        int penalidade = 0;
        char regiao_Do_Corpo = 'A';
        boolean usando = false;
        int bonus_atributo[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int preco = 0;
        String habilidade_Necessaria = null;
        
        try{
            instance = new Armadura(nome, descricao, absorcao_Distancia, absorcao_CorpoACorpo, penalidade, regiao_Do_Corpo, usando, bonus_atributo, preco, habilidade_Necessaria);
        } catch(ItemInvalidoException e){
            fail(e.getMessage());
        }
    }

    @After
    public void tearDown() throws Exception {
    }
    
    
    /**
     * Test of constructos methods, of class Item
     */
    @Test
    public void testConstructors() throws Exception {
    	System.out.println("Constructors");
    	
    	String nome = "Armadura";
        String descricao = "Descricao da Armadura";
        int absorcao_Distancia = 0;
        int absorcao_CorpoACorpo = 0;
        int penalidade = 0;
        char regiao_Do_Corpo = 'A';
        boolean usando = false;
        int bonus_atributo[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int preco = 0;
        String habilidade_Necessaria = null;
        
        try{
            instance = new Armadura(nome, descricao, absorcao_Distancia, absorcao_CorpoACorpo, penalidade, regiao_Do_Corpo, usando, bonus_atributo, preco, habilidade_Necessaria);
            instance = new Armadura(nome, descricao, absorcao_Distancia, absorcao_CorpoACorpo, penalidade, regiao_Do_Corpo, usando, preco);
        } catch(ItemInvalidoException e){
            fail(e.getMessage());
        }
    	// TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    

    /**
     * Test of setAbsorcao_Distancia method, of class Armadura.
     */
    @Test
    public void testSetAbsorcao_Distancia() throws Exception {
        System.out.println("setAbsorcao_Distancia");
        instance.setAbsorcao_Distancia(1);
        
        try{
        	instance.setAbsorcao_Distancia(-1);
        	fail("setAbsorcao_Distancia esta invalido, a excecao deveria ter pegado");
        } catch (ItemInvalidoException e) {
		}
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    /**
     * Test of getAbsorcao_Arma_Distancia method, of class Armadura.
     */
    @Test
    public void testGetAbsorcao_Distancia() {
        System.out.println("getAbsorcao_Distancia");
        int expResult = 0;
        int result = instance.getAbsorcao_Distancia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    /**
     * Test of setAbsorcao_Arma_De_Corpo_A_Corpo method, of class Armadura.
     */
    @Test
    public void testSetAbsorcao_CorpoACorpo() throws Exception {
        System.out.println("setAbsorcao_Corpo a Corpo");
        instance.setAbsorcao_CorpoACorpo(1);
        
        try{
        	instance.setAbsorcao_CorpoACorpo(-1);
        	fail("setAbsorcao_CorpoACorpo esta invalido, a excecao deveria ter pegado");
        } catch (ItemInvalidoException e) {
		}
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    /**
     * Test of getAbsorcao_CorpoACorpo method, of class Armadura.
     */
    @Test
    public void testGetAbsorcao_CorpoACorpo() {
        System.out.println("getAbsorcao_CorpoACorpo");
        int expResult = 0;
        int result = instance.getAbsorcao_CorpoACorpo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    /**
     * Test of setRegiao_Do_Corpo method, of class Armadura.
     */
    @Test
    public void testSetRegiao_Do_Corpo() throws Exception {
        System.out.println("setRegiao_Do_Corpo");
        instance.setRegiao_Do_Corpo('A');
        instance.setRegiao_Do_Corpo('B');
        instance.setRegiao_Do_Corpo('C');
        instance.setRegiao_Do_Corpo('D');
        instance.setRegiao_Do_Corpo('E');
        instance.setRegiao_Do_Corpo('F');
        instance.setRegiao_Do_Corpo('G');
        instance.setRegiao_Do_Corpo('H');
        
        try{
        	instance.setRegiao_Do_Corpo(' ');
        	fail("setRegiao_Do_Corpo esta invalido, a excecao deveria ter pegado");
        } catch (ItemInvalidoException e) {
		}
        try{
        	instance.setRegiao_Do_Corpo('1');
        	fail("setRegiao_Do_Corpo esta invalido, a excecao deveria ter pegado");
        } catch (ItemInvalidoException e) {
		}
        try{
        	instance.setRegiao_Do_Corpo('Z');
        	fail("setRegiao_Do_Corpo esta invalido, a excecao deveria ter pegado");
        } catch (ItemInvalidoException e) {
		}
        try{
        	instance.setRegiao_Do_Corpo('a');
        	fail("setRegiao_Do_Corpo esta invalido, a excecao deveria ter pegado");
        } catch (ItemInvalidoException e) {
		}
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    /**
     * Test of getRegiao_Do_Corpo method, of class Armadura.
     */
    @Test
    public void testGetRegiao_Do_Corpo() {
        System.out.println("getRegiao_Do_Corpo");
        char expResult = 'A';
        char result = instance.getRegiao_Do_Corpo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    /**
     * Test of setPenalidade method, of class Armadura.
     */
    @Test
    public void testSetPenalidade() throws Exception {
        System.out.println("setPenalidade");
        instance.setPenalidade(1);
        
        try{
            instance.setPenalidade(-1);
            fail("setPenalidade esta invalido, a excecao deveria ter pegado");
        } catch (ItemInvalidoException e) {
		}
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    /**
     * Test of getPenalidade method, of class Armadura.
     */
    @Test
    public void testGetPenalidade() {
        System.out.println("getPenalidade");
        int expResult = 0;
        int result = instance.getPenalidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
    /**
     * Test of toString method, of class Armadura.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "Nome = Armadura; Descricao = Descricao da Armadura; Preco = 0; Usando = false; Bonus de Atributo = [1, 2, 3, 4, 5, 6, 7, 8]; Habilidade Necessaria = null; Absorcao Arma Distancia = 0; Absorcao Arma de Corpo a Corpo = 0; Penalidade = 0; Regiao do Corpo = A";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

   
}
