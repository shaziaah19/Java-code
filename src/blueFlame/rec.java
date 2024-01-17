package blueFlame;
import java.util.*;
public class rec {
  public static void test() {
    Scanner scanner = new Scanner(System.in);
    int l = scanner.nextInt();
    int w = scanner.nextInt();

    int area = l * w;

    for (long i = 100000; i >= 1; i--) {
      long val = i * i;
      if (area % val == 0) {
        System.out.println(area / val);
        return;
      }
    }
  }

  public static void main(String[] args) {
   test();
  }
}
