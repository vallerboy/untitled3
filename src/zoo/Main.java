package zoo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bear bear = new Bear(1, "Pysio", 200, 40);
        Wolf wolf = new Wolf(2, "Wilczus", 70);
        Tiger tiger = new Tiger(3, "mufasa", 50, 20);
        Dog dog = new Dog(4, "Reksio", 30);

        List<Animal> animalList = new ArrayList<>();
        animalList.add(bear);
        animalList.add(wolf);
        animalList.add(tiger);
        animalList.add(dog);

        for (Animal animal : animalList) {
            animal.introduce();
        }

        List<Animal> howlers = new ArrayList<>();
        howlers.add(dog);
        howlers.add(wolf);


        for (Animal howler : howlers) {
            System.out.println("My name is: " + howler.getName());
            ((Canine) howler).bark();

//            if(howler instanceof Dog){
//                ((Dog) howler).sitPretty();
//            }
        }

    }
}
