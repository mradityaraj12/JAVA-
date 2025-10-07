
/**
 * ! Eneter the number of Row Is :  5 ? 
 
25 24 23 22 21 20 19 18 17 
  16 15 14 13 12 11 10 
    9 8 7 6 5 
      4 3 2 
        1 

 */

import java.util.Scanner;

public class program113 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Eneter the number of Row Is :");
        int n = Sc.nextInt();
        printPattern(n);

    }

    public static void printPattern(int n) {
        int star = 2 * n - 1;
        int space = 0;
        int num = n * n;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= space; j++)
                System.out.print("  ");

            for (int j = 1; j <= star; j++)
                System.out.print(num-- + " ");
            star -= 2;
            space++;

            System.out.println();
        }
    }

}
