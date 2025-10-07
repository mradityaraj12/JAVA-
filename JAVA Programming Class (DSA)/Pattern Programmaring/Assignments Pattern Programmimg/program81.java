import java.util.Scanner;

/**
 * ! Enter the number of row and columns: 5 ?
 * 
 * 1
 * 2 3 2
 * 3 4 5 4 3
 * 4 5 6 7 6 5 4
 * 5 6 7 8 9 8 7 6 5
 * 
 */

public class program81 {

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
            int num = i;
            for (int j = 1; j <= space; j++)
                System.out.print("\t");

            int starMid = star / 2 + 1;

            for (int j = 1; j <= star; j++) {
                if (j < starMid)
                    System.out.print(num++ + "\t");
                else
                    System.out.print(num-- + "\t");
            }
            star += 2;
            space--;

            System.out.println();
        }

    }

}
