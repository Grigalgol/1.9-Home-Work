import java.util.*;
public class Two {
    public static int sum(int x) {
        for(int i=14; i<100; i+=7) {
            int p = i % 10 + i / 10;
            x += p;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = sum(0);
        System.out.println(a);
    }
}