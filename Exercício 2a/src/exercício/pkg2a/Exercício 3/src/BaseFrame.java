

import javax.swing.JFrame;

public abstract class BaseFrame extends JFrame {
    
    BaseFrame() {
        this("Sem título informado");
    }
    
    BaseFrame(String titulo) {
        this(titulo, 800, 600);
    }
    
    BaseFrame(String titulo, int width, int height) {
        this.setTitle(titulo);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(width, height);
    }
    
    
    
}