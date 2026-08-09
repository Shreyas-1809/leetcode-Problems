class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int left=0,right=1; // left for buy and right for sell

        while(right<prices.length)
        {
            if(prices[left]<prices[right])
            {
                maxprofit = Math.max(maxprofit , prices[right]-prices[left]);
                right++;
            }
            else
            {
            left = right;// if prices[right]<prices[left] it means that the value on right is much lower than left so we directly shift our left value to right
            right++;
        }
        }

        return maxprofit;

    }
}
