package codingGame;

import java.util.Scanner;

public class Thor {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");

            if(lightX==initialTx){
                if(lightY>initialTy){
                    initialTy++;
                    System.out.println("S");
                }
                else if(lightY< initialTy){
                    initialTy--;
                    System.out.println("N");
                }
            }

            else if(lightY==initialTy){
                if(lightX>initialTx){
                    initialTx ++;
                    System.out.println("E");
                }
                else if(lightX< initialTx){
                    initialTx--;
                    System.out.println("W");
                }
            }
            else if(lightX>initialTx){
                initialTx++;
                if(lightY>initialTy){

                    initialTy++;
                    System.out.println("SE");
                }
                else if(lightY< initialTy){
                    initialTy--;
                    System.out.println("NE");
                }
            }
            else if(lightX< initialTx){
                initialTx--;
                if(lightY>initialTy){
                    initialTy++;
                    System.out.println("SW");
                }
                else if(lightY< initialTy){
                    initialTy--;
                    System.out.println("NW");
                }

            }
            // A single line providing the move to be made: N NE E SE S SW W or NW
        }
    }

}


//coding game solution
///**
// * Auto-generated code below aims at helping you parse
// * the standard input according to the problem statement.
// * ---
// * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
// **/
//class Player {
//
//    public static void main(String args[]) {
//        Scanner in = new Scanner(System.in);
//        int lightX = in.nextInt(); // the X position of the light of power
//        int lightY = in.nextInt(); // the Y position of the light of power
//        int thorX = in.nextInt(); // Thor's starting X position
//        int thorY = in.nextInt(); // Thor's starting Y position
//
//        // game loop
//        while (true) {
//            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.
//
//            if (thorY < lightY) {
//                System.out.print('S');
//                thorY++;
//            } else if (thorY > lightY) {
//                System.out.print('N');
//                thorY--;
//            }
//
//            if (thorX < lightX) {
//                System.out.print('E');
//                thorX++;
//            } else if (thorX > lightX) {
//                System.out.print('W');
//                thorX--;
//            }
//
//            System.out.println();
//        }
//    }
//}