import java.util.*;
public class Four {
    public static void sum(double x1, int n1) {
        for(int i=0; i<n1; i++) {
            x1 *= 2;
            System.out.print((int) x1);
            x1 %= 1;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        double x=in.nextDouble();
        int n=in.nextInt();
        sum(x,n);
    }
}