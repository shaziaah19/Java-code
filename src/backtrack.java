import java.util.Arrays;

public class backtrack {
  public static void print(int []nums){
    for (int i = 0; i <nums.length ; i++) {
      System.out.print(nums[i]);
    }
    System.out.println();
  }
  public static void changeArr(int []arr,int i,int v){
    if(i==arr.length){
     print(arr);
      return;
    }
    arr[i]=v;
    changeArr(arr,i+1,v+1);
    arr[i]=arr[i]-2;

  }
  public static void main(String[] args) {
    int arr[]=new int[5];
    changeArr(arr,0,1);
    print(arr);
  }
}
