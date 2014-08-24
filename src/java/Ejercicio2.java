/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author lgutierrez
 */
@Named(value = "ejercicio2")
@ApplicationScoped
public class Ejercicio2 {

    int N1 = 0;
    int N2 = 0;
    int N3 = 0;
    String Mensaje;

    public void setN1(int N1) {
        this.N1 = N1;
    }

    public void setN2(int N2) {
        this.N2 = N2;
    }

    public void setN3(int N3) {
        this.N3 = N3;
    }

    public void setMensaje(String Mensaje) {
        this.Mensaje = Mensaje;
    }

    public int getN1() {
        return N1;
    }

    public int getN2() {
        return N2;
    }

    public int getN3() {
        return N3;
    }

    public String getMensaje() {
        return Mensaje;
    }
    /**
     * Creates a new instance of Ejercicio2
     */
    public Ejercicio2() {
    }
    
    
    public void Calcular()       
    {
        if(N1 ==N2 && N1 == N3)
            Mensaje = "Son iguales";
        else if(N1 > N2 && N1> N3)
            Mensaje  =" A es mayor";
        else if(N2>N1 && N2>N3)
            Mensaje = "B es mayor";
        else 
            Mensaje = "C es mayor";
    }
}
