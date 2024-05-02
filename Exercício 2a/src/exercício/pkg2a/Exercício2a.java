package exercício.pkg2a;

import javax.swing.*;
import java.awt.*;

public class Exercício2a extends JFrame {
    
    public JButton buttonnorte, buttonoeste, buttonleste, buttonsul;
    
    public Exercício2a (String titulo){
        
        super(titulo);
        setSize(400,300);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(10,10));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JButton button = new JButton("Norte");
        add(button, BorderLayout.PAGE_START);
         
        button = new JButton("Oeste");
        add(button, BorderLayout.LINE_START);
         
        button = new JButton("Leste");
        add(button, BorderLayout.LINE_END);
        
        button = new JButton("Sul");
        add(button, BorderLayout.PAGE_END);
        
        setVisible(true);
        
    }
            
            public static void main(String[] args) {
                new Exercício2a ("BorderLayout");
    }
    
}
