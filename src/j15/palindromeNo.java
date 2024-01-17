package j15;

public class palindromeNo {
  public static boolean isPalindrome(int x) {
    int n=x,num=0;
    while(n>0){
      int  rem=n%10;

      num=num*10+rem;
      n=n/10;

    }
    if(num==x){
      return true;
    }
    return false;
  }
  public static void main(String[] args) {
    boolean ans=palindromeNo.isPalindrome(32);
    System.out.println(ans);

  }
}
