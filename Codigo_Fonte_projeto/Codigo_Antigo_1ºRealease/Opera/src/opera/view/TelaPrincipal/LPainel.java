/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package opera.view.TelaPrincipal;

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
public class LPainel extends JPanel{
    
    private ImageIcon icone;
    private String titulo;
    private JToolBar barraDeFerramentas;
    private JComponent conteiner;
    private BotaoFecharDaTab btnFechar;
    
    public LPainel(ImageIcon icone, String titulo, JToolBar barraDeFerramentas, JComponent conteiner){
        this.setIcone(icone);
        this.setTitulo(titulo);
        this.setBarraDeFerramentas(barraDeFerramentas);
        this.setConteiner(conteiner);
        organizarPainel();
    }
    
    public LPainel(ImageIcon icone, String titulo, JComponent conteiner){
        this.setIcone(icone);
        this.setTitulo(titulo);
        this.barraDeFerramentas = new JToolBar();
        this.setConteiner(conteiner);
        organizarPainel();
    }
    
    public LPainel(String titulo, JToolBar barraDeFerramentas, JComponent conteiner){
        this.setIcone(null);
        this.setTitulo(titulo);
        this.setBarraDeFerramentas(barraDeFerramentas);
        this.setConteiner(conteiner);
        organizarPainel();
    }
    
    public LPainel(){
        
    }
    
    public LPainel(String titulo, JComponent conteiner){
        this.setIcone(null);
        this.setTitulo(titulo);
        this.barraDeFerramentas = new JToolBar();
        this.setConteiner(conteiner);
        organizarPainel();
    }
    
    public void adicionarseNaTab(JTabbedPane tabbedPane){
        tabbedPane.add(this.getTitulo(), this);
        adicionarComponentesNaTab(tabbedPane);
        int index = tabbedPane.indexOfTab(this.getTitulo());
        tabbedPane.setSelectedIndex(index);
    }
    
    public void selecionarseNaTab(JTabbedPane tabbedPane){
        int index = tabbedPane.indexOfTab(this.getTitulo());
        tabbedPane.setSelectedIndex(index);
    }
        
    public void removerseDaTab(JTabbedPane tabbedPane){
        Object componente[] = tabbedPane.getComponents();
        boolean componenteEncontrado = false;
        
        for(int i = 0; i < componente.length; i++){
            if(componente[i].equals(this)){
                
                componenteEncontrado = true;
                
                tabbedPane.remove((LPainel)componente[i]);
                
            }
        }
        
        if(!componenteEncontrado){
            throw new LPainelException("LPainel nao existe nesse JTabbedPane");
        }
        
    }
    
    public void adicionarComponentesNaTab(JTabbedPane tabbedPane){
        Object componente[] = tabbedPane.getComponents();
        boolean componenteEncontrado = false;
        
        for(int i = 0; i < componente.length; i++){
            if(componente[i].equals(this)){
                
                componenteEncontrado = true;
                
                JLabel lblTitulo = new JLabel(this.getTitulo());
                lblTitulo.setIcon(this.getIcone());
                lblTitulo.setOpaque(false);
                
                JPanel pnlTitulo = new JPanel();
                pnlTitulo.setOpaque(false);
                pnlTitulo.add(lblTitulo);
                pnlTitulo.add(this.getBtnFechar());
                
                int index = tabbedPane.indexOfTab(this.getTitulo());
                tabbedPane.setTabComponentAt(index, pnlTitulo);
                
            }
        }
        
        if(!componenteEncontrado){
            throw new LPainelException("LPainel nao existe nesse JTabbedPane");
        }
        
    }
    
    
    public void limparCampos(){
        limparCamposJTextField(this);
        limparCamposJCheckBox(this);
    }
    
    public void limparCamposJTextField(JComponent componente){
        Object objeto[] = componente.getComponents();
        for(int i = 0; i < objeto.length; i++){
            //System.out.println(objeto[i]);
            if(objeto[i] instanceof JComponent){
                limparCamposJTextField(((JComponent)objeto[i]));
            }
            if(objeto[i] instanceof JTextField){
                //System.out.println(((JTextField)objeto[i]).getText());
                ((JTextField)objeto[i]).setText(null);
            }
        }
    }
    
    public void limparCamposJCheckBox(JComponent componente){
        Object objeto[] = componente.getComponents();
        for(int i = 0; i < objeto.length; i++){
            //System.out.println(objeto[i]);
            if(objeto[i] instanceof JPanel){
                limparCamposJCheckBox(((JPanel)objeto[i]));
            }
            if(objeto[i] instanceof JCheckBox){
                //System.out.println(((JCheckBox)objeto[i]).getText());
                ((JCheckBox)objeto[i]).setSelected(false);
            }
        }
    }
    
    
    
    private void organizarPainel(){
        
        this.btnFechar = new BotaoFecharDaTab();
        
        this.barraDeFerramentas.setEnabled(true);
        
        this.barraDeFerramentas.setFloatable(false);
        
        JScrollPane painelDeRolagem = new JScrollPane(conteiner);
        
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(barraDeFerramentas, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelDeRolagem, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(barraDeFerramentas, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(painelDeRolagem, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ImageIcon getIcone() {
        return icone;
    }

    public void setIcone(ImageIcon icone) {
        this.icone = icone;
    }

    public JToolBar getBarraDeFerramentas() {
        return barraDeFerramentas;
    }

    public void setBarraDeFerramentas(JToolBar barraDeFerramentas) {
        this.barraDeFerramentas = barraDeFerramentas;
    }

    public JComponent getConteiner() {
        return conteiner;
    }

    public void setConteiner(JComponent conteiner) {
        this.conteiner = conteiner;
    }

    public BotaoFecharDaTab getBtnFechar() {
        return btnFechar;
    }

    
    
    
    
    
    
    public class BotaoFecharDaTab extends JButton implements MouseListener{

        private BotaoFecharDaTab(){
            //int size = 33;
            int size = 17;
            
            this.setText("x");
            this.setPreferredSize(new Dimension(size, size));
            this.setFocusable(false);
            this.setContentAreaFilled(false);
            this.setBorder(BorderFactory.createEtchedBorder());
            this.setUI(new BasicButtonUI());
            this.setBorderPainted(false);
            this.setBackground(Color.GRAY);

            this.setOpaque(false);

            this.iniciarEventos();
        }

        private void iniciarEventos(){
            this.addMouseListener(this);
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

    }
    
    
    private class LPainelException extends RuntimeException{
        public LPainelException(){
            
        }
        public LPainelException(String mensagem){
            super(mensagem);
        }
    }
    
}
