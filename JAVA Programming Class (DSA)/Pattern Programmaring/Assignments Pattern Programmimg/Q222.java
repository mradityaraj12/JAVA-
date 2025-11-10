
/**
 * ! Enter n: 4 ? 

1    2    5    26   677   

 */

import java.util.Scanner;

public class Q222 {

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
            num = num * num + 1;
            System.out.printf("%-5d", num);
        }
    }

}
