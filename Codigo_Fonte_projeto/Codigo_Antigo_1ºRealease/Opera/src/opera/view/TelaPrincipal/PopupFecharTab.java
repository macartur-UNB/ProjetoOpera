/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opera.view.TelaPrincipal;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/**
 *
 * @author Luciano
 */
public class PopupFecharTab extends JPopupMenu{
    
    private JMenuItem itemFechar;
    private JMenuItem itemFecharTodos;
    private JMenuItem itemFecharOutros;

    public JMenuItem getItemFechar() {
        return itemFechar;
    }

    public void setItemFechar(JMenuItem itemFechar) {
        this.itemFechar = itemFechar;
    }

    public JMenuItem getItemFecharTodos() {
        return itemFecharTodos;
    }

    public void setItemFecharTodos(JMenuItem itemFecharTodos) {
        this.itemFecharTodos = itemFecharTodos;
    }

    public JMenuItem getItemFecharOutros() {
        return itemFecharOutros;
    }

    public void setItemFecharOutros(JMenuItem itemFecharOutros) {
        this.itemFecharOutros = itemFecharOutros;
    }
    
    
    public PopupFecharTab(){
        itemFechar = new JMenuItem("Fechar");
        itemFecharTodos = new JMenuItem("Fechar Todos");
        itemFecharOutros = new JMenuItem("Fechar Outros");
        
        this.add(itemFechar);
        this.add(itemFecharTodos);
        this.add(itemFecharOutros);
    }
    
}
