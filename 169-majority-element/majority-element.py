class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        if(len(nums)==1):
            return nums[0]
        elif len(nums)==2:
            if nums[0]==nums[1]:
                return nums[0]
        arr=sorted(nums)
        i=len(arr)//2
        j=i+1
        if(arr[i]==arr[j] or arr[i]==arr[i-1]):
            return arr[i]
            