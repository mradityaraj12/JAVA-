
/**
 * ! Enter the number of row and columns: 5 ? 

        1  
      2  2  2
    3  3  3  3  3
  4  4  4  4  4  4  4
5  5  5  5  5  5  5  5  5

 */

import java.util.Scanner;

public class program68 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of row and columns:");
        int n = Sc.nextInt();
        getPrintPattern(n);

    }

    public static void getPrintPattern(int n) {
        int star = 1;
        int space = n - 1;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= space; j++)
                System.out.print("  ");

            for (int j = 1; j <= star; j++)

                System.out.print(i + "  ");

            star += 2;
            space--;

            System.out.println();
        }
    }

}
