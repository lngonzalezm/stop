/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stop;

import java.awt.Graphics;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author USER
 */
public class TableroFinal extends JPanel{
    private JFrame frame;
    
    public TableroFinal(Visual v) {
        this.setVisible(false);
        this.frame=v;
    }
    @Override
    protected void paintComponent (Graphics g){
        super.paintComponent(g);
        JLabel puntajeFinal= new JLabel("Puntaje Final");
        JLabel puntaje1= new JLabel();
        
        JButton salir= new JButton("Salir");
        //tableroFinal.add(tabla);
        this.add(puntaje1);
    }
}
