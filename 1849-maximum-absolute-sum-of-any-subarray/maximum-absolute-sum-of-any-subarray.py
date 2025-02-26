class Solution:
    def maxAbsoluteSum(self, nums: List[int]) -> int:
        maxn=nums[0]
        maxs=nums[0]
        minn=nums[0]
        minfar=nums[0]
        for i in range(1,len(nums)):
            minn=min(nums[i],nums[i]+minn)
            maxn=max(nums[i],nums[i]+maxn)
            maxs=max(maxs,maxn,minn,minfar)
            minfar=min(maxs,minn,maxn,minfar)
        return max(abs(minfar),maxs)
