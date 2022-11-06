import driver.DriverCategoryB;
import driver.DriverCategoryC;
import driver.DriverCategoryD;
import transport.Bus;
import transport.PassengerCar;
import transport.Truck;

public class Main {
    public static void main(String[] args) {
        PassengerCar audi = new PassengerCar("AUDI", "A4", 2.0);
        PassengerCar bmw = new PassengerCar("BMW", "5 series", 2.0);
        PassengerCar mb = new PassengerCar("Mercedes-Benz", "E200", 2.0);

        Truck volvo = new Truck("Volvo", "FH", 12.8);
        Truck scania = new Truck("Scania", "P-series", 12.7);
        Truck daf = new Truck("DAF", "XF", 12.0);


        Bus zhongTong = new Bus("Zhong Tong", "Fasion", 7.5);
        Bus volgabus = new Bus("Volgabus", "Ситирим", 6.5);
        Bus higer = new Bus("Higer", "KLQ 6928", 6.7);

        System.out.println(audi);

        DriverCategoryB smith = new DriverCategoryB("Smith", true, 10);
        DriverCategoryC alex = new DriverCategoryC("Alex", true, 5);
        DriverCategoryD sam = new DriverCategoryD("Sam", true, 9);
        DriverCategoryD demis = new DriverCategoryD("Demis", false, 0);
        smith.toControlDriver(audi);
        alex.toControlDriver(volvo);
        sam.toControlDriver(higer);
        demis.toControlDriver(higer);
        System.out.println(smith.refuelTheTransport());
        System.out.println(sam);
        System.out.println(sam.stop());
        System.out.println(sam.start());
        System.out.println(sam.refuelTheTransport());

    }
}