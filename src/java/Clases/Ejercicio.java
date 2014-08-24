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
@Named(value = "ejercicio")
@ApplicationScoped
public class Ejercicio {
int N1 =0;

    public int getN1() {
        return N1;
    }

    public int getN2() {
        return N2;
    }
    int N2=0;

    public void setN1(int N1) {
        this.N1 = N1;
    }

    public void setN2(int N2) {
        this.N2 = N2;
    }
    /**
     * Creates a new instance of Ejercicio1
     */
    public Ejercicio() {
        
        
    }
    
    String Mensaje;

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }

    public String getMensaje() {
        return Mensaje;
    }
    
    public void Validar()
    {
        if(N1 == N2)
            Mensaje = "Son iguales";
        else if (N1 > N2)
            Mensaje = "El primero es mayor";
        else Mensaje = "El segundo es mayor";
    }
    
    public String Respuesta()
    {
        return this.Mensaje;
    }
    
}
