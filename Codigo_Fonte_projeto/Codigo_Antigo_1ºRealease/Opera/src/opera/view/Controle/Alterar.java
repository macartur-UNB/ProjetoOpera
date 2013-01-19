/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opera.view.Controle;

import opera.control.ControleCaracteristica;
import opera.control.ControleEquipamento;
import opera.control.ControleHabilidade;
import opera.control.ControleFicha;
import opera.exception.HabilidadeInvalidaException;
import opera.exception.FichaInvalidaException;
import opera.exception.EquipamentoInvalidoException;
import opera.exception.CaracteristicaInvalidaException;
import java.io.IOException;
import opera.model.Jogo;
import opera.view.PaineisDeAlteracao.*;

/**
 *
 * @author Luciano
 */
public class Alterar {
    
    private static Alterar instancia;
    
    public static Alterar getInstance(){
        if(instancia == null){
            instancia = new Alterar();
        }
        return instancia;
    }
    
    private Alterar(){
        
    }   
    
    public void alterarFicha(Jogo jogo, Object objeto) throws FichaInvalidaException, IOException{
        
        PnlAlterarFicha ficha;
        
        String nomeJogador, nomePersonagem, tipoDeFicha=null, campanha;
        int experiencia,atributos[];
        atributos = new int[8];
        
        ficha = (PnlAlterarFicha) objeto;
        nomeJogador = ficha.getPnlCadastrarFichaParte01().getTxtNomeJogador().getText();
        nomePersonagem = ficha.getPnlCadastrarFichaParte01().getTxtNomePersonagem().getText();
        
        if(ficha.getPnlCadastrarFichaParte01().getRdbJogador().isSelected()){
            tipoDeFicha = "Jogador";
        }
        if(ficha.getPnlCadastrarFichaParte01().getRdbNpc().isSelected()){
            tipoDeFicha = "NPC";
        }
        if(ficha.getPnlCadastrarFichaParte01().getRdbMonstro().isSelected()){
            tipoDeFicha = "Monstro";
        }
        campanha = ficha.getPnlCadastrarFichaParte01().getTxtCampanha().getText();
        
        try{
            experiencia = Integer.parseInt(ficha.getPnlCadastrarFichaParte01().getTxtExperiencia().getText());
        } catch(NumberFormatException e){
            throw new FichaInvalidaException("Experiencia invalida, deve ser numero inteiro maior ou igual a zero e diferente de nulo");
        }
        
        
        try{
            atributos[0] = Integer.parseInt(ficha.getPnlCadastrarFichaParte02().getTxtFisico().getText());
        } catch(NumberFormatException e){
            throw new FichaInvalidaException("Fisico invalido, o numero deve ser inteiro e maior ou igual a zero");
        }
        try{
            atributos[1] = Integer.parseInt(ficha.getPnlCadastrarFichaParte02().getTxtDestreza().getText());
        } catch(NumberFormatException e){
            throw new FichaInvalidaException("Destreza invalida, o numero deve ser inteiro e maior ou igual a zero");
        }
        try{
            atributos[2] = Integer.parseInt(ficha.getPnlCadastrarFichaParte02().getTxtInteligencia().getText());
        } catch(NumberFormatException e){
            throw new FichaInvalidaException("Inteligencia invalida, o numero deve ser inteiro e maior ou igual a zero");
        }
        try{
            atributos[3] = Integer.parseInt(ficha.getPnlCadastrarFichaParte02().getTxtVontade().getText());
        } catch(NumberFormatException e){
            throw new FichaInvalidaException("Vontade invalida, o numero deve ser inteiro e maior ou igual a zero");
        }
        try{
            atributos[4] = Integer.parseInt(ficha.getPnlCadastrarFichaParte02().getTxtPercepcao().getText());
        } catch(NumberFormatException e){
            throw new FichaInvalidaException("Percepcao invalida, o numero deve ser inteiro e maior ou igual a zero");
        }
        try{
            atributos[5] = Integer.parseInt(ficha.getPnlCadastrarFichaParte02().getTxtMente().getText());
        } catch(NumberFormatException e){
            throw new FichaInvalidaException("Mente invalida, o numero deve ser inteiro e maior ou igual a zero");
        }
        try{
            atributos[6] = Integer.parseInt(ficha.getPnlCadastrarFichaParte02().getTxtMana().getText());
        } catch(NumberFormatException e){
            throw new FichaInvalidaException("Mana invalida, o numero deve ser inteiro e maior ou igual a zero");
        }
        try{
            atributos[7] = Integer.parseInt(ficha.getPnlCadastrarFichaParte02().getTxtSorte().getText());
        } catch(NumberFormatException e){
            throw new FichaInvalidaException("Sorte invalida, o numero deve ser inteiro e maior ou igual a zero");
        }
        
        //Metodos de Alteracao
        if(tipoDeFicha.toLowerCase().equals("jogador")){
            ControleFicha.getInstance().alterarFicha(jogo, ficha.getFicha(), nomePersonagem, nomeJogador, campanha, experiencia, tipoDeFicha, atributos);
        }else{
            ControleFicha.getInstance().alterarFicha(jogo, ficha.getFicha(), nomePersonagem, experiencia, tipoDeFicha, atributos);
        }
        
    }
    
    
    public void alterarHabilidade(Jogo jogo, Object objeto) throws HabilidadeInvalidaException, IOException{
        
        PnlAlterarHabilidade habilidade;
        String nome;
        int teste, nivel, custo;

        habilidade = (PnlAlterarHabilidade) objeto;

        nome = habilidade.getPnlCadastrarHabilidade().getTxtNome().getText();

        try{
            teste = Integer.parseInt(habilidade.getPnlCadastrarHabilidade().getTxtTeste().getText());
        } catch(NumberFormatException e){
            throw new HabilidadeInvalidaException("Teste invalido, deve ser um numero e nao nulo");
        }
         try{
            nivel = Integer.parseInt(habilidade.getPnlCadastrarHabilidade().getTxtNivel().getText());
        } catch(NumberFormatException e){
            throw new HabilidadeInvalidaException("Nivel invalido, deve ser um numero");
        }
          try{
            custo = Integer.parseInt(habilidade.getPnlCadastrarHabilidade().getTxtCusto().getText());
        } catch(NumberFormatException e){
            throw new HabilidadeInvalidaException("Custo invalido, deve ser um numero");
        }
        
        //AQUI VAI O MÉTODO DE ALTERACAO
        ControleHabilidade.getInstance().alterarHabilidade(jogo, habilidade.getHabilidade(), nome, teste, nivel, custo);
    }
    
    
    public void alterarCaracteristica(Jogo jogo, Object objeto) throws CaracteristicaInvalidaException, IOException{
        
        PnlAlterarCaracteristica caracteristica;
        String nome, descricao;
        boolean c_modificador = false;
        int custo;
        int modificador[] = new int[8];
 
        caracteristica = (PnlAlterarCaracteristica) objeto;
        nome = caracteristica.getPnlCadastrarCaracteristica().getTxtNome().getText();
        descricao = caracteristica.getPnlCadastrarCaracteristica().getTxtDescricao().getText();
        
        try{
            custo = Integer.parseInt(caracteristica.getPnlCadastrarCaracteristica().getTxtCusto().getText());
        } catch(NumberFormatException e){
                throw new CaracteristicaInvalidaException("Custo invalido, deve ser um numero");
            }

        if(caracteristica.getPnlCadastrarCaracteristica().getChkFisico().isSelected()) {
            try{
                modificador[0] = Integer.parseInt(caracteristica.getPnlCadastrarCaracteristica().getTxtFisico().getText());
                c_modificador = true;
            } catch(NumberFormatException e){
                throw new CaracteristicaInvalidaException("Fisico invalido, deve ser um numero");
            }
        }
        if(caracteristica.getPnlCadastrarCaracteristica().getChkDestreza().isSelected()) {
            try{
                modificador[1] = Integer.parseInt(caracteristica.getPnlCadastrarCaracteristica().getTxtDestreza().getText());
                c_modificador = true;
            } catch(NumberFormatException e){
                throw new CaracteristicaInvalidaException("Destreza invalida, deve ser um numero");
            } 
        }
        if(caracteristica.getPnlCadastrarCaracteristica().getChkInteligencia().isSelected()) {
            try{
                modificador[2] = Integer.parseInt(caracteristica.getPnlCadastrarCaracteristica().getTxtInteligencia().getText());
                c_modificador = true;
            } catch(NumberFormatException e){
                throw new CaracteristicaInvalidaException("Inteligencia invalida, deve ser um numero");
            }
        }
        if(caracteristica.getPnlCadastrarCaracteristica().getChkVontade().isSelected()) {
            try{
                modificador[3] = Integer.parseInt(caracteristica.getPnlCadastrarCaracteristica().getTxtVontade().getText());
                c_modificador = true;
            } catch(NumberFormatException e){
                throw new CaracteristicaInvalidaException("Vontade invalida, deve ser um numero");
            }
        }
        if(caracteristica.getPnlCadastrarCaracteristica().getChkPercepcao().isSelected()) {
            try{
                modificador[4] = Integer.parseInt(caracteristica.getPnlCadastrarCaracteristica().getTxtPercepcao().getText());
                c_modificador = true;
            } catch(NumberFormatException e){
                throw new CaracteristicaInvalidaException("Percepcao invalida, deve ser um numero");
            }
        }
        if(caracteristica.getPnlCadastrarCaracteristica().getChkMente().isSelected()) {
            try{
                modificador[5] = Integer.parseInt(caracteristica.getPnlCadastrarCaracteristica().getTxtMente().getText());
                c_modificador = true;
            } catch(NumberFormatException e){
                throw new CaracteristicaInvalidaException("Mente invalida, deve ser um numero");
            }
        }
        if(caracteristica.getPnlCadastrarCaracteristica().getChkMana().isSelected()) {
            try{
                modificador[6] = Integer.parseInt(caracteristica.getPnlCadastrarCaracteristica().getTxtMana().getText());
                c_modificador = true;
            } catch(NumberFormatException e){
                throw new CaracteristicaInvalidaException("Mana invalido, deve ser um numero");
            }
        }
        if(caracteristica.getPnlCadastrarCaracteristica().getChkSorte().isSelected()) {
            try{
                modificador[7] = Integer.parseInt(caracteristica.getPnlCadastrarCaracteristica().getTxtSorte().getText());
                c_modificador = true;
            } catch(NumberFormatException e){
                throw new CaracteristicaInvalidaException("Sorte invalida, deve ser um numero");
            }
        }
        
        
        //AQUI VAI O MÉTODO DE CADASTRO!
        if(!c_modificador){
            ControleCaracteristica.getInstance().alterarCaracteristica(jogo, caracteristica.getCaracteristica(), nome, descricao, custo);
        }else{
            ControleCaracteristica.getInstance().alterarCaracteristica(jogo, caracteristica.getCaracteristica(), nome, descricao, custo, modificador);
        }
    }
    
    
    public void alterarEquipamento(Jogo jogo, Object objeto) throws EquipamentoInvalidoException, IOException{
        System.out.println("Iniciando Alteração de Equipamento");
        PnlAlterarEquipamento equipamento;
        String nome, descricao;
        int preco;
        int modificador[] = new int[8];
        boolean c_modificador = false;
        
        equipamento = (PnlAlterarEquipamento) objeto;
        
        nome = equipamento.getPnlCadastrarEquipamento_Geral().getTxtNome().getText();
        descricao = equipamento.getPnlCadastrarEquipamento_Geral().getTxtDescricao().getText();
        try{
            preco = Integer.parseInt(equipamento.getPnlCadastrarEquipamento_Geral().getTxtPreco().getText());
        } catch(NumberFormatException e){
            throw new EquipamentoInvalidoException("Preco invalido, deve ser numero inteiro maior ou igual a zero");
        }
        if(equipamento.getPnlCadastrarEquipamento_Geral().getChkFisico().isSelected()) {
            try{
                modificador[0] = Integer.parseInt(equipamento.getPnlCadastrarEquipamento_Geral().getTxtFisico().getText());
                c_modificador = true;
            } catch(NumberFormatException e){
                throw new EquipamentoInvalidoException("Fisico invalido, deve ser numero inteiro maior ou igual a zero");
            }
        }
        if(equipamento.getPnlCadastrarEquipamento_Geral().getChkDestreza().isSelected()) {
            try{
                modificador[1] = Integer.parseInt(equipamento.getPnlCadastrarEquipamento_Geral().getTxtDestreza().getText());
                c_modificador = true;
            } catch(NumberFormatException e){
                throw new EquipamentoInvalidoException("Destreza invalida, deve ser numero inteiro maior ou igual a zero");
            }
        }
        if(equipamento.getPnlCadastrarEquipamento_Geral().getChkInteligencia().isSelected()) {
            try{
                modificador[2] = Integer.parseInt(equipamento.getPnlCadastrarEquipamento_Geral().getTxtInteligencia().getText());
                c_modificador = true;
            } catch(NumberFormatException e){
                throw new EquipamentoInvalidoException("Inteligencia invalida, deve ser numero inteiro maior ou igual a zero");
            }
        }
        if(equipamento.getPnlCadastrarEquipamento_Geral().getChkVontade().isSelected()) {
            try{
                modificador[3] = Integer.parseInt(equipamento.getPnlCadastrarEquipamento_Geral().getTxtVontade().getText());
                c_modificador = true;
            } catch(NumberFormatException e){
                throw new EquipamentoInvalidoException("Vontade invalida, deve ser numero inteiro maior ou igual a zero");
            }
        }
        if(equipamento.getPnlCadastrarEquipamento_Geral().getChkPercepcao().isSelected()) {
            try{
                modificador[4] = Integer.parseInt(equipamento.getPnlCadastrarEquipamento_Geral().getTxtPercepcao().getText());
                c_modificador = true;
            } catch(NumberFormatException e){
                throw new EquipamentoInvalidoException("Percepcao invalida, deve ser numero inteiro maior ou igual a zero");
            }
        }
        if(equipamento.getPnlCadastrarEquipamento_Geral().getChkMente().isSelected()) {
            try{
                modificador[5] = Integer.parseInt(equipamento.getPnlCadastrarEquipamento_Geral().getTxtMente().getText());
                c_modificador = true;
            } catch(NumberFormatException e){
                throw new EquipamentoInvalidoException("Mente invalida, deve ser numero inteiro maior ou igual a zero");
            }
        }
        if(equipamento.getPnlCadastrarEquipamento_Geral().getChkMana().isSelected()) {
            try{
                modificador[6] = Integer.parseInt(equipamento.getPnlCadastrarEquipamento_Geral().getTxtMana().getText());
                c_modificador = true;
            } catch(NumberFormatException e){
                throw new EquipamentoInvalidoException("Mana invalido, deve ser numero inteiro maior ou igual a zero");
            }
        }
        if(equipamento.getPnlCadastrarEquipamento_Geral().getChkSorte().isSelected()) {
            try{
                modificador[7] = Integer.parseInt(equipamento.getPnlCadastrarEquipamento_Geral().getTxtSorte().getText());
                c_modificador = true;
            } catch(NumberFormatException e){
                throw new EquipamentoInvalidoException("Sorte invalida, deve ser numero inteiro maior ou igual a zero");
            }
        }
                
        //Verifica se o equipamento eh um ITEM
        if(equipamento.getPnlCadastrarEquipamento_Geral().getRdbItem().isSelected()){
            System.out.println("Eh um Item!");
            if(!c_modificador){
                ControleEquipamento.getInstance().alterarItem(jogo, equipamento.getItem(), nome, descricao, preco);
            }else{
                System.out.println("Sem modificador");
                ControleEquipamento.getInstance().alterarItem(jogo, equipamento.getItem(), nome, descricao, preco, modificador);
            }
        }
        
        //Verifica se o equipamento eh uma ARMA
        if(equipamento.getRdbArmaBranca().isSelected() || equipamento.getRdbArmaDeFogo().isSelected()){
            //CADASTRAR ARMA
            int tipo, danoAdicional;
            
            try{
                tipo = Integer.parseInt(equipamento.getPnlCadastrarEquipamento_Arma().getTxtTipo().getText());
            } catch(NumberFormatException e){
                throw new EquipamentoInvalidoException("Tipo invalido, deve ser numero inteiro maior ou igual a zero");
            }
            try{
                danoAdicional = Integer.parseInt(equipamento.getPnlCadastrarEquipamento_Arma().getTxtDanoAdicional().getText());
            } catch(NumberFormatException e){
                throw new EquipamentoInvalidoException("Dano Adicional invalido, deve ser numero inteiro maior ou igual a zero");
            }
            
            //Verifica se o equipamento eh uma ARMA BRANCA
            if(equipamento.getRdbArmaBranca().isSelected()){
                //CADASTRAR ARMA BRANCA
                int golpe, aparo, esquiva;
                try{
                    golpe = Integer.parseInt(equipamento.getPnlCadastrarEquipamento_Arma().getTxtGolpe().getText());
                } catch(NumberFormatException e){
                    throw new EquipamentoInvalidoException("Golpe invalido, deve ser numero inteiro maior ou igual a zero");
                }
                try{
                    aparo = Integer.parseInt(equipamento.getPnlCadastrarEquipamento_Arma().getTxtAparo().getText());
                } catch(NumberFormatException e){
                    throw new EquipamentoInvalidoException("Aparo invalido, deve ser numero inteiro maior ou igual a zero");
                }
                try{
                    esquiva = Integer.parseInt(equipamento.getPnlCadastrarEquipamento_Arma().getTxtEsquiva().getText());
                } catch(NumberFormatException e){
                    throw new EquipamentoInvalidoException("Esquiva invalida, deve ser numero inteiro maior ou igual a zero");
                }
                
                //AQUI VAI O MÉTODO DE CADASTRO!
                if(!c_modificador){
                    ControleEquipamento.getInstance().alterarArmaBranca(jogo, equipamento.getArma_Branca(), nome, descricao, preco, tipo, golpe, aparo, esquiva, danoAdicional);
                }else{
                    ControleEquipamento.getInstance().alterarArmaBranca(jogo, equipamento.getArma_Branca(), nome, descricao, preco, tipo, golpe, aparo, esquiva, danoAdicional, modificador);
                }
            }
            
            //Verifica se o equipamento eh uma ARMA DE FOGO
            if(equipamento.getRdbArmaDeFogo().isSelected()){
                //CADASTRAR ARMA DE FOGO
                
                //System.out.println("A");
                
                int tiroRapido, tiroMirado, cadencia;
                try{
                    tiroRapido = Integer.parseInt(equipamento.getPnlCadastrarEquipamento_Arma().getTxtTiroRapido().getText());
                } catch(NumberFormatException e){
                    throw new EquipamentoInvalidoException("Tiro Rapido invalido, deve ser numero inteiro maior ou igual a zero");
                }
                try{
                    tiroMirado = Integer.parseInt(equipamento.getPnlCadastrarEquipamento_Arma().getTxtTiroMirado().getText());
                } catch(NumberFormatException e){
                    throw new EquipamentoInvalidoException("Tiro Mirado invalido, deve ser numero inteiro maior ou igual a zero");
                }
                try{
                    cadencia = Integer.parseInt(equipamento.getPnlCadastrarEquipamento_Arma().getTxtCadencia().getText());
                } catch(NumberFormatException e){
                    throw new EquipamentoInvalidoException("Cadencia invalido, deve ser numero inteiro maior ou igual a zero");
                }
                
                
                //AQUI VAI O MÉTODO DE CADASTRO!
                if(!c_modificador){
                    ControleEquipamento.getInstance().alterarArmaDeFogo(jogo, equipamento.getArma_Fogo(), nome, descricao, preco, tipo, danoAdicional, tiroRapido, tiroMirado, cadencia);
                }else{
                    ControleEquipamento.getInstance().alterarArmaDeFogo(jogo, equipamento.getArma_Fogo(), nome, descricao, preco, tipo, danoAdicional, tiroRapido, tiroMirado, cadencia, modificador);
                }
            }
        }
        
        //Verifica se o equipamento eh uma ARMADURA
        if(equipamento.getRdbArmadura().isSelected()){
            //CADASTRAR ARMADURA
            int absorcaoArmaBranca, absorcaoArmaDeFogo, penalidade;
            char regiaoDoCorpo;
            
            try{
                absorcaoArmaBranca = Integer.parseInt(equipamento.getPnlCadastrarEquipamento_Armadura().getTxtAbsorcaoArmaBranca().getText());
            } catch(NumberFormatException e){
                throw new EquipamentoInvalidoException("Absorcao de Arma Branca deve ser um numero inteiro maior ou iguel a zero");
            }
            try{
                absorcaoArmaDeFogo = Integer.parseInt(equipamento.getPnlCadastrarEquipamento_Armadura().getTxtAbsorcaoArmaDeFogo().getText());
            } catch(NumberFormatException e){
                throw new EquipamentoInvalidoException("Absorcao de Arma de Fogo deve ser um numero inteiro maior ou iguel a zero");
            }
            try{
                penalidade = Integer.parseInt(equipamento.getPnlCadastrarEquipamento_Armadura().getTxtPenalidade().getText());
            } catch(NumberFormatException e){
                throw new EquipamentoInvalidoException("Penalidade deve ser um numero inteiro maior ou iguel a zero");
            }
            regiaoDoCorpo = equipamento.getPnlCadastrarEquipamento_Armadura().getTxtRegiaoDoCorpo().getText().charAt(0);
            
            //AQUI VAI O MÉTODO DE CADASTRO!
            if(!c_modificador){
                ControleEquipamento.getInstance().alterarArmadura(jogo, equipamento.getArmadura(), nome, descricao, preco, absorcaoArmaBranca, absorcaoArmaDeFogo, penalidade, regiaoDoCorpo);
            }else{
                ControleEquipamento.getInstance().alterarArmadura(jogo, equipamento.getArmadura(), nome, descricao, preco, absorcaoArmaBranca, absorcaoArmaDeFogo, penalidade, regiaoDoCorpo, modificador);
            }
        }
    }
}
