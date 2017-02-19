package com.cristhianurrego.pregunta7;

import java.util.Scanner;

/*
 * Created by Afuro on 18/02/2017.
 */
public class hipotenusa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int ladoA,ladoB;

        System.out.println("CALCULAR LA HIPOTENUSA DE UN TRIANGULO");
        System.out.print("Ingrese el cateto A: ");

        ladoA = sc.nextInt();

        System.out.print("Ingrese el cateto B: ");

        ladoB = sc.nextInt();

        double sumaCatetos = (ladoA*ladoA)+(ladoB*ladoB);

        double hipotenusaTri = Math.sqrt(sumaCatetos);

        System.out.print("la hipotenusa es: "+hipotenusaTri);


    }
}
