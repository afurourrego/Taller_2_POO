package com.cristhianurrego.pregunta5;

import java.util.Scanner;

/**
 * Created by Afuro on 16/02/2017.
 */
public class SumResProDiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hayar la Suma, Resta, Producto y Division de A y B");
        System.out.print("Ingrese A: ");

        double A = sc.nextDouble();

        System.out.print("Ingrese B: ");

        double B = sc.nextDouble();

        System.out.println("A+B = "+(A+B));
        System.out.println("A-B = "+(A-B));
        System.out.println("A*B = "+(A*B));
        System.out.println("A/B = "+(A/B));

    }
}
