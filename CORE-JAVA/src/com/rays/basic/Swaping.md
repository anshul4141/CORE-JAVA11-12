```java
package com.rays.basic;

/**
 * The {@code Swaping} class demonstrates two methods to swap the values of two
 * integer variables: one using a third variable and another without using a third variable.
 */
public class Swaping {

    /**
     * The main method is the entry point of the program. It contains examples of 
     * swapping two integers with and without using a third variable.
     * 
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {

        // Swapping using a third variable
        int a = 5;  // Initialize variable a with value 5
        int b = 10; // Initialize variable b with value 10
        int c = 0;  // Declare a third variable c to assist in swapping

        // Swap the values of a and b using c
        c = a; // Assign the value of a to c
        a = b; // Assign the value of b to a
        b = c; // Assign the value of c (which is the original value of a) to b

        // Print the swapped values of a and b
        System.out.println("a = " + a); // Outputs a = 10
        System.out.println("b = " + b); // Outputs b = 5

        // Swapping without using a third variable
        int i = 12; // Initialize variable i with value 12
        int j = 14; // Initialize variable j with value 14

        // Swap the values of i and j without a third variable
        i = i + j; // i becomes the sum of i and j (i = 26)
        j = i - j; // j becomes the original value of i (j = 12)
        i = i - j; // i becomes the original value of j (i = 14)

        // Print the swapped values of i and j
        System.out.println(j); // Outputs j = 12
        System.out.println(i); // Outputs i = 14
    }

}
```

### Explanation:

- **Class-level Javadoc (`Swaping` class)**: Describes the purpose of the class (demonstrating two methods of swapping values).
- **Method-level Javadoc (`main` method)**: Explains that this method demonstrates swapping values with and without a third variable.
- **Inline comments**: Each step of the code is explained, including initialization, the logic for swapping with and without a third variable, and printing the results.
