import Functions.ReadFile;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ReadFile readFile = new ReadFile();

        readFile.readFile("palavras.txt");
    }
}