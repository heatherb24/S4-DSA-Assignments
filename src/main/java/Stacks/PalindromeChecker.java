package Stacks;

public class PalindromeChecker {

    public static boolean isPalindrome(String word) {
        int n = word.length();

        StringBuilder reverseWord = new StringBuilder();

        for (int i = n - 1; i >= 0; i--) {
            char currentChar = word.charAt(i);
            reverseWord.append(currentChar);
            System.out.println("Adding character '" + currentChar + "' to reverseWord: " + reverseWord.toString());
        }

        System.out.println("Reverse of the word '" + word + "' is: " + reverseWord.toString());

        boolean isPalindrome = word.equals(reverseWord.toString());
        if (isPalindrome) {
            System.out.println("'" + word + "' is a palindrome.");
        } else {
            System.out.println("'" + word + "' is not a palindrome.");
        }

        return isPalindrome;
    }

    public static void main(String[] args) {
        String word1 = "hello";
        String word2 = "racecar";
        String word3 = "cat";

        System.out.println("Checking if '" + word1 + "' is a palindrome:");
        System.out.println(isPalindrome(word1));
        System.out.println();

        System.out.println("Checking if '" + word2 + "' is a palindrome:");
        System.out.println(isPalindrome(word2));
        System.out.println();

        System.out.println("Checking if '" + word3 + "' is a palindrome:");
        System.out.println(isPalindrome(word3));
    }
}
