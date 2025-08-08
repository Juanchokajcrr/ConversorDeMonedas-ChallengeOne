package ConversorDeMonedas.main;

import ConversorDeMonedas.funciones.ConsultaMoneda;
import ConversorDeMonedas.models.ConversionRates;
import ConversorDeMonedas.models.MonedasApi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n===================================================\n");
            System.out.println("Sea bienvenido/a al Conversor de Moneda =");
            System.out.println("1.) Dólar >> Peso argentino");
            System.out.println("2.) Peso argentino >> Dólar");
            System.out.println("3.) Dólar >> Real brasileño");
            System.out.println("4.) Real brasileño >> Dólar");
            System.out.println("5.) Dólar >> Peso colombiano");
            System.out.println("6.) Peso colombiano >> Dólar");
            System.out.println("7.) Salir");
            System.out.println("\n===================================================\n");
            System.out.print("Elija una opción válida: ");

            int opcion = scanner.nextInt();
            double cantidad, resultado;

            ConsultaMoneda consulta = new ConsultaMoneda();
            ConversionRates monedaARS = consulta.buscarMoneda("USD").conversion_rates();
            double tasaARS = monedaARS.ARS();
            double tasaBRL = monedaARS.BRL();
            double tasaCOP = monedaARS.COP();

            try {
                switch (opcion) {
                    case 1 -> {
                        System.out.println("El valor de 1 USD en ARS es: " + monedaARS.ARS() + " ARS");
                        System.out.print("Ingrese cantidad a convertir en dólares: ");
                        cantidad = scanner.nextDouble();
                        resultado = cantidad * tasaARS;
                        System.out.println("El valor " + cantidad + "[USD]" + " equivale al valor final de ======> " + resultado + " [ARS].");
                    }
                    case 2 -> {
                        System.out.println("El valor de 1 USD en ARS es: " + monedaARS.ARS() + " ARS");
                        System.out.print("Ingrese cantidad en pesos argentinos: ");
                        cantidad = scanner.nextDouble();
                        resultado = cantidad / tasaARS;
                        System.out.println("El valor " + cantidad + "[ARS]" + " equivale al valor final de ======> " + resultado + " [USD].");
                    }
                    case 3 -> {
                        System.out.println("El valor de 1 USD en BRL es: " + monedaARS.BRL() + " BRL");
                        System.out.print("Ingrese cantidad a convertir en dólares: ");
                        cantidad = scanner.nextDouble();
                        resultado = cantidad * tasaBRL;
                        System.out.println("El valor " + cantidad + "[USD]" + " equivale al valor final de ======> " + resultado + " [BRL].");
                    }
                    case 4 -> {
                        System.out.println("El valor de 1 USD en BRL es: " + monedaARS.BRL() + " BRL");
                        System.out.print("Ingrese cantidad en reales brasileños: ");
                        cantidad = scanner.nextDouble();
                        resultado = cantidad / tasaBRL;
                        System.out.println("El valor " + cantidad + "[BRL]" + " equivale al valor final de ======> " + resultado + " [USD].");
                    }
                    case 5 -> {
                        System.out.println("El valor de 1 USD en COP es: " + monedaARS.COP() + " BRL");
                        System.out.print("Ingrese cantidad a convertir en dólares: ");
                        cantidad = scanner.nextDouble();
                        resultado = cantidad * tasaCOP;
                        System.out.println("El valor " + cantidad + "[USD]" + " equivale al valor final de ======> " + resultado + " [COP].");
                    }
                    case 6 -> {
                        System.out.println("El valor de 1 USD en COP es: " + monedaARS.COP() + " BRL");
                        System.out.print("Ingrese cantidad en pesos colombianos: ");
                        cantidad = scanner.nextDouble();
                        resultado = cantidad / tasaCOP;
                        System.out.println("El valor " + cantidad + "[COP]" + " equivale al valor final de ======> " + resultado + " [USD].");
                    }
                    case 7 -> {
                        System.out.println("Gracias por usar el conversor. ¡Hasta pronto!");
                        continuar = false;
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
