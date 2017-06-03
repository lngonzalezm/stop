/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stop;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class Tablero extends JPanel implements ActionListener, MouseListener{
        
   private Ruleta ruleta;
   private JFrame frame;

    public Tablero(Visual v) {
        this.ruleta = ruleta;
        this.setSize(954, 800);
        this.setVisible(false);
        this.frame=v;
    }
   
    @Override
    protected void paintComponent (Graphics g){
        Object[][] data = {};
        String[] columnNames = {};
        DefaultTableModel dtm= new DefaultTableModel(data, columnNames);
        JTable tabla= new JTable(5, 4);
        tabla.setVisible(true);
        JButton boton8= new JButton("¡STOP!");
        boton8.setBackground(Color.red);
        Font font= new Font("Forte", 0, 40);
        String letra = ruleta.EnviarLetra();
        JLabel letraa= new JLabel(letra);
        letraa.setFont(font);
        this.add(tabla);
        this.add(boton8);
        this.add(letraa);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
