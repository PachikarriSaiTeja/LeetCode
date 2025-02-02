class Solution:
    def check(self, nums: List[int]) -> bool:
        x=0
        for i in range(1,len(nums)):
            if(nums[i-1]>nums[i]):
                x=i

        arr=sorted(nums)
        for i in range(len(nums)):
            if(arr[i] != nums[(i+x)%len(nums)]):
                return False
        return True

        

            

            
        