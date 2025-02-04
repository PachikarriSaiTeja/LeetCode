class Solution {
    public int maxAscendingSum(int[] nums) {
        int ctotal=nums[0];
        int ptotal=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]<nums[i])
            {
                ctotal+=nums[i];
            }
            else 
            {
                ptotal=Math.max(ptotal,ctotal);
                ctotal=nums[i];
            }
        }
        return Math.max(ctotal,ptotal); 
    }
}