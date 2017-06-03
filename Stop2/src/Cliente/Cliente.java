/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cliente;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import stop.Tablero;
import stop.Visual;

/**
 *
 * @author USER
 */
public class Cliente {
    private String ip;
    private Visual v;
    private Tablero tablero;
    private Socket cliente;
    private final Thread t;
    
    public Cliente(String ip,Visual v) {
        this.ip = ip;
        this.v=v;
        t = new Thread((Runnable) this,"cliente");
        try {
            cliente = new Socket(ip,6000);
            t.start();
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
