package model.classes;

import model.exception.ItemInvalidoException;


public class Arma_A_Distancia extends Arma{

    private int tiro_Rapido;
    private int tiro_Mirado;
    private int cadencia;
    
    public Arma_A_Distancia(String nome, String descricao,
                            Dado dano, int danoAdicional,
                            int tiro_Rapido,int tiro_Mirado,int cadencia,
                            boolean usando, int preco) 
                                                  throws ItemInvalidoException {
        
        super(nome, descricao, dano, danoAdicional, usando, preco);
        this.tiro_Mirado = tiro_Mirado;
        this.tiro_Rapido = tiro_Rapido;
        this.cadencia = cadencia;       
    }

    public Arma_A_Distancia(String nome, String descricao,
                            Dado dano, int danoAdicional,
                            int tiro_Rapido,int tiro_Mirado,int cadencia,
                            boolean usando, int[] bonus_atributo,
                            int preco, String habilidade_Necessaria)    
                                                  throws ItemInvalidoException {
        
        super(nome, descricao,dano, danoAdicional, usando,
              bonus_atributo, preco, habilidade_Necessaria);
        this.tiro_Mirado = tiro_Mirado;
        this.tiro_Rapido = tiro_Rapido;
        this.cadencia = cadencia;    
    }

    public void setTiro_Mirado(int tiro_Mirado) {
        this.tiro_Mirado = tiro_Mirado;
    }

    public int getTiro_Mirado() {
        return tiro_Mirado;
    }

    public void setTiro_Rapido(int tiro_Rapido) {
        this.tiro_Rapido = tiro_Rapido;
    }

    public int getTiro_Rapido() {
        return tiro_Rapido;
    }

    public void setCadencia(int cadencia) {
        this.cadencia = cadencia;
    }

    public int getCadencia() {
        return cadencia;
    }

    @Override
    public String toString() {
        return super.toString()+
               " Tiro Mirado = "+this.getTiro_Mirado()+
               " Tiro Rapido = "+this.getTiro_Rapido()+
               " Cadencia = "+this.getCadencia();
    }
}
