
/**
 * ! Enter the number of row and columns: 5 ?

                                0
                        1       0       1
                2       1       0       1       2
        3       2       1       0       1       2       3
4       3       2       1       0       1       2       3       4 

 */

import java.util.Scanner;

public class program80 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of row and columns:");
        int n = Sc.nextInt();
        getPrintPattern(n);

    }

    public static void getPrintPattern(int n) {
        int star = 1;
        int space = n - 1;
        int num = 0;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= space; j++)
                System.out.print("   ");

            int starMid = star / 2 + 1;

            for (int j = 1; j <= star; j++) {
                if (j < starMid)
                    System.out.printf("%-3d", num--);
                else
                    System.out.printf("%-3d", num++);
            }
            star += 2;
            space--;

            System.out.println();
        }

    }

}
