package com.company;


import com.company.Factory.Car;
import com.company.Factory.Enums.BMWCarModel;
import com.company.Factory.Enums.FordCarModel;
import com.company.Factory.Factory;
import com.company.Factory.LeftSideFactory;
import com.company.Factory.RightSideFactory;

public class Main {

    public static void main(String[] args) {

        Factory leftSide = new LeftSideFactory();
        Factory rightSide = new RightSideFactory();

        Car BMWLPG = leftSide.createBMWCar(BMWCarModel.E60_LPG);
        System.out.println(BMWLPG.getWheel());

        Car Ford = rightSide.createFordCar(FordCarModel.CMax_petrol);
        System.out.println(Ford.getWheel());



    }
}
