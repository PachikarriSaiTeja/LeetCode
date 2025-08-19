class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long cnt = 0;
        long zcnt = 0;
        for(int i=0; i<nums.length;i++){
            if(nums[i] == 0)
            {
                zcnt+=1;
            }
            if(zcnt != 0 && nums[i] != 0)
            {
                cnt += (zcnt*(zcnt+1))/2;
                zcnt = 0;
            }
        }
        if(zcnt != 0) cnt += (zcnt*(zcnt+1))/2;
        return cnt;
    }
    
}