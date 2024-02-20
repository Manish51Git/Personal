
import java.util.Scanner;

public class BallBounce {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        int height = 0, noBounces = 0, fivePer = 0;
        fivePer = height /100 * 5;
        System.out.print("\n\tEnter the height in feet that the ball will be dropped from: ");
        height = key.nextInt();
        do {
            System.out.print("\n\tIt took  " + (height - fivePer));
            fivePer--;
        } while (height > 0);

        /*---------------*/
//     //   float height = key.nextInt();
//        int nBounces = 0;
//        while(height > 10){
//            height *= 95 / 100; //decrease the height by 5%
//            nBounces++; //add a bounce
//        }
//        System.out.print("\n\tIt took  " + nBounces);
    }
    
}