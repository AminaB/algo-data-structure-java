package cours.stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("./cours/stream/test.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.mark(10);
        System.out.print((char)bis.read());
        bis.reset(); // go back to mark read agin
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());

        fis.close();
        bis.close();
    }
}
