
/** 
 * ! Eneter the number of Row Is :  5 ? 

1 1 1 1 1 1 1 1 1 
  2 2 2 2 2 2 2
    3 3 3 3 3
      4 4 4
        5

 */

import java.util.Scanner;

public class program108 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Eneter the number of Row Is :");
        int n = Sc.nextInt();
        printPattern(n);

    }

    public static void printPattern(int n) {
        int star = 2 * n - 1;
        int space = 0;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= space; j++)
                System.out.print("  ");

            for (int j = 1; j <= star; j++)
                System.out.print(i + " ");
            star -= 2;
            space++;

            System.out.println();
        }
    }

}
