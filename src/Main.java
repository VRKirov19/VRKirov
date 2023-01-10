<<<<<<< HEAD
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        List<String> linked = new LinkedList<>();
        List<String> strings = new LinkedList<>();

        strings.add("second");
        strings.add("adsa");
        strings.add("third");

        System.out.println(String.join(", ", strings));
        Collections.sort(strings);
        System.out.println(String.join(", ", strings));
        Collections.reverse(strings);
        System.out.println(String.join(", ", strings));

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        nums = Arrays.stream(input.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        String[] tokens = input.split("\\s+");

//        System.out.println(tokens[1]);
//        tokens[1] = "Index1";
//        System.out.println(tokens[1]);

        for (int i = 0; i < tokens.length; i++) {
            int element = Integer.parseInt(tokens[i]);
            nums.add(element);
        }

        for (int i = 0; i < nums.size(); i++) {
            System.out.print(nums.get(i) + " ");
            nums.set(i, 10);
        }
=======
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Gosho");
        Mammal person2 = new Person("Tosho");
        Animal person3 = new Person("Ivan");

        System.out.println("PERSON: ");
        System.out.println(person.getName());
        person.eat();
        person.walk();
        person.test("shshsh");

        Dog dog = new Dog();
        dog.walk();
        dog.test("shshhshsh");


        //System.out.println("MAMMAL: ");
        //person2.walk();
        //person2.test();
//
        //System.out.println("ANIMAL: ");
        //person3.eat();
>>>>>>> fd4bfc423e9d7f27916b0e2d53f64fd1e938aa09
    }
}
