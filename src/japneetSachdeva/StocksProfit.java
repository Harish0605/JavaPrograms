package japneetSachdeva;

public class StocksProfit {

	public static int maxprofit(int[] prices) {
		int buyingPrice = 0;
		int sellingPrice = 0;
		int profit = 0;
		int maxProfit = 0;
		for(int i=0;i<prices.length;i++) {
			for(int j=i+1;j<prices.length;j++) {
				if(prices[i] < prices[j]) {
					buyingPrice = prices[i];
					sellingPrice = prices[j];
					profit = sellingPrice - buyingPrice;
				}
				if(maxProfit < profit) {
					maxProfit = profit;
				}
			}
		}

		return maxProfit;
	}

	public static void main(String[] args) {
     int[] prices = {7,1,5,3,6,4};
     int[] prices2 = {7,6,4,3,1};
     System.out.println(maxprofit(prices));
     System.out.println(maxprofit(prices2));
 	}

}
