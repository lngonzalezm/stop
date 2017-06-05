/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Sergio y Camilo
 */
public abstract class VentanaCronometro extends JFrame implements ActionListener {
    private JLabel label;
    private JButton btnIniciar;
    private JButton btnDetener;
    private JButton btnReiniciar;
    
    public static int hora=0;
    public static int minuto=0;
    public static int segundo=0;
    
    static boolean IniciaHilo=true;
    boolean corriendo = false;
    
    public VentanaCronometro()
    {
        initialize();
        setSize(358,160); //Dimensiones de la ventana del cronómetro (ancho,alto)
        getContentPane().setLayout(null);
        setLocationRelativeTo(null);
    }
    
    private void initialize()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        label = new JLabel("00:00:00");
        label.setFont(new Font("Traditional Arabic", Font.PLAIN,50));
        label.setBounds(67,-30, 237, 145); //Ubicacion y dimensiones del texto de las horas, minutos y segundos (x,y,ancho,alto)
        getContentPane().add(label);
        
        btnIniciar = new JButton("Iniciar");
        btnIniciar.setBounds(119,80,89,23); //Ubicacion y dimensiones del boton de Iniciar (x,y,ancho,alto)
        btnIniciar.addActionListener(this);
        getContentPane().add(btnIniciar);
        
        btnDetener = new JButton("Parar");
        btnDetener.setBounds(10,80,89,23); //Ubicacion y dimensiones del boton de Parar (x,y,ancho,alto)
        btnDetener.addActionListener(this);
        getContentPane().add(btnDetener);
        
        btnReiniciar = new JButton("Reiniciar");
        btnReiniciar.setBounds(228,80,89,23); //Ubicacion y dimensiones del boton de Parar (x,y,ancho,alto)
        btnReiniciar.addActionListener(this);
        getContentPane().add(btnReiniciar);
        
       
        
    }
    
    private void iniciarHiloCronometro(){
            if(IniciaHilo==true)
            {
                System.out.println("Empieza el juego");
                Cronometro miCronometro = new Cronometro(label);
                miCronometro.start();
            }
        }
    
    @Override
    public void actionPerformed(ActionEvent e)
        {
            if(e.getSource()==btnIniciar)
            {
                if(corriendo==false)
                {
                    IniciaHilo=true;
                    corriendo=true;
                    iniciarHiloCronometro();
                }
            }
            
            if(e.getSource()==btnDetener)
            {
                corriendo=false;
                IniciaHilo=false;
            }
            
            if(e.getSource()==btnReiniciar)
            {
                corriendo=false;
                IniciaHilo=false;
                label.setText("00:00:00");
                hora=0;
                minuto=0;
                segundo=0;
            }
        }

}
