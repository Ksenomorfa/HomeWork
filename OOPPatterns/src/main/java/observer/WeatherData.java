package observer;

import java.util.Observable;

/* Паттерн Наблюдатель
* определяет отношение один-ко-многим между объектами т.о., что при изменении состояния одного из объектов
* происходит автоматическое оповещение и обновлени всех зависимых объектов. Объект с состоянием- Субьект,
* оповещаемые - наблюдатели. В данном примере используется стандартный java.util.Observable для субъектоа и
* java.util.Observer для наблюдателей. Observable это класс, так что если нужно реализовывать более гибкую
* структуру, то нужно делать своего "субъекта"-интерфейс. Его нельзя включить в класс как переменную, так как
* setchanged protected и может быть использован только наследниками. */

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
