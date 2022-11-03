package driver;

import transport.PassengerCar;

public class DriverCategoryB<T extends PassengerCar> extends Driver {


    public DriverCategoryB(String name, boolean driversLicense, int experience) {
        super(name, driversLicense, experience);
    }

    public final void toControlDriver(PassengerCar car) {
        if (isDriversLicense() == true) {
            System.out.println("водитель " + getName() + " управляет автомобилем " + car.getBrand() + " " + car.getModel() + " и будет участвовать в заезде");
        } else System.out.println("У " + getName() + " нет водительского удостоверения");


    }

    @Override
    public String start() {
        if (isDriversLicense() == true) {
            return "start moving the passenger car";
        } else return "No driver license";

    }

    @Override
    public String stop() {
        return "stop the passenger car";
    }

    @Override
    public String refuelTheTransport() {
        return "refuel the passenger car";
    }

    @Override
    public String toString() {
        return getName() + " - Driver Category B";
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
