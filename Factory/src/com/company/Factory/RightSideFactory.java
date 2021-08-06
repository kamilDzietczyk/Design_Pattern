package com.company.Factory;

import com.company.Factory.Enums.BMWCarModel;
import com.company.Factory.Enums.FordCarModel;
import com.company.Factory.Enums.Fuel;

public class RightSideFactory extends Factory {


    @Override
    public BMW createBMWCar(BMWCarModel c) {
        switch(c){
            case E60_diesel:
                return new BMW("right",2.0, Fuel.diesel,2021);
            case E60_LPG:
                return new BMW("right",2.5, Fuel.LPG,2021);
            case E60_electric:
                return new BMW("right",4.0, Fuel.electric,2021);
            case E60_petrol:
                return new BMW("right",1.9, Fuel.petrol,2021);
            case X5_diesel:
                return new BMW("right",5.0, Fuel.diesel,2021);
            case X5_LPG:
                return new BMW("right",3.5, Fuel.LPG,2021);
            case X5_electric:
                return new BMW("right",1.0, Fuel.electric,2021);
            case X5_petrol:
                return new BMW("right",6.9, Fuel.petrol,2021);
            default:
                throw new UnsupportedOperationException("not exist");
        }
    }

    @Override
    public Ford createFordCar(FordCarModel c) {
        switch(c)
        {
            case CMax_diesel:
                return new Ford("right",3.0, Fuel.diesel,2021);
            case CMax_LPG:
                return new Ford("right",8.5, Fuel.LPG,2021);
            case CMax_electric:
                return new Ford("right",2.0, Fuel.electric,2021);
            case CMax_petrol:
                return new Ford("right",5.9, Fuel.petrol,2021);
            case Focus_diesel:
                return new Ford("right",3.3, Fuel.diesel,2021);
            case Focus_LPG:
                return new Ford("right",2.5, Fuel.LPG,2021);
            case Focus_electric:
                return new Ford("right",5.0, Fuel.electric,2021);
            case Focus_petrol:
                return new Ford("right",7.9, Fuel.petrol,2021);
            default:
                throw new UnsupportedOperationException("not exist");
        }
    }
}

