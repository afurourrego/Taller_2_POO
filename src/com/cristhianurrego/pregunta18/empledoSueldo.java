package com.cristhianurrego.pregunta18;

import java.util.Scanner;

/**
 * Created by Afuro on 19/02/2017.
 */
public class empledoSueldo {
    public static void main(String[] args) {

        String nombre;
        double sueldoHora, horasTrabajadas, sueldoTotal;

        Scanner sc = new Scanner(System.in);

        System.out.println("SUELDO EMPLEADO");
        System.out.print("nombre: ");

        nombre = sc.nextLine();

        System.out.print("horas trabajadas: ");

        horasTrabajadas = sc.nextInt();

        System.out.print("Precio Hora: $");

        sueldoHora = sc.nextInt();

        if (horasTrabajadas <= 40)
        {
            sueldoTotal = horasTrabajadas*sueldoHora;

            System.out.println("El sueldo de "+nombre+" es de $"+sueldoTotal);
        }
        else
        {
            sueldoTotal = (40*sueldoHora)+(((horasTrabajadas-40)*sueldoHora)*1.5);

            System.out.println("El sueldo de "+nombre+" es de $"+sueldoTotal);
        }


    }
}
