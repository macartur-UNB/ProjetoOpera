/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opera.model;

import java.io.Serializable;
import opera.control.Validar;
import opera.exception.CaracteristicaInvalidaException;
import opera.exception.FichaInvalidaException;
import opera.exception.HabilidadeInvalidaException;

/**
 * 
 * @author Macartur
 */
public class Ficha implements Serializable{
    private String personagem;
    private String jogador;
    private String campanha;
    private int experiencia;
    private String tipo;
    private int atributos[];
    
    private Habilidade habilidade[];
    private Caracteristica caracteristica[];
    
    
    public Ficha(String personagem, int experiencia, String tipo, int[] atributos) throws FichaInvalidaException {
        setPersonagem(personagem);
        setExperiencia(experiencia);
        setTipo(tipo);
        setAtributos(atributos);
    }
        
        
    public Ficha(String personagem, String jogador, String campanha, int experiencia, String tipo, int[] atributos) throws FichaInvalidaException {
        this(personagem, experiencia, tipo, atributos);
        setJogador(jogador);
        setCampanha(campanha);
    }
    
    
       

    public final void setPersonagem(String personagem) throws FichaInvalidaException {
        if(Validar.validarNome(personagem)){
            this.personagem = personagem;
        }else{
            throw new FichaInvalidaException("Nome do Personagem esta nulo ou invalido");
        }
    }

    public String getPersonagem() {
        return personagem;
    }

    public final void setTipo(String tipo) throws FichaInvalidaException {
        if( (tipo.toLowerCase().equals("jogador")) || (tipo.toLowerCase().equals("npc")) || (tipo.toLowerCase().equals("monstro")) ){
            this.tipo = tipo;
        }else{
            System.out.println(tipo);
            throw new FichaInvalidaException("Tipo de Ficha invalido, deve ser: jogador, npc ou monstro");
        }
        
    }

    public String getTipo() {
        return tipo;
    }

    public final void setCampanha(String campanha) throws FichaInvalidaException {
        if( (!campanha.equals("")) || (!campanha.equals(" ")) || (campanha != null) ){
            this.campanha = campanha;
        }else{
            throw new FichaInvalidaException("Campanha Invalida, nao pode ser nula");
        }
    }

    public String getCampanha() {
        return campanha;
    }

    public final void setExperiencia(int experiencia) throws FichaInvalidaException {
        try{
            if(experiencia >= 0){
                this.experiencia = experiencia;
            }else{
                throw new FichaInvalidaException("Experiencia invalida, deve ser numero inteiro maior ou igual a zero e diferente de nulo");
            }
        } catch(NumberFormatException e){
            throw new FichaInvalidaException("Experiencia invalida, deve ser numero inteiro maior ou igual a zero e diferente de nulo");
        }
    }

    public int getExperiencia() {
        return experiencia;
    }

    public final void setAtributos(int[] atributos) throws FichaInvalidaException {
        boolean erro = false;
        String atributo[] = new String[8];
        atributo[0] = "Fisico";
        atributo[1] = "Destreza";
        atributo[2] = "Inteligencia";
        atributo[3] = "Vontade";
        atributo[4] = "Percepcao";
        atributo[5] = "Mente";
        atributo[6] = "Mana";
        atributo[7] = "Sorte";
        
        if( (atributos != null) && (atributos.length == 8) ){
            for(int i = 0; i < atributos.length; i++){
                if(atributos[i] < 0){
                    erro = true;
                    throw new FichaInvalidaException("Atributo " + atributo[i] + " invalido, deve ser numero inteiro e maior que zero");
                }
            }
            if(!erro){
                this.atributos = atributos;
            }
        }else{
            throw new FichaInvalidaException("Erro no vetor de Atributos");
        }
    }

    public int[] getAtributos() {
        return atributos;
    }
    
    public final void setJogador(String jogador) throws FichaInvalidaException {
        if(Validar.validarNome(jogador)){
            this.jogador = jogador;
        }else{
            throw new FichaInvalidaException("Nome do Jogador esta nulo ou invalido");
        }
    }

    public String getJogador() {
        return jogador;
    }

    public Habilidade[] getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(Habilidade[] habilidade) {
        this.habilidade = habilidade;
    }

    public Caracteristica[] getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(Caracteristica[] caracteristica) {
        this.caracteristica = caracteristica;
    }
       
    
    
    @Override
    public String toString() {
        return " Personagem: "+getPersonagem() +
               " Jogador: " +getJogador() + 
               " Experiencia: " +getExperiencia() +
               " Tipo: "+ getTipo() + 
               " Campanha"+ getCampanha();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void addHabilidade(Habilidade hab){
        
        boolean habJaColocada = false;
        
        if(habilidade == null){
            habilidade = new Habilidade[1];
            habilidade[0] = hab;   
        }else{
            Habilidade temp[] = habilidade;
            habilidade = new Habilidade[temp.length + 1];
            for(int i = 0; i < temp.length; i++){
                if(hab.getNome().compareToIgnoreCase(temp[i].getNome()) >= 0){
                    //System.out.println("maior");
                    habilidade[i] = temp[i];
                }else{
                    if(!habJaColocada){
                        habilidade[i] = hab;
                        habJaColocada = true;
                    }
                    habilidade[i+1] = temp[i];
                }
            }
            if(!habJaColocada){
                habilidade[habilidade.length - 1] = hab;
                habJaColocada = true;
            }
        }     
    }
    
    public void addCaracteristica(Caracteristica car){
        
        boolean carJaColocada = false;
        
        if(caracteristica == null){
            caracteristica = new Caracteristica[1];
            caracteristica[0] = car;   
        }else{
            Caracteristica temp[] = caracteristica;
            caracteristica = new Caracteristica[temp.length + 1];
            for(int i = 0; i < temp.length; i++){
                if(car.getNome().compareToIgnoreCase(temp[i].getNome()) >= 0){
                    //System.out.println("maior");
                    caracteristica[i] = temp[i];
                }else{
                    if(!carJaColocada){
                        caracteristica[i] = car;
                        carJaColocada = true;
                    }
                    caracteristica[i+1] = temp[i];
                }
            }
            if(!carJaColocada){
                caracteristica[caracteristica.length - 1] = car;
                carJaColocada = true;
            }
        }     
    }
    
    
    public void removerHabilidade(Habilidade hab) throws HabilidadeInvalidaException{
        if(habilidade != null){
            int indice = indiceHabilidade(hab);
            
            for(int i = indice+1; i < habilidade.length; i++){
                habilidade[i-1] = habilidade[i];
            }
            
            Habilidade temp[] = habilidade;
            habilidade = new Habilidade[temp.length - 1];
            
            for(int i = 0; i < habilidade.length; i++){
                habilidade[i] = temp[i];
            }
        }
    }
    
    
    public void removerCaracteristica(Caracteristica car) throws CaracteristicaInvalidaException{
        if(caracteristica != null){
            int indice = indiceCaracteristica(car);
            
            for(int i = indice+1; i < caracteristica.length; i++){
                caracteristica[i-1] = caracteristica[i];
            }
            
            Caracteristica temp[] = caracteristica;
            caracteristica = new Caracteristica[temp.length - 1];
            
            for(int i = 0; i < caracteristica.length; i++){
                caracteristica[i] = temp[i];
            }
            
            if(car.getModificador() != null){
                subtrairAtributos(car.getModificador());
            }
        }
    }
    
    
    public int indiceHabilidade(Habilidade hab) throws HabilidadeInvalidaException{
        if( (habilidade != null) && (habilidade.length > 0) ){
            int inicio = 0;
            int fim = habilidade.length - 1;
            int meio = (int) ((inicio + fim) / 2);  
            int meioAnterior;
            boolean encontrado = false;

            do{
                if(habilidade[meio].equals(hab)){
                    return meio;
                }else{
                    if( hab.getNome().compareToIgnoreCase(habilidade[meio].getNome()) > 0 ){
                        inicio = meio;
                    }else{
                        fim = meio;
                    }
                    meioAnterior = meio;

                    meio = (inicio + fim) / 2;

                    if(meio == meioAnterior){
                        meio++;
                    }
                }       
            }while( (inicio != fim) && (!encontrado) );
        }else{
            throw new HabilidadeInvalidaException("A Ficha nao possui Habilidades");
        }
        
        throw new HabilidadeInvalidaException("Habilidade nao encontrada");
    }
    
    public int indiceCaracteristica(Caracteristica car) throws CaracteristicaInvalidaException{
        if( (caracteristica != null) && (caracteristica.length > 0) ){
            int inicio = 0;
            int fim = caracteristica.length - 1;
            int meio = (int) ((inicio + fim) / 2);  
            int meioAnterior;
            int inLoop = 3;
            boolean encontrado = false;

            do{
                if(caracteristica[meio].equals(car)){
                    return meio;
                }else{
                    if( car.getNome().compareToIgnoreCase(caracteristica[meio].getNome()) > 0 ){
                        inicio = meio;
                    }else{
                        fim = meio;
                    }
                    meioAnterior = meio;

                    meio = (inicio + fim) / 2;

                    if(meio == meioAnterior){
                        meio++;
                        System.out.println("meioAnterior: " + meioAnterior);
                        System.out.println("meio: " + meio);
                        System.out.println("caracteristica[meio]: " + caracteristica[meio].getNome() + ". car: " + car.getNome());
                        //inLoop--;
                    }
                }       
            }while( (inicio != fim) && (!encontrado) && (inLoop > 0) );
        }else{
            throw new CaracteristicaInvalidaException("A Ficha nao possui Caracteristicas");
        }
        
        throw new CaracteristicaInvalidaException("Caracteristica nao encontrada");
    }
    
    
    private void somarAtributos(int modificadores[]){
        for(int i = 0; i < atributos.length; i++){
            //System.out.println("atributos[i]: " + atributos[i] + " + modificadores[i]: " + modificadores[i]);
            atributos[i] += modificadores[i];
        }
    }
    private void subtrairAtributos(int modificadores[]){
        for(int i = 0; i < atributos.length; i++){
            //System.out.println("atributos[i]: " + atributos[i] + " - modificadores[i]: " + modificadores[i]);
            atributos[i] -= modificadores[i];
        }
    }
    
    
    
}