
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Macartur
 */
public class Teste {
    static HashMap<String, String> teste = new HashMap();
    static Vector v = new Vector(2, 1);
    public static void main(String args[])
    {
        
        teste.put("1", "2");
        teste.put("2", "3");
        teste.put("3", "4");
        
        for(String i : teste.keySet())
        {
            String s = teste.get(i);
            System.out.println("Valor de s = "+s);           
        }
        
        Iterator j = teste.keySet().iterator();
        while(j.hasNext()){
            System.out.println(j.next());
        }        
    }    
}
