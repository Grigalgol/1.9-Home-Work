import java.util.*;
public class FIve {
    public static void sum(int[] b) {
        int k=0;
        double s=0;
        for(int q=0; q<b.length; q++) {
            if (b[q]>=1000 && b[q]<=9999) {
                s+=b[q];
                k++;
            }
        }
        if(k!=0) {
            s=s/k;
            System.out.format("%.2f",s );
        }
        else {
            s=-1; System.out.format("%.2f",s );
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);
        int n=in.nextInt();
        int a[] = new int [n];
        int i;
        for(i=0; i<a.length; i++)
            a[i] = in.nextInt();
        sum(a);
    }
}
