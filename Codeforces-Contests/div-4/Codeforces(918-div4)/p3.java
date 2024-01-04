/**
 * Calin has n buckets, the i-th of which contains ai wooden squares of side length 1.
 * Can Calin build a square using all the given squares? 
 */
import java.util.*;
public class p3 {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int t = in.nextInt();
        while (t-- > 0) {
            long sum = 0;
            int n = in.nextInt();
            /**
             * we are given n buckets each contains a square of 1x1 we have to find can we build a big square
             * using all these squares.
             * so we will sum up all the squares and check if it is perfect square or not for ex 
             * if sum = 16 we can make square of 4x4 like this
             */ 
            
            for (int i = 0; i < n; i++) {
                sum += in.nextInt();
            }

            long val = (long) Math.sqrt(sum);
            System.out.println(val * val == sum ? "YES" : "NO");
        }
    }

}