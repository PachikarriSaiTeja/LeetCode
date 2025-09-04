class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        
                Arrays.sort(nums);
                int ans = 1;
                int res = 1;
                for(int i=1;i<nums.length;i++)
                {
                    if(nums[i] - nums[i-1] == 1)
                    {
                        ans+=1;
                    }
                    if(nums[i] - nums[i-1] > 1 && ans != 1)
                    {
                        res = Math.max(res,ans);
                        ans = 1;
                    }


                }
                res =  Math.max(res,ans);
                return res;

    }
}