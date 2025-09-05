import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int sum = getFibonacci(n);
        System.out.println(sum);
    }

    public static int getFibonacci(int n) {
        if (n == 0 || n == 1)
            return n;
        int n1 = 0;
        int n2 = 1;
        int i = 1;
        while (i <= n) {
            n2 = n1 + n2;
            n1 = n2 - n1;

            i++;
        }
        return n1;
    }

}
