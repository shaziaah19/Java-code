package pattern;

public class Diamond {
//
//                *
//               * *
//              * * *
//               * *
//                *
public static void main(String[] args) {
  int n=5;
  for (int i = 0; i < 2*n; i++) {
    int star= i>n?2*n-i:i;
    int space=n-star;
    for (int j = 0; j < space; j++) {
      System.out.print(" ");
    }

    for (int k = 1; k <=star ; k++) {
      System.out.print("* ");
    }
    System.out.println();
  }
}
}
