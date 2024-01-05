
public class Bmw extends Car {

    private String model;
    private String color;
    private double price;

    public Bmw(String type, int productionYear, String brand, double weight, int numberOfWheels, String model, String color, double price) {
        super(type, productionYear, brand, weight, numberOfWheels);
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
    }
}
