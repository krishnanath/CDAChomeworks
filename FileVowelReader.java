import java.io.*;

public class FileVowelReader {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("Hello.txt");
        int c;
        int vowel = 0;

        //
        while ((c = fr.read()) != -1) {
            System.out.print((char) c);

            for (int j = 0; j < fr.read(); ++j) {

                int ch = fr.read();

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    ++vowel;
                }

            }

        }
        // System.out.println("Vowels" + vowel);

        // for (int j = 0; j < s.length(); ++j) {
        // char ch = s.charAt(j);
        // if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        // ++vowel;
        // }

    }
}