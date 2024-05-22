//Write a program that prints the temperature closest to 0 among input data.
// If two numbers are equally close to zero,
// positive integer has to be considered closest to zero (for instance, if the temperatures are -5 and 5, then display 5).


public class ClosestToZero {

    public static int closest(int[] input){
        int closest=input[0];
        for (int t : input) {
            if (Math.abs(t) < Math.abs(closest)) {
                closest = t;
            } else if (Math.abs(t) == Math.abs(closest)) {
                closest = t < closest ? closest : t;
            }
        }

        return closest;
    }

    public static void main(String[] args) {
        int [] test={1 ,-2, -8, 4, 5};
        System.out.println(closest(test));
    }
}
