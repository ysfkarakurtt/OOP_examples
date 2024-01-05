
public class Animal {

    private boolean isMammal;
    private int age;
    private String gender;

    public Animal(boolean isMammal, int age, String gender) {
        this.isMammal = isMammal;
        this.age = age;
        this.gender = gender;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void mate() {
        System.out.println("Animal is mating");
    }

    public void voice() {
        System.out.println("Animal voice");
    }

    public final void sleep() {
        System.out.println("Animal is sleeping");
    }

    @Override
    public String toString() {
        return "Animal isMammal: " + isMammal()
                + ", Age: " + age
                + ", Gender: " + gender;
    }

}
