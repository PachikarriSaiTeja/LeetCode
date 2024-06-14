class Solution:
    def minIncrementForUnique(self, nums: List[int]) -> int:
        o=0
        m=sorted(nums)
        for i in range(1,len(nums)):
            if m[i]<=m[i-1]:
                o+=m[i-1]-m[i]+1
                m[i]=m[i-1]+1
        return o
       