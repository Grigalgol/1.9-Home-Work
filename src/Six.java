import java.util.Scanner;

public class Six {
    public static void sum(int[] arr) {
        int min = arr[0], imin = 0;
        int io, it;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                imin = i;
                min = arr[i];
            }
        }
        it = imin;
        io = it - 1;
        while (io >= 0) {
            arr[it--] = arr[io--];
        }
        arr[0] = min;
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int i;
        for (i = 0; i < a.length; i++)
            a[i] = in.nextInt();
        sum(a);
    }
}
