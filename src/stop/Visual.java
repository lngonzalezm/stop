/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stop;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;

/**
 *
 * @author USER
 */
public class Visual {
    public static void main(String[]args){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setTitle("¡STOP!");
        
        
        //Panel de inicio
        JPanel inicio= new JPanel();
        inicio.setSize(500, 500);
        inicio.setVisible(true);
        
        //Panel de instrucciones
        JPanel instrucciones= new JPanel(); 
        instrucciones.setLayout(new BoxLayout(instrucciones,BoxLayout.Y_AXIS));
        
        ImageIcon icon= new ImageIcon("titulo.png");
        JLabel im= new JLabel ("", icon, JLabel.CENTER);   
        inicio.add(im);
        
        JLabel ins= new JLabel();
        ins.setText("INSTRUCCIONES");
        instrucciones.add(ins);
        
        JLabel ins1= new JLabel();
        ins1.setText("Bienvenido al juego STOP" );
        instrucciones.add(ins1);
        
        JLabel ins2= new JLabel();
        ins2.setText("Para empezar la diversión deberas escoger: las categorias, el numero de jugadores y las rondas por esta partida, si quieres que");
        instrucciones.add(ins2);
        
        JLabel ins6= new JLabel();
        ins6.setText("(Nombre,Apellido,Ciudad, Fruta, Animal, Cosa, ...) y las columnas (rondas), " );
        instrucciones.add(ins6);
        
        JLabel ins7= new JLabel();
        ins7.setText("que deben ser llenadas por el jugador de acuerdo a la letra escogida" );
        instrucciones.add(ins7);
        
        JLabel ins3= new JLabel();
        ins3.setText("el nivel de dificultad suba, entonces escoge el tiempo limite para la partida." );
        instrucciones.add(ins3);
        
        JLabel ins4= new JLabel();
        ins4.setText("Posteriormente el juego escogera aleatoreamente la letra con la que empezará esta partida." );
        instrucciones.add(ins4);
        
        JLabel ins5= new JLabel();
        ins5.setText("La tabla que se genera está compesta por diversas columnas, cuyos encabezados corresponden a las categorias" );
        instrucciones.add(ins5);
        
        JButton boton4 = new JButton();
        boton4.setLocation(50, 400);
        boton4.setText("Jugar");
        instrucciones.add(boton4);
        
        
        
        
        
        frame.add(instrucciones);
        instrucciones.setVisible(false);
        
        JButton boton1 = new JButton();
        boton1.setText("Instrucciones");
        boton1.addMouseListener(new MouseListener(){
            
            @Override
            public void mouseClicked(MouseEvent e) {
               inicio.setVisible(false);            
               frame.add(instrucciones);
               instrucciones.setVisible(true);
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
        inicio.add(boton1);
        
        
        JButton boton2 = new JButton();
        boton2.setText("Jugar");
       // boton2.setBounds(150, 0, 50, 20);
        inicio.add(boton2);
        
        JButton boton3 = new JButton();
        boton3.setText("Acerca del desarrollador");
        //boton3.setBounds(250, 450, 50, 20);
        inicio.add(boton3);
        //Boton para panel de instrucciones
        
        
        frame.add(inicio);
        frame.setVisible(true);
        
    
    }
    
}
