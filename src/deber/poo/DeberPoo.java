package deber.poo;

import java.util.Scanner;

public class DeberPoo {

    public static void main(String[] args) {
        Scanner suma = new Scanner(System.in);
        System.out.println("ingrese dos numeros para sumar");
        Suma op = new Suma(suma.nextInt(), suma.nextInt());
        System.out.println("el resultado de la Suma es: " + op.suma());
        System.out.println("ingrese los valores para la resta");
        Scanner resta=new Scanner(System.in);
        Resta res = new Resta(resta.nextInt(),resta.nextInt());
        System.out.println("El resultado de la resta es: "+ res.restar());
    }

}
