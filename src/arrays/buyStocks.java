package arrays;

public class buyStocks {
  public static int buyAndSellStock(int prices[]){
    int buyPrice=Integer.MAX_VALUE;
    int maxprofit =0;
    for(int i =0;i<prices.length;i++){
      if(buyPrice<prices[i]){
        int profit = prices[i]-buyPrice;
        maxprofit = Math.max(maxprofit,profit);
      }else{
        buyPrice=prices[i];
      }
    }
    return maxprofit;
  }
  public static void main(String args[]){
    int prices[]={7,1,5,3,6,4};

    System.out.println( buyAndSellStock(prices));
  }
}
