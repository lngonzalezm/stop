package stop;
import java.awt.Color;
import java.awt.GridLayout;
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
        frame.setSize(600, 800);
        frame.setResizable(false);
        frame.setLocation(350, 0);
        frame.setTitle("¡STOP!");
        
        //Panel de inicio
        JPanel inicio= new JPanel();
        inicio.setSize(600, 800);
        inicio.setVisible(true);
        frame.add(inicio);
                
        //Panel de instrucciones
        JPanel instrucciones= new JPanel(); 
        instrucciones.setLayout(new BoxLayout(instrucciones,BoxLayout.Y_AXIS));
        instrucciones.setVisible(false);
        frame.add(instrucciones);
        
        //Panel acerca de los desarrolladores
        JPanel acerca= new JPanel();
        acerca.setLayout(new BoxLayout(acerca,BoxLayout.Y_AXIS));
        frame.add(acerca);
        acerca.setVisible(false);
        
        //Panel para escoger las opciones del juego
        JPanel escoger= new JPanel();
        escoger.setVisible(false);
        escoger.setLayout(new GridLayout(11,4));
        frame.add(escoger);
        
        //Panel de la ruleta donde se escogera aleatoreamene la letra
        JPanel ruleta= new JPanel();
        ruleta.setLayout(new BoxLayout(ruleta,BoxLayout.Y_AXIS));
        ruleta.setVisible(false);
        frame.add(ruleta);
        
        //Panel para el tablero
        JPanel tablero=new JPanel();
        tablero.setVisible(false);
        frame.add(tablero);
        
        //Panel muestra tablero final y puntaje
        JPanel tableroFinal=new JPanel();
        tableroFinal.setVisible(false);
        frame.add(tableroFinal);
        
        //Panel de fin del juego 
        JPanel FinJuego=new JPanel();
        FinJuego.setVisible(false);
        frame.add(FinJuego);
        
        //creacion objetos para el panel de inicio
        ImageIcon icon= new ImageIcon("titulo.png");
        JLabel im= new JLabel ("", icon, JLabel.CENTER);   
        
        JButton boton1 = new JButton("Instrucciones");
        JButton boton2 = new JButton("Jugar");
        boton2.setBackground(Color.red);
        JButton boton3 = new JButton("Acerca del desarrollador");

        //Agragacion de objetos panel inicio
        inicio.add(im);
        inicio.add(boton1);
        inicio.add(boton2);
        inicio.add(boton3);
        
        //creacion de objetos para el panel de instrucciones
        JButton boton4 = new JButton();
        boton4.setLocation(50, 400);
        boton4.setText("Jugar");
        boton4.setBackground(Color.red);
        
        JLabel ins= new JLabel("INSTRUCCIONES");
        JLabel ins1= new JLabel("Bienvenido al juego STOP");
        JLabel ins2= new JLabel("Para empezar la diversion deberas escoger: las categorias, el numero de jugadores y las rondas");
        JLabel ins3= new JLabel("por esta partida, si quieres que el nivel de dificultad suba, entonces escoge el tiempo limite " );
        JLabel ins4= new JLabel("para la partida. Posteriormente el juego escogera aleatoreamente la letra con la que empezara " );
        JLabel ins5= new JLabel("esta partida. La tabla que se genera esta compuesta por diversas columnas, cuyos encabezados " );
        JLabel ins6= new JLabel("corresponden a las categorias (Nombre,Apellido,Ciudad, Fruta, Animal, Cosa, ...) y las columnas " );
        JLabel ins7= new JLabel("(rondas), que deben ser llenadas por el jugador de acuerdo a la letra escogida anteriormente por el");
        JLabel ins8= new JLabel(" juego. Por ejemplo, se escoge la letra B, cada jugador escribirá una palabra que comience" );
        JLabel ins9= new JLabel(" por esta letrapara categoria .La ronda finalizá cuando uno de los jugadores haya completado todas" );
        JLabel ins10= new JLabel( "las categorias y presione el boton \\\"¡STOP!\\\" o el  tiempo finalice, en este momento ");
        JLabel ins11= new JLabel("está indicando que finalizó y los demás jugadores no podran seguir escribiendo en el tablero y  " );
        JLabel ins12= new JLabel("se les dará puntos por las categorias que hayan completado, de esta manera: categoria con igual");
        JLabel ins13= new JLabel(" palabra escrita por otro jugador ( 5 puntos), categoria con  palabra sin repetir por ningun " );
        JLabel ins14= new JLabel("jugador(10 puntos) y categoria sin palabra o con palabra inválida ( 0 puntos). Al finalizar cada " );
        JLabel ins15= new JLabel("partida el juego sumara los puntajes de cada jugador y decidira quien gana está partida, también " );
        JLabel ins16= new JLabel("guardara el tablero por si quieres verlo más tarde y prácticar para ganar todas las partidas." );
        JLabel ins17= new JLabel("Suerte y que seas el primero en gritar ¡STOP!");
        
        //Agregacion de los objetos panel instrucciones
        instrucciones.add(ins);
        instrucciones.add(ins1);
        instrucciones.add(ins2); 
        instrucciones.add(ins3);
        instrucciones.add(ins4); 
        instrucciones.add(ins5); 
        instrucciones.add(ins6);
        instrucciones.add(ins7); 
        instrucciones.add(ins8); 
        instrucciones.add(ins9); 
        instrucciones.add(ins10); 
        instrucciones.add(ins11);
        instrucciones.add(ins12); 
        instrucciones.add(ins13);
        instrucciones.add(ins14);
        instrucciones.add(ins15); 
        instrucciones.add(ins16); 
        instrucciones.add(ins17);
        instrucciones.add(boton4);
        
        //creacion de objetos para el panel acerca
        JLabel acercalabel= new JLabel("Acerca de los desarrolladores");
        JLabel acercalabel2= new JLabel("Laura Natalia Gonzalez Mora, Estudiante ingenieria de sistemas y computacion" );
        JLabel acercalabel3= new JLabel("Pedro Antonio Perez Sibaja, Estudiante ingenieria Industrial" );
        JLabel acercalabel4= new JLabel("Diego Raul Guerrero Anaya, Estudiante ingenieria Industrial" );
        JLabel acercalabel5= new JLabel("Sergio Esteban Rendon Umbarila, Estudiante ingenieria de sistemas y computacion" );
        JLabel acercalabel6= new JLabel("Universidad Nacional de Colombia " );
        JButton boton5 = new JButton("Regresar al menu");
        
        //Agregacion objetos del panel acerca
        acerca.add(acercalabel);
        acerca.add(acercalabel2);
        acerca.add(acercalabel3);
        acerca.add(acercalabel4);
        acerca.add(acercalabel5);
        acerca.add(acercalabel6);
        acerca.add(boton5);
        
        //creacion de objetos para panel escoger
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
        
        JComboBox rondas= new JComboBox(new String[]{"Seleccione el numero de rondas","1","2","3","4","5","6","7",
            "8","9","10","11","12","13","14","15","16","17","18","19","20","21",
            "22","23","24","25","26","27"});
        rondas.setSize(20, 5);
            
        JButton boton6 = new JButton("Jugar");
        boton6.setBackground(Color.red);
        
        //Agregacion de los objetos para panel escoger
        escoger.add(escogerLabel1); 
        escoger.add(escogerLabel2); 
        escoger.add(escogerLabel3);
        escoger.add(escogerLabel4);
        escoger.add(Box1);
        escoger.add(check1);
        escoger.add(rondas);
        escoger.add(check11);
        escoger.add(Box2);
        escoger.add(check2);
        escoger.add(l1);
        escoger.add(boton6);
        escoger.add(Box3);
        escoger.add(check3);
        escoger.add(l3);
        escoger.add(l4);
        escoger.add(Box4);
        escoger.add(check4);
        escoger.add(l5);
        escoger.add(l6);
        escoger.add(l7);
        escoger.add(check5);
        escoger.add(l8);
        escoger.add(l9);
        escoger.add(l10);
        escoger.add(check6);
        escoger.add(l11);
        escoger.add(l12);
        escoger.add(l13);
        escoger.add(check7);
        escoger.add(l14);
        escoger.add(l15);
        escoger.add(l16);
        escoger.add(check8);
        escoger.add(l17);
        escoger.add(l18);
        escoger.add(l19);
        escoger.add(check9);
        escoger.add(l20);
        escoger.add(l21);
        escoger.add(l22);
        escoger.add(check10);
        escoger.add(l23);
        
        //Creacion de objetos para el panel ruleta
        JLabel r1= new JLabel("Empieza con la letra: ");
        ImageIcon ruletaImagen= new ImageIcon("ruleta.jpg");
        JLabel rul= new JLabel ("", ruletaImagen, JLabel.CENTER);
        JButton boton7=new JButton("Jugar");
        boton7.setBackground(Color.red);
        
        //Agregacion deobjetos para el panel ruleta
        ruleta.add(rul);
        ruleta.add(boton7);
        ruleta.add(r1);
        
        
        //Creacion de objetos para el panel tablero
        Object[][] data = {};
        String[] columnNames = {};
        DefaultTableModel dtm= new DefaultTableModel(data, columnNames);
        JTable tabla= new JTable(5, 4);
        tabla.setVisible(true);
        tabla.setEditingRow(2);
        tabla.setEditingRow(3);
        tabla.setEditingRow(4);
        JButton boton8= new JButton("¡STOP!");
        boton8.setBackground(Color.red);
        
        //Agregacion de objetos para panel tablero
        tablero.add(tabla);
        tablero.add(boton8);
        
        //Creacion de objetos para panel tablero final 
        JLabel puntajeFinal= new JLabel("Puntaje Final");
        JLabel puntaje1= new JLabel();
        
        JButton salir= new JButton("Salir");
        
        //Agregacion de objetos para panel tablero final
        tableroFinal.add(tabla);
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
        
        //Metodo para los radio botones    
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
        
        //Metodos para los botones 
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
        boton2.addMouseListener(new MouseListener(){
            
            @Override
            public void mouseClicked(MouseEvent e) {                         
               instrucciones.setVisible(false);
               frame.add(escoger);
               escoger.setVisible(true); 
               boton2.setVisible(false);
               boton1.setVisible(false);
               boton3.setVisible(false);
               inicio.remove(im);
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
        boton6.addMouseListener(new MouseListener(){
            
            @Override
            public void mouseClicked(MouseEvent e) {
               escoger.setVisible(false);
               frame.add(ruleta); 
               ruleta.setVisible(true);
                
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
        boton7.addMouseListener(new MouseListener(){
            
            @Override
            public void mouseClicked(MouseEvent e) {
               ruleta.setVisible(false);
               frame.add(tablero); 
               tablero.setVisible(true);
                
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
        frame.setVisible(true);
        
    
    }
    
}
