import java.io.*;

class DemoFileList {
    public static void main(String[] args) throws IOException {

        File f = new File("/Users/krishnanath/Desktop/");

        if (f.isDirectory()) {
            String s[] = f.list();
            for (int i = 0; i < s.length; i++) {
                File f1 = new File(f, s[i]);
                if (f1.isDirectory()) {
                    System.out.println(s[i] + "is Directory");
                } else {
                    System.out.println(s[i] + "is File");
                }
            }
        }
    }
}