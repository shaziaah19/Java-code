package arrays;

public class noToBinary{
  public static void main(String[] args) {
    int n= 3;
    int i=0;
    int []bin=new int [32];
    while(n>0){
      bin[i]= n%2;
      n=n/2;
      i++;

    }
    for(int j=i-1;j>=0;j--)
    {
      System.out.print(bin[j]);
    }
  }
}
