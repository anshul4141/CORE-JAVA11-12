```java
package com.rays.basic;

/**
 * The {@code ReverseNo} class demonstrates how to reverse an integer number
 * using a while loop. It extracts the digits of the number and constructs the
 * reversed number step by step.
 */
public class ReverseNo {

    /**
     * The main method is the entry point of the program. It initializes an integer
     * number and reverses it by extracting its digits using a while loop.
     * 
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {

        int no = 123;    // The number to be reversed
        int r = 0;       // Variable to hold the remainder (last digit)
        int rno = 0;     // Variable to hold the reversed number
        int temp = no;   // Temporary variable for manipulation

        // While loop to reverse the number
        while (temp != 0) {
            // Extract the last digit of temp
            r = temp % 10;
            // Append the last digit to the reversed number
            rno = (rno * 10) + r;
            // Remove the last digit from temp
            temp = temp / 10;
        }

        // Print the reversed number
        System.out.println(rno);

    }

}
```

### Explanation:

- **Class-level Javadoc (`ReverseNo` class)**: Describes the purpose of the class (reversing an integer number).
- **Method-level Javadoc (`main` method)**: Explains the initialization of the number and the logic for reversing it using a while loop.
- **Inline comments**: Provides detailed explanations of each step, including how the last digit is extracted, how the reversed number is built, and how the temporary variable is updated.
