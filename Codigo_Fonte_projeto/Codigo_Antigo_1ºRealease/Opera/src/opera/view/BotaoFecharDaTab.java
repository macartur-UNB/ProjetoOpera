/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opera.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.plaf.basic.BasicButtonUI;

/**
 *
 * @author Luciano
 */
public class BotaoFecharDaTab extends JPanel implements MouseListener{
    
    private JButton btnFechar;
    private JLabel lblPalavra;
    
    public JButton getBtnFechar() {
        return btnFechar;
    }
    public JLabel getLblPalavra(){
        return lblPalavra;
    }

    public void setBtnFechar(JButton btnFechar) {
        this.btnFechar = btnFechar;
    }

    public void setLblPalavra(JLabel lblPalavra) {
        this.lblPalavra = lblPalavra;
    }
    

    public BotaoFecharDaTab(String palavra){
        //int size = 33;
        int size = 17;
        
        btnFechar = new JButton("x");
        btnFechar.setPreferredSize(new Dimension(size, size));
        btnFechar.setFocusable(false);
        btnFechar.setContentAreaFilled(false);
        btnFechar.setBorder(BorderFactory.createEtchedBorder());
        btnFechar.setUI(new BasicButtonUI());
        btnFechar.setBorderPainted(false);
        btnFechar.setBackground(Color.GRAY);

        lblPalavra = new JLabel(palavra);
        lblPalavra.setOpaque(false);
        this.setOpaque(false);

        this.add(lblPalavra);
        this.add(btnFechar);
        
        this.iniciarEventos();
    }

    private void iniciarEventos(){
        btnFechar.addMouseListener(this);
    }
    
    @Override
    public void mouseClicked(MouseEvent event) {

        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mousePressed(MouseEvent event) {
        Object origem = event.getSource();
        
        
        if(origem.equals(btnFechar)){
            btnFechar.setBackground(Color.DARK_GRAY);
            btnFechar.setBorderPainted(true);
            //System.out.println("Event: " + event);
        }
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseReleased(MouseEvent event) {
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseEntered(MouseEvent event) {
        Object origem = event.getSource();
        
        if(origem.equals(btnFechar)){
            btnFechar.setBorderPainted(true);
        }
        
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void mouseExited(MouseEvent event) {
        Object origem = event.getSource();
        
        if(origem.equals(btnFechar)){
            btnFechar.setBackground(Color.GRAY);
            btnFechar.setBorderPainted(false);
        }
        //throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
