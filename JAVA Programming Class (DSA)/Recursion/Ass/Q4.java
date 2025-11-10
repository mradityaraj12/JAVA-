import java.util.*;

public class Q4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Main Methods Starts:");
        System.out.println("Enter The Number Is :");
        int n = sc.nextInt();
        int sum = getSum(n);
        System.out.println("Sum Of " + n + "Number is: " + sum);

    }

    public static int getSum(int n) {
        // int i = 1;
        if (1 <= n)
            return n + getSum(n - 1);
        else
            return n;

    }

}
