package blueFlame;
import java.util.*;
  public class BinaryMismatch {
    static int getMoneySpent(int[] k, int[] d, int b) {
      /*
       * Write your code here.
       */
      int max=0;
      Arrays.sort(k);
      Arrays.sort(d);
      int l=k.length-1,m=d.length-1;
      while(((l>m?m:l))>0){
        if(k[l]+d[m]<b){
          max=k[l]+d[m];
        }
        l--;
        m--;
      }
      return max;
    }

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        while(s.length() < 32)
          s = "0" + s;

        int val = scanner.nextInt();
        int cnt = 0;

        for(int i = 0; i < 32; i++) {
          int bit = (val >> (31 - i)) & 1;
          int sBit = s.charAt(i) - '0';

          if(bit != sBit) {
            System.out.println(i);
            cnt++;
          }
        }

        System.out.println(cnt);
      }
    }




