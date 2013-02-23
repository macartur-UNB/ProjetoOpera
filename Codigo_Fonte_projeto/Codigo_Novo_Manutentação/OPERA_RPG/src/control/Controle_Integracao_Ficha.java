/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import model.classes.Arma_A_Distancia;
import model.classes.Arma_Corpo_A_Corpo;
import model.classes.Armadura;
import model.classes.Caracteristica;
import model.classes.Ficha;
import model.classes.Habilidade;
import model.classes.Item;
import model.exception.ArquivoInvalidoException;
import model.exception.CaracteristicaInvalidaException;
import model.exception.DeletarInvalidoException;
import model.exception.FichaInvalidaException;
import model.exception.HabilidadeInvalidaException;
import model.exception.ItemInvalidoException;


public class Controle_Integracao_Ficha {
    
    private static Ficha ficha ; 
    private static ArrayList auxiliar;
    
    public static void selecionarFicha(String personagem) throws FileNotFoundException, ClassNotFoundException, IOException, ArquivoInvalidoException, FichaInvalidaException{
        if(!Controle_Ficha.FichaExiste(personagem))
        {
            throw new FichaInvalidaException("Personagem {"+personagem+"} nao Existe");
        }
        ficha = Controle_Ficha.encontrarFicha(personagem);
    }
    
    
    public static boolean colocarCaracteristica(String caracteristica) 
                        throws FileNotFoundException, IOException, IOException,
                               ArquivoInvalidoException, ClassNotFoundException,
                               DeletarInvalidoException, FichaInvalidaException, CaracteristicaInvalidaException{
            Caracteristica c;
            if(!Controle_Caracteristica.CaracteristicaExiste(caracteristica)){       
                return false;
            }
            c = Controle_Caracteristica.encontrarCaracteristica(caracteristica);
            auxiliar = ficha.getCaracteristicas();
            if(auxiliar == null)
            {
                auxiliar  = new ArrayList();
            }
            if(contemCaracteristica(auxiliar, caracteristica)){
                throw new CaracteristicaInvalidaException("Ja contem a caracteristica = {"+caracteristica+"}");
            }
            auxiliar.add(c);
            ficha.setCaracteristicas(auxiliar);
            Controle_Ficha.atualizarFicha(ficha);
            return true;
    }
    public static boolean removerCaracteristica(String caracteristica) 
                               throws FileNotFoundException, IOException,
                               ArquivoInvalidoException, ClassNotFoundException,
                               DeletarInvalidoException, FichaInvalidaException, CaracteristicaInvalidaException{
         Caracteristica c;
         
         if(!Controle_Caracteristica.CaracteristicaExiste(caracteristica)){       
                return false;
            }
         c = Controle_Caracteristica.encontrarCaracteristica(caracteristica);
         auxiliar = ficha.getCaracteristicas();
         if(auxiliar==null){
             return false;
         }
         if(!contemCaracteristica(auxiliar, caracteristica)){
             throw  new CaracteristicaInvalidaException("A caracteristica = "+caracteristica+"e invalida");
         }
         Iterator i = auxiliar.iterator();
         Caracteristica car = null;
         while(i.hasNext()){
             car = (Caracteristica)i.next();
         }
         if(car != null){
             if(car.getNome().equals(c.getNome())){
                 auxiliar.remove(car);
             }
         }
         ficha.setCaracteristicas(auxiliar);
         Controle_Ficha.atualizarFicha(ficha);
         return true;
    }
    
    public static String[] listarIntegracaoCaracteristicasFisicas(){
        return listarCaracteristicas("Fisica");
    }
    public static String[] listarIntegracaoCaracteristicasPsiquicas(){
        return listarCaracteristicas("Psiquica");
    }
    public static String[] listarIntegracaoCaracteristicasRaciais(){
        return listarCaracteristicas("Racial");
    }
    private static String[] listarCaracteristicas(String tipo){
        String caracteristicas[] ;
        int aux=0;
        auxiliar = ficha.getCaracteristicas();
        if(auxiliar == null){
            return null;
        }
        caracteristicas = new String[auxiliar.size()];
        Iterator i = auxiliar.iterator();
        while(i.hasNext()){
            Caracteristica c = (Caracteristica)i.next();
            if(c.getTipo().equals(tipo)){
                caracteristicas[aux] = c.getNome();      
                aux++;
            }
        }
        return caracteristicas;
    }
    
    public static void colocarHabilidade(String habilidade) 
                     throws HabilidadeInvalidaException, ClassNotFoundException,
                     IOException, FileNotFoundException, ArquivoInvalidoException,
                     ArquivoInvalidoException, DeletarInvalidoException,
                                                         FichaInvalidaException{
            Habilidade h;
            if(!Controle_Habilidade.HabilidadeExiste(habilidade)){ 
                throw new HabilidadeInvalidaException("Habilidade {"+habilidade+"} Invalida");
            }
            h = Controle_Habilidade.encontrarHabilidade(
                    habilidade,Controle_Habilidade.getTipoHabildiade(habilidade));
            auxiliar = ficha.getHabilidades();
            if(auxiliar == null)
            {
                auxiliar  = new ArrayList();
            }
            if(contemHabilidade(auxiliar, habilidade)){
                throw  new HabilidadeInvalidaException("Ja contem a habilidade {"+habilidade+"} na ficha");
            }
            auxiliar.add(h);           
            ficha.setHabilidades(auxiliar);
            Controle_Ficha.atualizarFicha(ficha);
    }
   
    public static void removerHabilidade(String habilidade) 
            throws FileNotFoundException, IOException, ArquivoInvalidoException,
            ArquivoInvalidoException, HabilidadeInvalidaException,
            ClassNotFoundException{
         Habilidade h;
         
         if(!Controle_Habilidade.HabilidadeExiste(habilidade)){
                throw new HabilidadeInvalidaException("Habilidade {"+habilidade+"} Invalida");
            }
         h = Controle_Habilidade.encontrarHabilidade(habilidade, Controle_Habilidade.getTipoHabildiade(habilidade));
         auxiliar = ficha.getHabilidades();
         if(auxiliar==null){
             throw new HabilidadeInvalidaException("Habilidade {"+habilidade+"} Nao pode ser Removida");
         }         
         if(!contemHabilidade(auxiliar, habilidade)){
             throw new HabilidadeInvalidaException("Não contem a habilidade{"+habilidade+"}");
         }
         Iterator i = auxiliar.iterator();
         Habilidade hab = null;
         while(i.hasNext()){
             hab = (Habilidade)i.next();
         }
         if(hab != null){
             if(hab.getNome().equals(h.getNome())){
                 auxiliar.remove(hab);
            }
         }
         ficha.setHabilidades(auxiliar);
         Controle_Ficha.atualizarFicha(ficha);
    }
        
    public static String[] listarIntegracaoHabilidadesFisicas(){
        return listarHabilidades("Fisica");
    }
    public static String[] listarIntegracaoHabilidadesPsiquicas(){
        return listarHabilidades("Psiquica");
    }
    public static String[] listarIntegracaoHabilidadesBelicas(){
        return listarHabilidades("Belica");
    }
    private static String[] listarHabilidades(String tipo){
        String habilidades[] ;
        int aux=0;
        auxiliar = ficha.getHabilidades();
        if(auxiliar == null){
            return null;
        }
        habilidades = new String[auxiliar.size()];
        Iterator i = auxiliar.iterator();
        while(i.hasNext()){
            Habilidade h = (Habilidade)i.next();
            if(h.getTipo().equals(tipo)){
                habilidades[aux] = h.getNome();      
                aux++;
            }
        }
        return habilidades;
    }
    
    public static void colocarItemGenerico(String nomeItem) throws ItemInvalidoException{
        try{
            Item item = Controle_Item.encontrarItemGenerico(nomeItem);
            if(item == null){ 
                throw new ItemInvalidoException("Item {"+nomeItem+"} Invalido");
            }
            auxiliar = ficha.getItensGenericos();
            if(auxiliar == null)
            {
                auxiliar  = new ArrayList();
            }
            if(contemItem(auxiliar, nomeItem)){
                throw  new ItemInvalidoException("O Item {"+nomeItem+"} Já existe");
            }
            auxiliar.add(item);
            ficha.setItensGenericos(auxiliar);
            Controle_Ficha.atualizarFicha(ficha);
        
        } catch(ArquivoInvalidoException | ClassNotFoundException | IOException e){
            throw new ItemInvalidoException("O Item {"+nomeItem+"} Nao pode ser Integrado");
        }
    }
    public static void removerItemGenerico(String nomeItem) throws ItemInvalidoException{
        try{
            Item item = Controle_Item.encontrarItemGenerico(nomeItem);
            if(item == null){ 
                throw new ItemInvalidoException("Item {"+nomeItem+"} Invalido");
            }
            auxiliar = ficha.getItensGenericos();       
            if(auxiliar==null){
                throw new ItemInvalidoException("Item {"+nomeItem+"} Nao pode ser Removido");
            }         
            if(!contemItem(auxiliar, nomeItem)){
                throw  new ItemInvalidoException("Não contem o item ={"+nomeItem+"} na ficha");
            }
            if(ItemUsando(auxiliar, nomeItem)){
                throw new ItemInvalidoException("O item={"+nomeItem+"} esta sendo usado");
            }
            Iterator i = auxiliar.iterator();
            Item tempItem = null;
            while(i.hasNext()){
                tempItem = (Item)i.next();
            }
            if(tempItem != null){
                if(tempItem.getNome().equals(item.getNome())){
                    if(!ItemUsando(auxiliar,nomeItem)){
                        auxiliar.remove(tempItem);
                    }
                }
            }
            ficha.setItensGenericos(auxiliar);
            Controle_Ficha.atualizarFicha(ficha);
        } catch(ArquivoInvalidoException | ClassNotFoundException | IOException e){
            throw new ItemInvalidoException("O Item nao pode ser removido");
        }
    }    
    public static String[] listarItensGenericos(){
        String itens[] ;
        auxiliar = ficha.getItensGenericos();
        if(auxiliar == null){
            return null;
        }
        itens = listarItem(auxiliar);
        return itens;
    }
    
    public static void colocarArma_A_Distancia(String nomeArma) throws ItemInvalidoException{
        try{
            Arma_A_Distancia arma = Controle_Item.encontrarArma_A_Distancia(nomeArma);
            if(arma == null){ 
                throw new ItemInvalidoException("Arma {"+nomeArma+"} Invalida");
            }
            auxiliar = ficha.getArmasADistancia();
            if(auxiliar == null)
            {
                auxiliar  = new ArrayList();
            }

            Iterator i = auxiliar.iterator();
            Arma_A_Distancia tempArma = null;
            if(contemItem(auxiliar, nomeArma)){
                throw  new ItemInvalidoException("Ja contem o item {"+nomeArma+"}");
            }
            auxiliar.add(arma);
            ficha.setArmasADistancia(auxiliar);
            Controle_Ficha.atualizarFicha(ficha);
        
        } catch(ArquivoInvalidoException | ClassNotFoundException | IOException e){
            throw new ItemInvalidoException("A Arma {"+nomeArma+"} Nao pode ser Integrada");
        }
    }
    public static void removerArma_A_Distancia(String nomeArma) throws ItemInvalidoException{
        try{
            Arma_A_Distancia arma = Controle_Item.encontrarArma_A_Distancia(nomeArma);
            if(arma == null){ 
                throw new ItemInvalidoException("Arma {"+nomeArma+"} Invalida");
            }
            
            auxiliar = ficha.getArmasADistancia();
            if(auxiliar==null){
                throw new ItemInvalidoException("Arma {"+nomeArma+"} Nao pode ser Removida");
            }         
            
            Iterator i = auxiliar.iterator();
            Arma_A_Distancia tempArma = null;
            while(i.hasNext()){
                tempArma = (Arma_A_Distancia)i.next();
            }

            if(tempArma != null){
                if(tempArma.getNome().equals(arma.getNome())){
                    auxiliar.remove(tempArma);
                }
            }else{
                throw new ItemInvalidoException("Arma {"+nomeArma+"} Invalida");
            }

            ficha.setArmasADistancia(auxiliar);
            Controle_Ficha.atualizarFicha(ficha);
        } catch(ArquivoInvalidoException | ClassNotFoundException | IOException e){
            throw new ItemInvalidoException("A Arma nao pode ser removida");
        }
    }
    public static String[] listarArma_A_Distancia(){
        String armas[] ;
        auxiliar = ficha.getArmasADistancia();
        if(auxiliar == null){
            return null;
        }
        armas = listarItem(auxiliar);
        return armas;
    }
    
    public static void colocarArma_Corpo_A_Corpo(String nomeArma) throws ItemInvalidoException{
        try{
            Arma_Corpo_A_Corpo arma = Controle_Item.encontrarArma_Corpo_A_Corpo(nomeArma, null);
            if(arma == null){ 
                throw new ItemInvalidoException("Arma {"+nomeArma+"} Invalida");
            }
            
            auxiliar = ficha.getArmasCorpoACorpo();
            if(auxiliar == null)
            {
                auxiliar  = new ArrayList();
            }

            Iterator i = auxiliar.iterator();
            Arma_Corpo_A_Corpo tempArma = null;
            while(i.hasNext()){
                tempArma = (Arma_Corpo_A_Corpo)i.next();
            }

            auxiliar.add(arma);

            ficha.setArmasCorpoACorpo(auxiliar);
            Controle_Ficha.atualizarFicha(ficha);
        
        } catch(ArquivoInvalidoException | ClassNotFoundException | IOException e){
            throw new ItemInvalidoException("A Arma {"+nomeArma+"} Nao pode ser Integrada");
        }
    }
    public static void removerArma_Corpo_A_Corpo(String nomeArma) throws ItemInvalidoException{
        try{
            Arma_Corpo_A_Corpo arma = Controle_Item.encontrarArma_Corpo_A_Corpo(nomeArma, null);
            if(arma == null){ 
                throw new ItemInvalidoException("Arma {"+nomeArma+"} Invalida");
            }
            
            auxiliar = ficha.getArmasCorpoACorpo();
            if(auxiliar==null){
                throw new ItemInvalidoException("Arma {"+nomeArma+"} Nao pode ser Removida");
            }         
            
            Iterator i = auxiliar.iterator();
            Arma_Corpo_A_Corpo tempArma = null;
            while(i.hasNext()){
                tempArma = (Arma_Corpo_A_Corpo)i.next();
            }

            if(tempArma != null){
                if(tempArma.getNome().equals(arma.getNome())){
                    auxiliar.remove(tempArma);
                }
            }else{
                throw new ItemInvalidoException("Arma {"+nomeArma+"} Invalida");
            }

            ficha.setArmasCorpoACorpo(auxiliar);
            Controle_Ficha.atualizarFicha(ficha);
        } catch(ArquivoInvalidoException | ClassNotFoundException | IOException e){
            throw new ItemInvalidoException("A Arma nao pode ser removida");
        }
    }
    public static String[] listarArma_Corpo_A_Corpo(){
        String armas[] ;
        auxiliar = ficha.getArmasCorpoACorpo();
        if(auxiliar == null){
            return null;
        }
        armas = listarItem(auxiliar);
        return armas;
    }
    
    public static void colocarArmadura(String nomeArmadura) throws ItemInvalidoException{
        try{
            Armadura armadura = Controle_Item.encontrarArmadura(nomeArmadura);
            if(armadura == null){ 
                throw new ItemInvalidoException("Armadura {"+nomeArmadura+"} Invalida");
            }
            
            auxiliar = ficha.getArmaduras();
            if(auxiliar == null)
            {
                auxiliar  = new ArrayList();
            }

            if(contemItem(auxiliar, nomeArmadura)){
                throw  new ItemInvalidoException("Item {"+nomeArmadura+"} ja existe.");
            }

            auxiliar.add(armadura);

            ficha.setArmaduras(auxiliar);
            Controle_Ficha.atualizarFicha(ficha);
        
        } catch(ArquivoInvalidoException | ClassNotFoundException | IOException e){
            throw new ItemInvalidoException("A Armadura {"+nomeArmadura+"} Nao pode ser Integrada");
        }
    }
    public static void removerArmadura(String nomeArmadura) throws ItemInvalidoException{
        try{
            Armadura armadura = Controle_Item.encontrarArmadura(nomeArmadura);
            if(armadura == null){ 
                throw new ItemInvalidoException("Armadura {"+nomeArmadura+"} Invalida");
            }
            
            auxiliar = ficha.getArmaduras();
            if(auxiliar==null){
                throw new ItemInvalidoException("Armadura {"+nomeArmadura+"} Nao pode ser Removida");
            }         
            
            Iterator i = auxiliar.iterator();
            Armadura tempArmadura = null;
            while(i.hasNext()){
                tempArmadura = (Armadura)i.next();
            }
                if(tempArmadura != null){
                    if(tempArmadura.getNome().equals(armadura.getNome())){
                        auxiliar.remove(tempArmadura);
                    }
                }else{
                    throw new ItemInvalidoException("Armadura {"+nomeArmadura+"} Invalida");
                }
            
            ficha.setArmaduras(auxiliar);
            Controle_Ficha.atualizarFicha(ficha);
        } catch(ArquivoInvalidoException | ClassNotFoundException | IOException e){
            throw new ItemInvalidoException("A Armadura nao pode ser removida");
        }
    }
    public static String[] listarArmaduras(){
        String armaduras[] ;
        auxiliar = ficha.getArmaduras();
        if(auxiliar == null){
            return null;
        }
        armaduras = listarItem(auxiliar);
        return armaduras;
    }
    private static String[] listarItem(ArrayList colecao){
        if(colecao.isEmpty()){
            return null;
        }
        String s[] = new String[colecao.size()];
        int aux = 0;
        Iterator i = colecao.iterator();
        while(i.hasNext()){
            Item item = (Item)i.next();
            s[aux] = item.getNome();
            aux++;
        }
        return s;
    }
    
     public static boolean ItemUsando(ArrayList colecao,String nomeItem){
        Iterator i = colecao.iterator();
        while(i.hasNext()){
            Item item = (Item)i.next();
            if(item.getNome().equals(nomeItem)){
                   return item.isUsando();
            }
        }
        return false;
    }
    public static boolean contemItem(ArrayList colecao,String nomeItem){
        Iterator i = colecao.iterator();
        while(i.hasNext()){
            Item item = (Item)i.next();
            if(item.getNome().equals(nomeItem)){
                   return true;
            }
        }
        return false;
    }
    public static boolean contemCaracteristica(ArrayList caracteristicas,String nomeCaracteristica){
        Iterator i = caracteristicas.iterator();
        while(i.hasNext()){
            Caracteristica caracteristica = (Caracteristica)i.next();
            if(caracteristica.getNome().equals(nomeCaracteristica)){
                   return true;
            }
        }
        return false;
    }
    public static boolean contemHabilidade(ArrayList habilidades, String nomeHabilidade){
        Iterator i = habilidades.iterator();
        while(i.hasNext()){
            Habilidade habilidade = (Habilidade)i.next();
            if(habilidade.getNome().equals(nomeHabilidade)){
                   return true;
            }
        }
        return false;
    }
}
