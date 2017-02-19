package com.cristhianurrego.pregunta15;

import java.util.Scanner;

/**
 * Created by Afuro on 18/02/2017.
 */
public class menorMayor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c, menor, mayor;

        System.out.println("MAYOR Y MENOR");
        System.out.print("Ingrese el valor de a: ");

        a = sc.nextInt();

        System.out.print("Ingrese el valor de b: ");

        b = sc.nextInt();

        System.out.print("Ingrese el valor de c: ");

        c = sc.nextInt();

        menor = a;
        mayor = a;

        if (b < menor)
        {
            menor = b;
        }
        else if (b > mayor)
        {
            mayor = b;
        }

        if (c < menor)
        {
            menor = c;
        }
        else if (c > mayor)
        {
            mayor = c;
        }

        System.out.println("El menor es: "+ menor);
        System.out.println("El mayor es: "+ mayor);

    }
}
