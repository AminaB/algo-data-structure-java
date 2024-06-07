package codingGame;

import java.util.Scanner;

public class shadowKnightE1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt(); // width of the building.
        int H = in.nextInt(); // height of the building.
        int N = in.nextInt(); // maximum number of turns before game over.
        int X = in.nextInt();
        int Y = in.nextInt();

        int l = 0,r=W,t=0,b=H;

        // game loop
        while (true) {
            String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)
            //System.out.println(bombDir);

            if(bombDir.equals( "U")){//ok
                l=X;
                r=X;
                b=Y-1;
                Y=(t+b)/2;
                X=(l+r)/2;
                System.out.println(X + " "+ Y);
            }  if(bombDir.equals( "UR")){ //ok


                b=Y-1;
                l=X+1;

                Y=(t+b)/2;
                X=(l+r)/2;
                //System.out.println("L:"+l+"R:"+r);
                System.out.println(X + " "+ Y);

            }  if(bombDir.equals( "R")){ //ok
                l=X+1;
                t=Y;
                b=Y;
                Y=(t+b)/2;
                X=(l+r)/2;
                System.out.println(X + " "+ Y);
            }  if(bombDir.equals( "DR")){ //ok
                t=Y+1;
                l=X+1;


                Y=(t+b)/2;
                X=(l+r)/2;
                System.out.println(X + " "+ Y);
            }  if(bombDir.equals(  "D")){
                l=X;
                r=X;
                t=Y+1;
                //b=H;
                Y=(t+b)/2;
                X=(l+r)/2;
                System.out.println(X + " "+ Y);

            }  if(bombDir.equals(  "L")){
                r=X;
                t=Y;
                b=Y;
                Y=(t+b)/2;
                X=(l+r)/2;
                System.out.println(X + " "+ Y);
            }  if(bombDir.equals(  "DL")){
                t=Y+1;
                r=X;
                Y=(t+b)/2;
                X=(l+r)/2;
                System.out.println(X + " "+ Y);


            }  if(bombDir.equals(  "UL")){
                b=Y-1;
                r=X;


                Y=(t+b)/2;
                X=(l+r)/2;
                System.out.println(X + " "+ Y);


            }

        }


        //Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");

/**
 *
 * Coding game solution
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.

        class Player {

            public static void main(String args[]) {
                Scanner in = new Scanner(System.in);
                int W = in.nextInt(); // width of the building.
                int H = in.nextInt(); // height of the building.
                int N = in.nextInt(); // maximum number of turns before game over.
                int X0 = in.nextInt();
                int Y0 = in.nextInt();


                int maximalXDistance=0;
                int maximalYDistance=0;

                int squareX0=-1;
                int squareX=W;
                int squareY0=-1;
                int squareY=H;

                // game loop
                while (true) {
                    String bombDir = in.next(); // the direction of the bombs from batman's current location
                    //(U, UR, R, DR, D, DL, L or UL)


                    switch (bombDir) {
                        case "U":
                            squareY=Y0;
                            maximalYDistance=squareY-squareY0;
                            Y0=Y0-(maximalYDistance/2);
                            break;
                        case "UR":
                            squareY=Y0;
                            maximalYDistance=squareY-squareY0;
                            Y0=Y0-(maximalYDistance/2);

                            squareX0=X0;
                            maximalXDistance=squareX-squareX0;
                            X0=X0+(maximalXDistance/2);
                            break;
                        case "UL":
                            squareY=Y0;
                            maximalYDistance=squareY-squareY0;
                            Y0=Y0-(maximalYDistance/2);

                            squareX=X0;
                            maximalXDistance=squareX-squareX0;
                            X0=X0-(maximalXDistance/2);
                            break;
                        case "D":
                            squareY0=Y0;
                            maximalYDistance=squareY-squareY0;
                            Y0=Y0+(maximalYDistance/2);
                            break;
                        case "DR":
                            squareY0=Y0;
                            maximalYDistance=squareY-squareY0;
                            Y0=Y0+(maximalYDistance/2);

                            squareX0=X0;
                            maximalXDistance=squareX-squareX0;
                            X0=X0+(maximalXDistance/2);
                            break;
                        case "DL":
                            squareY0=Y0;
                            maximalYDistance=squareY-squareY0;
                            Y0=Y0+(maximalYDistance/2);

                            squareX=X0;
                            maximalXDistance=squareX-squareX0;
                            X0=X0-(maximalXDistance/2);
                            break;
                        case "R":
                            squareX0=X0;
                            maximalXDistance=squareX-squareX0;
                            X0=X0+(maximalXDistance/2);
                            break;
                        case "L":
                            squareX=X0;
                            maximalXDistance=squareX-squareX0;
                            X0=X0-(maximalXDistance/2);
                            break;


                    }

                    // Write an action using System.out.println()
                    // To debug: System.err.println("Debug messages...");


                    // the location of the next window Batman should jump to.
                    System.out.println(X0+" "+ Y0);
                }
            }
        }
* */

        // the location of the next window Batman should jump to.
    }
}

