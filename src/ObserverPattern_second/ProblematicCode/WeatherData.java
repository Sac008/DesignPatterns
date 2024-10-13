package ObserverPattern_second.ProblematicCode;

public class WeatherData {

    private float temperature;
    private float humidity;
    private float pressure;

    private CurrentConditionDisplay currentConditionDisplay;
    private StatisticsDisplay statisticsDisplay;

    public WeatherData(){}

    public WeatherData(CurrentConditionDisplay currentConditionDisplay , StatisticsDisplay statisticsDisplay) {
        this.currentConditionDisplay = currentConditionDisplay;
        this.statisticsDisplay = statisticsDisplay;
    }

    public WeatherData(CurrentConditionDisplay currentConditionDisplay) {
        this.currentConditionDisplay = currentConditionDisplay;
    }

    public WeatherData(StatisticsDisplay statisticsDisplay) {
        this.statisticsDisplay = statisticsDisplay;
    }


    public void measurementsChanged() {
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        if(currentConditionDisplay != null) {
            currentConditionDisplay.update(temp , humidity , pressure);
        }
        if(statisticsDisplay != null) {
            statisticsDisplay.update(temp , humidity , pressure);
        }
    }

    public void setMeasurements(float temperature , float humidity , float pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        this.measurementsChanged();
    }

    private float getPressure() {
        return this.pressure;
    }

    private float getHumidity() {
        return this.humidity;
    }

    private float getTemperature() {
        return this.temperature;
    }
}
