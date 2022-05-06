public class Quiz {
  public static void main(String[] args) {
    String s = "Hello";
    int a=0;
    switch (s.charAt(1)) {
        case 'H':
        case 'e':
            a = 2;
            break;
        case 'l':
        case 'o':
            a = 7;
            break;
        default:
            a = 9;
    }

    System.out.println(a);
  }
}
