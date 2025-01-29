class Solution {
    public int removeDuplicates(int[] nums) {
        int pr=-999;
        int j=0;
        for(int i:nums){

            if(pr!=i){
            nums[j]=i;
            j++;
            pr=i;
    }
        }
        return j;
        
    }
}