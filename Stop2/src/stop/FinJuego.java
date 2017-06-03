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
public class FinJuego extends JPanel{
    
    private JFrame frame;
    
    public FinJuego(Visual v) {
        this.setVisible(false);
        this.frame= v;
    }
    @Override
    protected void paintComponent (Graphics g){
        super.paintComponent(g);
        JLabel puntaje= new JLabel("Puntaje del juego");
        JLabel ganador= new JLabel("Gana jugador # ");
        JLabel ganador1= new JLabel();
        JLabel Salir= new JLabel("Fin del juego. ¿Desea jugar de nuevo?");
        
        JButton Si= new JButton("Si");
        JButton No= new JButton("No");
        
        //Agregacion de objetos para panel fin del juego
        this.add(puntaje);
        this.add(ganador);
        this.add(ganador1);
        this.add(Salir);
        this.add(Si);
        this.add(No);
    }
}
