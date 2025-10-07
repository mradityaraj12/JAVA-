import java.util.Scanner;

public class program31 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the number of row and columns:");
        int n = Sc.nextInt();
        getPrintPattern(n);

    }

    public static void getPrintPattern(int n) {
        int star = 1;
        int num = n + 64;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= star; j++)
                System.out.print((char) (num) + "  ");
            star++;
            num--;
            System.out.println();
        }
    }

}
