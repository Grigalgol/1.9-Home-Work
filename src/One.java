import java.util.*;
public class One {
    public static int sum(int x) {
        return x%10+x/10;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = sum(n);
        System.out.println(a);
    }
}
