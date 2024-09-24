```java
package com.rays.basic;

/**
 * The {@code Table} class demonstrates the generation of a multiplication table
 * from 1 to 10. It uses nested for-loops to print the product of two numbers
 * in a tabular format.
 */
public class Table {

    /**
     * The main method is the entry point of the program. It prints a multiplication
     * table from 1 to 10 using nested loops.
     * 
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {

        // Outer loop for rows (i represents the number to be multiplied)
        for (int i = 1; i <= 10; i++) {

            // Inner loop for columns (j represents the multiplier)
            for (int j = 1; j <= 10; j++) {

                // Print the product of i and j, followed by a tab character for spacing
                System.out.print(i * j + "\t");

            }

            // Move to the next line after each row is printed
            System.out.println();

        }

    }

}
```

### Explanation:

- **Class-level Javadoc (`Table` class)**: Describes the purpose of the class (generating a multiplication table from 1 to 10).
- **Method-level Javadoc (`main` method)**: Explains that the method generates the multiplication table using nested loops and prints it in a tabular format.
- **Inline comments**: Each part of the code is explained, including the outer and inner loops, the multiplication, and the formatting of the output.
