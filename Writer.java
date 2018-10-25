import java.io.*;

public class Writer {
    public static void main(String[] args) {

        try {
            String source = "If len is zero, then no bytes are read and 0 is returned; otherwise, there is an attempt to read at least one byte. If no byte is available because the stream is at end of file, the value -1 is returned; otherwise, at least one byte is read and stored into b.";
            char cbuf[] = new char[source.length()];
            source.getChar(0, source.length(), cbuf, 0);
            FileWriter fw = new FileWriter("Hello.txt");
            for (int i = 0; i < cbuf.length; i += 2) {
                fw.write(cbuf[i]);

            }
            FileWriter f1 = new FileWriter("Hello.txt");
            f1.write(cbuf);
        } catch (IOException e) {

        }
    }
}