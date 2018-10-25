import java.io.*;

class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {

        FileInputStream f = new FileInputStream("Hello.txt");
        System.out.println("Total avilable bytes" + f.available());
        int n = f.available();
        for (int i = 0; i < n; i++) {
            System.out.print((char) f.read());

        }

        FileOutputStream fo = new FileOutputStream("Hello.txt");
        String s = "A Sky full of Stars ";
        byte[] hello = s.getBytes();
        fo.write(hello);
        // for (int j = 0; j < hello.length; j += 2) {
        // fo.write(hello[j]);
        // }

    }
}
