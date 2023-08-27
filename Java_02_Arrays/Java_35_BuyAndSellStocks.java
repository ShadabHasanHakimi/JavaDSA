public class Java_35_BuyAndSellStocks {
    public static int bSStocks(int[] p){
//        TC=O(n)
        int bPrice=Integer.MAX_VALUE;
        int maxProfit=0;
        for (int i=0; i<p.length; i++){
            if(bPrice<p[i]){
                int profit = p[i]-bPrice;
                maxProfit=Math.max(profit, maxProfit);
            }
            else{
                bPrice=p[i];
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        int[] price = {7, 1, 5, 3, 6, 4};
        System.out.println(bSStocks(price));
    }
}
