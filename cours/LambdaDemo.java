package cours;

@FunctionalInterface
interface MyLambda{
    public int add(int x, int y);
}
interface MyLambda2{
    public void display();
}
public class LambdaDemo {
    public static void callLambda(MyLambda2 ml2){
        ml2.display();
    }
    public static void method1(){
        MyLambda2 m2= ()-> {
            int count=0;
            System.out.println("hello");
            System.out.println("Bye "+count++);

        };
        m2.display();
        callLambda(()-> {System.out.println("hello");});
        callLambda(m2);
    }

    public static void main(String[] args) {
        MyLambda m = (x,y) -> x+y;
        System.out.println(m.add(1,8));

        method1();

    }
}
