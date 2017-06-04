/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stop;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author USER
 */
public class Escoger extends JPanel{
    private JFrame frame;
    private String[] categorias;
    private int filas;
    private int columnas;
    
    public Escoger(Visual v) {
        this.setSize(954, 800);
        this.setLayout(new GridLayout(11,4));
        this.setVisible(false);
        this.setAutoscrolls(false);
        this.frame=v;
        this.categorias = categorias;
        this.filas = filas;
        this.columnas = columnas;
        
    }

    public String[] getCategorias() {
        return categorias;
    }

    public void setCategorias(String[] categorias) {
        this.categorias = categorias;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }
    
    @Override
    protected void paintComponent (Graphics g){
        
        super.paintComponent(g);
        Font font= new Font("Forte", 0, 40);
        Font font2= new Font("Forte", 0, 20);
        
        JLabel escogerLabel1= new JLabel("Número de jugadores" );
        JLabel escogerLabel2= new JLabel("Categorias " );
        JLabel escogerLabel3= new JLabel("Rondas ");        
        JLabel escogerLabel4= new JLabel("Temporizador ");
        JLabel l1= new JLabel(" ");
        JLabel l2= new JLabel(" ");
        JLabel l3= new JLabel(" ");
        JLabel l4= new JLabel(" ");
        JLabel l5= new JLabel(" ");
        JLabel l6= new JLabel(" ");
        JLabel l7= new JLabel(" ");
        JLabel l8= new JLabel(" ");
        JLabel l9= new JLabel(" ");
        JLabel l10= new JLabel(" ");
        JLabel l11= new JLabel(" ");
        JLabel l12= new JLabel(" ");
        JLabel l13= new JLabel(" ");
        JLabel l14= new JLabel(" ");
        JLabel l15= new JLabel(" ");
        JLabel l16= new JLabel(" ");
        JLabel l17= new JLabel(" ");
        JLabel l18= new JLabel(" ");
        JLabel l19= new JLabel(" ");
        JLabel l20= new JLabel(" ");
        JLabel l21= new JLabel(" ");
        JLabel l22= new JLabel(" ");
        JLabel l23= new JLabel(" ");
        JLabel l24= new JLabel(" ");
        
        JRadioButton Box1= new JRadioButton("1");
        JRadioButton Box2= new JRadioButton("2");
        JRadioButton Box3= new JRadioButton("3");
        JRadioButton Box4= new JRadioButton("4");
 
        JCheckBox check1= new JCheckBox("Nombre");
        JCheckBox check2= new JCheckBox("Apellido");
        JCheckBox check3= new JCheckBox("Cosa");
        JCheckBox check4= new JCheckBox("Color");
        JCheckBox check5= new JCheckBox("Pais");
        JCheckBox check6= new JCheckBox("Animal"); 
        JCheckBox check7= new JCheckBox("Ciudad");  
        JCheckBox check8= new JCheckBox("Deporte");
        JCheckBox check9= new JCheckBox("Fruta");
        JCheckBox check10= new JCheckBox("Verbo");
        JCheckBox check11= new JCheckBox("jugar con tiempo");
        
        if(check1.isSelected()){
            categorias[0]= "Nombre";
            if(check2.isSelected()){
                categorias[1]= "Apellido";
                if(check3.isSelected()){
                    categorias[2]= "Cosa";
                    if(check4.isSelected()){
                        categorias[3]= "Color";
                        if(check5.isSelected()){
                            categorias[4]= "Pais";
                            if(check6.isSelected()){
                                categorias[5]= "Animal";
                                if(check7.isSelected()){
                                    categorias[6]= "Ciudad";
                                    if(check8.isSelected()){
                                        categorias[7]= "Deporte";
                                        if(check9.isSelected()){
                                            categorias[8]= "Fruta";
                                            if(check10.isSelected())
                                                categorias[9]= "Verbo"; 
                                        }else{
                                            if(check10.isSelected())
                                                categorias[8]= "Verbo";                                         
                                        }
                                    }else{
                                        if(check9.isSelected()){
                                            categorias[7]= "Fruto";
                                            if(check10.isSelected())
                                                categorias[8]= "Verbo";
                                        }else{
                                            if(check10.isSelected())
                                                categorias[7]= "Verbo";
                                        }
                                    }
                                }else{
                                    if(check8.isSelected()){
                                        categorias[6]= "Deporte";
                                        if(check9.isSelected()){
                                                categorias[7]= "Fruta";
                                                if(check10.isSelected())
                                                    categorias[8]= "Verbo";
                                        }else{
                                            if(check9.isSelected()){
                                                categorias[7]= "Fruta";
                                            }else{
                                                if(check10.isSelected())
                                                categorias[7]= "Verbo";
                                            }
                                        }
                                    }else{
                                       if(check9.isSelected()){
                                            categorias[6]= "Fruta";
                                            if(check10.isSelected())
                                                categorias[7]= "Verbo";
                                            }else {
                                            if(check10.isSelected())
                                                categorias[6]= "Verbo";
                                            }   
                                    }
                                }
                            }else{
                                if(check7.isSelected()){
                                    categorias[5]= "Ciudad";
                                    if(check8.isSelected()){
                                        categorias[6]= "Deporte";
                                        if(check9.isSelected()){
                                            categorias[7]= "Fruta";
                                            if(check10.isSelected())
                                                categorias[8]= "Verbo";
                                        }else{
                                            if(check10.isSelected())
                                            categorias[7]= "Verbo";
                                        }    
                                    }else{
                                        if(check9.isSelected()){
                                            categorias[6]= "Fruta"; 
                                            if(check10.isSelected())
                                                categorias[7]= "Verbo";
                                        }else{
                                            if(check10.isSelected())
                                                categorias[6]= "Verbo";
                                        }
                                    }
                                }else{
                                    if(check8.isSelected()){
                                        categorias[5]= "Deporte";
                                        if(check9.isSelected()){
                                            categorias[6]= "Fruta";
                                            if(check10.isSelected())
                                                categorias[7]= "Verbo";
                                        }else{
                                            if(check10.isSelected())
                                                categorias[6]= "Verbo";
                                        }
                                        
                                    }else{
                                        if(check9.isSelected()){
                                                categorias[5]= "Fruta";
                                                if(check10.isSelected())
                                                    categorias[6]= "Verbo";
                                        }else{
                                            if(check10.isSelected())
                                                categorias[5]= "Verbo";
                                        }        
                                    }
                                }
                            }
                        }else{
                            if(check6.isSelected()){
                                categorias[4]= "Animal";
                                if(check7.isSelected()){
                                    categorias[5]= "Ciudad";
                                }else{
                                    if(check8.isSelected()){
                                        categorias[5]= "Deporte";
                                        if(check9.isSelected()){
                                            categorias[6]= "Fruta";
                                                if(check10.isSelected()){
                                                    categorias[7]= "Verbo";
                                        }else{
                                            if(check10.isSelected()){
                                                categorias[6]= "Verbo";
                                            }
                                        }
                                        }else{
                                            if(check9.isSelected()){
                                                categorias[5]= "Fruta";
                                                if(check10.isSelected())
                                                    categorias[6]= "Verbo";
                                            }else{
                                                if(check10.isSelected())
                                                    categorias[5]= "Verbo";
                                            }
                                        }
                                    }
                                }
                            }else{
                                if(check7.isSelected()){
                                    categorias[4]= "Ciudad";
                                    if(check8.isSelected()){
                                        categorias[5]= "Deporte";
                                        if(check9.isSelected()){
                                            categorias[6]= "Fruta";
                                            if(check10.isSelected())
                                                categorias[7]= "Verbo";
                                        }else{
                                            if(check10.isSelected())
                                                categorias[6]= "Ciudad";    
                                        }
                                    }else{
                                        if(check9.isSelected()){
                                            categorias[5]= "Fruta";
                                            if(check10.isSelected())
                                                categorias[6]= "Verbo";
                                        }else{
                                            if(check10.isSelected())
                                                categorias[5]= "Verbo";
                                        }
                                    }
                                }else{
                                    if(check8.isSelected()){
                                        categorias[4]= "Deporte";
                                        if(check9.isSelected()){
                                            categorias[5]= "Fruta";
                                            if(check10.isSelected()){
                                                categorias[4]= "Verbo";
                                        }else{
                                            if(check10.isSelected())
                                                categorias[5]= "Verbo";
                                        }
                                    }else{
                                        if(check9.isSelected()){
                                            categorias[4]= "Fruta";
                                        }else{
                                            if(check10.isSelected()){
                                                categorias[4]= "Verbo";
                                        }
                            }
                        }    
                    }else{
                        if(check4.isSelected()){
                        categorias[2]= "Apellido";
                        }
                    }
                }else{
                    if(check3.isSelected()){
                    categorias[1]= "Cosa";
                    }
                }
            }else {
                if(check3.isSelected()){
                categorias[1]= "Cosa";
                }
            }
        }else{
            if(check2.isSelected()){
                categorias[0]= "Apellido";
            }
        }
        
        JComboBox rondas= new JComboBox(new String[]{"Seleccione el numero de rondas","1","2","3","4","5","6","7",
            "8","9","10","11","12","13","14","15","16","17","18","19","20","21",
            "22","23","24","25","26","27"});
        rondas.setSize(20, 5);
            
        JButton boton6 = new JButton("Jugar");
        boton6.setBackground(Color.red);
        
        escogerLabel1.setFont(font2);
        escogerLabel2.setFont(font2);
        escogerLabel3.setFont(font2);
        escogerLabel4.setFont(font2);
        Box1.setFont(font2);
        Box2.setFont(font2);
        Box3.setFont(font2);
        Box4.setFont(font2);
        check1.setFont(font2);
        check2.setFont(font2);
        check3.setFont(font2);
        check4.setFont(font2);
        check5.setFont(font2);
        check6.setFont(font2);
        check7.setFont(font2);
        check8.setFont(font2);
        check9.setFont(font2);
        check10.setFont(font2);
        check11.setFont(font2);
        rondas.setFont(font2);        
        boton6.setFont(font);
        
        this.add(escogerLabel1); 
        this.add(escogerLabel2); 
        this.add(escogerLabel3);
        this.add(escogerLabel4);
        
        this.add(Box1);
        this.add(check1);
        this.add(rondas);
        this.add(check11);
        this.add(Box2);
        this.add(check2);
        this.add(l1);
        this.add(boton6);
        this.add(Box3);
        this.add(check3);
        this.add(l3);
        this.add(l4);
        this.add(Box4);
        this.add(check4);
        this.add(l5);
        this.add(l6);
        this.add(l7);
        this.add(check5);
        this.add(l8);
        this.add(l9);
        this.add(l10);
        this.add(check6);
        this.add(l11);
        this.add(l12);
        this.add(l13);
        this.add(check7);
        this.add(l14);
        this.add(l15);
        this.add(l16);
        this.add(check8);
        this.add(l17);
        this.add(l18);
        this.add(l19);
        this.add(check9);
        this.add(l20);
        this.add(l21);
        this.add(l22);
        this.add(check10);
        this.add(l23);
        this.add(l24);
 
        Box1.addMouseListener(new MouseListener(){
            
            @Override
            public void mouseClicked(MouseEvent e) {
               Box2.setSelected(false);
               Box3.setSelected(false);
               Box4.setSelected(false);
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
        Box2.addMouseListener(new MouseListener(){
            
            @Override
            public void mouseClicked(MouseEvent e) {
               Box1.setSelected(false);
               Box3.setSelected(false);
               Box4.setSelected(false);
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
        Box3.addMouseListener(new MouseListener(){
            
            @Override
            public void mouseClicked(MouseEvent e) {
               Box2.setSelected(false);
               Box1.setSelected(false);
               Box4.setSelected(false);
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
        Box4.addMouseListener(new MouseListener(){
            
            @Override
            public void mouseClicked(MouseEvent e) {
               Box2.setSelected(false);
               Box3.setSelected(false);
               Box1.setSelected(false);
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
        
        JPanel escoger= this;
        
        boton6.addMouseListener(new MouseListener(){
            
            @Override
            public void mouseClicked(MouseEvent e) {
                ((Visual)frame).CambiarPanel("ruleta","escoger");
                escoger.setVisible(false);
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
}
