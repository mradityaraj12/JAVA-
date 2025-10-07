import java.util.Scanner;

public class Q199 {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Number Of Row IS :");
        int n = Sc.nextInt();
        printPattern(n);

    }

    public static void printPattern(int n) {

        if (n % 2 == 0) {
            System.out.println("Pattern is NOT Possible for Even Row!");
            return;
        }

        int star = n;
        int rowMid = n / 2 + 1;
        int space = 0;
        int num;

        for (int i = 1; i <= n; i++) {
            if (i <= rowMid)
                num = i + 64;
            else
                num = n - i + 64 + 1;

            for (int j = 1; j <= space; j++)
                System.out.print("   ");

            int colMid = star / 2 + 1;
            for (int j = 1; j <= star; j++) {
                if (j < colMid) {
                    System.out.printf((char) num + "  ");

                } else {
                    System.out.printf((char) num + "  ");

                }

            }

            if (i < rowMid) {

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
