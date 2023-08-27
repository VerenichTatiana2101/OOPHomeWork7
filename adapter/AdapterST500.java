package adapter;

import java.time.LocalDateTime;

public class AdapterST500 extends ST500Info implements MeteoSensor {
    private SensorTemperature adaptee;

    public AdapterST500(SensorTemperature adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public int getId() {
        return getData().identifier();
    }

    @Override
    public Float getTemperature() {
        return (float) getData().temperature();
    }

    @Override
    public Float getHumidity() {
        return (float) 69;
    }

    @Override
    public Float getPressure() {
        return (float) 739;
    }

    @Override
    public LocalDateTime getDateTime() {
        LocalDateTime dateTime = LocalDateTime.of(adaptee.year(), 1, 1, 0, 0);
        dateTime = dateTime.plusDays(adaptee.day()-1);
        dateTime = dateTime.plusSeconds(adaptee.second());
        return dateTime;
    }

    // @Override
    // public LocalDateTime getDateTime() {
    //     return LocalDateTime.now();
    // }


}
