/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stop;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author USER
 */
public class Acerca extends JPanel{
    private JFrame frame;
    
    public Acerca(Visual v) {
        this.setSize(954, 800);
        this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        this.setVisible(false);
        this.frame=v;
    }
    
    @Override
    protected void paintComponent (Graphics g){
        super.paintComponent(g);
        Font font= new Font("Forte", 0, 40);
        Font font2= new Font("Forte", 0, 20);
        JLabel acercalabel= new JLabel("Acerca de los desarrolladores");
        JLabel acercalabel2= new JLabel("Laura Natalia Gonzalez Mora, Estudiante ingenieria de sistemas y computacion" );
        JLabel acercalabel3= new JLabel("Pedro Antonio Perez Sibaja, Estudiante ingenieria Industrial" );
        JLabel acercalabel4= new JLabel("Diego Raul Guerrero Anaya, Estudiante ingenieria Industrial" );
        JLabel acercalabel5= new JLabel("Sergio Esteban Rendon Umbarila, Estudiante ingenieria de sistemas y computacion" );
        JLabel acercalabel6= new JLabel("Universidad Nacional de Colombia " );
        JButton boton5 = new JButton("Regresar al menu");
        
        acercalabel.setFont(font2);
        acercalabel2.setFont(font2);
        acercalabel3.setFont(font2);
        acercalabel4.setFont(font2);
        acercalabel5.setFont(font2);
        acercalabel6.setFont(font2);
        boton5.setFont(font);
        JPanel acerca= this;
        
        boton5.addMouseListener(new MouseListener(){
            
            @Override
            public void mouseClicked(MouseEvent e) {
                ((Visual)frame).CambiarPanel("acerca","inicio");
                acerca.setVisible(false);
            }

            @Override
            public void mousePressed(MouseEvent e) {
               
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                 
            }

            @Override
            public void mouseExited(MouseEvent e) {
                
            }
        });
        
        this.add(acercalabel);
        this.add(acercalabel2);
        this.add(acercalabel3);
        this.add(acercalabel4);
        this.add(acercalabel5);
        this.add(acercalabel6);
        this.add(boton5);
    }
}
