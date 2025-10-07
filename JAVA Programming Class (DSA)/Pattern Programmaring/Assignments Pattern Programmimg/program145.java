
/**
 * ! Enter the Number Of Row IS : 7 ? 

      A   
    B   C
  D   E   F
G   H   I   J
  K   L   M
    N   O
      P 

 */

import java.util.Scanner;

public class program145 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Number Of Row IS :");
        int n = Sc.nextInt();
        printPattern(n);

    }

    public static void printPattern(int n) {
        int star = 1;
        int rowMid = n / 2 + 1;
        int space = n / 2;
        char c = 'A';
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= space; j++)
                System.out.print("  ");

            for (int j = 1; j <= star; j++)

                System.out.print(c++ + "   ");
            if (i < rowMid) {

                star++;
                space--;

            } else {
                star--;
                space++;

            }

            System.out.println();

        }
    }

}
