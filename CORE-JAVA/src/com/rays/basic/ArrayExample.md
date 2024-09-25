```java
package com.rays.basic;

/**
 * The {@code ArrayExample} class demonstrates basic usage of arrays in Java.
 * It initializes an integer array and prints its elements using a for-each loop.
 */
public class ArrayExample {

    /**
     * The main method is the entry point of the program. It initializes an array 
     * of integers and uses a for-each loop to print each element.
     * 
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {

        // Declare and initialize an integer array with values
        int[] i = { 5, 10, 12, 15 };

        /*
         * Uncommented code that can be used to print individual elements of the array:
         * System.out.println(i[0]); // Prints the first element of the array
         * System.out.println(i[1]); // Prints the second element of the array
         * System.out.println(i[2]); // Prints the third element of the array
         * System.out.println(i[3]); // Prints the fourth element of the array
         */

        // Use a for-each loop to iterate over the array and print each element
        for (int a : i) {
            System.out.println(a); // Prints the value of each element in the array
        }

    }

}
```

### Explanation:

- **Class-level Javadoc (`ArrayExample` class)**: Describes the purpose of the class (demonstrating basic array usage).
- **Method-level Javadoc (`main` method)**: Explains that this method initializes an integer array and prints its elements using a for-each loop.
- **Inline comments**: Each part of the code, including array declaration, the commented-out `System.out.println()` statements, and the for-each loop, is explained.
