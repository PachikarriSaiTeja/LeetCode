class Solution {
    public int maxProfit(int[] prices) {
       int max=0;
       int min=9999999;
    
    for(int i=0;i<prices.length;i++)
    {
        if(prices[i]<min)
        {
            min=prices[i];
        }
        int val=prices[i]-min;
        if(val>max)
        {
            max=val;
        }
    }
    return max;


        
    }
}