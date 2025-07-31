public class Main {

    private static int ex;

    public static void main(String[] args) {
        Person person1 = new Person("Person", 18); // Invoke constructor to create a new Person object
        Person person2 = new Person("Person 2");

        // person1.age = 5; // Change age of person if instance variable is public
        System.out.println(person1); // toString is automatically run, special method

        System.out.println(person1.getAge()); // prints out age using getter

        System.out.println(person2);
        person1.age();
        person2.age(18);
        System.out.println(person1.toString() + person2.toString());

        for (int i = 0; i < 10; i ++) { // i variable also has the same limited block scope as the for loop
            int age = 10;
        } // age stops existing

        // age stops existing starting here
        int age = 10;
        declareInt(age); // age remains unchanged

        String str = "Hello";
        declareString(str);
        iniEx(); // successfully accessed ex
        System.out.println(ex); // able to be accessed
        System.out.println(age); // age doesn't exist outside of declareInt
        System.out.println(str); // unchanged

        // System.out.println(age); // age doesn't exist at this point

        SignedText signature = new SignedText("First", "Last");
        System.out.println(signature.addSignature("asdf")); // F-Last
    }

    public static void declareInt(int age) {
        age = 5;
    }

    public static void declareString(String str) {
        str = new String("Hello world!");
    }

    public static void iniEx() {
        ex = 10;
    }
}