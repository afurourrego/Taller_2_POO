package com.cristhianurrego.pregunta8;

import java.util.Scanner;

/**
 * Created by Afuro on 18/02/2017.
 */
public class algoritmoVelocidad {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double altura, preEcuacion, velocidad;

        System.out.println("ENCONTREMOS LA VELOCIDAD");
        System.out.print("Ingrese la altura en pies: ");

        altura = sc.nextDouble();

        preEcuacion = 2*32*altura;

        velocidad = Math.sqrt(preEcuacion);

        System.out.println("La velocidad de caida es de "+velocidad+" p/s2.");
    }
}