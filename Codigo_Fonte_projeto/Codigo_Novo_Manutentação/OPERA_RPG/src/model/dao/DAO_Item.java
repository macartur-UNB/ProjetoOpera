package model.dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import model.classes.Arma_A_Distancia;
import model.classes.Arma_Corpo_A_Corpo;
import model.classes.Armadura;
import model.classes.Constante_Endereco;
import model.classes.Item;
import model.exception.ArquivoInvalidoException;
import model.exception.DeletarInvalidoException;

public class DAO_Item {   
    
    private static final String ENDERECO_ITEM_GENERICO = Constante_Endereco.ITEM_GENERICO;
    private static final String ENDERECO_ITEM_ARMA_CORPO_A_CORPO = Constante_Endereco.ITEM_ARMA_CORPO_A_CORPO;
    private static final String ENDERECO_ITEM_ARMA_A_DISTANCIA = Constante_Endereco.ITEM_ARMA_A_DISTANCIA;
    private static final String ENDERECO_ITEM_ARMADURA = Constante_Endereco.ITEM_ARMADURA;
    
    public static void gravarItem(Item item) throws FileNotFoundException,
                                                    IOException, 
                                                       ArquivoInvalidoException{
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()
                           +ENDERECO_ITEM_GENERICO;
        if(DAO_Funcao.diretorioExiste(diretorio)){
            DAO_Funcao.criarArquivoOpera(diretorio, item.getNome(), item);
        }
    }
    
    public static void gravarArma_Corpo_A_Corpo(Arma_Corpo_A_Corpo arma)
                                                   throws FileNotFoundException, 
                                                          IOException, 
                                                       ArquivoInvalidoException{
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+
                   ENDERECO_ITEM_ARMA_CORPO_A_CORPO;        
        if(DAO_Funcao.diretorioExiste(diretorio)){
            DAO_Funcao.criarArquivoOpera(diretorio, arma.getNome(), arma);
        }
    }
   public static void gravarArma_A_Distancia(Arma_A_Distancia arma)
                                                   throws FileNotFoundException, 
                                                          IOException, 
                                                       ArquivoInvalidoException{
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+
                  ENDERECO_ITEM_ARMA_A_DISTANCIA;
        if(DAO_Funcao.diretorioExiste(diretorio)){
            DAO_Funcao.criarArquivoOpera(diretorio, arma.getNome(), arma);
        }
        
    }
    public static void gravarArmadura(Armadura armadura) 
                                                   throws FileNotFoundException, 
                                                          IOException, 
                                                       ArquivoInvalidoException{
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()
                           +Constante_Endereco.ITEM_ARMADURA;
        if(DAO_Funcao.diretorioExiste(diretorio)){
            DAO_Funcao.criarArquivoOpera(diretorio,armadura.getNome(),armadura);
        }
    }
    
    public static void removerItemGenerico(String nome) 
                                                throws DeletarInvalidoException, 
                                                       IOException, 
                                                       ArquivoInvalidoException{
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()
                           +ENDERECO_ITEM_GENERICO;
        if(DAO_Funcao.arquivoOperaExiste(diretorio, nome)){
            DAO_Funcao.removerArquivo(diretorio, nome);
        }
    }
    public static void removerArma_A_Distancia(String nome) 
                                                throws DeletarInvalidoException, 
                                                       IOException, 
                                                       ArquivoInvalidoException{
         String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+
                  ENDERECO_ITEM_ARMA_A_DISTANCIA;
         if(DAO_Funcao.arquivoOperaExiste(diretorio, nome)){
               DAO_Funcao.removerArquivo(diretorio, nome);
         }
    }
    
    public static void removerArma_Corpo_A_Corpo(String nome) 
                                                throws DeletarInvalidoException, 
                                                       IOException, 
                                                       ArquivoInvalidoException{
         String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+
                   ENDERECO_ITEM_ARMA_CORPO_A_CORPO;
         if(DAO_Funcao.arquivoOperaExiste(diretorio, nome)){
               DAO_Funcao.removerArquivo(diretorio, nome);
         }
    }
        
    public static void removerArmadura(String nome)
                                                throws DeletarInvalidoException,
                                                       IOException, 
                                                       ArquivoInvalidoException{
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()
                           +Constante_Endereco.ITEM_ARMADURA;
        if(DAO_Funcao.arquivoOperaExiste(diretorio, nome)){
               DAO_Funcao.removerArquivo(diretorio, nome);
         }
    }
    
    public static Item encontrarItemGenerico(String nome) 
                                                   throws FileNotFoundException, 
                                                          ClassNotFoundException, 
                                                          IOException, 
                                                       ArquivoInvalidoException{
        Item item = null;   
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()
                           +ENDERECO_ITEM_GENERICO;
        if(DAO_Funcao.arquivoOperaExiste(diretorio, nome)){
            item =(Item) DAO_Funcao.carregarArquivoOpera(diretorio, nome);
        }
        return item;
    }
    
    public static Arma_Corpo_A_Corpo encontrarArma_Corpo_A_Corpo(String nome)
                                                throws FileNotFoundException,
                                                       IOException, 
                                                       ClassNotFoundException, 
                                                       ArquivoInvalidoException{
            Arma_Corpo_A_Corpo acc = null;
            String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+
                   ENDERECO_ITEM_ARMA_CORPO_A_CORPO;
            if(DAO_Funcao.arquivoOperaExiste(diretorio, nome)){
                acc =(Arma_Corpo_A_Corpo) 
                               DAO_Funcao.carregarArquivoOpera(diretorio, nome);
            }
            return acc;
    }
    
    public static Arma_A_Distancia encontrarArma_A_Distancia(String nome) 
                                                   throws FileNotFoundException, 
                                                          IOException, 
                                                          ClassNotFoundException, 
                                                       ArquivoInvalidoException{
        Arma_A_Distancia aad = null;
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+
                  ENDERECO_ITEM_ARMA_A_DISTANCIA;
        if(DAO_Funcao.arquivoOperaExiste(diretorio, nome)){
                aad =(Arma_A_Distancia) 
                               DAO_Funcao.carregarArquivoOpera(diretorio, nome);
        }
        return aad;
    }
    public static Armadura encontrarArmadura(String nome) 
                                     throws FileNotFoundException,
                                            ClassNotFoundException, IOException,
                                                       ArquivoInvalidoException{
        Armadura a = null;
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()+
                  ENDERECO_ITEM_ARMADURA;
        if(DAO_Funcao.arquivoOperaExiste(diretorio, nome)){
                a =(Armadura) DAO_Funcao.carregarArquivoOpera(diretorio, nome);
        }
        return a;
    }
    public static boolean ItemGenericoExiste(String item){
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()
                           +ENDERECO_ITEM_GENERICO;
        return DAO_Funcao.arquivoOperaExiste(diretorio, item);
    }
    public static boolean ArmaduraExiste(String armadura){
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()
                           +ENDERECO_ITEM_ARMADURA;
        return DAO_Funcao.arquivoOperaExiste(diretorio, armadura);
    }
    public static boolean ArmaCorpo_A_CorpoExiste(String arma){
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco()
                           +ENDERECO_ITEM_ARMA_CORPO_A_CORPO;
        return DAO_Funcao.arquivoOperaExiste(diretorio, arma);
    }
    public static boolean Arma_A_DistanciaExiste(String arma){
        String diretorio= DAO_Jogo.getJogoRodando().getEndereco()
                          +ENDERECO_ITEM_ARMA_A_DISTANCIA;
        return DAO_Funcao.arquivoOperaExiste(diretorio, arma);
    }
    
    public static String[] listarItem(String tipo){ 
        String diretorio = DAO_Jogo.getJogoRodando().getEndereco();
        switch(tipo){
            case "Generico":
                diretorio += Constante_Endereco.ITEM_GENERICO;
                break;
            case "Arma a Distancia":
                diretorio += Constante_Endereco.ITEM_ARMA_A_DISTANCIA;
                break;
            case "Arma Corpo a Corpo":
                diretorio += Constante_Endereco.ITEM_ARMA_CORPO_A_CORPO;
                break;
            case "Armadura":
                diretorio += Constante_Endereco.ITEM_ARMADURA;
                break;
        }
        String s[];
        s = DAO_Funcao.listarArquivosOpera(diretorio);
        return s;
    }
    
}
