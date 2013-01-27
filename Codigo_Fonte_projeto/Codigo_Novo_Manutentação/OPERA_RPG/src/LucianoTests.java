
import control.Controle_Item;
import control.Controle_Jogo;
import dao.DAO_Funcao;
import exception.ArquivoInvalidoException;
import exception.DeletarInvalidoException;
import exception.DiretorioInvalidoException;
import exception.JogoInvalidoException;
import exception.NomeInvalidoException;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Ficha;
import model.Item;
import validacao.ValidarNome;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luciano
 */
public class LucianoTests {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        try {
            String nome = "Lucianoç)8*";
            String nomeValidado = ValidarNome.validarNome(nome, false);
            System.out.println(nomeValidado);
        } catch (NomeInvalidoException e) {
            System.out.println(e.getMessage());
        }
        
        
    }
    
    
    
    
    
    
    
    
    public static void teste03(){
        try {
            System.out.println("DAO_Funcao.carregarArquivoOpera");
            Ficha ficha = new Ficha("NtWarrior", "Luciano", "jogador", "campanha", 0, 0, null);
            System.out.println("1");
            
            if(!DAO_Funcao.diretorioExiste("C:\\LucianoOpera")){
                System.out.println("Diretorio Nao Existe");
                DAO_Funcao.criarDiretorio("C:\\LucianoOpera");
            }
            
            DAO_Funcao.criarArquivoOpera("C:\\LucianoOpera", ficha.getPersonagem(), ficha);
            Ficha ficha2 = (Ficha)DAO_Funcao.carregarArquivoOpera("C:\\LucianoOpera", "NtWarrior");
            System.out.println("2");
            System.out.println(ficha2.getPersonagem());
            System.out.println("3");
            DAO_Funcao.removerArquivo("C:\\LucianoOpera", "NtWarrior");
            //DAO_Funcao.removerDiretorio("C:\\LucianoOpera");
        } catch ( DeletarInvalidoException | DiretorioInvalidoException | IOException | ClassNotFoundException | ArquivoInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    public static void testItem(){
        try {
            Controle_Jogo.abrirJogo("JogoLuciano");
        } catch (IOException | ClassNotFoundException | JogoInvalidoException e) {
            System.out.println(e.getMessage());
        }
        
        try{
            Controle_Item.cadItemGenerico("Item", "Apenas um Item", 10);
        } catch(ArquivoInvalidoException | IOException e){
            System.out.println(e.getMessage());
        }
        
        
        try{
            Item item = Controle_Item.encontrarItemGenerico("Item");
            //System.out.println(item.getNome());
        }catch(ArquivoInvalidoException | ClassNotFoundException | IOException e){
            System.out.println(e.getMessage());
        }
        
        
        
        
        
        //System.out.println(DAO_Jogo.getJogoRodando().getEndereco()+Constantes.Endereco.ITEM_GENERICO);

        /*
        if(true){
            try {
                if(Controle_Item.encontrarItemGenerico("Item") == null) {
                    System.out.println("a");
                    try {
                        Controle_Item.cadItemGenerico("Item", "Apenas um Item", 10);
                    } catch (ArquivoInvalidoException e) {
                        System.out.println(e.getMessage());
                    }
                }            
                System.out.println("Itens Cadastrado Com Sucesso");
            } catch (ClassNotFoundException | IOException e) {
               System.out.println(e.getMessage());
            }
        }
        */
    }
    
    public static void testeCriarDeletarJogo(){
        try {
            Controle_Jogo.criarJogo("JogoLuciano");
        } catch (DiretorioInvalidoException | ArquivoInvalidoException | ClassNotFoundException | IOException e) {
            System.out.println(e.getMessage());
        }
        
        /*
        try {
            Controle_Jogo.apagarJogo("JogoLuciano");
        } catch (DeletarInvalidoException | DiretorioInvalidoException e) {
            System.out.println(e.getMessage());
        }
        */
    }
    
    
    public static void testes02(){
        try {
            String diretorio = "C:\\LucianoPrestes";
            DAO_Funcao.removerDiretorio(diretorio);
        } catch (ArquivoInvalidoException | IOException | DiretorioInvalidoException | DeletarInvalidoException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    
    
    public static void testes01(){
        try {
            String diretorio = "C:\\LucianoPrestes";
            if(!DAO_Funcao.diretorioExiste(diretorio)){
                DAO_Funcao.criarDiretorio(diretorio);
            }
            System.out.println(new File(diretorio, "teste.opera").createNewFile());
            //DAO_Funcoes.removerDiretorio(diretorio);
            //String diretorios[] = DAO_Funcao.listarDiretorio(diretorio);
            //String arquivosOpera[] = DAO_Funcao.listarArquivosOpera(diretorio);
            //System.out.println(DAO_Funcao.arquivoOperaExiste(diretorio, "Nova Pasta"));
            //System.out.println(arquivosOpera[0]);
            DAO_Funcao.removerArquivo(diretorio, "teste.opera");
            
            Ficha ficha = new Ficha("NtWarrior", "Luciano", "jogador", "", 0, 0, null);
            
            //DAO_Funcoes.criarArquivoOpera(diretorio, ficha.getPersonagem(), ficha);
            
            Ficha fichaCarregada = (Ficha)DAO_Funcao.carregarArquivoOpera(diretorio, ficha.getPersonagem());
            System.out.println(fichaCarregada.getJogador());
            
            Ficha ficha2 = new Ficha("NtWarrior", "Flavio", "jogador", "", 0, 0, null);
            
            
            fichaCarregada = (Ficha)DAO_Funcao.carregarArquivoOpera(diretorio, ficha2.getPersonagem());
            System.out.println(fichaCarregada.getJogador());
            
            
            //DAO_Funcoes.deletarArquivos(diretorio);
            //DAO_Funcoes.deletarDiretorios_E_Arquivos(diretorio);
            
        } catch (ArquivoInvalidoException | ClassNotFoundException | DeletarInvalidoException | IOException | DiretorioInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
