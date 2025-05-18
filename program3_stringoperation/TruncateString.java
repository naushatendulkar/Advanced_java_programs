/*Q7. Write a Java Program for Shortening a string to a specified length and adds an ellipsis using user
defined function truncate()*/
import java.util.Scanner;

public class TruncateString {

    // Function to truncate and add "..."
    public static String truncate(String str, int maxLength) {
        if (str == null || maxLength < 0) return "";
        return str.length() <= maxLength ? str : str.substring(0, maxLength) + "...";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = sc.nextLine();
        System.out.print("Enter max length: ");
        int length = sc.nextInt();

        System.out.println("Truncated: " + truncate(input, length));
        sc.close();
    }
}
