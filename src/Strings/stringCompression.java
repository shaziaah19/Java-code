package Strings;

public class stringCompression {
  public static void main(String[] args) {
    String s = "aabbccd";
    StringBuilder sb = new StringBuilder("");
    for (int i = 0; i < s.length(); i++) {
      Integer c = 1;
      while (i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
        c++;
        i++;
      }
      sb.append(s.charAt(i));
      if (c > 1) {
        sb.append(c);
      }
    }
    System.out.println(sb.toString());
  }
}
