package ObserverPattern_second.ProblematicCode;

public class CurrentConditionDisplay {

    private float humidity;
    private float temperature;
    private float pressure;

    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

    public void update(float temperature , float humidity , float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
