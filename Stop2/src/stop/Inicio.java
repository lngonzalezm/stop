/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stop;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author USER
 */
public class Inicio extends JPanel implements ActionListener, MouseListener{
        
    
    @Override
    protected void paintComponent (Graphics g){
        super.paintComponent(g);
        Image icon= loadImage("titulo.png");
        Font font= new Font("Forte", 0, 40);
        Font font2= new Font("Forte", 0, 20);
        
        JLabel l1= new JLabel(" ");
        JLabel l2= new JLabel(" ");
        JLabel l3= new JLabel(" ");
        JLabel l4= new JLabel(" ");
        JLabel l5= new JLabel(" ");
        JLabel l6= new JLabel(" ");
        
        JButton boton1 = new JButton("Instrucciones");
        boton1.setFont(font2);
        JButton boton2 = new JButton("Jugar");
        boton2.setFont(font); 
        boton2.setBackground(Color.red);
        JButton boton3 = new JButton("Acerca del desarrollador");
        boton3.setFont(font2);
        
        g.drawImage(icon, 0, 0, 950, 209, null);
        this.add(l1);
        this.add(l2);
        this.add(l3);
        this.add(boton1);
        this.add(boton2);
        this.add(boton3);
        this.add(l4);
        this.add(l5);
        this.add(l6);
        boton1.addMouseListener(new MouseListener(){
            
            @Override
            public void mouseClicked(MouseEvent e) {
              
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
        boton3.addMouseListener(new MouseListener(){
            
            @Override
            public void mouseClicked(MouseEvent e) {
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
        boton2.addMouseListener(new MouseListener(){
            
            @Override
            public void mouseClicked(MouseEvent e) {                         
              
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
        
       
    }
    
    
    public Image loadImage(String imageName) {
        ImageIcon ii = new ImageIcon(imageName);
        Image image = ii.getImage();
        return image;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       
    }

    @Override
    public void mouseExited(MouseEvent e) {
               
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       
    }
    
}
