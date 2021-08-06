package com.company;
import Client.InternetNews;
import Client.RadioNews;
import Client.TVNews;

public class Main {

    public static void main(String[] args) {
	Weather w = new Weather(25, 1003);
	InternetNews In = new InternetNews();
	TVNews Tn = new TVNews();
    RadioNews Rn = new RadioNews();
    w.Register(In);
    w.Register(Tn);
    w.Register(Rn);
    w.Notify();
    w.Unregister(In);
    System.out.println("---------------------NEW---------------------------------");
    w.UpdateForecast(45,1523);
    }
}
