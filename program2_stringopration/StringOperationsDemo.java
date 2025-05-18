/*2 a. Develop a java program for performing various string operations with different string
handling functions directed as follows
String Creation and Basic Operations, Length and Character Access, String Comparison, String
Searching, Substring Operations , String Modification, Whitespace Handling, String
Concatenation, String Splitting, StringBuilder Demo, String Formatting , Validate Email with
contains( ) and startsWith() and endsWith()*/
import java.util.Scanner;

public class StringOperationsDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = "World";
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("Length of str1: " + str1.length());
        System.out.println("Character at index 1 of str1: " + str1.charAt(1));

        // 3. String Comparison
        String str3 = "hello";
        System.out.println("str1 equals str3? " + str1.equals(str3));
        System.out.println("str1 equalsIgnoreCase str3? " + str1.equalsIgnoreCase(str3));

        // 4. String Searching
        System.out.println("Index of 'l' in str1: " + str1.indexOf('l'));
        System.out.println("Last index of 'l' in str1: " + str1.lastIndexOf('l'));
        System.out.println("str1 contains 'el'? " + str1.contains("el"));

        // 5. Substring Operations
        System.out.println("Substring of str1 from index 1 to 4: " + str1.substring(1, 4));

        // 6. String Modification
        String modified = str1.replace('l', 'x');
        System.out.println("After replace: " + modified);
        String upper = str1.toUpperCase();
        String lower = str2.toLowerCase();
        System.out.println("Upper case str1: " + upper);
        System.out.println("Lower case str2: " + lower);

        // 7. Whitespace Handling
        String strWithSpaces = "  Java Programming  ";
        System.out.println("Before trim: '" + strWithSpaces + "'");
        System.out.println("After trim: '" + strWithSpaces.trim() + "'");

        // 8. String Concatenation
        String combined = str1.concat(" ").concat(str2);
        System.out.println("Concatenated string: " + combined);

        // 9. String Splitting
        String csv = "apple,banana,grape";
        String[] fruits = csv.split(",");
        System.out.println("Splitted fruits:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Start");
        sb.append(" Middle");
        sb.append(" End");
        System.out.println("StringBuilder result: " + sb.toString());

        // 11. String Formatting
        String name = "Alice";
        int age = 22;
        System.out.println(String.format("Name: %s, Age: %d", name, age));

        // 12. Email Validation with contains(), startsWith(), endsWith()
        System.out.print("Enter email for validation: ");
        String email = sc.nextLine();
        if (email.contains("@") && email.endsWith(".com") && !email.startsWith("@")) {
            System.out.println("Valid Email");
        } else {
            System.out.println("Invalid Email");
        }

        sc.close();
    }
}
