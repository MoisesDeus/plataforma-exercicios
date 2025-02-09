package Functions;

public class Reverse {
    private int reversedCount = 0;

    public String reverseWords(String word) {
        StringBuilder wordInverted = new StringBuilder();

        for (int i = word.length()-1; i >= 0; i--) {
            wordInverted.append(word.charAt(i));
        }
        reversedCount++;
        return wordInverted.toString();
    }

    public int getReversedCount() {
        return reversedCount;
    }
}
