package com.company.Factory;

import com.company.Factory.Enums.Fuel;

public abstract class Car {

    private String wheel;
    private double EngineCapacity;
    private Fuel fuel;
    private int YearOfProduction;

    protected Car(String wheel, double engineCapacity, Fuel fuel, int yearOfProduction) {
        this.wheel = wheel;
        this.EngineCapacity = engineCapacity;
        this.fuel = fuel;
        this.YearOfProduction = yearOfProduction;
    }

    public String getWheel() {
        return wheel;
    }

    public double getEngineCapacity() {
        return EngineCapacity;
    }

    public Fuel getFuel() {
        return fuel;
    }

    public int getYearOfProduction() {
        return YearOfProduction;
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheel=" +wheel+
                "EngineCapacity=" + EngineCapacity +
                ", fuel=" + fuel +
                ", YearOfProduction=" + YearOfProduction +
                '}';
    }
}
