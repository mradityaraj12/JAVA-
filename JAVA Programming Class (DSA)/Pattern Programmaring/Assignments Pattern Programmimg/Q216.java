
/**
 * ! Enter n:  5 ?

2    
6    12
20   30   42
56   72   90   110
132  156  182  210  240

 */

import java.util.Scanner;

public class Q216 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        PrintPattern(n);
    }

    public static void PrintPattern(int n) {
        int star = 1;
        int num = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= star; j++) {
                System.out.printf("%-5d", num * (num + 1));
                num++;
            }

            star++;
            System.out.println();

        }

    }
}