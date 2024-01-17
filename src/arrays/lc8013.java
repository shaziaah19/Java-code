package arrays;

public class lc8013 {

  public static boolean iseven(int i){
    if(i%2==0) return true;
   return false;
  }

  public static int numberOfBeautifulIntegers(int low, int high, int k) {

    int c=0,e=0,o=0;
    int j=low;
    for(int i=low;i<=high;i++){
      int rem=i%10;
      if(iseven(rem)) e++;
      else o++;
      j++;
      i=i/10;
      if(e==o&& j%k==0) c++;
    }
    return c;
  }

  public static void main(String[] args) {
    System.out.println(numberOfBeautifulIntegers(10,20,3));
  }
}
