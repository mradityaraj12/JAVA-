import java.util.Scanner;

class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter The Number :");
        int n = sc.nextInt();
        if (n < 0)
            n = -n;

        int count = getCount(n);
        System.out.println("Total Digit in:" + n + "is:" + count);

    }

    public static int getCount(int n) {
        if (n > 0)
            return 1 + getCount(n / 10);
        else
            return 0;
    }

}