package Functions;

import java.io.*;

public class ReadFile {
    Reverse reverse = new Reverse();
    Palindrome palindrome = new Palindrome();
    Anagram anagram = new Anagram();

    public void readFile(String wordsFile) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(wordsFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (!line.isEmpty() && !line.startsWith("#")) {
                    // Passa a palavra para todas as funções responsáveis
                    reverse.reverseWords(line);
                    palindrome.IsPalindrome(line);
                    anagram.addWord(line);
                }
            }

            // Depois de ler todas as palavras, verificamos os anagramas
            anagram.checkAnagrams();

            // Exibir resultados finais
            System.out.println("\nTotal de palavras revertidas: " + reverse.getReversedCount());
            System.out.println("Total de palíndromos encontrados: " + palindrome.getPalindromeCount());
            System.out.println("Total de anagramas encontrados: " + anagram.getAnagramCount());

        } catch (IOException e) {
            System.out.println("Erro ao ler arquivo: " + e.getMessage());
        }
    }
}