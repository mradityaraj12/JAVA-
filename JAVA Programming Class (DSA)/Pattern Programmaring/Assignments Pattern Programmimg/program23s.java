
/**
 * ! Enter the number of row and columns:  8

1  
2  3  
4  5  6  
7  8  9  10  
11  12  13  14  15  
16  17  18  19  20  21  
22  23  24  25  26  27  28  
29  30  31  32  33  34  35  36  
 */

import java.util.Scanner;

public class program23s {
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
                System.out.print(num++ + "  ");
            star++;
            System.out.println();
        }
    }

}
