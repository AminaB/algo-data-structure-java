package codingGame;

import java.util.Arrays;
import java.util.Scanner;

public class Mountain {


        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);

            // game loop
            while (true) {
                int[] mts=new int[8];
                int maxMts=0;
                int idex=0;

                for (int i = 0; i < 8; i++) {
                    int mountainH = in.nextInt(); // represents the height of one mountain.
                    mts[i]=mountainH;

                }
                for(int i = 0; i < 8; i++){
                    if(mts[i]>maxMts){
                        maxMts=mts[i];
                        idex=i;
                    }
                }
                System.err.println(Arrays.toString(mts));

                // Write an action using System.out.println()
                // To debug: System.err.println("Debug messages...");

                System.out.println(idex); // The index of the mountain to fire on.
            }
        }
    }

