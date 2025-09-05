public class program9 {
    public static void main(String[] args) {
        int count = 1;
        int n = 28;
        int i = 2;
        while (i * i < n) {
            if (n % i == 0) {
                int fact1 = i, fact2 = n / i;
                if (fact1 == fact2)
                    count++;
            } else {
                count += 2;
            }
            i++;
        }
        System.out.println("total number is :" + count);
    }

}
