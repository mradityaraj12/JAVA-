
/**
 * ! Enter the Number Of Row IS :  7 ? 

      D   
    C   C   
  B   B   B   
A   A   A   A   
  B   B   B   
    C   C   
      D    

 */

import java.util.Scanner;

public class program144 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Number Of Row IS :");
        int n = Sc.nextInt();
        printPattern(n);

    }

    public static void printPattern(int n) {
        int star = 1;
        int rowMid = n / 2 + 1;
        int space = n / 2;
        int num = n / 2 + 1 + 64;
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= space; j++)
                System.out.print("  ");

            for (int j = 1; j <= star; j++)

                System.out.print((char) (num) + "   ");
            if (i < rowMid) {

                star++;
                space--;
                num--;

            } else {
                star--;
                space++;
                num++;

            }

            System.out.println();

        }
    }

}
