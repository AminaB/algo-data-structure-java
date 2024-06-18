package cours.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fos= new FileOutputStream("./cours/stream/tewst.txt");
            String str ="learn java";
            fos.write(str.getBytes());
            fos.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            FileInputStream fis= new FileInputStream("./cours/stream/tewst.txt");
            //or  FileReader fis= new FileReader("./cours/stream/tewst.txt");
//            byte b[]=new byte[fis.available()];
//            fis.read(b);
//            String str=new String(b);
//            System.out.println(str);

            //or
            int x;
            while(  (x=fis.read())!=-1){
                System.out.print((char) x);
            };
            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
