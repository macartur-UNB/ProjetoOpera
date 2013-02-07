/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import model.classes.Constante_Endereco;
import model.classes.Jogo;
import model.exception.ArquivoInvalidoException;
import model.exception.DeletarInvalidoException;
import model.exception.DiretorioInvalidoException;
import model.exception.JogoInvalidoException;

/**
 *
 * @author Macartur
 */
public class DAO_Jogo {
    
    private static final String DIRETORIO_RAIZ = "C:\\Opera";
    private static final String DIRETORIO_OPERA = DIRETORIO_RAIZ+"\\Jogos";
    private static Jogo JOGO_RODANDO;
    
    private static String ENDERECO_FICHA = Constante_Endereco.FICHA;
    private static String ENDERECO_FICHA_JOGADOR = Constante_Endereco.FICHA_JOGADOR;
    private static String ENDERECO_FICHA_NPC = Constante_Endereco.FICHA_NPC;
    private static String ENDERECO_FICHA_MONSTRO = Constante_Endereco.FICHA_MONSTRO;
    
    private static String ENDERECO_HABILIDADE = Constante_Endereco.HABILIDADE;
    private static String ENDERECO_HABILIDADE_FISICA = Constante_Endereco.HABILIDADE_FISICA;
    private static String ENDERECO_HABILIDADE_PSIQUICA = Constante_Endereco.HABILIDADE_PSIQUICA;
    private static String ENDERECO_HABILIDADE_BELICA = Constante_Endereco.HABILIDADE_BELICA;
    
    private static final String ENDERECO_CARACTERISTICA = Constante_Endereco.CARACTERISTICA;
    private static String ENDERECO_CARACTERISTICA_FISICA = Constante_Endereco.CARACTERISTICA_FISICA;
    private static String ENDERECO_CARACTERISTICA_PSIQUICA = Constante_Endereco.CARACTERISTICA_PSIQUICA;
    private static String ENDERECO_CARACTERISTICA_RACIAL = Constante_Endereco.CARACTERISTICA_RACIAL;
    
    private static final String ENDERECO_ITEM = Constante_Endereco.ITEM;
    private static final String ENDERECO_ITEM_GENERICO = Constante_Endereco.ITEM_GENERICO;
    private static final String ENDERECO_ITEM_ARMA = Constante_Endereco.ITEM_ARMA;
    private static final String ENDERECO_ITEM_ARMA_CORPO_A_CORPO = Constante_Endereco.ITEM_ARMA_CORPO_A_CORPO;
    private static final String ENDERECO_ITEM_ARMA_CORPO_A_CORPO_BRANCA = Constante_Endereco.ITEM_ARMA_CORPO_A_CORPO_BRANCA;
    private static final String ENDERECO_ITEM_ARMA_CORPO_A_CORPO_DE_FOGO = Constante_Endereco.ITEM_ARMA_CORPO_A_CORPO_DE_FOGO;
    private static final String ENDERECO_ITEM_ARMA_A_DISTANCIA = Constante_Endereco.ITEM_ARMA_A_DISTANCIA;
    private static final String ENDERECO_ITEM_ARMADURA = Constante_Endereco.ITEM_ARMADURA;
    
    private static final String ENDERECO_DADO = Constante_Endereco.DADO;
    
    public static void criarDiretorioJogo(Jogo jogo) throws DiretorioInvalidoException{
        DAO_Funcao.criarDiretorio(jogo.getEndereco());
    }    
    
    public static void removerArquivosJogo(Jogo jogo) throws DeletarInvalidoException, IOException, ArquivoInvalidoException{
        DAO_Funcao.deletarArquivos(jogo.getEndereco());
    }
    public static void removerDiretorioJogo(Jogo jogo) throws DeletarInvalidoException, DiretorioInvalidoException, ArquivoInvalidoException, IOException{
        DAO_Funcao.removerDiretorio(jogo.getEndereco());
    }
    
    public static void criarDiretorioFichas(Jogo jogo) throws DiretorioInvalidoException{
        DAO_Funcao.criarDiretorio(jogo.getEndereco() + ENDERECO_FICHA);
        DAO_Funcao.criarDiretorio(jogo.getEndereco() + ENDERECO_FICHA_JOGADOR);
        DAO_Funcao.criarDiretorio(jogo.getEndereco() + ENDERECO_FICHA_NPC);
        DAO_Funcao.criarDiretorio(jogo.getEndereco() + ENDERECO_FICHA_MONSTRO);
    }

    public static void removerArquivosFichas(Jogo jogo) throws DeletarInvalidoException, IOException, ArquivoInvalidoException{
       DAO_Funcao.deletarArquivos(jogo.getEndereco() + ENDERECO_FICHA_JOGADOR);
       DAO_Funcao.deletarArquivos(jogo.getEndereco() + ENDERECO_FICHA_NPC);
       DAO_Funcao.deletarArquivos(jogo.getEndereco() + ENDERECO_FICHA_MONSTRO);
       DAO_Funcao.deletarArquivos(jogo.getEndereco() + ENDERECO_FICHA);
    }

    public static void removerDiretorioFichas(Jogo jogo) throws DiretorioInvalidoException, DeletarInvalidoException, IOException, ArquivoInvalidoException{
       DAO_Funcao.removerDiretorio(jogo.getEndereco() + ENDERECO_FICHA);
    }


    public static void criarDiretorioHabilidades(Jogo jogo) throws DiretorioInvalidoException{
        DAO_Funcao.criarDiretorio(jogo.getEndereco() + ENDERECO_HABILIDADE);
        DAO_Funcao.criarDiretorio(jogo.getEndereco() + ENDERECO_HABILIDADE_FISICA);
        DAO_Funcao.criarDiretorio(jogo.getEndereco() + ENDERECO_HABILIDADE_PSIQUICA);
        DAO_Funcao.criarDiretorio(jogo.getEndereco() + ENDERECO_HABILIDADE_BELICA);
    }
    public static void removerArquivosHabilidades(Jogo jogo) throws DeletarInvalidoException, IOException, ArquivoInvalidoException{
        DAO_Funcao.deletarArquivos(jogo.getEndereco() + ENDERECO_HABILIDADE_FISICA);
        DAO_Funcao.deletarArquivos(jogo.getEndereco() + ENDERECO_HABILIDADE_PSIQUICA);
        DAO_Funcao.deletarArquivos(jogo.getEndereco() + ENDERECO_HABILIDADE_BELICA);
        DAO_Funcao.deletarArquivos(jogo.getEndereco() + ENDERECO_HABILIDADE);
    }

    public static void removerDiretorioHabilidades(Jogo jogo) throws DeletarInvalidoException, DiretorioInvalidoException, IOException, ArquivoInvalidoException{
        DAO_Funcao.removerDiretorio(jogo.getEndereco() + ENDERECO_HABILIDADE);
    }
    
    
    public static void criarDiretorioCaracteristicas(Jogo jogo) throws DiretorioInvalidoException{
        DAO_Funcao.criarDiretorio(jogo.getEndereco() + ENDERECO_CARACTERISTICA);
        DAO_Funcao.criarDiretorio(jogo.getEndereco() + ENDERECO_CARACTERISTICA_FISICA);
        DAO_Funcao.criarDiretorio(jogo.getEndereco() + ENDERECO_CARACTERISTICA_PSIQUICA);
        DAO_Funcao.criarDiretorio(jogo.getEndereco() + ENDERECO_CARACTERISTICA_RACIAL);
    }
    
    public static void removerArquivosCaracteristicas(Jogo jogo) throws DeletarInvalidoException, IOException, ArquivoInvalidoException{
        DAO_Funcao.deletarArquivos(jogo.getEndereco() + ENDERECO_CARACTERISTICA_FISICA);
        DAO_Funcao.deletarArquivos(jogo.getEndereco() + ENDERECO_CARACTERISTICA_PSIQUICA);
        DAO_Funcao.deletarArquivos(jogo.getEndereco() + ENDERECO_CARACTERISTICA_RACIAL);
        DAO_Funcao.deletarArquivos(jogo.getEndereco() + ENDERECO_CARACTERISTICA);
    }
    
    public static void removerDiretorioCaracteristicas(Jogo jogo) throws DeletarInvalidoException, DiretorioInvalidoException, IOException, ArquivoInvalidoException{
        DAO_Funcao.removerDiretorio(jogo.getEndereco() + ENDERECO_CARACTERISTICA);
    }
    
    public static void criarDiretorioItens(Jogo jogo) throws DiretorioInvalidoException{
        DAO_Funcao.criarDiretorio(jogo.getEndereco() + ENDERECO_ITEM);
        DAO_Funcao.criarDiretorio(jogo.getEndereco() + ENDERECO_ITEM_GENERICO);
        DAO_Funcao.criarDiretorio(jogo.getEndereco() + ENDERECO_ITEM_ARMA);
        DAO_Funcao.criarDiretorio(jogo.getEndereco() + ENDERECO_ITEM_ARMA_CORPO_A_CORPO);
        DAO_Funcao.criarDiretorio(jogo.getEndereco() + ENDERECO_ITEM_ARMA_CORPO_A_CORPO_BRANCA);
        DAO_Funcao.criarDiretorio(jogo.getEndereco() + ENDERECO_ITEM_ARMA_CORPO_A_CORPO_DE_FOGO);
        DAO_Funcao.criarDiretorio(jogo.getEndereco() + ENDERECO_ITEM_ARMA_A_DISTANCIA);
        DAO_Funcao.criarDiretorio(jogo.getEndereco() + ENDERECO_ITEM_ARMADURA);
    }
    
    public static void removerArquivosItens(Jogo jogo) throws DeletarInvalidoException, IOException, ArquivoInvalidoException{
        DAO_Funcao.deletarArquivos(jogo.getEndereco() + ENDERECO_ITEM);
        DAO_Funcao.deletarArquivos(jogo.getEndereco() + ENDERECO_ITEM_GENERICO);
        DAO_Funcao.deletarArquivos(jogo.getEndereco() + ENDERECO_ITEM_ARMA_CORPO_A_CORPO_BRANCA);
        DAO_Funcao.deletarArquivos(jogo.getEndereco() + ENDERECO_ITEM_ARMA_CORPO_A_CORPO_DE_FOGO);
        DAO_Funcao.deletarArquivos(jogo.getEndereco() + ENDERECO_ITEM_ARMA_A_DISTANCIA);
        DAO_Funcao.deletarArquivos(jogo.getEndereco() + ENDERECO_ITEM_ARMADURA);
    }
    public static void removerDiretoriosItens(Jogo jogo) throws DeletarInvalidoException, DiretorioInvalidoException, IOException, ArquivoInvalidoException{
        DAO_Funcao.removerDiretorio(jogo.getEndereco() + ENDERECO_ITEM);
    }
    
    
    public static void criarDiretorioDados(Jogo jogo) throws DiretorioInvalidoException{
        DAO_Funcao.criarDiretorio(jogo.getEndereco() + ENDERECO_DADO);
    }
   
    public static void removerArquivosDados(Jogo jogo) throws DeletarInvalidoException, IOException, ArquivoInvalidoException{
        DAO_Funcao.deletarArquivos(jogo.getEndereco() + ENDERECO_DADO);
    }
    public static void removerDiretorioDados(Jogo jogo) throws DeletarInvalidoException, DiretorioInvalidoException, IOException, ArquivoInvalidoException{
        DAO_Funcao.removerDiretorio(jogo.getEndereco() + ENDERECO_DADO);
    }
    
    public static void criarDiretoriosJogo(Jogo jogo) throws DiretorioInvalidoException{ 
        if(!DAO_Funcao.diretorioExiste(jogo.getEndereco())){
           criarDiretorioJogo(jogo);
           criarDiretorioCaracteristicas(jogo);
           criarDiretorioDados(jogo);
           criarDiretorioFichas(jogo);
           criarDiretorioHabilidades(jogo);          
           criarDiretorioItens(jogo);
        }else{
            throw new DiretorioInvalidoException("Não foi possivel criar diretorio,jogo já existente");
        }        
    }
   
    public static void deletarJogo(String nome) throws DeletarInvalidoException, DiretorioInvalidoException, IOException, ArquivoInvalidoException{
        Jogo jogo = new Jogo(nome, DIRETORIO_OPERA + "\\" + nome);
        DAO_Funcao.removerDiretorio(jogo.getEndereco());
    }
  
    public static void deletarTodosJogos() throws DeletarInvalidoException,
            DiretorioInvalidoException, IOException, ArquivoInvalidoException{
        String jogos[] = jogosExistentes();
        
        for(int i=0;i<jogos.length;i++)
        {
            deletarJogo(jogos[i]);
        }
        
    }
    
    public static void verificarDiretorioRaiz() throws DiretorioInvalidoException{
        if(!DAO_Funcao.diretorioExiste(DIRETORIO_OPERA)){
            DAO_Funcao.criarDiretorio(DIRETORIO_RAIZ);
            DAO_Funcao.criarDiretorio(DIRETORIO_OPERA);
            
        }
    }
        
    
    public static void carregarJogo(String nome) throws FileNotFoundException, IOException, ClassNotFoundException, JogoInvalidoException, ArquivoInvalidoException{
        if(jogoExiste(nome)){
            JOGO_RODANDO = (Jogo) DAO_Funcao.carregarArquivoOpera(DIRETORIO_OPERA+"\\"+nome+"\\", nome);
        }else{
            throw new JogoInvalidoException("O Jogo - " + nome + " - Nao Existe!");
        }
    } 
    
    public static Jogo getJogoRodando(){
        return JOGO_RODANDO;
    }
    
    public static String[] jogosExistentes(){        
        return DAO_Funcao.listarDiretorio(DIRETORIO_OPERA);        
    }
     
    public static boolean jogoExiste(String nome){
        Jogo jogo = new Jogo(nome, DIRETORIO_OPERA+"\\"+nome);
        return DAO_Funcao.diretorioExiste(jogo.getEndereco());
    }     
    
    public static void gravarJogo(Jogo jogo) throws FileNotFoundException, IOException, ClassNotFoundException, ArquivoInvalidoException{
        DAO_Funcao.criarArquivoOpera(jogo.getEndereco(), jogo.getNome(), jogo);
    }
    
    public static void criarJogo(String nome) throws DiretorioInvalidoException, FileNotFoundException, IOException, ClassNotFoundException, ArquivoInvalidoException, JogoInvalidoException{
        Jogo jogo = new Jogo(nome, DIRETORIO_OPERA + "\\" + nome);
        verificarDiretorioRaiz();
        criarDiretoriosJogo(jogo);
        gravarJogo(jogo);
        carregarJogo(nome);
    }
    
}
