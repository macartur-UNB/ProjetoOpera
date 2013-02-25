package model.classes;

import model.exception.ItemInvalidoException;


public class Arma extends Item{
    
    private Dado dano;
    private int danoAdicional;
    
    /**
     * 
     * @param nome Nome da Arma. Deve conter apenas caracteres
     * Alfa-Numericos (A-Z, a-z e 0-9)".
     * @param descricao Descricao da Arma. Deve conter apenas caracteres
     * Alfa-Numericos (A-Z, a-z e 0-9)".
     * @param dano Dano eh uma instancia da Classe Dado, este representa o
     * dano da Arma
     * @param danoAdicional  Dano Adicional da Arma. O Dano Adicional deve ser 
     * um numero inteiro e maior ou igual a zero(0)
     * @param usando Define se a Arma esta sendo Usada, TRUE - Sim. FALSE - Nao
     * @param preco Preco da Arma. Deve ser um numero inteiro e 
     * maior ou igual a zero(0)
     * @throws ItemInvalidoException 
     */
    public Arma(String nome, String descricao,Dado dano,
                int danoAdicional, boolean usando, int preco) 
                                                  throws ItemInvalidoException {
        super(nome, descricao, usando, preco);
        setDano(dano);
        setDanoAdicional(danoAdicional);
    }

    /**
     * 
     * @param Nome da Arma. Deve conter apenas caracteres
     * Alfa-Numericos (A-Z, a-z e 0-9)".
     * @param descricao Descricao da Arma. Deve conter apenas caracteres
     * Alfa-Numericos (A-Z, a-z e 0-9)".
     * @param dano Dano eh uma instancia da Classe Dado, este representa o
     * dano da Arma
     * @param danoAdicional  Dano Adicional da Arma. O Dano Adicional deve ser 
     * um numero inteiro e maior ou igual a zero(0)
     * @param usando Define se a Arma esta sendo Usada, TRUE - Sim. FALSE - Nao
     * @param bonus_atributo Vetor com os Valores dos Bonus de Atributo da Arma. 
     * Todos os valores devem ser maiores ou iguais a zero(0).
     * @param preco Preco da Arma. Deve ser um numero inteiro e 
     * maior ou igual a zero(0)
     * @param habilidade_Necessaria Habilidade Necessaria para se usar a Arma.
     * @throws ItemInvalidoException
     */
    public Arma(String nome, String descricao,Dado dano,
                int danoAdicional, boolean usando, int[] bonus_atributo,
                int preco, String habilidade_Necessaria) 
                           throws ItemInvalidoException, ItemInvalidoException {
        super(nome,descricao,usando,bonus_atributo,preco,habilidade_Necessaria);
        setDano(dano);
        setDanoAdicional(danoAdicional);
    }

   
    /**
     * Altera o Dano da Arma
     * @param dano Dano eh uma instancia da Classe Dado, este representa o
     * dano da Arma
     * @throws ItemInvalidoException
     */
    public void setDano(Dado dano) throws ItemInvalidoException {
        if(dano != null){
            this.dano = dano;
        }else{
            throw new ItemInvalidoException("O Dano da Arma NAO pode ser NULO");
        }
    }

    /**
     * Retorna o Dano da Arma
     * @return Dano da Arma
     */
    public Dado getDano() {
        return dano;
    }

    /**
     * Altera o Dano Adicional da Arma
     * @param danoAdicional Dano Adicional da Arma. O Dano Adicional deve ser 
     * um numero inteiro e maior ou igual a zero(0)
     * @throws ItemInvalidoException 
     */
    public void setDanoAdicional(int danoAdicional) throws ItemInvalidoException {
        if(danoAdicional >= 0){
    		this.danoAdicional = danoAdicional;
    	}else{
            throw new ItemInvalidoException(
                    "Dano Adicional Invalido, valor Abaixo de Zero(0)");
        }
    }

    /**
     * Retorna o Dano Adicional da Arma
     * @return Dano Adicional da Arma
     */
    public int getDanoAdicional() {
        return danoAdicional;
    }

    @Override
    public String toString() {
        return super.toString()+
               " Dano = "+this.getDano()+
               " + "+this.getDanoAdicional();
    }
}
