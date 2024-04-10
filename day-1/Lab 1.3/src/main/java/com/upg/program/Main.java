package com.upg.program;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        String[] sourceCurrenciesArray = {"USD", "EUR", "GBP", "JPY"};
        ArrayList<String> sourceCurrencies = new ArrayList<>(Arrays.asList((sourceCurrenciesArray)));
        HashMap<Integer, String> targetCurrencies = new HashMap<>();
        // USD to other currencies
        targetCurrencies.put(1, "USD");
        targetCurrencies.put(2, "EUR");
        targetCurrencies.put(3, "GBP");
        targetCurrencies.put(4, "JPY");
        
        boolean continueConversion = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Currency Converter!");
        System.out.println("Supported currencies:");
        System.out.println("1. USD (US Dollar)");
        System.out.println("2. EUR (Euro)");
        System.out.println("3. GBP (British Pound)");
        System.out.println("4. JPY (Japanese Yen)");
        while (continueConversion) {
            double amount = 0;
            String sourceCurrency = "";
            int targetCurrencyIndex = 0;

            while (amount <= 0) {
                System.out.print("\nEnter the amount you want to convert: ");
                try {
                    amount = scanner.nextDouble();
                    if (amount <= 0) {
                        System.out.println("Amount must be greater than zero.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.nextLine(); // Consume the invalid input
                }
            }

            while (!sourceCurrencies.contains(sourceCurrency)) {
                System.out.print("Enter the source currency (e.g., USD): ");
                sourceCurrency = scanner.next().toUpperCase();
                if (!sourceCurrencies.contains(sourceCurrency)) {
                    System.out.println("Invalid source currency. Please choose a supported currency.");
                }
            }

            while (!targetCurrencies.containsKey(targetCurrencyIndex)) {
                System.out.println("\nSelect the target currency:");
                System.out.println("Supported currencies:");
                System.out.println("1. USD");
                System.out.println("2. EUR");
                System.out.println("3. GBP");
                System.out.println("4. JPY");
                System.out.print("Enter the number corresponding to the target currency:");
                try {
                    targetCurrencyIndex = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a valid number.");
                    scanner.nextLine(); // Consume the invalid input
                }
                if (!targetCurrencies.containsKey(targetCurrencyIndex)) {
                    System.out.println("Invalid target currency. Please choose a valid option.");
                    continue;
                }
            }

            CurrencyConverter currencyConverter = new CurrencyConverter();
            String targetCurrency = targetCurrencies.get(targetCurrencyIndex);
            double convertedValue = currencyConverter.convertCurrency(amount, sourceCurrency, targetCurrency);
            System.out.printf("Converted %.2f %s to %.2f %s", amount, sourceCurrency, convertedValue, targetCurrency);

            System.out.print("\nDo you want to make another conversion? (yes/no): ");
            String choice = scanner.next().toLowerCase();
            if (!choice.equals("yes")) {
                continueConversion = false;
                System.out.println("\nThank you for using the Currency Converter! Goodbye!");
            }


        }

    }
}