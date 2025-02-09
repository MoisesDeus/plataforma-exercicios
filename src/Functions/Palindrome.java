package Functions;

public class Palindrome {
    private int palindromeCount = 0;

    public Boolean IsPalindrome(String word) {
        StringBuilder wordInverted = new StringBuilder(word);

        for (int i = word.length()-1; i >= 0; i--) {
            wordInverted.append(word.charAt(i));
        }
        if (wordInverted.toString().equals(word)) {
            palindromeCount++;
            return true;
        }
        return false;
    }

    public int getPalindromeCount() {
        return palindromeCount;
    }
}
