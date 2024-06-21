package cours.stream;

import java.io.*;

public class PipedDemo {
    public static void main(String[] args) throws IOException {
        PipedInputStream pis=new PipedInputStream();
        PipedOutputStream pos=new PipedOutputStream();

        pos.connect(pis);

        Producer p = new Producer(pos);
        Consumer c = new Consumer(pis);

        p.start();
        c.start();
    }
}
class Producer extends Thread{
    OutputStream os;
    public Producer(OutputStream o){
        os=o;
    }
    @Override
    public void run(){
        int count=1;
        while(true){
            try {
                os.write(count);
                os.flush();

                System.out.println("Producer"+count);
                System.out.flush();
                Thread.sleep(10);
                count++;
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class Consumer extends Thread{
    InputStream is;
    public Consumer(InputStream i){
        is=i;
    }
    @Override
    public void run(){
        while(true){
            try {
                System.out.println("Consumer"+ is.read());
                System.out.flush();
                Thread.sleep(10);
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}