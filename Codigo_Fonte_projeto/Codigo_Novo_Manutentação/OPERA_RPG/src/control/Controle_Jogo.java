/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.DAO_Jogo;
import exception.ArquivoInvalidoException;
import exception.DeletarInvalidoException;
import exception.DiretorioInvalidoException;
import exception.JogoInvalidoException;
import exception.Validacao;
import java.io.FileNotFoundException;
import java.io.IOException;
import model.Jogo;

public class Controle_Jogo {
    
    /**
     * Criar um novo Jogo
     * @param nome Nome do Jogo a ser criado
     * @throws DiretorioInvalidoException
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void criarJogo(String nome) throws DiretorioInvalidoException,
                                       FileNotFoundException, IOException,
                                       ArquivoInvalidoException,
                                       ClassNotFoundException {
       Validacao.validarCaracteresNome(nome, true);
       DAO_Jogo.criarJogo(nome);
    }
 
   public static void abrirJogo(String nome) throws FileNotFoundException,
    IOException, ClassNotFoundException, JogoInvalidoException{
       DAO_Jogo.carregarJogo(nome);
    }     
    
    public static void apagarJogo(String nome) throws DeletarInvalidoException, DiretorioInvalidoException, IOException, ArquivoInvalidoException{
        DAO_Jogo.deletarJogo(nome);
    }
   
    public static boolean jogoExiste(String nome){
        return DAO_Jogo.jogoExiste(nome);
    }
   
    public static String[] jogosExistentes(){
        return DAO_Jogo.jogosExistentes();
    } 
}
