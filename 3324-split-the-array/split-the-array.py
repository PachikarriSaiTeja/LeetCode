class Solution:
    def isPossibleToSplit(self, nums: List[int]) -> bool:
        ans={}
        for i in nums:
            if i not in ans:
                ans[i]=1
            else:
                ans[i]=ans[i]+1
        for value in ans.values():
            if value>2:
                return False
        return True
        