import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(10, "Meat");
        System.out.println(animal.getAge());
        animal.setAge(11);
        System.out.println(animal.getAge());
//        animal.setAge(5);
//        System.out.println(animal.getAge());
        ImmutableAnimal immAnimal = new ImmutableAnimal(10, "meat");
        System.out.println(immAnimal);
        System.out.println(immAnimal.getAge() + " " + immAnimal.getTypeOfFoodToEat());
        ImmutableAnimal newImm = immAnimal.changeAge(11);
        System.out.println(newImm);
        System.out.println(newImm.getAge() + " " + newImm.getTypeOfFoodToEat());
//        String test = "Gosho";
//        System.out.println(test);
//        String newString = test.replace("G", "T");
//        System.out.println(newString);
//        animal.eat();
//        Cat cat = new Cat(5, "Granuli");
//        cat.eat();
//
//        List<String> strings = new ArrayList<>();
    }
}