package com.company.Factory;

import com.company.Factory.Enums.Fuel;

public class Ford extends Car{

    protected Ford(String wheel, double engineCapacity, Fuel fuel, int yearOfProduction) {
        super(wheel, engineCapacity, fuel, yearOfProduction);
    }
}
