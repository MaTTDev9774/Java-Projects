

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FramePrincipal extends BaseFrame {
    
    private JPanel Login, Produto;
    private JLabel Email, Senha, COD,NOME,DESCRIÇÃO, PREÇO;
    private JButton[] login, gerar, cancelar, excluir;
    private JTextField tf1, tf2, tf3, tf4, tf5;
    
    public FramePrincipal() {
   
        super("Calculadora", 300, 300);
        
        BorderLayout layout = new BorderLayout();
        this.setLayout(layout);
        
        this.inicializacao();
    }
    
    private void inicializacao() {
      
        this.inicializarLogin();        
       
    }
    
    private void inicializarLogin() {
 
        this.Login = new JPanel();
        this.Login.setLayout(new FlowLayout());
   
        JLabel Email = new JLabel("E-mail:");  
        Login.add(Email);
        this.tf1 = new JTextField(30);
        this.Login.add(this.tf1);  
        
        this.add("Center", this.Login);
}
}