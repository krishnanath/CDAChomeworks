import java.io.*;

public class DataInputStream {
    public static void main(String[] args) throws IOException {
        DataOutputStream dout = new DataOutputStream(new FileOutputStream("Hello.txt"));
        dout.writeDouble(98.6);
        dout.writeInt(1000);
        dout.writeBoolean(true);
        DataInputStream din = new DataInputStream(new FileInputStream("Hello.txt"));
        double d = din.readDouble();
        int i = din.readInt();
        boolean b = din.readBoolean();

    }
}