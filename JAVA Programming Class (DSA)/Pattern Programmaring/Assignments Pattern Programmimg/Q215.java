
/**
 * ! Enter n: 8 ? 

2    6    12   20   30   42   56   72 ...... 

 */

import java.util.Scanner;

public class Q215 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        PrintPattern(n);
    }

    public static void PrintPattern(int n) {
        for (int i = 1; i <= n; i++)
            System.out.printf("%-5d", i * (i + 1));
    }
}
