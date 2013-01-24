
import control.Controle_Caracteristica;
import control.Controle_Item;
import control.Controle_Jogo;
import dao.DAO_Funcoes;
import dao.DAO_Jogo;
import exception.ArquivoInvalidoException;
import exception.DeletarInvalidoException;
import exception.DiretorioInvalidoException;
import exception.JogoInvalidoException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Constantes;
import model.Ficha;
import model.Item;

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
            Controle_Jogo.abrirJogo("JogoLuciano");
        } catch (IOException | ClassNotFoundException | JogoInvalidoException e) {
            System.out.println(e.getMessage());
        }
        
        
        
        try{
            Item item = Controle_Item.encontrarItemGenerico("Item");
            System.out.println(item.getNome());
        }catch(ClassNotFoundException | IOException e){
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
            DAO_Funcoes.removerDiretorio(diretorio);
        } catch (DiretorioInvalidoException | DeletarInvalidoException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    
    
    public static void testes01(){
        try {
            String diretorio = "C:\\LucianoPrestes";
            if(!DAO_Funcoes.diretorioExiste(diretorio)){
                DAO_Funcoes.criarDiretorio(diretorio);
            }
            System.out.println(new File(diretorio, "teste.opera").createNewFile());
            //DAO_Funcoes.removerDiretorio(diretorio);
            //String diretorios[] = DAO_Funcoes.listarDiretorio(diretorio);
            //String arquivosOpera[] = DAO_Funcoes.listarArquivosOpera(diretorio);
            //System.out.println(DAO_Funcoes.arquivoExiste(diretorio, "Nova Pasta"));
            //System.out.println(arquivosOpera[0]);
            DAO_Funcoes.removerArquivo(diretorio, "teste.opera");
            
            Ficha ficha = new Ficha("NtWarrior", "Luciano", "jogador", "", 0, 0, null);
            
            //DAO_Funcoes.criarArquivoOpera(diretorio, ficha.getPersonagem(), ficha);
            
            Ficha fichaCarregada = (Ficha)DAO_Funcoes.carregarArquivoOpera(diretorio, ficha.getPersonagem());
            System.out.println(fichaCarregada.getJogador());
            
            Ficha ficha2 = new Ficha("NtWarrior", "Flavio", "jogador", "", 0, 0, null);
            
            DAO_Funcoes.sobrescreverArquivoOpera(diretorio, ficha2.getPersonagem(), ficha2);
            fichaCarregada = (Ficha)DAO_Funcoes.carregarArquivoOpera(diretorio, ficha2.getPersonagem());
            System.out.println(fichaCarregada.getJogador());
            
            
            //DAO_Funcoes.deletarArquivos(diretorio);
            //DAO_Funcoes.deletarDiretorios_E_Arquivos(diretorio);
            
        } catch (/*ArquivoInvalidoException |*/ ClassNotFoundException | DeletarInvalidoException | IOException | DiretorioInvalidoException e) {
            System.out.println(e.getMessage());
        }
    }
}
