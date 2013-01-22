/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

public class DAO {
    
    
   
    private static DAO instancia ;
    
    public DAO() {
    }

    public static DAO getInstancia() {
        if(instancia == null){
            instancia = new DAO();
        }
        return instancia;
    }


    
    
}
