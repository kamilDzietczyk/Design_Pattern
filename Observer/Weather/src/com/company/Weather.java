package com.company;

import Client.Observer;

import java.util.HashSet;
import java.util.Set;

public class Weather implements Observable {
    private int temp;
    private int press;
    private Set<Observer> ListOfMedia = new HashSet<>();

    public Weather(int temp, int press) {
        this.temp = temp;
        this.press = press;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public void setPress(int press) {
        this.press = press;
    }

    public int getTemp() {
        return temp;
    }

    public int getPress() {
        return press;
    }

    @Override
    public void Register(Observer o) {
        ListOfMedia.add(o);
    }

    @Override
    public void Unregister(Observer o) {
        ListOfMedia.remove(o);
    }

    @Override
    public void Notify() {
        for (Observer o : ListOfMedia)
        {
            o.Update(this);
        }
    }
    public void UpdateForecast (int temp, int press)
    {
        setTemp(temp);
        setPress(press);
        Notify();
    }
}
