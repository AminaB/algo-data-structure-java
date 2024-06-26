package cours.multiThreading;

public class SychonisationThread {
    public static void main(String[] args) {
        MyData d= new MyData();
        MyThread1 t1= new MyThread1(d);
        MyThread2 t2= new MyThread2(d);
        t1.start();
        t2.start();
    }
}

class MyData{
    synchronized public void display(String str){
       // synchronized(this) {
            for (int i = 0; i < str.length(); i++) {
                System.out.println(str.charAt(i));
               // try{
                  //  Thread.sleep(100);
              //  }catch (Exception ignored){}
            }
       // }
    }
}

class MyThread1 extends Thread{
    MyData d;
    public MyThread1(MyData data){
        this.d=data;
    }
    @Override
    public void run(){
        d.display("Hello World");
    }

}
class MyThread2 extends Thread{
    MyData d;
    public MyThread2(MyData data){
        this.d=data;
    }
    @Override
    public void run(){
        d.display("Welcome");
    }

}
