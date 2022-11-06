package transport;

import com.sun.jdi.connect.Transport;

public class PassengerCar extends Car implements Rival {

    public PassengerCar(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public void start() {
        System.out.println("Начать движение");
    }

    @Override
    public void finish() {
        System.out.println("Закончить движение");
    }


    @Override
    public String pitSop() {
        return "легковому транспорту заехать на пит-стоп";
    }

    @Override
    public String bestLapTime() {
        return "лучшее время круга легкового автомобиля";
    }

    @Override
    public double maxSpeed() {
        return 150;
    }

    @Override
    public String toString() {
        return "PassengerCar{}";
    }


}
