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
@Named(value = "ejercicio5")
@ApplicationScoped
public class Ejercicio5 {

    int H= 0;

    public void setH(int H) {
        this.H = H;
    }

    public void setR(int R) {
        this.R = R;
    }

    public void setArea(double Area) {
        this.Area = Area;
    }

    public void setVolumen(double Volumen) {
        this.Volumen = Volumen;
    }
    int R = 0;

    public int getH() {
        return H;
    }

    public int getR() {
        return R;
    }

    public double getArea() {
        return Area;
    }

    public double getVolumen() {
        return Volumen;
    }
    double Area = 0;
    double Volumen = 0;
    
    /**
     * Creates a new instance of Ejercicio5
     */
    public Ejercicio5() {
        
    }
    
    public void CalcularArea() {
            Area =  2 * Math.PI * R * H ;
    }

    public void  CalcularVolumen() {
            Volumen =  Math.PI * (R * R) *H ;
    }
}
