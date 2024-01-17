package Heaps;

import java.util.ArrayList;

public class heapBasics {
  static class heap{
   static ArrayList<Integer> arr=new ArrayList<>();
    public void add(int data){ //ologn
      arr.add(data);
      int x= arr.size()-1; //child indx
      int par=(x-1)/2; //parent indx
      while (arr.get(x)<arr.get(par)){
        //swap
        int temp=arr.get(x);
        arr.set(x, arr.get(par));
        arr.set(par,temp);
      }
      System.out.println(arr.toString());
    }
    public  static int peek(){
      return arr.get(0);
    }
  }

  public static void main(String[] args) {
    int []arr={2,3,4,5,10};
 heap h=new heap();
    h.add(1);
  }
}
