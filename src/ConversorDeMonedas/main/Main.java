package ConversorDeMonedas.main;

import ConversorDeMonedas.funciones.ConsultaMoneda;
import ConversorDeMonedas.models.ConversionRates;
import ConversorDeMonedas.models.Conversiones;
import ConversorDeMonedas.models.MonedasApi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Conversiones conversiones = new Conversiones();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n===================================================\n");
            System.out.println("Sea bienvenido/a al Conversor de Moneda =");
            System.out.println("1.) Dólar [USD] >> Peso argentino [ARS]");
            System.out.println("2.) Peso argentino [ARS] >> Dólar [USD]");
            System.out.println("3.) Dólar [USD] >> Real brasileño [BRL]");
            System.out.println("4.) Real brasileño [BRL] >> Dólar [USD]");
            System.out.println("5.) Dólar [USD] >> Peso colombiano [COP]");
            System.out.println("6.) Peso colombiano [COP] >> Dólar [USD]");
            System.out.println("7.) Salir");
            System.out.println("\n===================================================\n");
            System.out.print("Elija una opción válida: ");

            int opcion = scanner.nextInt();

            if (opcion == 7) {
                System.out.println("Gracias por usar el conversor. ¡Hasta pronto!");
                continuar = false;
                continue;
            }

            try {
                switch (opcion) {
                    case 1 -> {
                        System.out.println("El valor de 1 USD en ARS es: " + Conversiones.monedaARS.ARS() + " ARS");
                        System.out.print("Ingrese cantidad a convertir en dólares: ");
                        double cantidad = scanner.nextDouble();
                        double resultado = Conversiones.usdToArs(cantidad);
                        System.out.println("El valor " + cantidad + "cantidad" + "[USD]" + " equivale al valor final de ======> " + resultado + " [ARS].");
                    }
                    case 2 -> {
                        System.out.println("El valor de 1 USD en ARS es: " + Conversiones.monedaARS.ARS() + " ARS");
                        System.out.print("Ingrese cantidad en pesos argentinos: ");
                        double cantidad = scanner.nextDouble();
                        double resultado = Conversiones.arsToUsd(cantidad);
                        System.out.println("El valor " + cantidad + "[ARS]" + " equivale al valor final de ======> " + resultado + " [USD].");
                    }
                    case 3 -> {
                        System.out.println("El valor de 1 USD en BRL es: " + Conversiones.monedaARS.BRL() + " BRL");
                        System.out.print("Ingrese cantidad a convertir en dólares: ");
                        double cantidad = scanner.nextDouble();
                        double resultado = Conversiones.usdToBrl(cantidad);
                        System.out.println("El valor " + cantidad + "[USD]" + " equivale al valor final de ======> " + resultado + " [BRL].");
                    }
                    case 4 -> {
                        System.out.println("El valor de 1 USD en BRL es: " + Conversiones.monedaARS.BRL() + " BRL");
                        System.out.print("Ingrese cantidad en reales brasileños: ");
                        double cantidad = scanner.nextDouble();
                        double resultado = Conversiones.brlToUsd(cantidad);
                        System.out.println("El valor " + cantidad + "[BRL]" + " equivale al valor final de ======> " + resultado + " [USD].");
                    }
                    case 5 -> {
                        System.out.println("El valor de 1 USD en COP es: " + Conversiones.monedaARS.COP() + " COP");
                        System.out.print("Ingrese cantidad a convertir en dólares: ");
                        double cantidad = scanner.nextDouble();
                        double resultado = Conversiones.usdToCop(cantidad);
                        System.out.println("El valor " + cantidad + "[USD]" + " equivale al valor final de ======> " + resultado + " [COP].");
                    }
                    case 6 -> {
                        System.out.println("El valor de 1 USD en COP es: " + Conversiones.monedaARS.COP() + " COP");
                        System.out.print("Ingrese cantidad en pesos colombianos: ");
                        double cantidad = scanner.nextDouble();
                        double resultado = Conversiones.copToUsd(cantidad);
                        System.out.println("El valor " + cantidad + "[COP]" + " equivale al valor final de ======> " + resultado + " [USD].");
                    }
                    default -> System.out.println("Opción inválida. Intente nuevamente.");
                }
            }catch (NumberFormatException e){
                System.out.println("Numero no encontrado "+ e.getMessage());
            } catch (RuntimeException e){
                System.out.println(e.getMessage());
                System.out.println("Finalizando la aplicacion");
            }


            System.out.println();
        }

        scanner.close();
    }
}
