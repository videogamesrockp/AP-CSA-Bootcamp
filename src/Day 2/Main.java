public class Main {
    public static void main(String[] args) {
        boolean x = (5 > 3); // Evaluates to true
        boolean y = (5 < 2);
        boolean z = (5 <= 5); // Evaluates to true
        boolean a = (5 >= 5);
        boolean b = (5 == 3); // Evaluate to false
        boolean c = ((3 < 5) && (5 < 7)); // Evaluates to true if 5 is greater than 3 AND less than 7
        boolean d = (5 != 3); // Evaluates to true because 5 isn't equal to 3
        boolean e = !false; // ! = NOT || true becomes false, false becomes true
        boolean f = ((false) || (false)); // the OR operation between two booleans || both false = false
        String str = "Hello"; // Not storing the string literal, storing a reference to a String object || A reference is the address (location) of the object in the memory of the computer
        String str2 = new String("Hello");
        boolean stringComp = str.equals(str2); // Compare two strings using built-in method

        boolean hasHouse = false;

        if (hasHouse) { // checks if hasHouse is true
            System.out.println("You have a house"); // code is run if the boolean is true
        }
        if (!hasHouse) { // can be else statement
            System.out.println("You don't have a house");
        }

        int num = 5;
        if (num > 9) {
            System.out.println("num is greater than 9");
        }
        else if (num > 5) { // only runs if previous if statements were false
            System.out.println("num is greater than 5");
        }
        else if (num > 4) {
            System.out.println("num is greater than 4");
        }
        else { // catch all statement
            System.out.println("num is pretty small");
        }
        /*
        while (true) { // Outputs hello world! infinitely
            System.out.println("Hello world!");
        }
        */

        for (int i = 0; i < 5; i ++) { // for (initial statement; boolean condition to check; code to run after each iteration)
            System.out.println(i);
        }

        for (int i = 0; i < 10; i ++) { // Iterate through 0, .. , 9
            if (i % 3 == 0) { // Check if i is divisible by 3
                System.out.println(i);
            }
        }

        int i = 0;
        while (i < 5) { // i = 4, true
            System.out.println(i);
            i ++;
        }

        int num2 = 5;
        int guess = (int) (Math.random() * 10); // Generate random number from 0 to 9
        int numGuesses = 1; // counter for how many times a random number is generated before we get a 5
        while (guess != num2) { // while we haven't gotten a 5 yet
            guess = (int) (Math.random() * 10);
            numGuesses ++; // increase counter by 1
        }

        System.out.println(numGuesses + " guesses to equal " + num2); // Output number of guesses

        for (int row = 0; row < 7; row ++) {
            for (int col = 0; col < 7; col ++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }
}