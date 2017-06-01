package stop;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;


/**
 *
 * @author USER
 */
public class Visual {
    public static void main(String[]args){
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
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
        ins2.setText("Para empezar la diversion deberas escoger: las categorias, el numero de jugadores y las rondas");
        instrucciones.add(ins2);
        
        JLabel ins3= new JLabel();
        ins3.setText("por esta partida, si quieres que el nivel de dificultad suba, entonces escoge el tiempo limite " );
        instrucciones.add(ins3);
        
        JLabel ins4= new JLabel();
        ins4.setText("para la partida. Posteriormente el juego escogera aleatoreamente la letra con la que empezara " );
        instrucciones.add(ins4);
         
        JLabel ins5= new JLabel();
        ins5.setText("esta partida. La tabla que se genera esta compuesta por diversas columnas, cuyos encabezados " );
        instrucciones.add(ins5);
        
        JLabel ins6= new JLabel();
        ins6.setText("corresponden a las categorias (Nombre,Apellido,Ciudad, Fruta, Animal, Cosa, ...) y las columnas " );
        instrucciones.add(ins6);
        
        JLabel ins7= new JLabel();
        ins7.setText("(rondas), que deben ser llenadas por el jugador de acuerdo a la letra escogida anteriormente por el" );
        instrucciones.add(ins7); 
        
        JLabel ins8= new JLabel();
        ins8.setText(" juego. Por ejemplo, se escoge la letra B, cada jugador escribirá una palabra que comience" );
        instrucciones.add(ins8); 
        
        JLabel ins9= new JLabel();
        ins9.setText(" por esta letrapara categoria .La ronda finalizá cuandouno de los jugadores haya completado todas" );
        instrucciones.add(ins9); 
        
        JLabel ins10= new JLabel();
        ins10.setText( "las categorias y presione el boton \\\"¡STOP!\\\" o el  tiempo finalice, en este momento ");
        instrucciones.add(ins10); 
        
        JLabel ins11= new JLabel();
        ins11.setText("está indicando que finalizó y los demás jugadores no podran seguir escribiendo en el tablero y  " );
        instrucciones.add(ins11); 
        
        JLabel ins12= new JLabel();
        ins12.setText("se les dará puntos por las categorias que hayan completado, de esta manera: categoria con igual" );
        instrucciones.add(ins12); 
        
        JLabel ins13= new JLabel();
        ins13.setText(" palabra escrita por otro jugador ( 5 puntos), categoria con  palabra sin repetir por ningun " );
        instrucciones.add(ins13); 
        
        JLabel ins14= new JLabel();
        ins14.setText("jugador(10 puntos) y categoria sin palabra o con palabra inválida ( 0 puntos). Al finalizar cada " );
        instrucciones.add(ins14); 
        
        JLabel ins15= new JLabel();
        ins15.setText("partida el juego sumara los puntajes de cada jugador y decidira quien gana está partida, también " );
        instrucciones.add(ins15); 
        
        JLabel ins16= new JLabel();
        ins16.setText("guardara el tablero por si quieres verlo más tarde y prácticar para ganar todas las partidas." );
        instrucciones.add(ins16);
        
        JLabel ins17= new JLabel();
        ins17.setText("Suerte y que seas el primero en gritar ¡STOP!" );
        instrucciones.add(ins17); 
        
        //Panel para configurar las opciones del juego
        JPanel escoger= new JPanel();
        escoger.setVisible(false);
        frame.add(escoger);
        
        escoger.setLayout(new BoxLayout(escoger,BoxLayout.X_AXIS));
        
        JLabel escogerLabel1= new JLabel();
        escogerLabel1.setText("Número de jugadores " );
        escoger.add(escogerLabel1); 
        
        JLabel escogerLabel2= new JLabel();
        escogerLabel2.setText("                            Categorias " );
        escoger.add(escogerLabel2); 

        JLabel escogerLabel3= new JLabel();
        escogerLabel3.setText("                            Rondas " );
        escoger.add(escogerLabel3); 
        
        JLabel escogerLabel4= new JLabel();
        escogerLabel4.setText("                            Temporizador " );
        escoger.add(escogerLabel4); 
        
        escoger.setLayout(new BoxLayout(escoger,BoxLayout.Y_AXIS));
        
        JRadioButton Box1= new JRadioButton("1");
        escoger.add(Box1);
        
        JRadioButton Box2= new JRadioButton("2");
        escoger.add(Box2);
        
        JRadioButton Box3= new JRadioButton("3");
        escoger.add(Box3);
        
        JRadioButton Box4= new JRadioButton("4");
        escoger.add(Box4);

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
        
        //escoger.setLayout(new BoxLayout(escoger,BoxLayout.X_AXIS));
        JCheckBox check1= new JCheckBox("Nombre");
        escoger.add(check1);
        
        JCheckBox check2= new JCheckBox("Apellido");
        escoger.add(check2);
        
        JCheckBox check3= new JCheckBox("Cosa");
        escoger.add(check3);
        
        JCheckBox check4= new JCheckBox();
        escoger.add(check4);
        
        JCheckBox check5= new JCheckBox();
        escoger.add(check5);
        
        JCheckBox check6= new JCheckBox();
        escoger.add(check6);
        
        JCheckBox check7= new JCheckBox();
        escoger.add(check7);
        
        JCheckBox check8= new JCheckBox();
        escoger.add(check8);
        
        JButton boton4 = new JButton();
        boton4.setLocation(50, 400);
        boton4.setText("Jugar");
        boton4.addMouseListener(new MouseListener(){
            
            @Override
            public void mouseClicked(MouseEvent e) {
               instrucciones.setVisible(false);
               frame.add(escoger);
               escoger.setVisible(true); 
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
        instrucciones.add(boton4);

        frame.add(instrucciones);
        instrucciones.setVisible(false);
        
        JPanel acerca= new JPanel();
        acerca.setLayout(new BoxLayout(acerca,BoxLayout.Y_AXIS));
        
        JLabel acercalabel= new JLabel();
        acercalabel.setText("Acerca de los desarrolladores" );
        acerca.add(acercalabel);
        
        JLabel acercalabel2= new JLabel();
        acercalabel2.setText("Laura Natalia Gonzalez Mora, Estudiante ingenieria de sistemas y computacion" );
        acerca.add(acercalabel2);
        
        JLabel acercalabel3= new JLabel();
        acercalabel3.setText("Pedro Antonio Perez Sibaja, Estudiante ingenieria Industrial" );
        acerca.add(acercalabel3);
        
        JLabel acercalabel4= new JLabel();
        acercalabel4.setText("Diego Raul Guerrero Anaya, Estudiante ingenieria Industrial" );
        acerca.add(acercalabel4);
        
        JLabel acercalabel5= new JLabel();
        acercalabel5.setText("Sergio Esteban Rendon Umbarila, Estudiante ingenieria de sistemas y computacion" );
        acerca.add(acercalabel5);
        
        JLabel acercalabel6= new JLabel();
        acercalabel6.setText("Universidad Nacional de Colombia " );
        acerca.add(acercalabel6);
        
        frame.add(acerca);
        acerca.setVisible(false);
        
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
        JButton boton3 = new JButton();
        boton3.setText("Acerca del desarrollador");
        boton3.addMouseListener(new MouseListener(){
            
            @Override
            public void mouseClicked(MouseEvent e) {
               inicio.setVisible(false);            
               frame.add(acerca);
               acerca.setVisible(true);
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
        

        JButton boton2 = new JButton();
        boton2.setText("Jugar");
        boton2.addMouseListener(new MouseListener(){
            
            @Override
            public void mouseClicked(MouseEvent e) {                         
               instrucciones.setVisible(false);
               frame.add(escoger);
               escoger.setVisible(true); 
               boton2.setVisible(false);
               boton1.setVisible(false);
               boton3.setVisible(false);
              
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
        inicio.add(boton2);
        inicio.add(boton3);
        
        JButton boton5 = new JButton();
        boton5.setText("Regresar al menu");
        boton5.addMouseListener(new MouseListener(){
            
            @Override
            public void mouseClicked(MouseEvent e) {
               acerca.setVisible(false);          
               inicio.setVisible(true);  
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
        acerca.add(boton5);
        frame.add(inicio);
        frame.setVisible(true);
        
    
    }
    
}
