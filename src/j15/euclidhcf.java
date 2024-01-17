package j15;

public class euclidhcf {
  public static void main(String[] args) {
    int a=15,b=20;

    while(a!=b){
     if(a>b){
       a=a-b;
     }else{
       b=b-a;
     }
    }
    System.out.println(a);
  }
}
