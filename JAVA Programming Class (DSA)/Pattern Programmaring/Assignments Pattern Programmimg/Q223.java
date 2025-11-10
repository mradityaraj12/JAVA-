
/**
 * ! Enter n: 6 ? 

1    2    6    7    21   22   66 

 */

import java.util.Scanner;

public class Q223 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        PrintPattern(n);
    }

    public static void PrintPattern(int n) {
        int num = 1;
        System.out.printf("%-5d", num);
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                num = num * 3;
            else
                num = num + 1;
            System.out.printf("%-5d", num);
        }
    }

}
