/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stop;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
public class Stop{
    File ciudad = new File ("ciudad.txt");
    File nombre = new File ("nombre.txt");
    File apellido = new File ("apellido.txt");
    File fruta = new File ("fruta.txt");
    File animal = new File ("animal.txt");
    File cosa = new File ("cosa.txt");
    public Stop() {
    }
    
    public String consulta(String letra , int tipo) throws FileNotFoundException, IOException{
        String linea;
        letra = letra.toUpperCase();
        String[] palabra = new String[100];
        int aux = 1;
        int ale;
        switch(tipo){
            case 1:    
                FileReader f_ciudad = new FileReader (ciudad);
                BufferedReader br_ciudad = new BufferedReader(f_ciudad);
                while((linea=br_ciudad.readLine())!=null){
                    if(linea.charAt(0) == letra.charAt(0)){
                        palabra[aux] = linea;
                        aux = aux +1;
                    }
                }
                return elegir(palabra);
            case 2:
                FileReader f_nombre = new FileReader (nombre);
                BufferedReader br_nombre = new BufferedReader(f_nombre);
                while((linea=br_nombre.readLine())!=null){
                    if(linea.charAt(0) == letra.charAt(0)){
                        palabra[aux] = linea;
                        aux = aux +1;
                    }
                }
                return elegir(palabra);
            case 3:
                FileReader f_apellido = new FileReader (apellido);
                BufferedReader br_apellido = new BufferedReader(f_apellido);
                   while((linea=br_apellido.readLine())!=null){
                        if(linea.charAt(0) == letra.charAt(0)){
                            palabra[aux] = linea;
                            aux = aux +1;
                        }
                }
                return elegir(palabra);
            case 4:
                FileReader f_fruta = new FileReader (fruta);
                BufferedReader br_fruta = new BufferedReader(f_fruta);
                    while((linea=br_fruta.readLine())!=null){
                        if(linea.charAt(0) == letra.charAt(0)){
                            palabra[aux] = linea;
                            aux = aux +1;
                        }
                }
                return elegir(palabra);
            case 5:
                FileReader f_animal = new FileReader (animal);
                BufferedReader br_animal = new BufferedReader(f_animal);
                    while((linea=br_animal.readLine())!=null){
                        if(linea.charAt(0) == letra.charAt(0)){
                            palabra[aux] = linea;
                            aux = aux +1;
                        }
                }
                return elegir(palabra);
            case 6:
                FileReader f_cosa = new FileReader (cosa);
                BufferedReader br_cosa = new BufferedReader(f_cosa);
                while((linea=br_cosa.readLine())!=null){
                    if(linea.charAt(0) == letra.charAt(0)){
                        palabra[aux] = linea;
                        aux = aux +1;
                    }
                }
                return elegir(palabra);
        }
        return "No se encontro";
    }
    public String elegir(String palabra[]){
        int ale;
        String linea="";
        while (linea == null){
            ale = (int) Math.round(Math.random()*10) +1;
            linea = palabra[ale];
        }
        return linea;
    }
    
}
