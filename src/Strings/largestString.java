package Strings;

public class largestString {
  public static void main(String[] args) {
    String fruit[] = {"apple", "mango", "banana"};
    String l = fruit[0];
    for (int i = 1; i < fruit.length; i++) {
      if (l.compareTo(fruit[i]) < 0) {
        l = fruit[i];
      }
    }
    System.out.println(l);
  }
}
