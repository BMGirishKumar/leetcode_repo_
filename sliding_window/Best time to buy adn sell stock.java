class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int low_current=prices[0];
        for(int i=0;i<prices.length;i++){
            if(low_current>prices[i]){
                low_current=prices[i];
            }
            else{
                max=Math.max(max,prices[i]-low_current);
            }
        }
        return max;
    }
}