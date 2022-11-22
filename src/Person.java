public class Person {
    public String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if(name.contains("1") || name.contains("2")) {
            return;
        }
        this.name = name;
    }
}