class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       if (m == 0 && n != 0) {
    for (int i = 0; i < n; i++) {
        nums1[i] = nums2[i]; // Copy nums2 into nums1
    }
    return;
} else if (n == 0) {
    return; // Nothing to merge if nums2 is empty
}


      
        int j=0;
        int o=0;
        for(int i=m;i<m+n;i++)
        {
            nums1[i]=nums2[o];
            o+=1;
        }
        Arrays.sort(nums1);
       
      

       
    }
}