package com.cristhianurrego.pregunta9;

import java.util.Scanner;

/**
 * Created by Afuro on 18/02/2017.
 */
public class tiempoEquivalencias {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double horas,minutos,segundos,dias;

        System.out.println("CONVERSOR DE TIEMPO");
        System.out.println("Ingrese la cantidad de horas a convertir: ");

        horas = sc.nextDouble();

        minutos = horas*60;
        segundos = minutos*60;
        dias = horas/24;

        System.out.println("EQUIVALENTES");
        System.out.println("- " + minutos + " minutos." );
        System.out.println("- " + segundos + " segundos." );
        if (dias > 1){
            System.out.println("- " + dias + " dias." );
        }
        else
        {
            System.out.println("- " + dias + " dia." );
        }

    }
}
