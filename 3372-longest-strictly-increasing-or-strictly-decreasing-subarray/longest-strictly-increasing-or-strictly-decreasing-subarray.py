class Solution:
    def longestMonotonicSubarray(self, nums: List[int]) -> int:
        i=0
        j=-1
        inmx=1
        demx=1

        mx=1
        for i in range(1,len(nums)):
            j=1
           
            if(nums[i-1]>nums[i]):
               
                inmx+=1
                mx=max(inmx,mx)
            
            else:
                mx=max(inmx,mx)
                print(mx)
                inmx=1
        for i in range(1,len(nums)):
            print('f')
            if(nums[i-1]<nums[i]):
                demx+=1
                mx=max(mx,demx)
            else:
                
                mx=max(demx,mx)
                demx=1

        
       
        return mx