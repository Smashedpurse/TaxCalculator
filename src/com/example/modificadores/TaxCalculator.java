package com.example.modificadores;

public class TaxCalculator {
    public double rate = 0.1;
    public double getTaxeAmount(double price)
    { return getRateFromDB() * price;
    }
    double getRateFromDB(){
      //SIMULAR EL LLAMADO A UNA BASE DE DATOS.
        return 0.1;
    };
}
