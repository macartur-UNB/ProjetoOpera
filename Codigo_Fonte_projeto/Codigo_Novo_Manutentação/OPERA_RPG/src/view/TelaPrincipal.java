package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UnsupportedLookAndFeelException;


public class TelaPrincipal extends JFrame{
    
    private static PanelTab tabbedPane;
    private BarraDeFerramentas toolBar;
    private BarraDeMenus menuBar;
    private static TelaPrincipal telaPrincipal;
    private static boolean existe = false;
    
    public TelaPrincipal(){
        
        existe = true;
        
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Gerenciador de Fichas OPERA RPG");
        
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
        
        
        telaPrincipal = new TelaPrincipal();
        telaPrincipal.setMinimumSize(new Dimension(800, 700));
        telaPrincipal.setMaximumSize(new Dimension(800, 700));
        telaPrincipal.setVisible(true);
    }

    public static void alterarTitulo(String titulo){
        telaPrincipal.setTitle(titulo);
    }
    
    public static PanelTab getTabbedPane() {
        return tabbedPane;
    }

    public static void setTabbedPane(PanelTab tabbedPane) {
        TelaPrincipal.tabbedPane = tabbedPane;
    }

    public static TelaPrincipal getTelaPrincipal() {
        return telaPrincipal;
    }

    public static void setTelaPrincipal(TelaPrincipal telaPrincipal) {
        TelaPrincipal.telaPrincipal = telaPrincipal;
    }

    public static boolean isExiste() {
        return existe;
    }

    public static void setExiste(boolean existe) {
        TelaPrincipal.existe = existe;
    }
    
    
    
}
