package Sort;

import java.util.Arrays;

public class cyclicSort {
  public static void main(String[] args) {
    int[]nums= {1, 4, 3, 2, 5};
    for (int i = 0; i < nums.length ; i++) {
      int c=i;
   if(nums[i]!=nums[nums[i]-1]){
     int temp=nums[nums[i]-1];
     nums[nums[i]-1]=nums[i];
     nums[i]=temp;

   }
    }
    System.out.println(Arrays.toString(nums));
  }
}
