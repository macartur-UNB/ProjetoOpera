/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;

/**
 *
 * @author Luciano
 */
public class BarraDeFerramentas extends JToolBar implements ActionListener{
    
    private PanelTab tabbedPane;
    
    private static JButton btnNovoJogo;
    private static JButton btnAbrirJogo;
    private static JButton btnDeletar;
    
    private static JButton btnNovaFicha;
    private static JButton btnNovaHabilidade;
    private static JButton btnNovaCaracteristica;
    private static JButton btnNovoEquipamento;
    
    private static JButton btnAlterarFicha;
    private static JButton btnAlterarHabilidade;
    private static JButton btnAlterarCaracteristica;
    private static JButton btnAlterarEquipamento;
    
    
        
    public BarraDeFerramentas(PanelTab tabbedPane){
        this.tabbedPane = tabbedPane;
        
        this.setSize(10, 10);
        
        btnNovoJogo = new JButton();
        btnAbrirJogo = new JButton();
        btnDeletar = new JButton();
        
        btnNovaFicha = new JButton();
        btnNovaHabilidade = new JButton();
        btnNovaCaracteristica = new JButton();
        btnNovoEquipamento = new JButton();
        
        btnAlterarFicha = new JButton();
        btnAlterarHabilidade = new JButton();
        btnAlterarCaracteristica = new JButton();
        btnAlterarEquipamento = new JButton();
        
        
        btnNovoJogo.setToolTipText("Novo Jogo");
        btnAbrirJogo.setToolTipText("Abrir Jogo");
        btnDeletar.setToolTipText("Deletar");
        
        btnNovaFicha.setToolTipText("Nova Ficha");
        btnNovaHabilidade.setToolTipText("Nova Habilidade");
        btnNovaCaracteristica.setToolTipText("Nova Caracteristica");
        btnNovoEquipamento.setToolTipText("Novo Equipamento");
        
        btnAlterarFicha.setToolTipText("Alterar Ficha");
        btnAlterarHabilidade.setToolTipText("Alterar Habilidade");
        btnAlterarCaracteristica.setToolTipText("Alterar Caracteristica");
        btnAlterarEquipamento.setToolTipText("Alterar Equipamento");
        
        
        btnNovoJogo.setIcon(new ImageIcon(getClass().getResource("/view/Icones/Novo Jogo.png")));
        btnAbrirJogo.setIcon(new ImageIcon(getClass().getResource("/view/Icones/Abrir Jogo.png")));
        btnDeletar.setIcon(new ImageIcon(getClass().getResource("/view/Icones/Deletar Jogo.png")));
        btnNovaFicha.setIcon(new ImageIcon(getClass().getResource("/view/Icones/Cadastrar Ficha.png")));
        btnNovaHabilidade.setIcon(new ImageIcon(getClass().getResource("/view/Icones/Cadastrar Habilidade.png")));
        btnNovaCaracteristica.setIcon(new ImageIcon(getClass().getResource("/view/Icones/Cadastrar Caracteristica.png")));
        btnNovoEquipamento.setIcon(new ImageIcon(getClass().getResource("/view/Icones/Cadastrar Equipamento.png")));
        
        btnAlterarFicha.setIcon(new ImageIcon(getClass().getResource("/view/Icones/Alterar Ficha.png")));
        btnAlterarHabilidade.setIcon(new ImageIcon(getClass().getResource("/view/Icones/Alterar Habilidade.png")));
        btnAlterarCaracteristica.setIcon(new ImageIcon(getClass().getResource("/view/Icones/Alterar Caracteristica.png")));
        btnAlterarEquipamento.setIcon(new ImageIcon(getClass().getResource("/view/Icones/Alterar Equipamento.png")));

        this.add(btnNovoJogo);
        this.add(btnAbrirJogo);
        this.add(btnDeletar);
        
        this.addSeparator();
        
        this.add(btnNovaFicha);
        this.add(btnNovaHabilidade);
        this.add(btnNovaCaracteristica);
        this.add(btnNovoEquipamento);
        
        this.addSeparator();
        
        this.add(btnAlterarFicha);
        this.add(btnAlterarHabilidade);
        this.add(btnAlterarCaracteristica);
        this.add(btnAlterarEquipamento);
        
        this.iniciarEventos();
        
        this.habilitarMenus(false);
    }
    
    
    public static void habilitarMenus(boolean habilitar){
        btnNovaFicha.setEnabled(habilitar);
        btnNovaHabilidade.setEnabled(habilitar);
        btnNovaCaracteristica.setEnabled(habilitar);
        btnNovoEquipamento.setEnabled(habilitar);

        btnAlterarFicha.setEnabled(habilitar);
        btnAlterarHabilidade.setEnabled(habilitar);
        btnAlterarCaracteristica.setEnabled(habilitar);
        btnAlterarEquipamento.setEnabled(habilitar);
    }
    
    public static boolean existe(){
        boolean existe = false;
        if(btnNovoJogo != null){
            existe = true;
        }
        return existe;
    }
    
    private void iniciarEventos(){
        btnNovoJogo.addActionListener(this);
        btnAbrirJogo.addActionListener(this);
        btnDeletar.addActionListener(this);
        
        btnNovaFicha.addActionListener(this);
        btnNovaHabilidade.addActionListener(this);
        btnNovaCaracteristica.addActionListener(this);
        btnNovoEquipamento.addActionListener(this);
        
        btnAlterarFicha.addActionListener(this);
        btnAlterarHabilidade.addActionListener(this);
        btnAlterarCaracteristica.addActionListener(this);
        btnAlterarEquipamento.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        Object origem = event.getSource();
        
        if(origem.equals(btnNovoJogo)){
            NovaAba.abaNovoJogo(tabbedPane, (ImageIcon)btnNovoJogo.getIcon());
        }
        
        if(origem.equals(btnAbrirJogo)){
            NovaAba.abaAbrirJogo(tabbedPane, (ImageIcon)btnAbrirJogo.getIcon());
        }
        if(origem.equals(btnDeletar)){
            
        }
        if(origem.equals(btnNovaFicha)){
            NovaAba.abaCadastrarFicha(tabbedPane, (ImageIcon)btnNovaFicha.getIcon());
        }
        if(origem.equals(btnNovaHabilidade)){
            NovaAba.abaCadastrarHabilidade(tabbedPane, (ImageIcon)btnNovaHabilidade.getIcon());
        }
        if(origem.equals(btnNovaCaracteristica)){
            NovaAba.abaCadastrarCaracteristica(tabbedPane, (ImageIcon)btnNovaCaracteristica.getIcon());
        }
        if(origem.equals(btnNovoEquipamento)){
            NovaAba.abaCadastrarEquipamento(tabbedPane, (ImageIcon)btnNovoEquipamento.getIcon());
        }
        if(origem.equals(btnAlterarFicha)){
            
        }
        if(origem.equals(btnAlterarHabilidade)){
            
        }
        if(origem.equals(btnAlterarCaracteristica)){
            
        }
        if(origem.equals(btnAlterarEquipamento)){
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        //throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
