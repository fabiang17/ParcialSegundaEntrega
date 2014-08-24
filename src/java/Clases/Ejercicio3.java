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
@Named(value = "ejercicio3")
@ApplicationScoped
public class Ejercicio3 {

    int N = 0;

    public void setN(int N) {
        this.N = N;
    }

    public void setSuma(int Suma) {
        this.Suma = Suma;
    }

    public int getN() {
        return N;
    }

    public int getSuma() {
        return Suma;
    }
    int Suma = 0;
    /**
     * Creates a new instance of Ejercicio3
     */
    public Ejercicio3() {
    }
    
    public void Calcular()
    {
        N= 0;
        Suma = 0;
        while(N <= 10)
        {
            N = N+1;
            Suma = Suma +N;
        }
        Suma = 10;
    }
    
}
