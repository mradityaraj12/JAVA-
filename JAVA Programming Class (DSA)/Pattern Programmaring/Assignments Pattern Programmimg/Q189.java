
/**
 * ! Enter the number of Row :
7
3  2  1  0  1  2  3  
   2  1  0  1  2
      1  0  1
         0
      1  0  1
   2  1  0  1  2
3  2  1  0  1  2  3 

 */

import java.util.Scanner;

public class Q189 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of Row :");
        int n = Sc.nextInt();
        printpattern(n);
    }

    public static void printpattern(int n) {
        int star = n;
        int space = 0;
        int mid = n / 2 + 1;
        int num;

        for (int i = 1; i <= n; i++) {
            if (i <= mid)
                num = mid - i;
            else
                num = i - mid;

            for (int j = 1; j <= space; j++)
                System.out.print("   ");

            int colMid = star / 2 + 1;

            for (int j = 1; j <= star; j++) {
                if (j < colMid) {
                    System.out.printf("%-3d", num);
                    num--;
                } else if (j == colMid) {
                    System.out.printf("%-3d", 0);
                    num = 1;
                } else {

                    System.out.printf("%-3d", num);
                    num++;

                }
            }

            if (i < mid) {
                star -= 2;
                space++;
            } else {
                star += 2;
                space--;
            }
            System.out.println();
        }

    }

}
