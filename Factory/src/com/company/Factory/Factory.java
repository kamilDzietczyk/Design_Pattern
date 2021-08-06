package com.company.Factory;

import com.company.Factory.Enums.BMWCarModel;
import com.company.Factory.Enums.FordCarModel;

public abstract class Factory {
    abstract public BMW createBMWCar(BMWCarModel c);
    abstract public Ford createFordCar(FordCarModel c);
}

