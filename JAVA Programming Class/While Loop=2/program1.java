import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int sum = getSum(n);
        System.out.println(sum);

    }

    public static int getSum(int n) {
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum = sum + i;

            i++;
        }
        return sum;
    }
}
