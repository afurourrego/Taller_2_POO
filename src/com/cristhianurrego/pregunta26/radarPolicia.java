package com.cristhianurrego.pregunta26;

import java.util.Scanner;

/**
 * Created by Afuro on 19/02/2017.
 */
public class radarPolicia {
    public static void main(String[] args) {

        int velocidad = 0, vMenor90 = 0, vMayor90 = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("RADAR DE POLICIA");

        while (velocidad <= 160)
        {
            System.out.print("Leer velocidad: ");

            velocidad = sc.nextInt();

            if (velocidad <= 90)
            {
                vMenor90++;

                System.out.println("BIEN");
            }
            else
            {
                vMayor90++;
                System.out.println("RAPIDO");
            }

            System.out.print("\n");
        }

        System.out.println("Velocidades Menores a 90 KM/H: "+vMenor90);
        System.out.println("Velocidades Mayores a 90 KM/H: "+vMayor90);
    }
}
