/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author lgutierrez
 */
@Named(value = "ejercicio6")
@ApplicationScoped
public class Ejercicio6 {

    int N = 0;
    String Mensaje;

    public void setN(int N) {
        this.N = N;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }

    public int getN() {
        return N;
    }

    public String getMensaje() {
        return Mensaje;
    }
    /**
     * Creates a new instance of Ejercicio6
     */
    public Ejercicio6() {
    }
    
    
    public void Calcular() {
        if(N % 2 == 0)
            Mensaje = "Par";
        else 
            Mensaje = "Impar";
    }
    
}
