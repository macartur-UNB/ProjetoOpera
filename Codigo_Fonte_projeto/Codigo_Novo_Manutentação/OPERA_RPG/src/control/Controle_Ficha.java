/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.FileNotFoundException;
import java.io.IOException;
import model.classes.Ficha;
import model.dao.DAO_Ficha;
import model.exception.ArquivoInvalidoException;
import model.exception.DeletarInvalidoException;
import model.exception.FichaInvalidaException;


public class Controle_Ficha {
    
    
    /**
     * Cadastrar Jogador
     * @param personagem Nome do personagem.
     * @param jogador Nome do jogador, ou seja, nome da pessoa que possui o personagem.
     * @param campanha Tipo de personagem, podendo ser: NPC ou Monstro.
     * @param experiencia Quantidade de experiencia do personagem.
     * @param atributos Vetor com os Atributos do personagem.
     * @param dinheiro Quantidade de Dinheiro do personagem.
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ArquivoInvalidoException
     * @throws FichaInvalidaException 
     */
    public static void cadJogador(String personagem,String jogador,
            String campanha,int experiencia,int atributos[],int dinheiro)
                                      throws FileNotFoundException, IOException, ArquivoInvalidoException, FichaInvalidaException{
        Ficha f = new Ficha(personagem, jogador,"Jogador", campanha, experiencia, atributos, dinheiro);
        DAO_Ficha.gravarFicha(f);
    }
    
    /**
     * Cadastrar NPC
     * @param personagem Nome do personagem.
     * @param campanha Tipo de personagem, podendo ser: NPC ou Monstro.
     * @param experiencia Quantidade de experiencia do personagem.
     * @param atributos Vetor com os Atributos do personagem.
     * @param dinheiro Quantidade de Dinheiro do personagem.
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ArquivoInvalidoException
     * @throws FichaInvalidaException 
     */
    public static void cadNPC(String personagem, String campanha,int experiencia,
            int atributos[],int dinheiro) throws FileNotFoundException, IOException, ArquivoInvalidoException, FichaInvalidaException{
        Ficha f = new Ficha(personagem,"jogado pelo mestre","NPC", campanha, experiencia, atributos, dinheiro);
        DAO_Ficha.gravarFicha(f);
    }
    
    /**
     * Cadastrar Monstro
     * @param personagem Nome do personagem.
     * @param campanha Tipo de personagem, podendo ser: NPC ou Monstro.
     * @param experiencia Quantidade de experiencia do personagem.
     * @param atributos Vetor com os Atributos do personagem.
     * @param dinheiro Quantidade de Dinheiro do personagem.
     * @throws FileNotFoundException
     * @throws IOException
     * @throws ArquivoInvalidoException
     * @throws FichaInvalidaException 
     */
    public static void cadMonstro(String personagem,String campanha,
            int experiencia,int atributos[],int dinheiro)
                                      throws FileNotFoundException, IOException, ArquivoInvalidoException, FichaInvalidaException{
        Ficha f = new Ficha(personagem,"jogado pelo mestre","Monstro", campanha, experiencia, atributos, dinheiro);
        DAO_Ficha.gravarFicha(f);
    }
    
    /**
     * Encontrar uma Ficha do Tipo Jogador
     * @param nome Nome do Personagem
     * @return Ficha. Retorna a Ficha encontrada
     * @throws FileNotFoundException
     * @throws ClassNotFoundException
     * @throws IOException
     * @throws ArquivoInvalidoException 
     */
    public static Ficha encontrarJogador(String nome) 
              throws FileNotFoundException, ClassNotFoundException, IOException, ArquivoInvalidoException{
            return DAO_Ficha.carregarFicha(nome, "Jogador");
    }    
    
    /**
     * Encontrar uma Ficha do Tipo NPC
     * @param nome Nome do Personagem NPC
     * @return Ficha. Retorna a Ficha encontrada
     * @throws FileNotFoundException
     * @throws ClassNotFoundException
     * @throws IOException
     * @throws ArquivoInvalidoException 
     */
    public static Ficha encontrarNPC(String nome) 
              throws FileNotFoundException, ClassNotFoundException, IOException, ArquivoInvalidoException{
            return DAO_Ficha.carregarFicha(nome, "NPC");
    } 
    
    /**
     * Encontrar uma Ficha do Tipo Monstro
     * @param nome Nome do Personagem Monstro
     * @return Ficha. Retorna a Ficha encontrada
     * @throws FileNotFoundException
     * @throws ClassNotFoundException
     * @throws IOException
     * @throws ArquivoInvalidoException 
     */
    public static Ficha encontrarMonstro(String nome) 
              throws FileNotFoundException, ClassNotFoundException, IOException, ArquivoInvalidoException{
            return DAO_Ficha.carregarFicha(nome, "Monstro");
    } 
    
    /**
     * Verifica se uma Ficha do Tipo Jogador Existe
     * @param personagem Nome do Personagem
     * @return boolean. TRUE se a Ficha Existe, ou FALSE se a Ficha Nao Existe
     */
    public static boolean JogadorExiste(String personagem){
        return DAO_Ficha.fichaExiste(personagem,"Jogador");
    }
    
    /**
     * Verifica se uma Ficha do Tipo NPC Existe
     * @param nome Nome do Personagem NPC
     * @return boolean. TRUE se a Ficha Existe, ou FALSE se a Ficha Nao Existe
     */
    public static boolean NPCExiste(String nome){
        return DAO_Ficha.fichaExiste(nome,"NPC");
    }
    
    /**
     * Verifica se uma Ficha do Tipo Monstro Existe
     * @param nome Nome do Personagem Monstro
     * @return boolean. TRUE se a Ficha Existe, ou FALSE se a Ficha Nao Existe
     */
    public static boolean MonstroExiste(String nome){
        return DAO_Ficha.fichaExiste(nome,"Monstro");
    }
    
    /**
     * Verifica se uma Ficha Existe
     * @param nome Nome do Personagem
     * @return boolean. TRUE se a Ficha Existe, ou FALSE se a Ficha Nao Existe
     */
    public static boolean FichaExiste(String nome){
        boolean status = false;
        if(JogadorExiste(nome)||NPCExiste(nome)||MonstroExiste(nome)){
            status = true;
        }
        return status;
    }
    
    public static Ficha encontrarFicha(String nome) throws FileNotFoundException, ClassNotFoundException, IOException, ArquivoInvalidoException{
        if(JogadorExiste(nome)){
            return encontrarJogador(nome);
        }else
        if(MonstroExiste(nome)){
            return encontrarMonstro(nome);
        }else
        if(NPCExiste(nome)){
            return encontrarNPC(nome);
        }
        return null;
    }
    
    
    /**
     * Remove uma Ficha do Tipo Jogador
     * @param personagem Nome do Personagem
     * @throws ArquivoInvalidoException
     * @throws DeletarInvalidoException
     * @throws IOException 
     */
    public static void removerJogador(String personagem) throws ArquivoInvalidoException, DeletarInvalidoException, IOException{
        DAO_Ficha.removerFicha(personagem, "Jogador");
    }
    
    /**
     * Remove uma Ficha do Tipo NPC
     * @param personagem Nome do Personagem
     * @throws ArquivoInvalidoException
     * @throws DeletarInvalidoException
     * @throws IOException 
     */
    public static void removerNPC(String personagem) throws ArquivoInvalidoException, DeletarInvalidoException, IOException{
        DAO_Ficha.removerFicha(personagem, "NPC");
    }
    
    /**
     * Remove uma Ficha do Tipo Monstro
     * @param personagem Nome do Personagem
     * @throws ArquivoInvalidoException
     * @throws DeletarInvalidoException
     * @throws IOException 
     */
    public static void removerMonstro(String personagem) throws ArquivoInvalidoException, DeletarInvalidoException, IOException{
        DAO_Ficha.removerFicha(personagem, "Monstro");
    }
    
    /**
     * Remove todas as Fichas do Tipo Jogador
     * @throws ArquivoInvalidoException
     * @throws DeletarInvalidoException
     * @throws IOException 
     */
    public static void removeTodasFichasJogador() throws ArquivoInvalidoException, DeletarInvalidoException, IOException{
        DAO_Ficha.removerTodasFichas("Jogador");
    }
    
    /**
     * Remove todas as Fichas do Tipo NPC
     * @throws ArquivoInvalidoException
     * @throws DeletarInvalidoException
     * @throws IOException 
     */
    public static void removeTodasFichasNPC() throws ArquivoInvalidoException, DeletarInvalidoException, IOException{
        DAO_Ficha.removerTodasFichas("Monstro");
    }
    
    /**
     * Remove todas as Fichas do Tipo Monstro
     * @throws ArquivoInvalidoException
     * @throws DeletarInvalidoException
     * @throws IOException 
     */
    public static void removeTodasFichasMonstro() throws ArquivoInvalidoException, DeletarInvalidoException, IOException{
        DAO_Ficha.removerTodasFichas("Monstro");
    }   
    
    /**
     * Remove todas as Fichas de Todos os Tipos
     * @throws ArquivoInvalidoException
     * @throws DeletarInvalidoException
     * @throws IOException 
     */
    public static void removeTodasFichas() throws ArquivoInvalidoException, DeletarInvalidoException, IOException{
        removeTodasFichasJogador();
        removeTodasFichasNPC();
        removeTodasFichasMonstro();
    }
    
    /**
     * Lista as Fichas do Tipo Jogador
     * @return String[] lista. Retorna um Vetor de String contendo todas as
     * Fichas.
     */
    public static String[] listarFichasJogador(){
       return DAO_Ficha.listarFichas("Jogador"); 
    }
    
    /**
     * Lista as Fichas do Tipo NPC
     * @return String[] lista. Retorna um Vetor de String contendo todas as
     * Fichas.
     */
    public static String[] listarFichasNPC(){
        return DAO_Ficha.listarFichas("NPC");
    }
    
    /**
     * Lista as Fichas do Tipo Monstro
     * @return String[] lista. Retorna um Vetor de String contendo todas as
     * Fichas.
     */
    public static String[] listarFichasMonstro(){
        return DAO_Ficha.listarFichas("Monstro");
    }   
    
    public static boolean atualizarFicha(Ficha ficha) throws ArquivoInvalidoException, DeletarInvalidoException, IOException, FileNotFoundException, FichaInvalidaException{
        if(ficha == null){
            return false;
        }
        if(ficha.getTipo().equals("Jogador")){
            removerJogador(ficha.getPersonagem());
            cadJogador(ficha.getPersonagem(), ficha.getJogador(),
                       ficha.getCampanha(), ficha.getExperiencia(),
                       ficha.getAtributos(), ficha.getDinheiro());
        }else
        if(ficha.getTipo().equals("Monstro")){
            removerMonstro(ficha.getPersonagem());
            cadMonstro(ficha.getPersonagem(), ficha.getCampanha(),
                       ficha.getExperiencia(), ficha.getAtributos(),
                       ficha.getDinheiro());           
        }else if(ficha.getTipo().equals("NPC")){
            removerNPC(ficha.getPersonagem());
            cadNPC(ficha.getPersonagem(), ficha.getCampanha(),
                   ficha.getExperiencia(), ficha.getAtributos(),
                   ficha.getDinheiro());
        };       
        return true;
    }
    
}
