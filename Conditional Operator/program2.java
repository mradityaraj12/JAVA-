
public class program2 {
    public static void main(String[] args) {
        int a = 3, b = 4, c = 5;
        int result = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println(result);
    }

}
