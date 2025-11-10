
/**
 * ! Enter n: 10 ? 

3    5    9    17   33   65   129  257  513  1025  

 */

import java.util.Scanner;

public class Q221 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        PrintPattern(n);
    }

    public static void PrintPattern(int n) {
        int num = 3;
        System.out.printf("%-5d", num);
        for (int i = 2; i <= n; i++) {
            num = num * 2 - 1;
            System.out.printf("%-5d", num);
        }
    }

}
