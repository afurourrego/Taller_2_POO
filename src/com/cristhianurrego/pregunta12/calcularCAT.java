package com.cristhianurrego.pregunta12;

import java.util.Scanner;

/**
 * Created by Afuro on 18/02/2017.
 */
public class calcularCAT {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        int x,a,b,c,d;
        double CAT;

        System.out.println("CALCULAR EL VALOR DE CAT");
        System.out.println("Ingrese el valor de  X: ");

        x = sc.nextInt();

        System.out.println("Ingrese el valor de  A: ");

        a = sc.nextInt();

        System.out.println("Ingrese el valor de  B: ");

        b = sc.nextInt();

        System.out.println("Ingrese el valor de  C: ");

        c = sc.nextInt();

        System.out.println("Ingrese el valor de  D:");

        d = sc.nextInt();

        if (x == 0)
        {
          CAT = (a+b)/(c+d);
        }
        else if (x > 0)
        {
          CAT = (a+b)*(c+d);
        }
        else
        {
          CAT = a+b-c+d;
        }

        System.out.println("El valor de CAT es: "+ CAT);

    }
}
