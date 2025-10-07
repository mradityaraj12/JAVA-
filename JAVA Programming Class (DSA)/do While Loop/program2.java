import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        char c;
        do {
            System.out.println("Enter the  a");
            int a = Sc.nextInt();
            System.out.println("Enter the b");
            int b = Sc.nextInt();
            int pow = getPower(a, b);
            System.out.println(a + "  to power " + b + " =" + pow);

            System.out.println("Enter Y/y to Continue.....");
            c = Sc.next().charAt(0);

        } while (c == 'y' || c == 'y');
        System.out.println("=============Program End =========");
    }

    public static int getPower(int a, int b) {
        int pow = 1;
        int i = 1;
        while (i <= b) {
            pow = pow * a;
            i++;
        }
        return pow;
    }

}
