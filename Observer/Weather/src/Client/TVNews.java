package Client;
import com.company.Weather;

public class TVNews implements Observer  {
    public void Update(Weather w)
    {
        System.out.println("TV Weather Forecast: temp - "+w.getTemp()+"C, and press - " + " pressure - "+w.getPress()+"hPa");
    }
}
