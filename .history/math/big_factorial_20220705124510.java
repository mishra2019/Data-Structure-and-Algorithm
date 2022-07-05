import java.util.*;

public class big_factorial {
    static void multiply(int[] a, int n, int no) {
        int carry = 0;
        for (int i = 0; i < n; i++) {
            int product = a[i] * no + carry;
            a[i] = product % 10;
            carry = product / 10;
        }
        while (carry > 0) {
            a[n++] = carry % 10;
            carry /= 10;
        }
    }

    static void bigFactorial(int number) {
        int[] a = new int[10001];
        a[0] = 1;
        int n = 1;
        for (int i = 2; i <= number; i++) {
            multiply(a, n, i);
        }
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(a[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        bigFactorial(n);

    }
}