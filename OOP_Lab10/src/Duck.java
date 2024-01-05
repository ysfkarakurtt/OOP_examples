
public class Duck extends Animal {

    private String beakColor;

    public Duck() {
        super(false, 0, "Unknown");
        this.beakColor = "yellow";
    }

    public String getBeakColor() {
        return beakColor;
    }

    public void swim() {
        System.out.println("Duck is swimming");
    }

    public void quack() {
        System.out.println("Quack quack");
    }

    @Override
    public void voice() {
        quack();
    }

    @Override
    public String toString() {
        return "Duck isMammal: " + isMammal()
                + ", Beak Color: " + beakColor;
    }
}
