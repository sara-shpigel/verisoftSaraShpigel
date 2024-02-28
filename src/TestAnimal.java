import java.util.ArrayList;
import java.util.List;

public class TestAnimal {

    public static void main(String[] args) {
        System.out.println("Welcome to Zoo! \n");
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat());
        animals.add(new Dog());
        animals.add(new Frog());

        for(Animal animal: animals){
            System.out.printf("Welcome to the %s 😀\n", animal.toString());
            animal.sayHello();
            System.out.println("The mood changes...");
            animal.setMood(animal.getMood() ^ 1);
            animal.sayHello();
            if(animal instanceof Land){
                System.out.println("This is a land animal:");
                System.out.printf("This land animal has %d legs \n", ((Land) animal).getNumberOfLegs());
            }
            if(animal instanceof Water){
                System.out.println("This is a water animal: ");
                System.out.printf("This water animal %s gills \n", ((Water) animal).hasGills() ? "has" : "doesn't have");
                System.out.printf("This water animal %s lays eggs \n", ((Water) animal).hasLaysEggs() ? "" : "doesn't ");
            }
            System.out.printf("It is %s mammal animal \n", animal.isMammals() ? "a" : "not");
            System.out.printf("It is %s carnivorous animal \n", animal.isCarnivorous() ? "a" : "not");

            System.out.println();
        }
    }
}

