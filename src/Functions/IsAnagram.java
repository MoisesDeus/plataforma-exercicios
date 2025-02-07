package Functions;

import java.util.Arrays;
import java.util.Scanner;

public class IsAnagram {
    //Separar as letras das palavras
    //Colocar em ordem alfábetica
    //Comparar se todas as letras são iguais
    Scanner scanner = new Scanner(System.in);

    public void IsAnagram() {
        System.out.println("Digite duas palavras para descobrir se é um anagrama: ");
        String word1 = scanner.nextLine().toUpperCase();
        String word2 = scanner.nextLine().toUpperCase();

        String[] word1Str = word1.split("");
        String[] word2Str = word2.split("");

        Arrays.sort(word1Str);
        Arrays.sort(word2Str);

        System.out.println(Arrays.toString(word1Str));
        System.out.println(Arrays.toString(word2Str));

        if (Arrays.equals(word1Str, word2Str)) {
            System.out.println("São anagramas");
        } else {
            System.out.println("Não são anagramas");
        }
    }
}
