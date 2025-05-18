/*Q5. Write a Java Program for Eliminating all whitespace characters from a string using user defined
function removeWhitespace()*/
import java.util.Scanner;

public class RemoveWhitespace {

    // User-defined function to remove all whitespace characters
    public static String removeWhitespace(String str) {
        if (str == null) return null;
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string with spaces: ");
        String input = sc.nextLine();

        String noSpaces = removeWhitespace(input);
        System.out.println("String without whitespace: " + noSpaces);

        sc.close();
    }
}
