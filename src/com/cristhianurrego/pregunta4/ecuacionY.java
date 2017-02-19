package com.cristhianurrego.pregunta4;

import java.util.Scanner;

/*
 * Created by Afuro on 16/02/2017.
 */
public class ecuacionY {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        double a,b,c,s,raizDeS,areaTriangulo;

        System.out.println ("Ingrese el lado de A");
        a = sc.nextDouble();
        System.out.println ("Ingrese el lado de B");
        b = sc.nextDouble();
        System.out.println ("Ingrese el lado de C");
        c = sc.nextDouble();

        s = (a + b + c)/2;

        raizDeS = s*(s-a)*(s-b)*(s-c);

        areaTriangulo = Math.sqrt(raizDeS);

        System.out.println ("El area del triangulo es: "+areaTriangulo);




    }
}
