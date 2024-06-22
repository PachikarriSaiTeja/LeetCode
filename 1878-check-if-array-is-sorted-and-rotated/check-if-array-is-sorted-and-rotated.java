class Solution {
    public boolean check(int[] nums) {
        int i;
        int c=0;
        int l=(nums.length)-1;
        if(nums.length<=2)
        {
             return true;
        }
       
        else{
        for(i=1;i<nums.length;i++)
        {
           if(nums[i]>=nums[i-1])
           {
            continue;
           }
           else{
            c++;
           }
        }
        
        if(c==1){
            if(nums[l]<=nums[0])
            {
                return true;
            }
            else{
        return false;
            }
        
    }
    else if(c==0)
    {
        return true;
    }
    return false;
    }
}
}