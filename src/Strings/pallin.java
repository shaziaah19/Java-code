package Strings;

public class pallin {
  public static void main(String[] args) {
    String s= "racecar";
    int i=0,j=s.length()-1;
       while (i<=j){
          if(!(s.charAt(i)==s.charAt(j))){
            System.out.println("false");
          }else {
            System.out.println("true");
          }
          i++;
          j--;
        }

  }
}
