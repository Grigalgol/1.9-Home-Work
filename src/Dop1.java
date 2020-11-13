import java.util.*;
public class Dop1 {
    public static double s (int x, int y, int a, int b) {
        return Math.sqrt(Math.pow((a-x),2)+Math.pow((b-y),2));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt(), y1 = in.nextInt(), x2 = in.nextInt(), y2 = in.nextInt(), x3 = in.nextInt(), y3 = in.nextInt();
        double per = s(x1,y1,x2,y2)+s(x2,y2,x3,y3)+s(x3,y3,x1,y1);
        System.out.printf("%.10f", per);
    }
}
