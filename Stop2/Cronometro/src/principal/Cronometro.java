/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import javax.swing.JLabel;

/**
 *
 * @author Sergio y Camilo
 */
public class Cronometro extends Thread {
     JLabel eti;
     public static String textSeg="";
     public static String textMin="";
     public static String textHora="";
     public static String reloj;
    public Cronometro(JLabel cronometro)
    {
        this.eti = cronometro;
    }

 
    public void run()
    {
        try{
         
        
        while(VentanaCronometro.IniciaHilo){
            Thread.sleep(1000);
            ejecutarHiloCronometro();
        }
            
        }catch (Exception e)
        {
            System.out.println("Exception en el hilo:"+e.getMessage());
        }
    }
    
    private void ejecutarHiloCronometro()
    {
        VentanaCronometro.segundo++;
        
        if(VentanaCronometro.segundo>59){
            VentanaCronometro.segundo=0;
            VentanaCronometro.minuto++;
                if(VentanaCronometro.minuto>59)
                {
                   VentanaCronometro.minuto=0;
                   VentanaCronometro.hora++;
                }
        }
        
     
     
     //textSeg+=VentanaCronometro.segundo;
     //textMin+=VentanaCronometro.minuto;
     //textHora+=VentanaCronometro.hora;
     //......................
     if(VentanaCronometro.segundo<10)
     {
        textSeg="0"+VentanaCronometro.segundo; 
     }else{
        textSeg="" +VentanaCronometro.segundo;
     }
     
     if(VentanaCronometro.minuto<10)
     {
        textMin="0"+VentanaCronometro.minuto; 
     }else{
        textMin="" +VentanaCronometro.minuto;
     }
     
     if(VentanaCronometro.hora<10)
     {
        textHora="0"+VentanaCronometro.hora; 
     }else{
        textHora="" +VentanaCronometro.hora;
     }
     
     reloj=textHora+":"+textMin+":"+textSeg;
     //......................
     
     eti.setText(reloj);
     
    }
    
}
