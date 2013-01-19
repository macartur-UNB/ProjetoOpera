/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opera.control;

import opera.model.Equipamento_Arma_Fogo;
import opera.model.Equipamento_Item;
import opera.model.Equipamento_Arma_Branca;
import opera.model.Equipamento_Armadura;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import opera.exception.EquipamentoInvalidoException;
import opera.model.Jogo;

/**
 *
 * @author Luciano
 */
public class ControleEquipamento {
    
    private static ControleEquipamento instancia;
    
    public static ControleEquipamento getInstance(){
        if(instancia == null){
            instancia = new ControleEquipamento();
        }
        return instancia;
    }
    
    private ControleEquipamento(){
        
    }
    
    public void cadastrarItem(Jogo jogo, String nome, String descricao, int preco) throws EquipamentoInvalidoException, IOException{
        Equipamento_Item item = new Equipamento_Item(nome, descricao, preco);
        System.out.println("Item: " + item.getNome());
        serializarItem(jogo, item);
    }
    public void cadastrarItem(Jogo jogo, String nome, String descricao, int preco, int[] bonus_Atributo) throws EquipamentoInvalidoException, IOException{
        System.out.println("Controle Equipamento: Cadastrando Item");
        Equipamento_Item item = new Equipamento_Item(nome, descricao, preco, bonus_Atributo);
        serializarItem(jogo, item);
    }
    
    public void cadastrarArmaBranca(Jogo jogo, String nome, String descricao, int preco, int tipo, int golpe, int aparo, int esquiva, int danoAdicional) throws EquipamentoInvalidoException, IOException{
        Equipamento_Arma_Branca arma_Branca = new Equipamento_Arma_Branca(nome, descricao, preco, tipo, golpe, aparo, esquiva, danoAdicional);
        serializarArmaBranca(jogo, arma_Branca);        
    }
    public void cadastrarArmaBranca(Jogo jogo, String nome, String descricao, int preco, int tipo, int golpe, int aparo, int esquiva, int danoAdicional, int[] bonus_Atributo) throws EquipamentoInvalidoException, IOException{
        Equipamento_Arma_Branca arma_Branca = new Equipamento_Arma_Branca(nome, descricao, preco, tipo, golpe, aparo, esquiva, danoAdicional, bonus_Atributo);
        serializarArmaBranca(jogo, arma_Branca);        
    }
    
    public void alterarItem(Jogo jogo, Equipamento_Item item, String nome, String descricao, int preco) throws EquipamentoInvalidoException, IOException{
        deletarItem(jogo, item);
        cadastrarItem(jogo, nome, descricao, preco);
    }
    public void alterarItem(Jogo jogo, Equipamento_Item item, String nome, String descricao, int preco, int[] bonus_Atributo) throws EquipamentoInvalidoException, IOException{
        deletarItem(jogo, item);
        cadastrarItem(jogo, nome, descricao, preco, bonus_Atributo);
    }
    
    public void alterarArmaBranca(Jogo jogo, Equipamento_Arma_Branca arma_Branca, String nome, String descricao, int preco, int tipo, int golpe, int aparo, int esquiva, int danoAdicional) throws EquipamentoInvalidoException, IOException{
        deletarArmaBranca(jogo, arma_Branca);
        cadastrarArmaBranca(jogo, nome, descricao, preco, tipo, golpe, aparo, esquiva, danoAdicional);
    }
    public void alterarArmaBranca(Jogo jogo, Equipamento_Arma_Branca arma_Branca, String nome, String descricao, int preco, int tipo, int golpe, int aparo, int esquiva, int danoAdicional, int[] bonus_Atributo) throws EquipamentoInvalidoException, IOException{
        deletarArmaBranca(jogo, arma_Branca);
        cadastrarArmaBranca(jogo, nome, descricao, preco, tipo, golpe, aparo, esquiva, danoAdicional, bonus_Atributo);
    }
    
    public void cadastrarArmaDeFogo(Jogo jogo, String nome, String descricao, int preco, int tipo, int danoAdicional, int tiro_Rapido, int tiro_Mirado, int cadencia) throws EquipamentoInvalidoException, IOException{
        Equipamento_Arma_Fogo arma_Fogo = new Equipamento_Arma_Fogo(nome, descricao, preco, tipo, danoAdicional, tiro_Rapido, tiro_Mirado, cadencia);
        serializarArmaFogo(jogo, arma_Fogo);
    }
    public void cadastrarArmaDeFogo(Jogo jogo, String nome, String descricao, int preco, int tipo, int danoAdicional, int tiro_Rapido, int tiro_Mirado, int cadencia, int[] bonus_Atributo) throws EquipamentoInvalidoException, IOException{
        Equipamento_Arma_Fogo arma_Fogo = new Equipamento_Arma_Fogo(nome, descricao, preco, tipo, danoAdicional, tiro_Rapido, tiro_Mirado, cadencia, bonus_Atributo);
        serializarArmaFogo(jogo, arma_Fogo);
    }
    
    public void alterarArmaDeFogo(Jogo jogo, Equipamento_Arma_Fogo arma_Fogo, String nome, String descricao, int preco, int tipo, int danoAdicional, int tiro_Rapido, int tiro_Mirado, int cadencia) throws EquipamentoInvalidoException, IOException{
        deletarArmaDeFogo(jogo, arma_Fogo);
        cadastrarArmaDeFogo(jogo, nome, descricao, preco, tipo, danoAdicional, tiro_Rapido, tiro_Mirado, cadencia);
    }
    public void alterarArmaDeFogo(Jogo jogo, Equipamento_Arma_Fogo arma_Fogo, String nome, String descricao, int preco, int tipo, int danoAdicional, int tiro_Rapido, int tiro_Mirado, int cadencia, int[] bonus_Atributo) throws EquipamentoInvalidoException, IOException{
        deletarArmaDeFogo(jogo, arma_Fogo);
        cadastrarArmaDeFogo(jogo, nome, descricao, preco, tipo, danoAdicional, tiro_Rapido, tiro_Mirado, cadencia, bonus_Atributo);
    }
    
    public void cadastrarArmadura(Jogo jogo, String nome, String descricao, int preco, int absorcao_Arma_Branca, int absorcao_Arma_De_Fogo, int penalidade, char regiao_Do_Corpo) throws EquipamentoInvalidoException, IOException{
        Equipamento_Armadura armadura = new Equipamento_Armadura(nome, descricao, preco, absorcao_Arma_Branca, absorcao_Arma_De_Fogo, penalidade, regiao_Do_Corpo);
        serializarArmadura(jogo, armadura);
    }
    public void cadastrarArmadura(Jogo jogo, String nome, String descricao, int preco, int absorcao_Arma_Branca, int absorcao_Arma_De_Fogo, int penalidade, char regiao_Do_Corpo, int[] bonus_Atributo) throws EquipamentoInvalidoException, IOException{
        Equipamento_Armadura armadura = new Equipamento_Armadura(nome, descricao, preco, absorcao_Arma_Branca, absorcao_Arma_De_Fogo, penalidade, regiao_Do_Corpo, bonus_Atributo);
        serializarArmadura(jogo, armadura);
    }
    
    public void alterarArmadura(Jogo jogo, Equipamento_Armadura armadura, String nome, String descricao, int preco, int absorcao_Arma_Branca, int absorcao_Arma_De_Fogo, int penalidade, char regiao_Do_Corpo) throws EquipamentoInvalidoException, IOException{
        deletarArmadura(jogo, armadura);
        cadastrarArmadura(jogo, nome, descricao, preco, absorcao_Arma_Branca, absorcao_Arma_De_Fogo, penalidade, regiao_Do_Corpo);
    }
    public void alterarArmadura(Jogo jogo, Equipamento_Armadura armadura, String nome, String descricao, int preco, int absorcao_Arma_Branca, int absorcao_Arma_De_Fogo, int penalidade, char regiao_Do_Corpo, int[] bonus_Atributo) throws EquipamentoInvalidoException, EquipamentoInvalidoException, IOException{
        deletarArmadura(jogo, armadura);
        cadastrarArmadura(jogo, nome, descricao, preco, absorcao_Arma_Branca, absorcao_Arma_De_Fogo, penalidade, regiao_Do_Corpo, bonus_Atributo);
    }
    
    public void deletarItem(Jogo jogo, Equipamento_Item item) throws EquipamentoInvalidoException{
        File diretorio = new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Equipamentos\\Item");
        File arquivo = new File(diretorio, item.getNome()+".txt");
       
        if(arquivo.exists()){
            boolean isDeletado = arquivo.delete();
        }else{
            throw new EquipamentoInvalidoException("Item invalido, esse item nao existe para ser deletada");
        }
    }
        
    public void deletarArmaBranca(Jogo jogo, Equipamento_Arma_Branca arma_Branca) throws EquipamentoInvalidoException{
        File diretorio = new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Equipamentos\\Arma\\Arma Branca");
        File arquivo = new File(diretorio, arma_Branca.getNome()+".txt");
       
        if(arquivo.exists()){
            arquivo.delete();
        }else{
            throw new EquipamentoInvalidoException("Arma invalida, essa arma nao existe para ser deletada");
        }
    }
    
    public void deletarArmaDeFogo(Jogo jogo, Equipamento_Arma_Fogo arma_Fogo) throws EquipamentoInvalidoException{
        File diretorio = new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Equipamentos\\Arma\\Arma de Fogo");
        File arquivo = new File(diretorio, arma_Fogo.getNome()+".txt");
       
        if(arquivo.exists()){
            arquivo.delete();
        }else{
            throw new EquipamentoInvalidoException("Arma invalida, essa arma nao existe para ser deletada");
        }
    }
    
    public void deletarArmadura(Jogo jogo, Equipamento_Armadura armadura) throws EquipamentoInvalidoException{
        File diretorio = new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Equipamentos\\Armadura");
        File arquivo = new File(diretorio, armadura.getNome()+".txt");
       
        if(arquivo.exists()){
            arquivo.delete();
        }else{
            throw new EquipamentoInvalidoException("Armadura invalida, essa armadura nao existe para ser deletada");
        }
    }

    private void serializarItem(Jogo jogo, Equipamento_Item item) throws IOException, EquipamentoInvalidoException{
        File diretorio = new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Equipamentos\\Item");
        File arquivo = new File(diretorio, item.getNome()+".txt");
        
        if(!arquivo.exists()){
            arquivo.createNewFile();

            //System.out.println(arquivo.getName());
            
            FileOutputStream fos = new FileOutputStream(arquivo);
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(item);
            }
        }else{
            throw new EquipamentoInvalidoException("Item invalido, ja existe um item com esse nome");
        }
    }
    
    private void serializarArmaBranca(Jogo jogo, Equipamento_Arma_Branca arma_Branca) throws IOException, EquipamentoInvalidoException{
        File diretorio = new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Equipamentos\\Arma\\Arma Branca");
        File arquivo = new File(diretorio, arma_Branca.getNome()+".txt");
       
        if(!arquivo.exists()){
            arquivo.createNewFile();

            //System.out.println(arquivo.getName());
            
            FileOutputStream fos = new FileOutputStream(arquivo);
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(arma_Branca);
            }
        }else{
            throw new EquipamentoInvalidoException("Arma invalida, ja existe uma arma com esse nome");
        }
    }
    
    private void serializarArmaFogo(Jogo jogo, Equipamento_Arma_Fogo arma_Fogo) throws IOException, EquipamentoInvalidoException{
        File diretorio = new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Equipamentos\\Arma\\Arma de Fogo");
        File arquivo = new File(diretorio, arma_Fogo.getNome()+".txt");
       
        if(!arquivo.exists()){
            arquivo.createNewFile();

            //System.out.println(arquivo.getName());
            
            FileOutputStream fos = new FileOutputStream(arquivo);
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(arma_Fogo);
            }
        }else{
            throw new EquipamentoInvalidoException("Arma invalida, ja existe uma arma com esse nome");
        }
    }
    
    private void serializarArmadura(Jogo jogo, Equipamento_Armadura armadura) throws IOException, EquipamentoInvalidoException{
        File diretorio = new File("C:\\Opera\\Jogos\\" + jogo.getNome() + "\\Equipamentos\\Armadura");
        File arquivo = new File(diretorio, armadura.getNome()+".txt");
       
        if(!arquivo.exists()){
            arquivo.createNewFile();

            //System.out.println(arquivo.getName());
            
            FileOutputStream fos = new FileOutputStream(arquivo);
            try (ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(armadura);
            }
        }else{
            throw new EquipamentoInvalidoException("Armadura invalida, ja existe uma armadura com esse nome");
        }
       
    }
    
}
