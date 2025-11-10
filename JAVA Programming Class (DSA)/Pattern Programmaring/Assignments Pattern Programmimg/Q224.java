
/**
 * ! Enter n: 7 ? 

0 1 1 2 3 5 8 13 21  

 */

import java.util.*;

public class Q224 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        PrintPattern(n);
    }

    public static void PrintPattern(int n) {
        int n1 = 0;
        int n2 = 1;

        System.out.print(n1 + " " + n2 + " ");
        for (int i = 1; i <= n; i++) {
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.printf(n3 + " ");
        }
    }

}
