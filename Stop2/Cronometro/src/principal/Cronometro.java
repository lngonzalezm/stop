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
    
    public Cronometro(JLabel cronometro)
    {
        this.eti = cronometro;
    }

 
    public void run()
    {
        try{
        int x=0;    
        
        while(VentanaCronometro.IniciaHilo){
            Thread.sleep(1000);
            ejecutarHiloCronometro(x);
        }
            
        }catch (Exception e)
        {
            System.out.println("Exception en el hilo:"+e.getMessage());
        }
    }
    
    private void ejecutarHiloCronometro(int x)
    {
        System.out.println(x+" - "+Thread.currentThread().getName());
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
        
     String textSeg="";
     String textMin="";
     String textHora="";
     
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
        textSeg="0"+VentanaCronometro.minuto; 
     }else{
        textSeg="" +VentanaCronometro.minuto;
     }
     
     if(VentanaCronometro.hora<10)
     {
        textSeg="0"+VentanaCronometro.hora; 
     }else{
        textSeg="" +VentanaCronometro.hora;
     }
     
     String reloj=textHora+":"+textMin+":"+textSeg;
     //......................
     
     eti.setText(reloj);
     
    }
    
}
