package codingGame;

public class DiamondRing {
    public static void diamond(int n){
        if(n%2==0 || n <= 0){
            System.out.println("null");
        }
        else{
            for(int i=1; i<= n; i++){
                printLine(i,n);
            }
            for(int i=n-1; i>=0; i--){
                printLine(i,n);
            }
        }
    }

    private static void printLine(int i, int n) {
        if(i%2!=0){
            String line="*".repeat(i);
            if(line.length()< n){
                do{
                    line=" "+line+" ";
                }while (line.length()< n);
            }
            System.out.println(line);

        }
    }

    public static void main(String[] args) {
        diamond(15);
    }
}
