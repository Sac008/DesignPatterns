package ObserverPattern_second.BestCode;

import ObserverPattern_second.BestCode.CurrentConditionDisplay;
import ObserverPattern_second.BestCode.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay ccd = new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
    }
}
