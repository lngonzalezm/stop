/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stop;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author USER
 */
public class Instrucciones extends JPanel{
    
    @Override
    protected void paintComponent (Graphics g){
        super.paintComponent(g);
        JButton boton4 = new JButton();
        Font font= new Font("Forte", 0, 40);
        Font font2= new Font("Forte", 0, 13);
        boton4.setText("Jugar");
        boton4.setFont(font);
        boton4.setBackground(Color.red);
        
        JLabel ins= new JLabel("INSTRUCCIONES");
        JLabel ins1= new JLabel("Bienvenido al juego STOP");
        JLabel ins2= new JLabel("Para empezar la diversion deberas escoger: las categorias, el numero de jugadores y las rondas por esta partida, si quieres que el nivel de dificultad suba, entonces  ");
        JLabel ins3= new JLabel("escoge el tiempo limite para la partida. Posteriormente el juego escogera aleatoreamente la letra con la que empezara esta partida. La tabla que se genera esta " );
        JLabel ins4= new JLabel("compuesta por diversas columnas, cuyos encabezados corresponden a las categorias (Nombre,Apellido,Ciudad, Fruta, Animal, Cosa, ...) y las columnas (rondas), que deben " );
        JLabel ins5= new JLabel("ser llenadas por el jugador, escribiendo en cada casilla una sola palabra que inicie con la letra escogida anteriormente por el juego. Por ejemplo, se escoge la letra " );
        JLabel ins6= new JLabel("B, cada jugador escribirá una palabra que comience por esta letrapara categoria .La ronda finalizá cuando uno de los jugadores haya completado todas las categorias y " );
        JLabel ins7= new JLabel("presione el boton \\\"¡STOP!\\\" o el  tiempo finalice, en este momento está indicando que finalizó y los demás jugadores no podran seguir escribiendo en el tablero y  ");
        JLabel ins8= new JLabel("se les dará puntos por las categorias que hayan completado, de esta manera: categoria con igual  palabra escrita por otro jugador ( 5 puntos), categoria con  palabra " );
        JLabel ins9= new JLabel("sin repetir por ningun jugador(10 puntos) y  categoria sin palabra o con palabra inválida ( 0 puntos). Al finalizar cada  partida el juego sumara los puntajes de cada " );
        JLabel ins10= new JLabel("jugador y decidira quien gana está partida, también guardara el tablero por si quieres verlo más tarde y prácticar para ganar todas las partidas.");
        JLabel ins11= new JLabel("Suerte y que seas el primero en gritar ¡STOP!" );
        ins.setFont(font2);
        ins1.setFont(font2);
        ins2.setFont(font2);
        ins3.setFont(font2);
        ins4.setFont(font2);
        ins5.setFont(font2);
        ins6.setFont(font2);
        ins7.setFont(font2);
        ins8.setFont(font2);
        ins9.setFont(font2);
        ins10.setFont(font2);
        ins11.setFont(font2);
        
        
        boton4.addMouseListener(new MouseListener(){
            
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
        
        this.add(ins);
        this.add(ins1);
        this.add(ins2); 
        this.add(ins3);
        this.add(ins4); 
        this.add(ins5); 
        this.add(ins6);
        this.add(ins7); 
        this.add(ins8); 
        this.add(ins9); 
        this.add(ins10); 
        this.add(ins11);
        this.add(boton4);
        
    }
}
