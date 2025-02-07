import Functions.IsAnagram;
import Functions.IsPalindrome;
import Functions.Reverse;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Reverse reverse = new Reverse();
        IsPalindrome palindrome = new IsPalindrome();
        IsAnagram anagram = new IsAnagram();

        reverse.reverseWords();
        palindrome.IsPalindrome();
        anagram.IsAnagram();
    }
}