/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package memoria;

import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class FramePrincipal extends BaseFrame {
    
    JLabel[] imagens;
    
    public FramePrincipal() {
        super();
        this.setSize(600,600);
        this.setLayout(new GridLayout(3, 4));

        this.initialize();
    }
    
    public void initialize() {
        String basePath = "assets/img/";
        this.imagens = new JLabel[12];        
        
        ImageIcon img;
        JLabel labImg;
        for (int i = 0; i < this.imagens.length; i++) {
            img = new ImageIcon(basePath + ((i%3) + 1) + ".jpg");
            labImg = new JLabel(img);
            this.imagens[i] = labImg;
            this.add(this.imagens[i]);            
        }
    }    
}
