import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter The Number :");
        int n = sc.nextInt();

        int sum = getCountSum(n);
        System.out.println("Total Digit in:" + n + "is:" + sum);

    }

    public static int getCountSum(int n) {
        if (n == 0) {
            return 0;
        } else {
            return (n % 10) + getCountSum(n / 10);

        }

    }
}