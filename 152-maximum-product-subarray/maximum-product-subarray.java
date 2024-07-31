class Solution {
    public int maxProduct(int[] nums) {
        if (nums.length == 0) return 0; 

        double maxs = nums[0]; 
        double mins = nums[0]; 
        double maxe = nums[0]; 
          double temp;
          int t;
        for (int i = 1; i < nums.length; i++) {
            // if (nums[i] < 0) {
               
            //      t=mins;
            //      mins=maxs;
            //      maxs=t;
            // }
           if(nums[i]==0)
            {
                maxs=0;
                mins=0;
                maxe=Math.max(maxe,0);
            }
            
            else{
           temp=Math.max(Math.max(maxs*nums[i],mins*nums[i]),nums[i]);
           mins=Math.min(Math.min(maxs*nums[i],mins*nums[i]),nums[i]);
           maxs=temp;
           maxe = Math.max(maxe, maxs);
        }
        }
        return (int) maxe;
    }
}
