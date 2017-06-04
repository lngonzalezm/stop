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
    
    public static int hora=0;
    public static int minuto=0;
    public static int segundo=0;
    
    static boolean IniciaHilo=true;
    boolean corriendo = false;
    
    public VentanaCronometro()
    {
        initialize();
        setSize(228,120);
        getContentPane().setLayout(null);
        setLocationRelativeTo(null);
    }
    
    private void initialize()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        label = new JLabel("00:00:00");
        label.setFont(new Font("Traditional Arabic", Font.PLAIN,30));
        label.setBounds(47,111, 137, 45);
        getContentPane().add(label);
        
        btnIniciar = new JButton("Inicia");
        btnIniciar.setBounds(119,54,89,23);
        btnIniciar.addActionListener(this);
        getContentPane().add(btnIniciar);
        
        btnDetener = new JButton("Para");
        btnDetener.setBounds(10,54,89,23);
        btnDetener.addActionListener(this);
        getContentPane().add(btnDetener);
        
       
        
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
        }

    private void iniciarHiloCronometro(){
            if(IniciaHilo==true)
            {
                System.out.println("Empieza el juego");
                Cronometro miCronometro = new Cronometro(label);
                miCronometro.start();
            }
        }




}
