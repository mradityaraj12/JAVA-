
/**
 * ! Enter the Number of Row Is :  5

1  2  3  4  5  
  6  7  8  9
    10  11  12
      13  14
        15

 */

import java.util.Scanner;

public class program99 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Number of Row Is : ");
        int n = Sc.nextInt();
        printPattern(n);
    }

    public static void printPattern(int n) {
        int star = n;
        int space = 0;
        int num = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++)
                System.out.print("  ");
            for (int j = 1; j <= star; j++)
                System.out.print(num++ + "  ");
            star--;
            space++;
            System.out.println();
        }
    }

}
