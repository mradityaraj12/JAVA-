public class program6 {
    public static void main(String[] args) {
        int count = 0;
        int i = 1;
        while (i < 100) {
            if (i % 7 == 0 || i % 10 == 7) {
                System.out.println(i);
                count++;

            }
            i++;
        }
        System.out.println("total Number Is:" + count);
    }

}
