package arrays;

import java.util.Arrays;

public class sort {
  public static void merge(int arr[], int s, int mid, int e) {
//     left(0,3) right(4,6) -> 6-0+1=7
    int temp[] = new int[e - s + 1];
    int i = s, j = mid + 1, k = 0;
    while (i <= mid && j <= e) {
      if (arr[i] < arr[j]) {
        temp[k++] = arr[i++];
      } else {
        temp[k++] = arr[j++];
      }
    }
    while (i <= mid) {
      temp[k++] = arr[i++];
    }
    while (j <= e) {
      temp[k++] = arr[j++];
    }
    for (int l = 0; l < temp.length ; l++) {
      arr[l]=temp[l];
    }
    System.out.println(Arrays.toString(arr));
  }

  public static void mergeSort(int arr[], int s, int e) {
    //base case
    if (s <= e) {
      return;
    }
    int mid = s + (e - s) / 2;
    //left
    mergeSort(arr, s, mid);
//   ..right
    mergeSort(arr, mid + 1, e);
    merge(arr, s, mid, e);
  }
  public static void printArr(int []nums){
    for(int num :nums){
      System.out.println(num);
    }
  }

  public static void main(String[] args) {
    int[] nums = {2, 6, 4, 8, 0, 13, 7};
    mergeSort(nums, 0, 6);
    printArr(nums);
  }
}
