
/**
 * ! Enter the number of row and columns:  5 ?

                                A
                        B       C
                D       E       F
        G       H       I       J
K       L       M       N       O

 */

import java.util.Scanner;

public class program45 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of row and columns:");
        int n = Sc.nextInt();
        getPrintPattern(n);

    }

    public static void getPrintPattern(int n) {
        int star = 1;
        int space = n - 1;
        char c = 'A';

        for (int i = 1; i <= n; i++) {
            // int num = i + 64;

            for (int j = 1; j <= space; j++)
                System.out.print("\t");

            for (int j = 1; j <= star; j++)
                System.out.print(c++ + "\t");
            star++;
            space--;

            System.out.println();
        }
    }

}
