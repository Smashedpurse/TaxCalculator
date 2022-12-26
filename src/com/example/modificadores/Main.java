package com.example.modificadores;

public class Main {
    public static void main(String[] args) {
        double itemPrice = 23.0;
        TaxCalculator tc = new TaxCalculator();

        double result = tc.rate * itemPrice;
        System.out.println(result);

        // double itemTax = tc.getTaxeAmount(itemPrice);
        //double itemTax = itemPrice * tc.rate;
       // System.out.println(itemTax);
        }

        }
