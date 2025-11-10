
/**
 * ! Enter n:  10 

2    5    11   23   47   95   191  383  767  1535 

 */

import java.util.Scanner;

public class Q220 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        PrintPattern(n);
    }

    public static void PrintPattern(int n) {
        int num = 2;
        System.out.printf("%-5d", num);
        for (int i = 2; i <= n; i++) {
            num = num * 2 + 1;
            System.out.printf("%-5d", num);
        }
    }

}
