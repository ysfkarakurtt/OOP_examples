
public class Zebra extends Animal {

    private boolean isWild;

    public Zebra() {
        super(true, 0, "Unknown");
        this.isWild = true;
    }

    public boolean isWild() {
        return isWild;
    }

    public void setWild(boolean isWild) {
        this.isWild = isWild;
    }

    public void run() {
        System.out.println("Zebra is running");
    }

    @Override
    public void voice() {
        System.out.println("Zebra neigh");
    }

    @Override
    public String toString() {
        return "Zebra isMammal: " + isMammal()
                + ", Is Wild: " + isWild;
    }
}
