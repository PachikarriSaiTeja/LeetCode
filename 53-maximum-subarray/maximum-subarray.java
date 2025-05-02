class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxn=nums[0];
        int maxs=nums[0];
        for(int i=1;i<nums.length;i++){
            maxn=Math.max(maxn+nums[i],nums[i]);
            maxs=Math.max(maxn,maxs);
        }
        return maxs;
    }
}