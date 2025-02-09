package Functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {
    private final List<String> wordsList = new ArrayList<>();
    private int anagramCount = 0;

    public void addWord(String word) {
        wordsList.add(word.toUpperCase()); // Armazena palavras em maiúsculas para padronizar
    }

    public void checkAnagrams() {
        System.out.println("\n### Verificando anagramas ###");

        for (int i = 0; i < wordsList.size(); i++) {
            for (int j = i + 1; j < wordsList.size(); j++) {
                if (isAnagram(wordsList.get(i), wordsList.get(j))) {
                    System.out.println(">> '" + wordsList.get(i) + "' é um anagrama de '" + wordsList.get(j) + "'");
                    anagramCount++;
                }
            }
        }

        System.out.println("Total de anagramas encontrados: " + anagramCount);
    }

    private boolean isAnagram(String word1, String word2) {
        if (word1.equalsIgnoreCase(word2)) return false; // Ignora palavras idênticas

        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public int getAnagramCount() {
        return anagramCount;
    }
}