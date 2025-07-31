public class Person {
    private int age;
    private String name;

    public Person(String name, int age) {
        this.name = name; // Objects not initialized are instead defaulted to null
        this.age = age; // if not initialized in constructor, ints default to 0, doubles to 0.0, boolean to false
    }

    public Person(String name) {
        this.name = name; // Only set name
    }

    public String toString() {
        // Intended behavior: Return a string representation of all the information of the Person object
        return name + " is " + age + " years old";
    }

    public int getAge() {
        return age; // getter for instance variable
    }

    public void setAge(int age) {
        this.age = age; // setter for instance variable
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void age() { // Overloading
        age ++;
    }

    public void age(int years) {
        age += years;
    }
}
