package cours.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fos= new FileOutputStream("./cours/stream/tewst.txt");
            String str ="lear java";
            fos.write(str.getBytes());
            fos.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
