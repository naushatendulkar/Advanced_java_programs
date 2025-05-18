/*Q3. Write a Java Program for Reversing the characters in a string using user defined function
reverseString().*/
import java.util.Scanner;

public class StringReverser {

    // User-defined function to reverse a string
    public static String reverseString(String str) {
        if (str == null) {
            return null;
        }

        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter a string to reverse: ");
        String input = sc.nextLine();

        // Call function and display result
        String result = reverseString(input);
        System.out.println("Reversed string: " + result);

        sc.close();
    }
}
