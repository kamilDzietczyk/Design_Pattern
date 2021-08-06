package Client;
import com.company.Weather;

public class RadioNews implements Observer {
    public void Update(Weather w)
    {
        System.out.println("Radio Weather Forecast: temp - "+w.getTemp()+"C, and press - " + " pressure - "+w.getPress()+"hPa");
    }
}
