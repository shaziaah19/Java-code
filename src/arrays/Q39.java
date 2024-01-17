package arrays;

public class Q39 {
  public static void main(String[] args) {
    int n=7,sum=0;
    for(int i=1;i<6;i++){
      if(n%i==0){
        sum+=i;
      }
    }
    if(n==sum){
      System.out.println("perfect");
    }
  }
}
