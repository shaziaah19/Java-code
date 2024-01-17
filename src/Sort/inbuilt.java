package Sort;

import java.util.Arrays;
import java.util.Collections;
public class inbuilt{
  public static void print(int arr[]) {
    for(int i =0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }

  //for interger type
  public static void print(Integer arrr[]) {
    for(int i =0;i<arrr.length;i++){
      System.out.print(arrr[i]+" ");
    }
  }
  public static void main(String args[]){
    int arr[]={2,6,4,1,7};
//    Arrays.sort(arr);
//    print(arr);
//    System.out.println();
    Arrays.sort(arr, 0, 3);
    print(arr);
    System.out.println();
    Integer arrr[]={2,6,4,1,7};
    Arrays.sort(arrr,Collections.reverseOrder());// wil not work on int primitive but on object Integer
    print(arrr);
// Arrays.sort(arrr,si,ei,Collections.reverseOrder());
  }
}
