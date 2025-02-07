package Functions;

import java.util.Scanner;

public class Reverse {

    Scanner scanner = new Scanner(System.in);

    public void reverseWords() {
        System.out.println("Digite uma palavra para inverter: ");
        String word = scanner.nextLine().toUpperCase();
        String wordInverted = "";

        for (int i = word.length()-1; i >= 0; i--) {
            wordInverted = wordInverted + word.charAt(i);
        }
        System.out.println("Palavra invertida com sucesso! " + wordInverted);
    }
}
