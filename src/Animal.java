public class Animal {
    private int age;
    private String typeOfFoodToEat;
    public Animal(int age, String typeOfFoodToEat) {
        setAge(age);
        setTypeOfFoodToEat(typeOfFoodToEat);
    }
    public void setTypeOfFoodToEat(String typeOfFoodToEat) {
        this.typeOfFoodToEat = typeOfFoodToEat;
    }
    public int getAge() {
        //if administrator
        return age;
        //else return 0;
    }
    public void setAge(int age) {
        if(age < this.age) {
            throw new IllegalArgumentException("Invalid age");
        }
        else this.age = age;
    }
    protected void eat() {
        System.out.println("Animal eating...");
    }
}