class BuyAndSell {
    public int maxProfit(int[] prices) {
        int minsofar = prices[0];
        int maxprofit = 0;
        for(int i=1;i<prices.length;i++){
            maxprofit = Math.max(maxprofit,prices[i]-minsofar);
            minsofar = Math.min(minsofar,prices[i]);
        }
        return maxprofit;
    }
}
