package mypractice.basicprogramming;

public class PalindromeTest {

    public static void main(String[] args) {
        String palindromTest = "huh";

        boolean isPalindrome = false;
        int size = palindromTest.length();
        palindromTest=palindromTest.toUpperCase();
        //System.out.print(palindromTest.charAt(1));
        for (int i = 0; i <= size - 1; i++) {
            if (palindromTest.charAt(i) != palindromTest.charAt(size - (1 + i))) {
                isPalindrome = false;
                break;
            } else {
                isPalindrome = true;
            }
        }

        System.out.println("The word is a palindrome: " + isPalindrome);
    }
}
