package com.Ryan;

/*
    This program tests if a string is a palindrome
*/
public class PalindromeChecker
{
    public static void main(String[] args)
    {
        // Declare word1
        String word1 = "radar";

        // Test if Palindrome and print out true or false
        if(testPalindrome(word1))
            System.out.println("True");
        else
            System.out.println("False");

        // Declare word2
        String word2 = "able was i ere i saw elba";

        // Test if palindrome and print out true or false
        if (testPalindrome(word2))
            System.out.println("True");
        else
            System.out.println("False");
    }

    // Test if string is palindrome
    public static boolean testPalindrome(String letters)
    {
        // Base case
        if (letters.length() == 0 || letters.length() == 1)
            return true;

        // Convert String to array
        char[] word = letters.toCharArray();

        // If first element equals last element, call function on substring
        if (word[0] == word[word.length - 1])
            return testPalindrome(letters.substring(1, letters.length() - 1));
        return false;
    }
}

