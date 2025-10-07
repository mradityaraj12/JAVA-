
/**
 * ! Enter the number of row and columns: 5 ?

15  
13  14  
10  11  12  
6  7  8  9  
1  2  3  4  5 

 */

import java.util.Scanner;

public class program25 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of row and columns:");
        int n = Sc.nextInt();
        getPrintPattern(n);

    }

    public static void getPrintPattern(int n) {
        int star = 1;
        int num = n * (n + 1) / 2;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= star; j++)
                System.out.print(num++ + "  ");
            star++;
            num = num - (2 * i + 1);

            System.out.println();
        }
    }

}
