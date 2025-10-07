
/**
 * ! Enter the Number of Row Is :  5

15  14  13  12  11  
  10  9  8  7
    6  5  4
      3  2
        1

 */

import java.util.Scanner;

public class program100 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Number of Row Is : ");
        int n = Sc.nextInt();
        printPattern(n);
    }

    public static void printPattern(int n) {
        int star = n;
        int space = 0;
        int num = n * (n + 1) / 2;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++)
                System.out.print("  ");
            for (int j = 1; j <= star; j++)
                System.out.print(num-- + "  ");
            star--;
            space++;
            System.out.println();
        }
    }

}
