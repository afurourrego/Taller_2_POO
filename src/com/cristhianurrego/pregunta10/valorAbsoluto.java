package com.cristhianurrego.pregunta10;

import java.util.Scanner;

/**
 * Created by Afuro on 18/02/2017.
 */
public class valorAbsoluto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("VALOR ABSOLUTO");
        System.out.print("Ingrese un numero entero para dar su valor absoluto: ");

        int numero = sc.nextInt();

        int valorAbsoluto =  Math.abs(numero);

        System.out.println("El valor absoluto de "+numero+" es: "+valorAbsoluto);



    }
}
