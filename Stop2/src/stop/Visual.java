package stop;
import java.awt.GridLayout;
import java.util.HashMap;
import javax.swing.*;


/**
 *
 * @author USER
 */
public class Visual extends JFrame{
   
    private final HashMap<String,JPanel> paneles;
    
    public Visual() {
        paneles = new HashMap<>();
        paneles.put("inicio", new Inicio(this));
        paneles.put("instrucciones", new Instrucciones(this));
        paneles.put("acerca", new Acerca(this));
        paneles.put("escoger", new Escoger(this));
        paneles.put("ruleta", new Ruleta(this));
        paneles.put("tablero", new Tablero(this));
        paneles.put("tableroFinal", new TableroFinal(this));
        paneles.put("finJuego", new FinJuego(this));
            
    }
    
    
    
    
    public JPanel getPanel(String a) {
        return paneles.get(a);
    }
    
    public HashMap<String, JPanel> getPaneles() {
        return paneles;
    }
    public void AgregarPanel(String a){
       add(paneles.get(a));
     }
    public void CambiarPanel(String a,String b){
        add(paneles.get(a));
        paneles.get(b).setVisible(false);
        paneles.get(a).setVisible(true);    
    }
   public static void main(String[]args){
        Visual frame= new Visual();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(954, 800);
        frame.setResizable(false);
        frame.setLocation(200, 0);
        frame.setTitle("¡STOP!");
        frame.setVisible(true);
        
        frame.AgregarPanel("inicio");
        /*frame.AgregarPanel("instrucciones");
        frame.AgregarPanel("acerca");
        frame.AgregarPanel("escoger");
        frame.AgregarPanel("ruleta");
        frame.AgregarPanel("tablero");
        frame.AgregarPanel("tableroFinal");
        frame.AgregarPanel("finJuego");*/
    }
}
