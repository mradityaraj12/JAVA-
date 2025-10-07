
/**
 * ! Enter the number of row and columns: 5 ? 

            A   
         C   B   A
      E   D   C   B   A
   G   F   E   D   C   B   A
I   H   G   F   E   D   C   B   A

 */

import java.util.Scanner;

public class program90 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of row and columns:");
        int n = Sc.nextInt();
        getPrintPattern(n);

    }

    public static void getPrintPattern(int n) {
        int star = 1;
        int space = n - 1;
        int num = 'A';

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= space; j++)
                System.out.print("   ");

            for (int j = 1; j <= star; j++) {

                System.out.print((char) (num--) + "   ");

            }
            star += 2;
            space--;
            num = num + (2 * i + 1);

            System.out.println();
        }

    }

}
