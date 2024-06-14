package cours;

@FunctionalInterface
interface MyLambda{
    public int add(int x, int y);
}
interface MyLambda2{
    public void display(String s);
}
public class LambdaDemo {
    public static void callLambda(MyLambda2 ml2){
        ml2.display("hello");
    }
    public static void method1(){
        MyLambda2 m2= (s)-> {
            int count=0;
            System.out.println(s);
            System.out.println("Bye "+count++);

        };
        m2.display("hi1");
        callLambda((s)-> {System.out.println(s);});
        callLambda(m2);
    }
    public static void reverse(String str){
        StringBuffer sb= new StringBuffer(str);
        sb.reverse();
        System.err.println(sb);
    }
    public static void main(String[] args) {
        MyLambda m = (x,y) -> x+y;
        System.out.println(m.add(1,8));
        method1();

        // references
        MyLambda2 myLambda2=System.out::println;
        myLambda2.display("hi from reference");

        MyLambda m3 = Integer::sum;
        System.out.println("add from ref "+m3.add(1,8));

        MyLambda2 m4=LambdaDemo::reverse;;
        m4.display("Hello");

        //constructeur as ref
        MyLambda2 m5= LambdaDemo2::new;
    }
}
 class LambdaDemo2 {
    public LambdaDemo2(String s){
        System.out.println(s.toUpperCase());
    }
    public void tesPrint(String s){
        System.out.println(s);
    }

}