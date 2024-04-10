package com.upg.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CurrencyConverter {
    private final HashMap<String, Double> conversionRates;


    public CurrencyConverter() {
        this.conversionRates = new HashMap<>();
        // Initialize conversion rates for USD, EUR, GBP, and JPY combinations
        // Example rates are approximate and for demonstration purposes only

        // USD to other currencies
        conversionRates.put("USD_EUR", 0.83);
        conversionRates.put("USD_GBP", 0.72);
        conversionRates.put("USD_JPY", 110.15);

        // EUR to other currencies
        conversionRates.put("EUR_USD", 1.21);
        conversionRates.put("EUR_GBP", 0.86);
        conversionRates.put("EUR_JPY", 132.58);

        // GBP to other currencies
        conversionRates.put("GBP_USD", 1.39);
        conversionRates.put("GBP_EUR", 1.16);
        conversionRates.put("GBP_JPY", 153.18);

        // JPY to other currencies
        conversionRates.put("JPY_USD", 0.0091);
        conversionRates.put("JPY_EUR", 0.0075);
        conversionRates.put("JPY_GBP", 0.0065);
    }
    public double convertCurrency(double amount, String sourceCurrency, String targetCurrency) {
        String currencyPair = sourceCurrency + "_" + targetCurrency;
        double conversionRate = conversionRates.get(currencyPair);
        double convertedValue = amount * conversionRate;

        return convertedValue;
    }

}
