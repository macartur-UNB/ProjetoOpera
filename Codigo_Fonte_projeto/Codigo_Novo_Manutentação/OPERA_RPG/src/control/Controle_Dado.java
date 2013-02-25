package control;

import java.io.FileNotFoundException;
import java.io.IOException;
import model.classes.Dado;
import model.dao.DAO_Dado;
import model.exception.ArquivoInvalidoException;
import model.exception.DadoInvalidoException;
import model.exception.DeletarInvalidoException;


public class Controle_Dado {
    
    /**
     * Cadastrar dado 
     * @param rolagem
     * @param lados
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ClassNotFoundException
     * @throws ArquivoInvalidoException
     * @throws DadoInvalidoException 
     */
    public static void cadDado(int rolagem, int lados) 
                                       throws FileNotFoundException,IOException,
                                                         ClassNotFoundException, 
                                                       ArquivoInvalidoException,
                                                          DadoInvalidoException{
        
        Dado dado = new Dado(rolagem, lados);
        if(dado != null){
            DAO_Dado.gravarDADO(dado);
        }
    }
    
    /**
     * encontrar dado cadastrado
     * @param nome_dado
     * @return
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ClassNotFoundException
     * @throws ArquivoInvalidoException 
     */
    public static Dado encontrarDado(String nome_dado) 
                                       throws FileNotFoundException,IOException,
                                              ClassNotFoundException, 
                                                       ArquivoInvalidoException{
    
        Dado dado = DAO_Dado.carregarDado(nome_dado);
        
        return dado;
    }
    /**
     * listar dados cadastrados
     * @return String[]
     */
    public static String[] listarTodosDados(){
       return DAO_Dado.listarTodosDados();
    }
    /**
     * remover um dado
     * @param nome_dado
     * @throws DeletarInvalidoException
     * @throws IOException
     * @throws ArquivoInvalidoException 
     */
    public static void removerDado(String nome_dado)
                                                throws DeletarInvalidoException, 
                                                                    IOException,
                                                       ArquivoInvalidoException{
        
         DAO_Dado.removerDado(nome_dado);
    }
    /**
     * remover todos os dados
     * @throws DeletarInvalidoException
     * @throws IOException
     * @throws ArquivoInvalidoException 
     */
    public static void removerTodosDados() 
                                                throws DeletarInvalidoException,
                                                       IOException, 
                                                       ArquivoInvalidoException{
        
        DAO_Dado.removerTodosDados();
    }
    
    
}
