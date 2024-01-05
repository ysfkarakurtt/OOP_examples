
public class Vehicle {

    private String type;
    private int productionYear;

    public Vehicle(String type, int productionYear) {
        this.type = type;
        this.productionYear = productionYear;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public void displayInfo() {
        System.out.println("Vehicle Type: " + type);
        System.out.println("Production Year: " + productionYear);
    }
}
