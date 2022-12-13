public class Person extends Mammal implements Animal{
    private String name;
    public Person(String name){
        this.name = name;
    }

    public Person(int age){

    }

    public String getName() {
        return name;
    }

    @Override
    public void eat(){
        System.out.println("Person is eating...");
    }

    @Override
    public void walk(){
        System.out.println("Person is walking...");
    }

    @Override
    public void test(String text){
        System.out.println("Testing is Person");
    }
}