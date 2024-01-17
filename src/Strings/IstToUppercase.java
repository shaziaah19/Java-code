package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;

public class IstToUppercase {
  public static void main(String[] args) {
    String s = "hi i am shazia";
    StringBuilder sb = new StringBuilder();
    sb.append(Character.toUpperCase(s.charAt(0)));
    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(i) == ' ' && i < s.length() - 1) {
        sb.append(s.charAt(i));
        i++;
        sb.append(Character.toUpperCase(s.charAt(i)));
      } else {
        sb.append(s.charAt(i));
      }
    }
    System.out.println(sb.toString());
  }

}
