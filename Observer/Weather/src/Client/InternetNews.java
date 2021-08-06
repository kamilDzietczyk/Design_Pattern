package Client;

import com.company.Weather;

public class InternetNews implements Observer {
    @Override
    public void Update(Weather w) {
        System.out.println("Internet Weather Forecast: temp - "+w.getTemp()+"C, and press - " + " pressure - "+w.getPress()+"hPa");
    }
}
