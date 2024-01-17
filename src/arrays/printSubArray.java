package arrays;

public class printSubArray {
  public static void main(String[] args) {
    int nums[]={2,4,6,8,10};
    for (int i = 0; i <nums.length ; i++) {
      for (int j = i; j <nums.length ; j++) {
        for (int k = i; k <=j ; k++) {
          System.out.print(nums[k]);
        }
        System.out.println();
      }

    }
  }
}
