package com.cristhianurrego.pregunta25;

/**
 * Created by Afuro on 18/02/2017.
 */
public class miguelYPerro {
    public static void main(String[] args) {

        double deuda = 200;
        int years = 5;
        double interesAnual = 6;


        int meses = years*12;
        double interes = (interesAnual*0.01)/12;
        double cuota = (interes*deuda)/(1-(Math.pow((1/(1+interes)),meses)));

        System.out.println("EL PRESTAMO DE MIGUEL");
        System.out.println("Prestamo: "+deuda);
        System.out.println("tiempo: "+years+" años");
        System.out.println("Interes Anual: "+interesAnual+" %");
        System.out.println("Cuotas fijas: "+cuota+"\n");

        System.out.println("|\t\tCUOTA\t\t|\t\tINTERES\t\t|\t\tCAPITAL\t\t|\t\tPRESTAMO\t\t|");

        for (int i = 0; i <= meses; i++)
        {
            if (i == 0)
            {
                System.out.println("|\t\t\t"+i+"\t\t|\t\t\t"+0+"\t\t|\t\t"+0+"\t\t\t|\t\t"+deuda+"\t\t|");
                i++;
            }

            double interescuota = deuda * interes;
            double amortizacion = cuota - interescuota;
            deuda = deuda - amortizacion;

            System.out.println("|\t\t\t"+i+"\t\t|\t\t"+reDecimal(interescuota,2)+"\t\t|\t\t"+reDecimal(amortizacion,2)+"\t\t|\t\t"+reDecimal(deuda,2)+"\t\t|");

        }
    }


    public static double reDecimal(double valorInicial, int numeroDecimales) {
        double parteEntera, resultado;
        resultado = valorInicial;
        parteEntera = Math.floor(resultado);
        resultado=(resultado-parteEntera)*Math.pow(10, numeroDecimales);
        resultado=Math.round(resultado);
        resultado=(resultado/Math.pow(10, numeroDecimales))+parteEntera;
        return resultado;
    }

}

