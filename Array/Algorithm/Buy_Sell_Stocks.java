 public class Buy_Sell_Stocks {
    public static int BuyAndSellStocks(int arr[]){
      //Time complexity-----O(n); 
      int BuyPrice=arr[0], maxProfit=0;
       
    
        for(int i=1;i<arr.length;i++){
          if(BuyPrice<arr[i]){
         
          int profit=arr[i]-BuyPrice;
          
          
              maxProfit=Math.max(maxProfit, profit);
          }
          if(BuyPrice>arr[i]){
            BuyPrice=arr[i];
            System.out.println( "Buy Price "+BuyPrice);
          }
        }
    
        return maxProfit;
      }
        
     public static void main(String[] args) {
        int arr[]={7,2,5,3,1,4}; 
       System.out.println( BuyAndSellStocks(arr));
     }
}
