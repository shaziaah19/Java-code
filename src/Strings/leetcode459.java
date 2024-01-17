package Strings;

public class leetcode459 {
  public static boolean repeatedSubstringPattern(String s) {
    int n = s.length();
    //loop till half only to check if substring exists
    for (int i = n / 2; i >= 1; i--) {
      // n=9 i=4 so 4+4+.. will never be 9 thats why this condition
      if (n % i == 0) {
        StringBuilder sb = new StringBuilder();
        //n/i to know how many times we have to add substring
        for (int j = 0; j < n / i; j++) {
          sb.append(s.substring(0, i));
        }
        if (s.equals(sb.toString())) return true;
      }

    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println(repeatedSubstringPattern("abab"));
  }
}
