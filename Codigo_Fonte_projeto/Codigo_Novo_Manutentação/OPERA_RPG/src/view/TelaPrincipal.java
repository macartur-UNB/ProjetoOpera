/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Luciano
 */
public class TelaPrincipal extends JFrame{
    
    public static PanelTab tabbedPane;
    private BarraDeFerramentas toolBar;
    private BarraDeMenus menuBar;
    
    public TelaPrincipal(){
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        tabbedPane = new PanelTab();
        
        toolBar = new BarraDeFerramentas(tabbedPane);
        
        menuBar = new BarraDeMenus(tabbedPane);
        
        this.setJMenuBar(menuBar);
        
        this.add(toolBar, BorderLayout.NORTH);
        this.add(tabbedPane, BorderLayout.CENTER);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Definindo o tipo de desenho da interface como "NIMBUS"
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
            try {
                javax.swing.UIManager.setLookAndFeel(info.getClassName());
                break;
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                Logger.getLogger(TelaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
        }
        
        
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setMinimumSize(new Dimension(800, 600));
        telaPrincipal.setMaximumSize(new Dimension(800, 600));
        telaPrincipal.setVisible(true);
    }


}
