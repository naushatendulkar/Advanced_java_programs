
/*Q8. Write a Java Program for Verifying if a string contains only numeric characters using user defined
function isNumeric()*/
import java.util.Scanner;

public class NumericCheck {

    // Function to check numeric string
    public static boolean isNumeric(String str) {
        return str != null && str.matches("\\d+");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        if (isNumeric(input)) {
            System.out.println("The string contains only numeric characters.");
        } else {
            System.out.println("The string is not numeric.");
        }

        sc.close();
    }
}
