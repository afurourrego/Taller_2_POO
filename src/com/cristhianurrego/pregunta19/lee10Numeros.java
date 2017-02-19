package com.cristhianurrego.pregunta19;

import java.util.Scanner;

/**
 * Created by Afuro on 18/02/2017.
 */
public class lee10Numeros {
    public static void main(String[] args) {

        int sumNeg = 0, sumPos = 0, numero, contadorCero = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10 ; i++)
        {
            System.out.print("Ingrese un numero: ");

            numero = sc.nextInt();

            if(numero == 0)
            {
                contadorCero++;
            }
            else if (numero > 0)
            {
                sumPos = sumPos + numero;
            }
            else
            {
                sumNeg = sumNeg + numero;
            }
        }

        System.out.println("La suma de positivos es: "+sumPos);
        System.out.println("La suma de negativos es: "+sumNeg);
        System.out.println("La cantidad de 0 ingresados es: "+contadorCero);
    }

}
