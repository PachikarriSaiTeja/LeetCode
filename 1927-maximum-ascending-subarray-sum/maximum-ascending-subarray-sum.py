class Solution:
    def maxAscendingSum(self, nums: List[int]) -> int:
        csum=nums[0]
        psum=nums[0]
        for i in range(1,len(nums)):
            if nums[i]>nums[i-1]:
                csum+=nums[i]
            else:
                psum=max(csum,psum)
                csum=nums[i]
        return(max(csum,psum))
        