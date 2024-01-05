
public class Car extends Vehicle {

    private String brand;
    private double weight;
    private int numberOfWheels;

    public Car(String type, int productionYear, String brand, double weight, int numberOfWheels) {
        super(type, productionYear);
        this.brand = brand;
        this.weight = weight;
        this.numberOfWheels = numberOfWheels;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Brand: " + brand);
        System.out.println("Weight: " + weight);
        System.out.println("Number of Wheels: " + numberOfWheels);
    }
}
