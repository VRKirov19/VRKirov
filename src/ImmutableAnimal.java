public class ImmutableAnimal {
    private int age;
    private String typeOfFoodToEat;
    public ImmutableAnimal(int age, String typeOfFoodToEat) {
        this.age = age;
        setTypeOfFoodToEat(typeOfFoodToEat);
    }

    public void setTypeOfFoodToEat(String typeOfFoodToEat) {
        this.typeOfFoodToEat = typeOfFoodToEat;
    }

    public String getTypeOfFoodToEat() {
        return typeOfFoodToEat;
    }

    public int getAge() {
        //if administrator
        return age;
        //else return 0;
    }

    public ImmutableAnimal changeAge(int age) {
        return new ImmutableAnimal(age, this.typeOfFoodToEat);
    }

    protected void eat() {
        System.out.println("Animal eating...");
    }
}