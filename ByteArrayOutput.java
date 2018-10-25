import java.io.*;

public class ByteArrayOutput {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream f = new ByteArrayOutputStream();
        String s = "This should end up the array";
        byte buff[] = s.getBytes();
        try {
            f.write(buff);

        } catch (IOException e) {
        }
        FileOutputStream fos = new FileOutputStream("Hello.txt");
        f.writeTo(fos);

    }
}