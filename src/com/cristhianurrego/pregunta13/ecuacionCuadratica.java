package com.cristhianurrego.pregunta13;

import java.util.Scanner;

/**
 * Created by Afuro on 18/02/2017.
 */
public class ecuacionCuadratica {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a, b, c, d, x1, x2;

        System.out.println("ECUACION GENERAL CUADRATICA");
        System.out.print("Ingresar valor de  a: ");

        a = sc.nextDouble();

        System.out.print("Ingresar valor de  b: ");

        b = sc.nextDouble();

        System.out.print("Ingresar valor de  c: ");

        c = sc.nextDouble();

        d= Math.pow(b,2) - (4*a*c);

        if(d < 0 )
        {
            System.out.println("La solucion no es real");
        }
        else
        {
            x1 = (-b + Math.sqrt(d)) / 2*a;
            x2 = (-b - Math.sqrt(d)) / 2*a;

            System.out.println("x1: "+x1);
            System.out.println("x2: "+x2);
        }

    }
}
