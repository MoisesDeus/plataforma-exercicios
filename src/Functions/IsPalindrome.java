package Functions;

import java.util.Scanner;

public class IsPalindrome {
    Scanner scanner = new Scanner(System.in);

    public void IsPalindrome() {
        System.out.println("Digite uma palavra para descobir se é um palíndromo: ");
        String word = scanner.nextLine().toUpperCase();
        String wordInverted = "";

        for (int i = word.length()-1; i >= 0; i--) {
            wordInverted = wordInverted + word.charAt(i);
        }
        if (wordInverted.equals(word)) {
            System.out.println("A palavra " + wordInverted + " é um palíndromo!");
        } else {
            System.out.println("A palavra " + word + " não é um palíndromo");
        }
    }
}
