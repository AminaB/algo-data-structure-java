package cours.multiThreading;

public class ThreadsCommunication {
    public static void main(String[] args) {
        MyData2 data=new MyData2();
        Producer p= new Producer(data);
        Consumer c= new Consumer(data);
        p.start();
        c.start();

    }
}
class Producer extends Thread{
    MyData2 d;
    Producer(MyData2 data){
        this.d=data;

    }
    @Override
    public void run(){
        int i=1;
        while (true){
            try {
                d.set(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("producer " +i);
            i++;
        }
    }
}
class Consumer extends Thread{
    MyData2 d;
    Consumer(MyData2 data){
        this.d=data;

    }
    @Override
    public void run(){
        while (true){
            try {
                System.out.println("consumer "+ d.get());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class MyData2{
    int value=1;
    boolean flag= true; // true mean producer turn , and false mean consumer turn
    synchronized void set(int v) throws InterruptedException {
        while(!flag)
            wait();
        value=v;
        flag=false;
        notify(); // use notifyAll() to notify all if there is many thread

        value= v;
    }
    synchronized int get() throws InterruptedException {
        int x=0;
        while(flag) {
            wait();
        }
        x=value;
        flag=true;
        notify();
        return x;
    }
}