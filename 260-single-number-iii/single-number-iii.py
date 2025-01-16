class Solution:
    def singleNumber(self, nums: List[int]) -> List[int]:
        nums= sorted(nums)
        ans=[]
        for i in range(1,len(nums)):
            if nums[i-1]==nums[i]:
                nums[i-1]=999
                nums[i]=999
        for i in nums:
            if i!=999:
                ans.append(i)
        return ans

        

        

        