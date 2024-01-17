package arrays;

public class maxSumSubArr {
  public static void main(String[] args) {
    int nums[] = {2, 4, 6, 8, 10};
    int sum = 0, s = 0;
    for (int i = 0; i < nums.length; i++) {
      for (int j = i; j < nums.length; j++) {
        s = 0;
        for (int k = i; k <= j; k++) {
          s += nums[k];

        }
        sum = Math.max(sum, s);
      }
    }
    System.out.println(sum);
  }
}
