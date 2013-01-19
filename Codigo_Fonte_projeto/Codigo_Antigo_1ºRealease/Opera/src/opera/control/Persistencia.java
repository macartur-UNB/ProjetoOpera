/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opera.control;
import java.io.*;

/**
 *
 * @author Macartur
 */
public class Persistencia {
    
    private FileInputStream arquivo_Entrada;
    private FileOutputStream arquivo_Saida;
    private ObjectInputStream objeto_Entrada;
    private ObjectOutputStream objeto_Saida;
    
    
    public void gravar( String endereco,Object o){
        try {
            arquivo_Saida = new FileOutputStream(endereco);
            objeto_Saida = new ObjectOutputStream(arquivo_Saida);
            objeto_Saida.writeObject(o);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
    
    public Object carregar(String endereco){
        Object o =null;
        try {
            arquivo_Entrada = new FileInputStream(endereco);
            objeto_Entrada = new ObjectInputStream(arquivo_Entrada);
            o = objeto_Entrada.readObject();
            
        } catch (ClassNotFoundException e) {
                System.out.println(e.getMessage());
        } catch (FileNotFoundException e){
                System.out.println(e.getMessage());
        } catch (Exception e){
                System.out.println(e.getMessage());
        }
        return o;
    }   
    public void removerArquivo(String endereco){
        File arquivo = new File(endereco);
        arquivo.delete();
    }
    
}
