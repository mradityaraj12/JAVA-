
/**
 * ! Enter the number of row and columns:  8

1  
1  0
1  0  1
1  0  1  0
1  0  1  0  1
1  0  1  0  1  0
1  0  1  0  1  0  1
1  0  1  0  1  0  1  0
 */

import java.util.Scanner;

public class program20 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of row and columns:");
        int n = Sc.nextInt();
        getPrintPattern(n);

    }

    public static void getPrintPattern(int n) {
        int star = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= star; j++)
                System.out.print(j % 2 + "  ");
            star++;
            System.out.println();
        }
    }

}
