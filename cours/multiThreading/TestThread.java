package cours.multiThreading;

public class TestThread extends Thread {

    @Override
    public void run(){
        int i=1;
        while (i<10){
            System.out.println(i+ "hello");
            i++;
        }

    }

    public static void main(String[] args) {
        TestThread th=new TestThread();
        th.start();
        int i=1;
        while (i<10){
            System.out.println(i+ "world");
            i++;
        }
    }
}
