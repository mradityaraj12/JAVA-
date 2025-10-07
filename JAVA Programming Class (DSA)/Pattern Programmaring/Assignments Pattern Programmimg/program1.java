
/**
 * Enter the number of rows and columns:
5
1 1 1 1 1 
2 2 2 2 2 
3 3 3 3 3 
4 4 4 4 4 
5 5 5 5 5 

 */

import java.util.Scanner;

public class program1 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns:");
        int n = Sc.nextInt();
        printPattern(n);

    }

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }

}
