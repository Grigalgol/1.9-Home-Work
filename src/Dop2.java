import java.util.*;
public class Dop2 {
    public static int min (int a, int b, int c, int d) {
        int minn= Math.min(a, b);
        minn = Math.min(c, minn);
        minn = Math.min(d, minn);
        return minn;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a1=in.nextInt(), b1=in.nextInt(), c1=in.nextInt(), d1=in.nextInt();
        System.out.println(min(a1,b1,c1,d1));
    }
}