import java.util.Scanner;

public class program91 {

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
            int num = i + 64;
            for (int j = 1; j <= space; j++)
                System.out.print("\t");

            int colMid = star / 2 + 1;
            for (int j = 1; j <= star; j++) {
                if (j <= colMid)
                    System.out.print((char) (num) + "\t");
                else
                    System.out.print((char) (num--) + "\t");

            }
            star += 2;

            space--;

            System.out.println();
        }

    }

}
