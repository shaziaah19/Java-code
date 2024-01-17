package arrays;

import java.util.Arrays;

public class reverse {
  public static void main(String[] args) {
    int []nums={1,2,3,4,6,7,8,8};
    int s=0,e=nums.length-1;
    while(s<e){
      int temp=nums[s];
      nums[s]=nums[e];
      nums[e]=temp;
      s++;
      e--;
    }
    System.out.println(Arrays.toString(nums));
  }
}
