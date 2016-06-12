package observer;

import java.util.Observable;
import java.util.Observer;

class StatisticsDisplay implements DisplayElement, Observer {
    private float temperature;
    private float humidity;
    private Observable observable;
    private float maxTemp = 0;
    private float minTemp = 300;
    private float tempSum = 0;
    private int num;

    StatisticsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            float temp = weatherData.getTemperature();
            tempSum += temp;
            num++;
            if (temp > maxTemp) maxTemp = temp;
            if (temp < minTemp) minTemp = temp;
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min: " + tempSum / num + "/" + maxTemp + "/" + minTemp);
    }
}
