// Java Program to Convert Binary Code
// Into Equivalent Gray Code Using Recursion
import java.io.*;
class BinarytoGray {

    // Function to change Binary Code
    // to Gray using Recursion
    public static int binaryToGray(int n)
    {
        if (n == 0) {
            return 0;
        }
        // Extracting the last digit
        int a = n % 10;
        // Extracting the second last digit
        int b = (n / 10) % 10;
        // Else If last two digits
        // are opposite bits to each other
        if ((a & ~b) == 1 || (~a & b) == 1) {
            return (1 + 10 * binaryToGray(n / 10));
        }
        // Else If the last
        // two bits are same
        return (10 * binaryToGray(n / 10));
    }
    // Driver's Function
    public static void main(String[] args)
    {
        int binaryNumber = 11010001;
        int result = binaryToGray(binaryNumber);
        System.out.println("Gray Code is " + result);
    }
}
