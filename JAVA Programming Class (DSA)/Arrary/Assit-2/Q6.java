
class Q6 {
  public static void main(String[] args) {
    int[] a = { 2, 5, 4, 3, 6 };

    System.out.println("The Resultant Array Is:");
    ChangeValues(a);

  }

  public static void ChangeValues(int[] a) {
    int sum = 0;
    for (int x : a) {
      sum = sum + x;
    }

    for (int i = 0; i < a.length; i++) {
      a[i] = sum - a[i];
      System.out.print(a[i] + "  ");
    }

  }

}