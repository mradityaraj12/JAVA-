public class Q18 {
    public static void main(String[] args) {
        int[] arr1 = { 10, 20, 30, 40, 30, 20, 10 };
        int[] arr2 = { 10, 20, 30, 40, 50, 30, 20 };
        System.out.println("The arr1 Palindrome is: " + ispalindrome(arr1));
        System.out.println("The arr2 Palindrome is: " + ispalindrome(arr2));
    }

    public static boolean ispalindrome(int[] a) {
        int start = 0, end = a.length - 1;
        while (start < end) {
            if (a[start] != a[end])
                return false;
            start++;
            end--;

        }
        return true;
    }

}
