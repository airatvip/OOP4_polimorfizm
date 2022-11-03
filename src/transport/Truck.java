package transport;

import transport.Rival;
import transport.Transport;

public class Truck extends Transport implements Rival {


    public Truck(String brand, String model, double engineVolume) {
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
        return "грузовому транспорту заехать на пит-стоп";
    }

    @Override
    public String bestLapTime() {
        return "лучшее время круга грузового автомобиля";
    }

    @Override
    public double maxSpeed() {
        return 150;
    }

    @Override
    public String toString() {
        return "transport.Truck{}";
    }
}


