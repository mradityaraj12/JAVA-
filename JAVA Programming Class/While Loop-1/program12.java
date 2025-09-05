import java.util.Scanner;

public class program12 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        printFibonacci(n);
    }

    public static void printFibonacci(int n) {
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1 + " " + n2 + " ");
        int i = 1;
        while (i < n - 1) {
            int n3 = n1 + n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;

            i++;
        }
    }
}
