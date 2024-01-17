package Sort;

import java.util.Arrays;

public class Insertion {
//  worst case-> O(N2)
//  best case-> O(n)
//  no of swaps is less than bubble sort
//  in insertion we sort the lhs one by one
static void swap(int arr[], int max, int l) {
  for (int i = 0; i < arr.length; i++) {
    int temp = arr[max];
    arr[max] = arr[l];
    arr[l] = temp;
  }
}
  public static void main(String[] args) {
    int[]nums= {1, 4, 3, 2, 5};
    for (int i = 0; i < nums.length-1 ; i++) {
//      j is i+1 so i=N-2
      for (int j = i+1; j >=0 ; j--) {
        if(nums[j-1]>nums[j]){
          swap(nums,j,j-1);
        }else{
          break;
        }
      }
    }
    System.out.println(Arrays.toString(nums));
  }
}
