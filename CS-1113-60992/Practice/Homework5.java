public class Homework5 {
  public static void main(String[] args) {
    int[] a = new int[5];
    int[] b = a;
    a[1] = 5;
    b[1] += 1;
    for (int i = 1; i<a.length; i++) {
      a[i] = a[i] + b[i-1] + 1;
      System.out.printf("a[%d]=%d, b[%d]=%d%n", i, a[i], i, b[i]);
    }
  }
}
