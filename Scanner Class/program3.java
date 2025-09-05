import java.util.Scanner;

 class ThreeDigitNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input from user
        System.out.print("Enter a positive number: ");
        int num = sc.nextInt();

        // Step 2: Check if number is three-digit
        if (num >= 100 && num <= 999) {
            System.out.println(num + " is a three-digit number.");
        } else {
            System.out.println(num + " is NOT a three-digit number.");
        }

        sc.close();
    }
}
