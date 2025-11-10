
/** 
 * ! Enter n: 9 ? 

0 0 1 1 2 4 7 13 24 44  

 */

import java.util.Scanner;

public class Q225 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        PrintPattern(n);
    }

    public static void PrintPattern(int n) {
        int n1 = 0;
        int n2 = 0;
        int n3 = 1;

        System.out.print(n1 + " " + n2 + " " + n3 + " ");
        for (int i = 3; i <= n; i++) {
            int n4 = n1 + n2 + n3;
            n1 = n2;
            n2 = n3;
            n3 = n4;
            System.out.printf(n4 + " ");
        }
    }

}
