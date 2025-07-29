public class Main {
    public static void main(String[] args) {
        // int, double, char, boolean
        // int = Integer value
        // double = Number (including decimal)
        // char = Single character
        // boolean is true or false
        /*
         * 293841702934
         * 12341234
         * 123412341234
         */

        int num = 56; // declare int and set it to 56
        int num2 = 10;
        double doub = -3.2;
        double doub2 = 1.05;
        char letter = 'a';
        boolean status = false;

        String greeting = "Hello world!";
        String hello = greeting.substring(0, 5); // Gets all characters from index 0-4, inclusive
        System.out.println(hello); // Prints out "Hello"

        int length = greeting.length();
        System.out.println(length);

        System.out.println(num + doub); // double + int = double, integer is converted to double and then added normally
        System.out.println(((double) num)/num2); // dividing two integers, the result will be an integer || 5.6

        System.out.println("Hello world! " + doub); // number is converted to string, then added like two strings || Hello world! 56

        System.out.println((1.333333) % 1 + 12); // Evaluates to: 12.33333

        System.out.println("Hello world!");
        System.out.println("Hello world!");
        System.out.print("Hello world!" + "\n");

        System.out.println(Math.random()); // Returns any number from [0, 1). 0 is included, 1 is not.
        System.out.println((int) (Math.random() * 10) + 1); // Generate a random integer from 1 to 10

        int puppies = 0;
        puppies = puppies + 1;
        puppies += 1;
        puppies ++; // All three of these do the same thing

        System.out.println(puppies);
        
        System.out.println(greeting);

        System.out.println(randomLengthSubstring("This is a string"));
    }

    public static String randomLengthSubstring(String str) {
        int len = str.length(); // Length of string stored here
        int randomIndex = (int) (Math.random() * len); // [0, 1) -> [0, len) - > 0, 1, ..., len - 1

        return str.substring(randomIndex); // Return a substring from a random index of the string to the end of the string
    }
}
