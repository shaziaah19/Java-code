package arrays;

import java.util.Arrays;

public class trappingRainwater {
  public static void main(String[] args) {
    int []n={4,2,0,6,3,2,5};
    int maxR[]=new int[n.length];
    int maxL[]=new int[n.length];
    maxL[0]=n[0];
    for (int i = 1; i <n.length ; i++) {
      maxL[i]=Math.max(maxL[i-1],n[i]);
    }
    maxR[n.length-1]=n[n.length-1];
    for (int i = n.length-2; i >=0 ; i--) {

      maxR[i]=Math.max(maxR[i+1],n[i]);
    }
    int tW=0;
    for(int i=0;i<n.length;i++){
      int wl=Math.min(maxL[i],maxR[i]);
      tW+=wl-n[i];
    }
    System.out.println(tW);
  }
}
