import java.io.*;

class ReaderWriter {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("Hello.txt");
            int c;
            while ((c = fr.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {

        }

    }
}