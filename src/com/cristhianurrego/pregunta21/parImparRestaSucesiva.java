package com.cristhianurrego.pregunta21;

import java.util.Scanner;

/**
 * Created by Afuro on 18/02/2017.
 */
public class parImparRestaSucesiva {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("COMPROBAR PAR/IMPAR");
        System.out.print("Ingrese un numero: ");

        int numero = sc.nextInt();

        while (numero > 0)
        {
            numero = numero-2;
        }

        if (numero == 0)
        {
            System.out.println("El numero es par");
        }
        else
        {
            System.out.println("El numero es impar");
        }

    }
}
