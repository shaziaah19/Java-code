package j15;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrimeNo {
  public static void main(String args[] ) throws Exception {
//    int n=13;
    //BufferedReader
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // String name = br.readLine();                // Reading input from STDIN
    // System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
    int n = Integer.parseInt(br.readLine());
    if(n==1 || n==2){
      System.out.println("1");
      return;
    }
    if(n%2==0){
      System.out.println("0");
      return;
    }
    for (int i = 3; i <= Math.sqrt(n); i++) {
      if(n%i ==0){
        System.out.println("0");
        return;
      }
    }
    System.out.println("1");
  }
}
