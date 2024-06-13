package cours;

@MyAnno(name = "Ami")
public class Annotation {
    @MyAnno(name = "Ami")
    int data;

    @MyAnno(name = "Ami")
    public static void main(String[] args) {

    }
}
@interface MyAnno
{
    String name();
    String version() default "13";
}
