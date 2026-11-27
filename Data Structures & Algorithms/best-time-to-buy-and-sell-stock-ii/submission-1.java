class Solution {
    public int maxProfit(int[] prices) {
        int j=0,k=0;
        int sum =0;
        int diff =0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i+1]>prices[i]){
                j=prices[i];
                k=prices[i+1];
                diff = k-j;
                sum += diff;
              
            }
            
              
        }
        return sum;
    }
}