class Solution:
    def numSubarrayProductLessThanK(self, nums: List[int], k: int) -> int:
        if k<=1:
            return 0
        j=0
        total=1
        mod=10000000007
        cnt=0
        for i in range(len(nums)):
            total*=nums[i]
            while(total>=k and j<len(nums)):
                total=total//nums[j]
                j+=1
            if(total<k):
                cnt+=(i-j+1)
        return cnt    



