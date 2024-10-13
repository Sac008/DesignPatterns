package ObserverPattern_second.ProblematicCode;

public class WeatherStation {

    public static void main(String[] args) {
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        WeatherData wd = new WeatherData(currentConditionDisplay , statisticsDisplay);
        wd.setMeasurements(80 , 90 , 90);
    }
}
