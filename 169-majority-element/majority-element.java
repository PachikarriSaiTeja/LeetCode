class Solution {
    public int majorityElement(int[] nums) {
        int can=-999;
        int cnt=0;
        for(int i:nums){
        if(cnt==0)
            {
                can=i;
                cnt=1;
            }
        else{
            if(i==can)
            {
                cnt+=1;
            }
            else{
                cnt--;
            }
        }
        }
    return can;
        
    }
}