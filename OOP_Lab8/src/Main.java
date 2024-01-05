
public class Main {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("Passenger", 2022);
        vehicle.displayInfo();

        System.out.println("------------------------");

        Car car = new Car("Passenger", 2022, "Honda", 1500.0, 4);
        car.displayInfo();

        System.out.println("------------------------");

        Bmw bmw = new Bmw("Passenger", 2022, "BMW", 1800.0, 4, "X5", "Black", 175000.0);
        bmw.displayInfo();
    }
}
