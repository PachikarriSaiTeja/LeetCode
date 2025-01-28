class Solution {
    public int removeElement(int[] nums, int val) {
        int j=nums.length-1;
        int cnt=0;
        int o=0;
        for(int i=0;i<nums.length;i++)
        {
            
                if(nums[i]!=val)
                {
                    cnt+=1;
                  nums[o]=nums[i];
                  o+=1;
                }
        }
        return cnt;
        
    }
}