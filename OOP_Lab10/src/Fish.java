
public class Fish extends Animal {

    private int sizeInFeet;
    private boolean canEat;

    public Fish() {
        super(false, 0, "Unknown");
        this.sizeInFeet = 0;
        this.canEat = true;
    }

    public int getSizeInFeet() {
        return sizeInFeet;
    }

    public void setSizeInFeet(int sizeInFeet) {
        this.sizeInFeet = sizeInFeet;
    }

    public boolean canEat() {
        return canEat;
    }

    public void setCanEat(boolean canEat) {
        this.canEat = canEat;
    }

    public void swim() {
        System.out.println("Fish is swimming");
    }

    @Override
    public void voice() {
        System.out.println("Blub blub");
    }

    @Override
    public String toString() {
        return "Fish isMammal: " + isMammal()
                + ", Size in Feet: " + sizeInFeet
                + ", Can Eat: " + canEat;
    }
}
