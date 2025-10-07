
/**
 * ! Enter the number of Row : 7 ?

1 1 1 1 1 1 1 
  2 2 2 2 2
    3 3 3
      4
    5 5 5
  6 6 6 6 6
7 7 7 7 7 7 7  

 */

import java.util.Scanner;

public class Q182 {

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

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= space; j++)
                System.out.print("  ");
            for (int j = 1; j <= star; j++) {
                System.out.print(i + " ");
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