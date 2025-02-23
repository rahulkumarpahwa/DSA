package ArraysQues;

public class BestTimeToBuyAndSell {
    public static int BuyAndSell(int prices[]) {
        int buyPrice = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) { // starting from one because in the start we can't sell. also,0 we can
                                                  // only sell or buy at a time
            int newProfit = prices[i] - buyPrice;
            if (newProfit > profit) {
                profit = newProfit;
            }
            if (profit < 0) {
                profit = 0;
            }
            if (buyPrice > prices[i]) {
                buyPrice = prices[i];
            }
        }

        return profit;
    }

    public static void main(String[] args) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(BuyAndSell(prices));
    }
}
