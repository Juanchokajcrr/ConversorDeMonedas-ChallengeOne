package ConversorDeMonedas.models;

import ConversorDeMonedas.funciones.ConsultaMoneda;

public class Conversiones {

    public static ConsultaMoneda consulta = new ConsultaMoneda();
    public static ConversionRates monedaARS = consulta.buscarMoneda("USD").conversion_rates();
    static double tasaARS = monedaARS.ARS();
    static double tasaBRL = monedaARS.BRL();
    static double tasaCOP = monedaARS.COP();

    public static double usdToArs(double cantidad) {
        return cantidad * tasaARS;
    }

    public static double arsToUsd(double cantidad) {
        return cantidad / tasaARS;
    }

    public static double usdToBrl(double cantidad) {
        return cantidad * tasaBRL;
    }

    public static double brlToUsd(double cantidad) {
        return cantidad / tasaBRL;
    }

    public static double usdToCop(double cantidad) {
        return cantidad * tasaCOP;
    }

    public static double copToUsd(double cantidad) {
        return cantidad / tasaCOP;
    }
}
