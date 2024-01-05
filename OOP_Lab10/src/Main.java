
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        Animal animal0 = new Animal(true, 5, "Male");
        animals.add(animal0);

        Animal animal1 = new Animal(false, 3, "Female");
        animals.add(animal1);

        Duck duck1 = new Duck();
        animals.add(duck1);

        Duck duck2 = new Duck();
        animals.add(duck2);

        Duck duck3 = new Duck();
        animals.add(duck3);

        Fish fish1 = new Fish();
        animals.add(fish1);

        Fish fish2 = new Fish();
        animals.add(fish2);

        Zebra zebra1 = new Zebra();
        animals.add(zebra1);

        Zebra zebra2 = new Zebra();
        animals.add(zebra2);

        Zebra zebra3 = new Zebra();
        animals.add(zebra3);

        Zebra zebra4 = new Zebra();
        animals.add(zebra4);

        for (Animal animal : animals) {
            System.out.println(animal.toString());
            animal.voice();

            if (animal instanceof Duck) {
                Duck duck = (Duck) animal;
                duck.swim();
                duck.quack();
            } else if (animal instanceof Fish) {
                Fish fish = (Fish) animal;
                fish.swim();
            } else if (animal instanceof Zebra) {
                Zebra zebra = (Zebra) animal;
                zebra.run();
            }

            animal.sleep();
            System.out.println("------------------");
        }

    }
}
