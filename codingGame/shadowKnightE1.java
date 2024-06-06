package codingGame;

import java.util.Scanner;

public class shadowKnightE1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt(); // width of the building.
        int H = in.nextInt(); // height of the building.
        int N = in.nextInt(); // maximum number of turns before game over.
        int X0 = in.nextInt();
        int Y0 = in.nextInt();
        int X=X0;
        int Y=Y0;


        // game loop
        while (true) {
            String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)
            //System.out.println(bombDir);
            int l,r,t,b=0;

            if(bombDir== "U"){//ok
                l=X;
                r=X;
                t=0;
                b=Y-1;

                Y=(t+b)/2;
                X=(l+r)/2;
            }  if(bombDir== "UR"){ //ok
                l=Y+1;
                r=W;
                t=0;
                b=Y-1;

                Y=(t+b)/2;
                X=(l+r)/2;

            }  if(bombDir== "R"){ //ok
                l=X+1;
                r=W;
                t=Y;
                b=Y;

                Y=(t+b)/2;
                X=(l+r)/2;
            }  if(bombDir== "DR"){ //ok
                //System.out.println("here");
                System.out.println("W:"+W+",H:"+H+",X:"+X+"Y:"+Y);
                l=X+1;
                r=W;
                t=Y+1;
                b=H;

                Y=(t+b)/2;
                X=(l+r)/2;
            }  if(bombDir==  "D"){
                l=X;
                r=X;
                t=Y+1;
                b=H;

                Y=(t+b)/2;
                X=(l+r)/2;

            }  if(bombDir==  "L"){
                l=0;
                r=X-1;
                t=Y;
                b=Y;
                Y=(t+b)/2;
                X=(l+r)/2;
            }  if(bombDir==  "DL"){
                l=0;
                r=X-1;
                t=Y+1;
                b=H;

                Y=(t+b)/2;
                X=(l+r)/2;
                Y=(t+b)/2;
                X=(l+r)/2;

            }  if(bombDir==  "UL"){
                l=0;
                r=X-1;
                t=0;
                b=Y-1;

                Y=(t+b)/2;
                X=(l+r)/2;

            }
            System.out.println(X + " "+ Y);

        }


        //Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");


        // the location of the next window Batman should jump to.
    }
}

