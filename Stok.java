

public class Stok {

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0; 
        }
            int min = prices[0];
            int maxProfit=0;
            for(int i=0;i<prices.length;i++){
                min = Math.min(min, prices[i]);
                maxProfit = Math.max(maxProfit, prices[i]-min) ;
            }
            return maxProfit;
    
        } 
     public static void main(String[] args) {
        int[] stockPrices = {7, 1, 5, 3, 6, 4};
    
            int result = maxProfit(stockPrices);
            System.out.println(result);

 }
    
}