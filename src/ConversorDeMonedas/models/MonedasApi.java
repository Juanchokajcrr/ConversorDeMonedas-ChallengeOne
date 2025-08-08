package ConversorDeMonedas.models;

import java.util.Map;

public record MonedasApi(
        String base_code,
        ConversionRates conversion_rates
) {}

