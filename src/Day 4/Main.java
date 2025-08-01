import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main { 
    public static void main(String[] args) {
        int[] arr = new int[10000]; // array constructor
        int[] arr2 = {1, 2, 3, 4}; // using array literal
        
        for (int i = 0; i < arr.length; i ++) { // length property of array used to iterate through each index
            arr[i] = i + 1; // arr = [1, 2, 3, 4 ... 10000]
            System.out.println(arr[i]);
        }

        for (int i: arr2) { // for-each loop
            System.out.println(i);
        }

        // System.out.println(arr[1000000]); // Index exceeds maximum array size = Index Out of Bounds Error
        int a = Integer.MAX_VALUE; // Property of Integer
        Double b = 29.0; // Declaring primitive type as instance of wrapper class
        System.out.println(Integer.toString(a)); // Runnign static toString method of wrapper Integer class

        ArrayList<String> list = new ArrayList<String>(); // Create new ArrayList: []
        System.out.println(list.size()); // .size() returns size of array

        list.add("Hello"); // adds "Hello" to the end of the ArrayList
        list.add(0, "World"); // Using two parameters allows you to specify where to insert the object into the ArrayList, order is index first then object second
        System.out.println(list); // [World, Hello]

        System.out.println(list.get(0)); // Access the element at index 0, prints "World"
        list.set(0, "Apple"); // ["Apple", "Hello"]

        list.remove(0);
        System.out.println(list);

        int[][] arr2D = new int[3][4];

        /*
         * {
         * {0, 0, 0, 0}
         * {0, 0, 0, 0}
         * {0, 0, 0, 0}
         * }
         */

        for (int row = 0; row < arr2D.length; row ++) {
            for (int col = 0; col < arr2D[0].length; col++) {
                System.out.print(arr2D[row][col] + " ");
            }
            System.out.println("");
        }

        for (int i = 0; i < arr.length; i ++) {
            if (arr[i] <= 7) {
                System.out.println(i);
            }
        }

        /* Insertion sort
         * {7, 3, 1, 10, 9}
         * {1, 3, 7, 10, 9}
         * {1, 3, 7, 10, 9}
         * {1, 3, 7, 10, 9}
         * {1, 3, 7, 9, 10}
         * {1, 3, 7, 9, 10}
         */
        /* Selection sort
         * {7, 3, 1, 9, 6}
         * {7, 3, 1, 9, 6}
         * {3, 7, 1, 9, 6}
         * {1, 3, 7, 9, 6}
         * {1, 3, 7, 9, 6}
         * {1, 3, 6, 7, 9}
         */
        /* Merge sort
         * {7, 3, 1, 10, 9}
         * Splits in half each time
         * Once each array has only one element, begins to recombine in a sorted fashion
         */

        System.out.println(fibonacciSeq(3)); // 1

        ArrayList<Integer> data = new ArrayList<Integer>(); // Must use wrapper class to store primitive types in ArrayList

        File file = new File("test.txt");
        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNext()) {
                data.add(scan.nextInt());
            }
            scan.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("error");
        }

        for (int i: data) {
            System.out.println(i);
        }
    }

    public static int fibonacciSeq(int x) {
        if (x == 1) {
            return 0;
        }
        else if (x == 2) {
            return 1;
        }
        else {
            return fibonacciSeq(x - 1) + fibonacciSeq(x-2);
        }
    }

    /*
     * fibonacciSeq(4) = 2
     * = fibonacciSeq(3) + fibonacciSeq(2)
     * fibonacciSeq(3) = fibonacciSeq(1) + fibonacciSeq(2) = 1
     */
}