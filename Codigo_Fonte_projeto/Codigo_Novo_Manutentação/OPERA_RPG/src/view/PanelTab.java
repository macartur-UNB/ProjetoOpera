/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

/**
 *
 * @author Luciano
 */
public class PanelTab extends JTabbedPane implements MouseListener{
    
    private static boolean existe = false;
    
    public void adicionarPainel(JPanel painel, String titulo, ImageIcon icone){
        
        JScrollPane scroolPane = new JScrollPane(painel);
        //this.add(titulo, scroolPane);
        this.addTab(titulo, icone, scroolPane);
        
        
        JLabel lblTitulo = new JLabel(titulo);
        lblTitulo.setIcon(icone);
        lblTitulo.setOpaque(false);
        
        JPanel pnlTitulo = new JPanel();
        pnlTitulo.setOpaque(false);
        pnlTitulo.add(lblTitulo);
        pnlTitulo.add(new BotaoFecharDaTab(this, titulo));
        pnlTitulo.setComponentPopupMenu(new PopupFecharTab(this, titulo));
        pnlTitulo.addMouseListener(this);
        
        int index = this.indexOfTab(titulo);
        this.setTabComponentAt(index, pnlTitulo);
    }
    
    public PanelTab(){
        existe = true;
    }
    
    public static boolean existe(){
        return existe;
    }


    @Override
    public void mouseClicked(MouseEvent event) {
        Object origem = event.getSource();
        
        if(origem instanceof JPanel){
            JPanel painel = (JPanel) origem;
            Component componentes[] = painel.getComponents();
            
            for(int i = 0; i < componentes.length; i++){
                if(componentes[i] instanceof JLabel){
                    JLabel rotulo = (JLabel) componentes[i];
                    int index = this.indexOfTab(rotulo.getText());
                    this.setSelectedIndex(index);
                }
            }
        }
        
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mousePressed(MouseEvent event) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseReleased(MouseEvent event) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseEntered(MouseEvent event) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseExited(MouseEvent event) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
    
    public class PopupFecharTab extends JPopupMenu implements ActionListener{

        private PanelTab tab;
        private String tabTitulo;
        
        private JMenuItem itemFechar;
        private JMenuItem itemFecharTodos;
        private JMenuItem itemFecharOutros;

        public PopupFecharTab(PanelTab tab, String titulo){
            this.tab = tab;
            this.tabTitulo = titulo;
            
            itemFechar = new JMenuItem("Fechar");
            itemFecharTodos = new JMenuItem("Fechar Todos");
            itemFecharOutros = new JMenuItem("Fechar Outros");

            this.add(itemFechar);
            this.add(itemFecharTodos);
            this.add(itemFecharOutros);
            
            iniciarEventos();
        }
        
        private void iniciarEventos(){
            itemFechar.addActionListener(this);
            itemFecharTodos.addActionListener(this);
            itemFecharOutros.addActionListener(this);
        }

        @Override
        public void actionPerformed(ActionEvent event) {
            Object origem = event.getSource();
            
            if(origem.equals(itemFechar)){
                int index = tab.indexOfTab(tabTitulo);
                tab.remove(index);
            }
            
            if(origem.equals(itemFecharTodos)){
                tab.removeAll();
            }
            
            if(origem.equals(itemFecharOutros)){
                while(tab.getTabCount() > 1){
                    for(int i = 0; i < tab.getTabCount(); i++){
                        if(!(tab.getTitleAt(i).equals(tabTitulo))){
                            tab.remove(i);
                        }
                    }
                }
            }
            //throw new UnsupportedOperationException("Not supported yet.");
        }

    }
    
    
    
    public class BotaoFecharDaTab extends JButton implements MouseListener, ActionListener{

        private PanelTab tab;
        private String tabTitulo;
        
        private BotaoFecharDaTab(PanelTab tab, String titulo){
            this.tab = tab;
            this.tabTitulo = titulo;
            
            //int size = 33;
            int size = 17;
            
            this.setText("x");
            this.setPreferredSize(new Dimension(size, size));
            this.setFocusable(false);
            this.setContentAreaFilled(false);
            this.setBorder(BorderFactory.createEtchedBorder());
            this.setBorderPainted(false);
            this.setBackground(Color.GRAY);

            this.setOpaque(false);

            this.iniciarEventos();
        }

        private void iniciarEventos(){
            this.addMouseListener(this);
            this.addActionListener(this);
        }

        @Override
        public void mouseClicked(MouseEvent event) {

            //throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void mousePressed(MouseEvent event) {
            Object origem = event.getSource();


            if(origem.equals(this)){
                this.setBackground(Color.DARK_GRAY);
                this.setForeground(Color.red);
                this.setBorderPainted(true);
                //System.out.println("Event: " + event);
            }
            //throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void mouseReleased(MouseEvent event) {
            Object origem = event.getSource();


            if(origem.equals(this)){
                this.setForeground(Color.BLACK);
                this.setBorderPainted(false);
                //System.out.println("Event: " + event);
            }
            //throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void mouseEntered(MouseEvent event) {
            Object origem = event.getSource();

            if(origem.equals(this)){
                this.setBorderPainted(true);                
            }

            //throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void mouseExited(MouseEvent event) {
            Object origem = event.getSource();

            if(origem.equals(this)){
                this.setBorderPainted(false);
                this.setBackground(Color.GRAY);
            }
            //throw new UnsupportedOperationException("Not supported yet.");
        }

        @Override
        public void actionPerformed(ActionEvent event) {
            Object origem = event.getSource();
            
            if(origem.equals(this)){
                int index = tab.indexOfTab(this.tabTitulo);
                tab.remove(index);
            }
            //throw new UnsupportedOperationException("Not supported yet.");
        }

    }
    
}
