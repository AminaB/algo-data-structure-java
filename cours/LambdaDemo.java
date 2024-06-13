package cours;

@FunctionalInterface
interface MyLambda{
    public void display();
}
class My implements MyLambda{

    @Override
    public void display() {
        System.out.println("Hello World");
    }
}
public class LambdaDemo {
    public static void main(String[] args) {
        MyLambda m = () -> {
                System.out.println("Hello World");
            };
        m.display();

    }
}
