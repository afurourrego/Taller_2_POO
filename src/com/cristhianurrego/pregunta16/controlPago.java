package com.cristhianurrego.pregunta16;

import java.util.Scanner;

/**
 * Created by Afuro on 18/02/2017.
 */
public class controlPago {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("CONTROL DE PAGO/DEUDA");
        System.out.print("Ingrese el monto de la deuda: ");

        int deuda = sc.nextInt();

        System.out.print("Ingrese el monto que abono: ");

        int pago = sc.nextInt();

        if (deuda == pago)
        {
            System.out.println("FELICIDADES A PAGADO TODA SU DEUDA");
        }
        else if ( pago > deuda)
        {
            System.out.println("FELICIDADES A PAGADO TODA SU DEUDA");
            System.out.println("ademas tiene un saldo a favor de: "+(pago-deuda));
        }
        else
        {
            double interes = (deuda - pago)+((deuda - pago)*0.03);

            System.out.println("SE HA REALIDADO EL ABONO A SU DEUDA");
            System.out.println("tiene un saldo de : "+ interes);
            System.out.println("interes del 3% agregado.");
        }
    }
}