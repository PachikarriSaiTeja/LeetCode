class Solution {
    public int search(int[] nums, int target) {
        
        int i=0;
        int j=nums.length-1;
        int m=0;
      for(i=0;i<=j;i++)
      {
        if(nums[i]==target)
        {
            return i;
        }
      }
      return -1;
    }
}