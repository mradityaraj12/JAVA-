
public class program2 {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        boolean result = (++x > 5) && (--y < 10);
        System.out.println(result);
        System.out.println(x);
        System.out.println(y);
    }
}
