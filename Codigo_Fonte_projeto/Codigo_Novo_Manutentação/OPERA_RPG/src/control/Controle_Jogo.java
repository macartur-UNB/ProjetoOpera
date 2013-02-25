package control;

import java.io.FileNotFoundException;
import java.io.IOException;
import model.dao.DAO_Jogo;
import model.exception.ArquivoInvalidoException;
import model.exception.DeletarInvalidoException;
import model.exception.DiretorioInvalidoException;
import model.exception.JogoInvalidoException;
import model.exception.PalavraInvalidaException;
import model.validacao.Validar;

public class Controle_Jogo {
    
    /**
     * Criar um novo Jogo
     * @param nome Nome do Jogo a ser criado
     * @throws DiretorioInvalidoException
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public static void criarJogo(String nome) 
                        throws DiretorioInvalidoException,IOException, 
                               FileNotFoundException, ClassNotFoundException,
                               ArquivoInvalidoException, JogoInvalidoException, 
                                                      PalavraInvalidaException {
       Validar.validarPalavra(nome, true);
       DAO_Jogo.criarJogo(nome);
    }
 
   public static void abrirJogo(String nome)
                            throws FileNotFoundException,IOException, 
                                   ClassNotFoundException,JogoInvalidoException, 
                                                       ArquivoInvalidoException{
       DAO_Jogo.carregarJogo(nome);
    }    
    
    public static void apagarJogo(String nome) 
                                    throws DeletarInvalidoException,IOException,
                                           DiretorioInvalidoException, 
                                                       ArquivoInvalidoException{
        DAO_Jogo.deletarJogo(nome);
    }
   public static void apagarTodosJogos() throws DeletarInvalidoException, 
                                                DiretorioInvalidoException, 
                                                IOException, 
                                                       ArquivoInvalidoException{
       DAO_Jogo.deletarTodosJogos();
   }
    public static boolean jogoExiste(String nome){
        return DAO_Jogo.jogoExiste(nome);
    }
   
    public static String[] jogosExistentes(){
        return DAO_Jogo.jogosExistentes();
    } 
    
     public static String jogoRodando(){
        return DAO_Jogo.getJogoRodando().getNome();
    }
}
