class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        k=[]
        c=0
        i=0
        j=len(nums)-1
        while(i<=j):
            if(nums[i]==1):
                c+=1
                i+=1
            elif(nums[i]==0 or i==j):
                k.append(c)
                c=0
                i+=1
            k.append(c)
        return(max(k))
               
