package arrays;

public class kadanes {
  public static void main(String[] args) {
    int []nums={-2,-3,4,-1,-2,1,5,-3};
    int sum=0, currSum =nums[0];
    for (int i = 0; i < nums.length ; i++) {
      sum+=nums[i];
      if(sum<0){
        sum=0;
      }
      currSum =Math.max(currSum,sum);

    }
    System.out.println(currSum);
  }
}
