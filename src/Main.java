public class Main {
    public static void main(String[] args) {
        Car dog = new Car("Dog", 20);
        Car cat = new Car("Cat", 10);
        System.out.println(dog.getAge());
        System.out.println(cat.getAge());
        dog.setAge(21);
        cat.setAge(11);
        System.out.println(dog.getAge());
        System.out.println(cat.getAge());
    }
}