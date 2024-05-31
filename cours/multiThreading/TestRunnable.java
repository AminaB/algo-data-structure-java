package cours.multiThreading;

public class TestRunnable implements Runnable{
    @Override
    public void run() {
        int i=0;
        while (i<10){
            System.out.println(i+ "hello");
            i++;
        }
    }

    public static void main(String[] args) {
        TestRunnable thI=new TestRunnable();
        Thread t=new Thread(thI);
        t.start();
        int i=1;
        while (i<10){
            System.out.println(i+ "world");
            i++;
        }
    }
}
