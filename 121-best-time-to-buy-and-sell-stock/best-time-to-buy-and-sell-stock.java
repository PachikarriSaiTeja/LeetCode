class Solution {
    public int maxProfit(int[] prices) {
        int cnt=0;
    for (int i = 1; i < prices.length; i++) {
    if (prices[i] < prices[i - 1]) {
        cnt += 1;
    }
}
if (cnt + 1 == prices.length) return 0;

    
        int mx=0;
        int mn=Integer.MAX_VALUE;
        int val=0;
        
      for(int i=0;i<prices.length;i++)
      {
        if(prices[i]<mn)
        {
            mn=prices[i];
        }
        mx=Math.max(prices[i]-mn,mx);
      }
      if(mx==0) return 0;
      return mx;

        
    }
}