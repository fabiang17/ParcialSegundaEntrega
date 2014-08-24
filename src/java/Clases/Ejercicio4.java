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
@Named(value = "ejercicio4")
@ApplicationScoped
public class Ejercicio4 {

    int CatA = 0;
    int CatB = 0;

    public void setCatA(int CatA) {
        this.CatA = CatA;
    }

    public void setCatB(int CatB) {
        this.CatB = CatB;
    }

    public void setHipo(double Hipo) {
        this.Hipo = Hipo;
    }

    public int getCatA() {
        return CatA;
    }

    public int getCatB() {
        return CatB;
    }

    public double getHipo() {
        return Hipo;
    }
    double Hipo = 0;
            
    /**
     * Creates a new instance of Ejercicio4
     */
    public Ejercicio4() {
        
    }
    
    
    public void Calcular()
    {
        CatA =    CatA * CatA ;
        CatB =    CatB * CatB ;
        Hipo = Math.pow((CatA + CatB), 2);
    }
}
