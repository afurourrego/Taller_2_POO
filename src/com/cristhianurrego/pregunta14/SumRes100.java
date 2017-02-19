package com.cristhianurrego.pregunta14;

import java.util.Scanner;

/**
 * Created by Afuro on 18/02/2017.
 */
public class SumRes100 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");

        int numero = sc.nextInt();

        if (numero == 100)
        {
            numero = numero+1;
        }
        else if ( numero > 100)
        {
            numero = numero+20;
        }
        else
        {
            numero = numero-20;
        }

        System.out.println("El resultado es: "+numero);
    }
}
