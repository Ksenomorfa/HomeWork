package observer;

import java.util.Observable;


class WeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    WeatherData() {
    }

    void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    private void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    float getPressure() {
        return pressure;
    }

    float getTemperature() {
        return temperature;
    }

    float getHumidity() {
        return humidity;
    }
}
