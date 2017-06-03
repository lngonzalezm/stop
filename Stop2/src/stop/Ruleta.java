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
import static java.lang.System.out;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author USER
 */
public class Ruleta extends JPanel implements ActionListener, MouseListener{
    private int x,y;
    private Timer timer;
    private int secuencia;
    private JLabel letra;
    private JFrame frame;

    public Ruleta(Visual v) {
        timer = new Timer(300, this);
        timer.start();
        this.secuencia = 0;
         this.letra = new JLabel(letras());
         this.setSize(954, 800);
        this.setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        this.setVisible(false);
        this.frame=v;
    }

    @Override
    protected void paintComponent (Graphics g){
        
        super.paintComponent(g);
        Font font= new Font("Forte", 0, 40);
        Font font2= new Font("Forte", 0, 80);
        JLabel r1= new JLabel("Empieza con la letra: ");
        JLabel r2= new JLabel(" ");
        JLabel r3= new JLabel(" ");
        Image icon= loadImage("ruleta.jpg");
        Image flecha= loadImage("flecha.png");
        JButton boton7=new JButton("Jugar");
        boton7.setBackground(Color.red);
        g.drawImage(flecha, 175, 350,null);
        g.drawImage(icon, 100, 50,400,350,(this.secuencia*120),(this.secuencia*120),(this.secuencia*120)+120,(this.secuencia*120)+120,this);
        letra= new JLabel("\t"+"\t"+"\t"+"\t"+"\t"+"           "+letras());
        r1.setFont(font);
        r2.setFont(font);
        letra.setFont(font2);
        boton7.setFont(font);
        
        this.add(r1);
        this.add(r2);
        this.add(r3);
        this.add(letra);
        this.add(boton7);
        JPanel tablero=this;
        boton7.addMouseListener(new MouseListener(){
            
            @Override
            public void mouseClicked(MouseEvent e) {
                ((Visual)frame).CambiarPanel("tablero","ruleta");
                tablero.setVisible(false);
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
    public String letras(){
        String rul="";
        int ruleta = new Double(Math.random ()*27).intValue();
            switch (ruleta)
            {
            case 0: rul= "A";
            break;
            case 1: rul= "B";
            break;
            case 2: rul= "C";
            break;
            case 3: rul= "D";
            break;
            case 4: rul= "B";
            break;
            case 5: rul= "E";
            break;
            case 6: rul= "F";
            break;
            case 7: rul= "G";
            break;
            case 8: rul= "H";
            break;
            case 9: rul= "I";
            break;
            case 10: rul= "J";
            break;
            case 11: rul= "K";
            break;
            case 12: rul= "L";
            break;
            case 13: rul= "M";
            break;
            case 14: rul= "N";
            break;
            case 15: rul= "O";
            break;
            case 16: rul= "P";
            break;
            case 17: rul= "Q";
            break;
            case 18: rul= "R";
            break;
            case 19: rul= "S";
            break;
            case 20: rul= "T";
            break;
            case 21: rul= "U";
            break;
            case 22: rul= "V";
            break;
            case 23: rul= "W";
            break;
            case 24: rul= "X";
            break;
            case 25: rul= "Y";
            break;
            case 26: rul= "Z";
            }
            
      return rul;
    }
    public String EnviarLetra() {
        String l=this.letras();
        String letras=l.toString();
        return letras;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(this.secuencia == 4){
          this.secuencia = 0;
          repaint();
        }else {
          this.secuencia++;
          repaint();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
