package com.cristhianurrego.pregunta3;

import java.util.Scanner;

/*
 * Created by Afuro on 16/02/2017.
 */
public class areaTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingreso de los numeros para hayar el area de un triangulo en cm..");
        System.out.print("Ingrese el lado A: ");

        int A = sc.nextInt();

        System.out.print("Ingrese el lado B: ");

        int B = sc.nextInt();

        System.out.print("Ingrese el lado C: ");

        int C = sc.nextInt();

        int S = (A+B+C)/2;
        int area = S*(S-A)*(S-B)*(S-C);
        double areaTotal = Math.sqrt(area);

        System.out.print("El area del triangulo es: "+areaTotal+"cm²");
    }
}
