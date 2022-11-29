import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(5, 3.5);
        Dog dog = new Dog(10,12.5,"German Sheppard");
        List<Animal> animals = new ArrayList<>();
        animals.add(cat);
        animals.add(dog);
        System.out.println(dog);
    }
}