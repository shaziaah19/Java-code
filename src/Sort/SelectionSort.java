package Sort;

import java.util.Arrays;

public class SelectionSort {
  static int getMax(int[] arr, int s, int e) {
    int max = s;
    for (int i = s; i <= e; i++) {

      if (arr[max] < arr[i]) {
        max = i;
      }
    }
    return max;
  }
  static void swap(int arr[], int max, int l) {
    for (int i = 0; i < arr.length; i++) {
      int temp = arr[max];
      arr[max] = arr[l];
      arr[l] = temp;
    }
  }
  static void selection(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int last = arr.length - i - 1;
      int maxInd = getMax(arr, 0, last);
      swap(arr, maxInd, last);

    }
    System.out.println(Arrays.toString(arr));
  }

  public static void main(String[] args) {
    int[] arr = {1, 4, 3, 2, 5};
    selection(arr);
  }
}
