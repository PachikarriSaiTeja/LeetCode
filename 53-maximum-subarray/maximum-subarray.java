class Solution {
    public int maxSubArray(int[] nums) {
        int maxe=nums[0];
        int maxs=nums[0];
        for(int i=1;i<nums.length;i++)
        {
           maxe= Math.max(nums[i],nums[i]+maxe);
           maxs=Math.max(maxe,maxs);
        }
        return maxs;
    }
}