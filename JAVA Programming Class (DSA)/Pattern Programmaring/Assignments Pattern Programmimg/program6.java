
/**
 * ! Enter the number of row and columns: 9

* * * * * * * * * 
* * * * * * * * * 
* *           * * 
* *           * * 
* *           * * 
* *           * * 
* *           * * 
* * * * * * * * * 
* * * * * * * * * 

 */

import java.util.Scanner;

public class program6 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of row and columns:");
        int n = Sc.nextInt();
        getPrintPattern(n);

    }

    public static void getPrintPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || i == 2 || i == n - 1 || j == 1 || j == 2 || j == n || j == n - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

}
