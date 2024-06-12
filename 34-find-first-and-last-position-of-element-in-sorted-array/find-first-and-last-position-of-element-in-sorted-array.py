class Solution:
    def searchRange(self, nums: List[int], target: int) -> List[int]:
        kk=[]
        cnt=0
        for i in range(len(nums)):
            if(nums[i]==target):
                kk.append(i)
                cnt+=1
        if(cnt>=1):
            return[min(kk),max(kk)]
        else:
            return[-1,-1]
                
        
        
        