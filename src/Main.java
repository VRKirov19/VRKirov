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
    }
}