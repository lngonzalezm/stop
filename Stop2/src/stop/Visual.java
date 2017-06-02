package stop;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author USER
 */
public class Visual {
    
    public static void main(String[]args){
        //creacion del frame y sus objetos
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(954, 800);
        frame.setResizable(false);
        frame.setLocation(200, 0);
        frame.setTitle("¡STOP!");
 
        //Panel de inicio
        Inicio inicio= new Inicio();
        inicio.setSize(954, 800);
        inicio.setLayout(new GridLayout(3, 3, 25, 100));
        inicio.setVisible(false);
        frame.add(inicio);
                
        //Panel de instrucciones
        Instrucciones instrucciones= new Instrucciones(); 
        instrucciones.setSize(954, 800);
        instrucciones.setLayout(new BoxLayout(instrucciones,BoxLayout.Y_AXIS));
        instrucciones.setVisible(false);
        frame.add(instrucciones);
        
        //Panel acerca de los desarrolladores
        Acerca acerca= new Acerca();
        acerca.setSize(954, 800);
        acerca.setLayout(new BoxLayout(acerca,BoxLayout.Y_AXIS));
        frame.add(acerca);
        acerca.setVisible(false);
        
        //Panel para escoger las opciones del juego
        Escoger escoger= new Escoger();
        escoger.setSize(954, 800);
        escoger.setLayout(new GridLayout(11,4));
        escoger.setVisible(false);
        escoger.setAutoscrolls(false);
        frame.add(escoger);
        
        
        //Panel de la ruleta donde se escogera aleatoreamene la letra
        Ruleta ruleta= new Ruleta();
        ruleta.setSize(954, 800);
        ruleta.setLayout(new BoxLayout(ruleta,BoxLayout.Y_AXIS));
        ruleta.setVisible(false);
        frame.add(ruleta);
        
        //Panel para el tablero
        Tablero tablero=new Tablero();
        tablero.setSize(954, 800);
        tablero.setVisible(true);
        frame.add(tablero);
        
        //Panel muestra tablero final y puntaje
        JPanel tableroFinal=new JPanel();
        tableroFinal.setVisible(false);
        frame.add(tableroFinal);
        
        //Panel de fin del juego 
        JPanel FinJuego=new JPanel();
        FinJuego.setVisible(false);
        frame.add(FinJuego);
        
        //Creacion de objetos para panel tablero final 
        JLabel puntajeFinal= new JLabel("Puntaje Final");
        JLabel puntaje1= new JLabel();
        
        JButton salir= new JButton("Salir");
        
        //Agregacion de objetos para panel tablero final
        //tableroFinal.add(tabla);
        tableroFinal.add(puntaje1);
        
        //Creacion de objetos para panel fin del juego  
        JLabel puntaje= new JLabel("Puntaje del juego");
        JLabel ganador= new JLabel("Gana jugador # ");
        JLabel ganador1= new JLabel();
        JLabel Salir= new JLabel("Fin del juego. ¿Desea jugar de nuevo?");
        
        JButton Si= new JButton("Si");
        JButton No= new JButton("No");
        
        //Agregacion de objetos para panel fin del juego
        FinJuego.add(puntaje);
        FinJuego.add(puntaje1);
        FinJuego.add(ganador);
        FinJuego.add(ganador1);
        FinJuego.add(Salir);
        FinJuego.add(Si);
        FinJuego.add(No);
       
        frame.setVisible(true);
    }
   
}
