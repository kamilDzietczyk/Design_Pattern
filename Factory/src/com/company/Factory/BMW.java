package com.company.Factory;

import com.company.Factory.Enums.Fuel;

public class BMW extends Car{

    protected BMW(String wheel, double engineCapacity, Fuel fuel, int yearOfProduction) {
        super(wheel, engineCapacity, fuel, yearOfProduction);
    }
}
