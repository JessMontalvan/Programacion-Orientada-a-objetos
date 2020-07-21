/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber.poo;

/**
 *
 * @author Usuario
 */
public class Resta {
    private double minuendo, sustraendo;

    public double getMinuendo() {
        return minuendo;
    }

    public void setMinuendo(double minuendo) {
        this.minuendo = minuendo;
    }

    public double getSustraendo() {
        return sustraendo;
    }

    public void setSustraendo(double sustraendo) {
        this.sustraendo = sustraendo;
    }

    public Resta(double minuendo, double sustraendo) {
        this.minuendo = minuendo;
        this.sustraendo = sustraendo;
    }
    public double restar(){
        return minuendo-sustraendo;
    }
}
