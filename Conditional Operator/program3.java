
public class program3 {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        int z = (x > y) ? (x < 15 ? x : y) : (x > 5 ? y : x);
        System.out.println(z);
    }
}
