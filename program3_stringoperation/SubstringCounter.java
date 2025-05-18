/*Q2. Write a Java Program for Counting how many times a substring appears in a main string
using user defined function countOccurrences()*/
import java.util.Scanner;

public class SubstringCounter {

    // User-defined function to count occurrences of a substring
    public static int countOccurrences(String mainStr, String subStr) {
        if (mainStr == null || subStr == null || subStr.isEmpty()) {
            return 0;
        }

        int count = 0;
        int index = 0;

        // Loop to find substring repeatedly
        while ((index = mainStr.indexOf(subStr, index)) != -1) {
            count++;
            index += subStr.length(); // Move past the last match
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter the main string: ");
        String mainStr = sc.nextLine();

        System.out.print("Enter the substring to count: ");
        String subStr = sc.nextLine();

        // Count and display result
        int result = countOccurrences(mainStr, subStr);
        System.out.println("The substring '" + subStr + "' appears " + result + " times.");

        sc.close();
    }
}
