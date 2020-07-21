/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber.poo;

public class Multiplicacion {
    private double multiplicando, multiplicador;

    public double getMultiplicando() {
        return multiplicando;
    }

    public void setMultiplicando(double multiplicando) {
        this.multiplicando = multiplicando;
    }

    public double getMultiplicador() {
        return multiplicador;
    }

    public void setMultiplicador(double multiplicador) {
        this.multiplicador = multiplicador;
    }

    public Multiplicacion(double multiplicando, double multiplicador) {
        this.multiplicando = multiplicando;
        this.multiplicador = multiplicador;
    }
    public double multiplicar(){
        
        return multiplicando*multiplicador;
    }
}
