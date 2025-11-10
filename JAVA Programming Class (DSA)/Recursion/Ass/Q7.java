import java.util.*;

public class Q7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Main Methods Starts:");
        System.out.println("Enter The Number Is :");
        int n = sc.nextInt();
        if (n >= 0) {
            int fact = getFactroial(n);
            System.out.println(n + "! = " + fact);

        } else {
            System.out.println("Factorial is Not Possible For -ve Number ");
        }

    }

    public static int getFactroial(int n) {
        // int i = 1;
        if (1 < n)
            return n * getFactroial(n - 1);
        else
            return n;

    }

}
