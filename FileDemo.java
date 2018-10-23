import java.io.*;
class FileDemo{
    public static void main (String [] args){
        File f1 = new File("Hello.txt");
        System.out.println("Filename:" + f1.getName());
        System.out.println("Absolute Path"+ f1.getAbsolutePath());
        System.out.println("Last Modified"+ f1.lastModified());
        System.out.println("Length in Bytes"+f1.length());
        


    }
    
}