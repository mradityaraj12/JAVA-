
/**
 * Enter the number of rows and columns:
5
1 1 1 1 1 
0 0 0 0 0 
1 1 1 1 1 
0 0 0 0 0 
1 1 1 1 1 

 */

import java.util.Scanner;

public class program2 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:");
        int n = Sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i % 2 + " ");
            }

            System.out.println();
        }
    }

}
