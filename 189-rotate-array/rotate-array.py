class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        k=k%len(nums)
        j=len(nums)-k-1
        for i in range(len(nums)-k):
            if(i<j):
                 nums[i],nums[j]=nums[j],nums[i]

            j-=1
        j=len(nums)-1
    
        for i in range(len(nums)-k,len(nums)):
            if(i<j):

                nums[i],nums[j]=nums[j],nums[i]

            j-=1
   
        j=len(nums)-1
        for i in range(len(nums)):
            if(i<j):
                nums[i],nums[j]=nums[j],nums[i]

            j-=1
     
        
            
        