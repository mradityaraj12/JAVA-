import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number Is:");
        int n = sc.nextInt();

        int rev = Reverse(n, 0);
        System.out.println("Reverse of " + n + " is " + rev);
    }

    public static int Reverse(int n, int rev) {
        if (n == 0) {
            return rev;
        } else {
            rev = rev * 10 + n % 10;
            return Reverse(n / 10, rev);
        }
    }
}
