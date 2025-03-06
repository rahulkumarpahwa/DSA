
public class BuyAndSellStocks {
    public static int buyAndSellStocks(int arr[]) {
        int profit = 0;

        int currBP = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int currSP = arr[i];
            int currProfit = currSP - currBP;
            if (currProfit > profit) {
                profit = currProfit;
            }
            // egde case : when profit is less than zero, then set it to zero.
            if (profit < 0) {
                profit = 0;
            }
            
            if (arr[i] < currBP) {
                currBP = arr[i];
            }
            
        }

        return profit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(buyAndSellStocks(prices));
    }
}
