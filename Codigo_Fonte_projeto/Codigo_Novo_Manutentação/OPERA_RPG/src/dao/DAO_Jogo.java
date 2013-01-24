/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import exception.ArquivoInvalidoException;
import exception.DeletarInvalidoException;
import exception.DiretorioInvalidoException;
import exception.JogoInvalidoException;
import java.io.FileNotFoundException;
import java.io.IOException;
import model.Constantes;
import model.Jogo;

/**
 *
 * @author Macartur
 */
public class DAO_Jogo {
    
    private static final String DIRETORIO_OPERA = "C:\\Opera";
    
    private static Jogo JOGO_RODANDO;
    
    public static void criarDiretorioJogo(Jogo jogo) throws DiretorioInvalidoException{
        DAO_Funcoes.criarDiretorio(jogo.getEndereco());
    }    
    
    public static void removerArquivosJogo(Jogo jogo) throws DeletarInvalidoException{
        DAO_Funcoes.deletarArquivos(jogo.getEndereco());
    }
    public static void removerDiretorioJogo(Jogo jogo) throws DeletarInvalidoException, DiretorioInvalidoException{
        DAO_Funcoes.removerDiretorio(jogo.getEndereco());
    }
    
    public static void criarDiretorioFichas(Jogo jogo ) throws DiretorioInvalidoException{
        DAO_Funcoes.criarDiretorio(jogo.getEndereco() + Constantes.Endereco.FICHA);
        DAO_Funcoes.criarDiretorio(jogo.getEndereco() + Constantes.Endereco.FICHA_JOGADOR);
        DAO_Funcoes.criarDiretorio(jogo.getEndereco() + Constantes.Endereco.FICHA_NPC);
        DAO_Funcoes.criarDiretorio(jogo.getEndereco() + Constantes.Endereco.FICHA_MONSTRO);
    }

    public static void removerArquivosFichas(Jogo jogo) throws DeletarInvalidoException{
       DAO_Funcoes.deletarArquivos(jogo.getEndereco() + Constantes.Endereco.FICHA_JOGADOR);
       DAO_Funcoes.deletarArquivos(jogo.getEndereco() + Constantes.Endereco.FICHA_NPC);
       DAO_Funcoes.deletarArquivos(jogo.getEndereco() + Constantes.Endereco.FICHA_MONSTRO);
       DAO_Funcoes.deletarArquivos(jogo.getEndereco() + Constantes.Endereco.FICHA);
    }

    public static void removerDiretorioFichas(Jogo jogo) throws DiretorioInvalidoException, DeletarInvalidoException{
       DAO_Funcoes.removerDiretorio(jogo.getEndereco() + Constantes.Endereco.FICHA);
    }


    public static void criarDiretorioHabilidades(Jogo jogo) throws DiretorioInvalidoException{
        DAO_Funcoes.criarDiretorio(jogo.getEndereco() + Constantes.Endereco.HABILIDADE);
        DAO_Funcoes.criarDiretorio(jogo.getEndereco() + Constantes.Endereco.HABILIDADE_FISICA);
        DAO_Funcoes.criarDiretorio(jogo.getEndereco() + Constantes.Endereco.HABILIDADE_PSIQUICA);
        DAO_Funcoes.criarDiretorio(jogo.getEndereco() + Constantes.Endereco.HABILIDADE_BELICA);
    }
    public static void removerArquivosHabilidades(Jogo jogo) throws DeletarInvalidoException{
        DAO_Funcoes.deletarArquivos(jogo.getEndereco() + Constantes.Endereco.HABILIDADE_FISICA);
        DAO_Funcoes.deletarArquivos(jogo.getEndereco() + Constantes.Endereco.HABILIDADE_PSIQUICA);
        DAO_Funcoes.deletarArquivos(jogo.getEndereco() + Constantes.Endereco.HABILIDADE_BELICA);
        DAO_Funcoes.deletarArquivos(jogo.getEndereco() + Constantes.Endereco.HABILIDADE);
    }

    public static void removerDiretorioHabilidades(Jogo jogo) throws DeletarInvalidoException, DiretorioInvalidoException{
        DAO_Funcoes.removerDiretorio(jogo.getEndereco() + Constantes.Endereco.HABILIDADE);
    }
    
    
    public static void criarDiretorioCaracteristicas(Jogo jogo) throws DiretorioInvalidoException{
        DAO_Funcoes.criarDiretorio(jogo.getEndereco() + Constantes.Endereco.CARACTERISTICA);
        DAO_Funcoes.criarDiretorio(jogo.getEndereco() + Constantes.Endereco.CARACTERISTICA_FISICA);
        DAO_Funcoes.criarDiretorio(jogo.getEndereco() + Constantes.Endereco.CARACTERISTICA_PSIQUICA);
        DAO_Funcoes.criarDiretorio(jogo.getEndereco() + Constantes.Endereco.CARACTERISTICA_BELICA);
    }
    
    public static void removerArquivosCaracteristicas(Jogo jogo) throws DeletarInvalidoException{
        DAO_Funcoes.deletarArquivos(jogo.getEndereco() + Constantes.Endereco.CARACTERISTICA_FISICA);
        DAO_Funcoes.deletarArquivos(jogo.getEndereco() + Constantes.Endereco.CARACTERISTICA_PSIQUICA);
        DAO_Funcoes.deletarArquivos(jogo.getEndereco() + Constantes.Endereco.CARACTERISTICA_BELICA);
        DAO_Funcoes.deletarArquivos(jogo.getEndereco() + Constantes.Endereco.CARACTERISTICA);
    }
    
    public static void removerDiretorioCaracteristicas(Jogo jogo) throws DeletarInvalidoException, DiretorioInvalidoException{
        DAO_Funcoes.removerDiretorio(jogo.getEndereco() + Constantes.Endereco.CARACTERISTICA);
    }
    
    public static void criarDiretorioItens(Jogo jogo) throws DiretorioInvalidoException{
        DAO_Funcoes.criarDiretorio(jogo.getEndereco() + Constantes.Endereco.ITEM);
        DAO_Funcoes.criarDiretorio(jogo.getEndereco() + Constantes.Endereco.ITEM_GENERICO);
        DAO_Funcoes.criarDiretorio(jogo.getEndereco() + Constantes.Endereco.ITEM_ARMA);
        DAO_Funcoes.criarDiretorio(jogo.getEndereco() + Constantes.Endereco.ITEM_ARMA_CORPO_A_CORPO);
        DAO_Funcoes.criarDiretorio(jogo.getEndereco() + Constantes.Endereco.ITEM_ARMA_CORPO_A_CORPO_BRANCA);
        DAO_Funcoes.criarDiretorio(jogo.getEndereco() + Constantes.Endereco.ITEM_ARMA_CORPO_A_CORPO_DE_FOGO);
        DAO_Funcoes.criarDiretorio(jogo.getEndereco() + Constantes.Endereco.ITEM_ARMA_A_DISTANCIA);
        DAO_Funcoes.criarDiretorio(jogo.getEndereco() + Constantes.Endereco.ITEM_ARMADURA);
    }
    
    public static void removerArquivosItens(Jogo jogo) throws DeletarInvalidoException{
        DAO_Funcoes.deletarArquivos(jogo.getEndereco() + Constantes.Endereco.ITEM);
        DAO_Funcoes.deletarArquivos(jogo.getEndereco() + Constantes.Endereco.ITEM_GENERICO);
        DAO_Funcoes.deletarArquivos(jogo.getEndereco() + Constantes.Endereco.ITEM_ARMA_CORPO_A_CORPO_BRANCA);
        DAO_Funcoes.deletarArquivos(jogo.getEndereco() + Constantes.Endereco.ITEM_ARMA_CORPO_A_CORPO_DE_FOGO);
        DAO_Funcoes.deletarArquivos(jogo.getEndereco() + Constantes.Endereco.ITEM_ARMA_A_DISTANCIA);
        DAO_Funcoes.deletarArquivos(jogo.getEndereco() + Constantes.Endereco.ITEM_ARMADURA);
    }
    public static void removerDiretoriosItens(Jogo jogo) throws DeletarInvalidoException, DiretorioInvalidoException{
        DAO_Funcoes.removerDiretorio(jogo.getEndereco() + Constantes.Endereco.ITEM);
    }
    
    
    public static void criarDiretorioDados(Jogo jogo) throws DiretorioInvalidoException{
        DAO_Funcoes.criarDiretorio(jogo.getEndereco() + Constantes.Endereco.DADO);
    }
   
    public static void removerArquivosDados(Jogo jogo) throws DeletarInvalidoException{
        DAO_Funcoes.deletarArquivos(jogo.getEndereco() + Constantes.Endereco.DADO);
    }
    public static void removerDiretorioDados(Jogo jogo) throws DeletarInvalidoException, DiretorioInvalidoException{
        DAO_Funcoes.removerDiretorio(jogo.getEndereco() + Constantes.Endereco.DADO);
    }
    
    public static void criarDiretoriosJogo(Jogo jogo) throws DiretorioInvalidoException{ 
        if(!DAO_Funcoes.diretorioExiste(jogo.getEndereco())){
           criarDiretorioJogo(jogo);
           criarDiretorioCaracteristicas(jogo);
           criarDiretorioDados(jogo);
           criarDiretorioFichas(jogo);
           criarDiretorioHabilidades(jogo);          
           criarDiretorioItens(jogo);
        }        
    }
   
    public static void deletarJogo(String nome) throws DeletarInvalidoException, DiretorioInvalidoException{
        Jogo jogo = new Jogo(nome, DIRETORIO_OPERA + "\\" + nome);
        DAO_Funcoes.removerDiretorio(jogo.getEndereco());
    }
  
    public static void verificarDiretorioRaiz() throws DiretorioInvalidoException{
        if(!DAO_Funcoes.diretorioExiste(DIRETORIO_OPERA)){
            DAO_Funcoes.criarDiretorio(DIRETORIO_OPERA);
        }
    }
        
    
    public static void carregarJogo(String nome) throws FileNotFoundException, IOException, ClassNotFoundException, JogoInvalidoException{
        Jogo jogo = new Jogo(nome, DIRETORIO_OPERA+"\\"+nome);
        if(jogoExiste(jogo)){
            JOGO_RODANDO = jogo;
        }else{
            throw new JogoInvalidoException("O Jogo - " + jogo.getNome() + " - Nao Existe!");
        }
    } 
    
    public static Jogo getJogoRodando(){
        return JOGO_RODANDO;
    }
    
    public static String[] jogosExistentes(){        
        return DAO_Funcoes.listarDiretorio(DIRETORIO_OPERA);        
    }
     
    public static boolean jogoExiste(Jogo jogo){
        return DAO_Funcoes.diretorioExiste(jogo.getEndereco());
    }     
    
    public static void gravarJogo() throws FileNotFoundException, IOException, ClassNotFoundException, ArquivoInvalidoException{
        DAO_Funcoes.criarArquivoOpera(JOGO_RODANDO.getEndereco(), JOGO_RODANDO.getNome(), JOGO_RODANDO);
    }
    
    public static void criarJogo(String nome) throws DiretorioInvalidoException{
        Jogo jogo = new Jogo(nome, DIRETORIO_OPERA + "\\" + nome);
        JOGO_RODANDO = jogo;
        criarDiretorioJogo(JOGO_RODANDO);
        criarDiretorioFichas(JOGO_RODANDO);
        criarDiretorioHabilidades(JOGO_RODANDO);
        criarDiretorioCaracteristicas(JOGO_RODANDO);
        criarDiretorioItens(JOGO_RODANDO);
        criarDiretorioDados(JOGO_RODANDO);
    }
    
}
