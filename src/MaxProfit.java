public class MaxProfit {
    public static void main(String[] args) {
        int[] prices = {7,1,5,6,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
//        int index = 0, max = 0,newindex = 0;
//        int min = Arrays.stream(prices).min().getAsInt();
//        for (int i = 0; i < prices.length; i++) {
//            if(prices[i] == min){
//                index = i;
//            }
//        }
//        for (int i = index; i < prices.length; i++) {
//            if (prices[i] > max){
//                max = prices[i];
//            }
//        }
//        for (int i = 0; i < prices.length; i++) {
//            if(prices[i] == max){
//                newindex = i;
//            }
//        }
//        return max - min;
        int maxprofit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxprofit)
                    maxprofit = profit;
            }
        }
        return maxprofit;
    }
}
