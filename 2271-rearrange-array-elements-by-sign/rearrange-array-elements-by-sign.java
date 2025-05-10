class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n =nums.length;
        int [] pos = new int[n/2];
        int [] neg = new int[n/2];
        int index1 =0;
        int index=0;
        for (int i =0;i<n;i++){
            if (nums[i]>0){
                pos[index1]=nums[i];
                index1++;
            }
            else{
                neg[index]=nums[i];
                index++;
            }
        }
       for (int i = 0; i < n / 2; i++) {
            nums[i * 2] = pos[i];
            nums[i * 2 + 1] = neg[i];
        }
        return nums;
    }
}