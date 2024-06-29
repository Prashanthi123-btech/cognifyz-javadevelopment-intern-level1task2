import java.util.*;

public class PalindromeChecker {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word or phrase: ");
        String input = scanner.nextLine();
        scanner.close();
        
        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a palindrome!");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
    }
    
    public static boolean isPalindrome(String s) {
        // Remove spaces and punctuation, convert to lowercase
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z]", ""); // Remove non-alphabetic characters
        
        // Check if the string equals its reverse
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}
