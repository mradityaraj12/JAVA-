
/**
 * ! Enter the number of row and columns:  5

1  
3  2
6  5  4
10  9  8  7
15  14  13  12  11
 */

import java.util.Scanner;

public class program24 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of row and columns:");
        int n = Sc.nextInt();
        getPrintPattern(n);

    }

    public static void getPrintPattern(int n) {
        int star = 1;
        int num = 1;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= star; j++)
                System.out.print(num-- + "  ");
            star++;
            num = num + 2 * i + 1;
            System.out.println();
        }
    }

}
