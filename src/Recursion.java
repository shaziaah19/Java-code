public class Recursion {
  public static void printDec(int n) {
    //BASE case
    if (n == 1) {
      System.out.println(n);
      return;
    }
    System.out.println(n);
    printDec(n - 1);
  }

  public static void printInc(int n) {
    if (n == 1) {
      System.out.println(n);
      return;
    }
    printInc(n - 1);
    System.out.println(n);
  }
  public static int fact(int n){
    if(n==1){
      return n;
    }
    return n*fact(n-1);
  }
  public static int sum(int n){
    if(n==1){
      return 1;
    }
    return n+sum(n-1);
  }
  public static int fib(int n){
    if(n==0|| n==1){
      return n;
    }
   return fib(n-2)+fib(n-1);
  }
  public static int powerN(int x,int n){
    if(n==1){
      return x;
    }
    return x*powerN(x,n-1);
  }
  public static int optimizedPower(int x,int n){
    if(n==1){
      return x;
    }
    int halfPower=optimizedPower(x,n/2) ;
    int halfpowerSq =halfPower*halfPower;
    if (n%2!=0){
      halfpowerSq=x*halfpowerSq;
    }
    return halfpowerSq;
  }
  public static int tilingProblem(int n){
    if(n==0||n==1){
    return 1;
    }
    //vertical
    int fnm1=tilingProblem(n-1);
    //horizontal
    int fnm2=tilingProblem(n-2);
    return fnm2+fnm1;
  }
  public static String removeDup(String s,int i,StringBuilder sb,boolean map[]){
    if(i==s.length()){
      return sb.toString();
    }
    char curr=s.charAt(i);
    if(map[curr-'a']==true){
      removeDup(s,i+1,sb,map);
    }else{
      map[curr-'a']=true;
      removeDup(s,i+1,sb.append(curr),map);
    }
    return sb.toString();
  }
  public static int friendsPair(int n){
    if(n==1||n==2){
      return n;
    }
    int fnm1=friendsPair(n-1); //to stay single
    int fnm2=friendsPair(n-2); // after making pair people left
    return fnm1+(n-1)*fnm2;
  }
  public static void binaryString(int n,int lp,String s){  //w/o consecutive ones
  if(n==0){
    System.out.println(s);
    return;
  }
    //kaam
    binaryString(n-1,0,s+"0");
    if(lp==0){
      binaryString(n-1,1,s+"1");
    }
  }



  public static void main(String[] args) {
    int n = 6;
//  printDec(n);
//    printInc(n);
//    System.out.println(fib(n));
    int[] nums = {1, 2, 45, 2, 3, 5};
//    System.out.println(optimizedPower(2,10));
//    System.out.println(tilingProblem(4));
//    System.out.println(removeDup("hello",0,new StringBuilder(""),new boolean[26]));
//    System.out.println(friendsPair(3));
    binaryString(3,0,"");
  }
}
