public class Dog extends Mammal {

    private String breed;

    public Dog(int age, double weight, String breed){
        super(age, weight);
        this.breed = breed;
    }

    @Override
    public String toString(){
        return this.breed + " " + super.age + " " + weight;
    }

    @Override
    public void walk() {
        System.out.println("Dog is walking");

    }
    @Override
    public void test() {
        System.out.println("Testing in dog");
    }
}