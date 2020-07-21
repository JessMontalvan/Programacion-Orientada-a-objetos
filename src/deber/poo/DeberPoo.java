package deber.poo;

import java.util.Scanner;

public class DeberPoo {

    public static void main(String[] args) {
        Scanner suma = new Scanner(System.in);
        System.out.println("Ingrese dos numeros para sumar");
        Suma op = new Suma(suma.nextInt(), suma.nextInt());
        System.out.println("El resultado de la Suma es: " + op.suma());
        System.out.println("Ingrese los valores para la resta");
        Scanner resta=new Scanner(System.in);
        Resta res = new Resta(resta.nextInt(),resta.nextInt());
        System.out.println("El resultado de la resta es: "+ res.restar());
        System.out.println("Ingrese dos numeros para dividir");
        Scanner div=new Scanner(System.in);
        Division di=new Division(div.nextInt(),div.nextInt());
        System.out.println("El resultado de la division es: "+di.dividir());
        Scanner mul=new Scanner(System.in);
        System.out.println("Ingrese lod valores para la multiplicacion");
        Multiplicacion mult = new Multiplicacion(mul.nextInt(),mul.nextInt());
        System.out.println("El resultado de la multiplicacion es: "+mult.multiplicar());
    }

}
