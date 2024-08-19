class Solution:
    def findMaxAverage(self, nums: List[int], k: int) -> float:

        j=k-1
        sum=0
        for i in range(0,k):
            sum+=nums[i]
        pre=sum
        for j in range(k,len(nums)):
            sum=nums[j]+sum-nums[j-k]
            pre=max(pre,sum)
        return(pre/k)
            

                     




