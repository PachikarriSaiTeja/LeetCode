class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        k=0
        if(target>nums[-1]):
            return len(nums)
        else:
            for i in range(len(nums)):
                if(target<=nums[i]):
                    k=i
                    return k
        