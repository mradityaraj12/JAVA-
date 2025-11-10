import java.util.*;

public class Q8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Main Methods Starts:");
        System.out.println("Enter The Number a :");
        int a = sc.nextInt();
        System.out.println("Enter The Number b :");
        int b = sc.nextInt();
        int power = getPower(a, b);
        System.out.println(a + "  to Power " + b + " is " + power);

    }

    public static int getPower(int a, int b) {
        // int i = 1;
        if (1 < b)
            return a * getPower(a, --b);
        else
            return a;

    }

}
