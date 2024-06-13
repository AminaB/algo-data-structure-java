package cours;

@FunctionalInterface
interface MyLambda{
    public int add(int x, int y);
}

public class LambdaDemo {
    public static void main(String[] args) {
        MyLambda m = (x,y) -> {
               return x+y;
            };
        System.out.println(m.add(1,8));

    }
}
