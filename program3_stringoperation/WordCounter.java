/*Q10. Write a Java Program for Counting the number of words in a string using user defined function
countWords()*/
import java.util.Scanner;

public class WordCounter {

    // Function to count words
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) return 0;
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        System.out.println("Number of words: " + countWords(input));
        sc.close();
    }
}
