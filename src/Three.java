import java.util.*;
public class Three {
    public static int sum(int x) {
        int s=0;
        for(int i=100; i<x; i++) {
            int y=i;
            int p=0;
            p=p+y%10;
            y=y/10;
            p=p+y%10+y/10;
            if(p%13==0) s++;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(sum(n));
    }
}