
/**
 * ! Enter the number of row and columns: 5 ?

                                1
                        1       0       1
                1       0       1       0       1
        1       0       1       0       1       0       1
1       0       1       0       1       0       1       0       1 

 */

import java.util.Scanner;

public class program72 {

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
                System.out.print("\t");

            for (int j = 1; j <= star; j++)

                System.out.print(j % 2 + "\t");

            star += 2;
            space--;

            System.out.println();
        }

    }
}
