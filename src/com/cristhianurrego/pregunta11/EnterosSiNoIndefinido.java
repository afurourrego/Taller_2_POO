package com.cristhianurrego.pregunta11;

import java.util.Scanner;

/**
 * Created by Afuro on 18/02/2017.
 */
public class EnterosSiNoIndefinido {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a,b,c,d;

        System.out.println("INGRESE CUATRO NUMEROS");
        System.out.print("Ingrese A: ");

        a = sc.nextInt();

        System.out.print("Ingrese B: ");

        b = sc.nextInt();

        System.out.print("Ingrese C: ");

        c = sc.nextInt();

        System.out.print("Ingrese D: ");

        d = sc.nextInt();

        if ((b == 0) || (d == 0))
        {
            System.out.println("ERROR: indefinido");
        }
        else
        {
            if ( (a/b) == (c/d) )
            {
                System.out.println("SI");
            }
            else
            {
                System.out.println("NO");
            }
        }

    }
}
