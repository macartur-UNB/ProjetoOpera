/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

public class DAO {
    
    
    public DAO_JOGO c_Jogo ;
    public DAO_DADO c_Dado ;
    public DAO_ITENS c_Item ;
    public DAO_Caracteristicas c_Caracteristicas ;
    
    private static DAO instancia ;
    
    public DAO() {
        c_Jogo = DAO_JOGO.getInstancia();
        c_Dado = DAO_DADO.getInstancia();
        c_Item = DAO_ITENS.getInstancia();
        c_Caracteristicas = DAO_Caracteristicas.getInstancia();
    }

    public static DAO getInstancia() {
        if(instancia == null){
            instancia = new DAO();
        }
        return instancia;
    }


    
    
}
