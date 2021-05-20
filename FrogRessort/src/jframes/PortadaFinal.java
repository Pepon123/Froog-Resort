
package jframes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Surface1 extends JPanel {

    private void doDrawing(Graphics g) {
        this.setBackground(new Color(102,255, 102));
        Toolkit t = Toolkit.getDefaultToolkit ();
        Image imagen = t.getImage ("src/imagenes/uaaLogo.png");
        g.drawImage (imagen, 250, 20, this);
        
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        doDrawing(g);
    }
}
public class PortadaFinal extends JFrame {
    JPanel panel = new Surface1();
    public PortadaFinal() {
        super.setSize(666, 530);
        //this.panel = new Surface1();
      
        JLabel nombres = new JLabel("Alumnos: XDDxdDxXd");
        nombres.setFont(new java.awt.Font("Times New Roman", 1, 18)); 
        nombres.setBounds(250, 20, 250, 120);
        panel.add(nombres);
        this.add(panel);
        //this.setContentPane(panel);
        
        setLocationRelativeTo(this);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
   
    public static void main(String[] args) {
        new PortadaFinal().setVisible(true);
    }
}
