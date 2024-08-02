class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        pf=[0]*len(nums)
        sf=[0]*len(nums)
        ans=[]
        pf[0]=nums[0]
        sf[-1]=nums[-1]
        i=1
        j=-2
        for i in range(1,len(nums)):
            pf[i]=pf[i-1]*nums[i]
            sf[j]=sf[j+1]*nums[j]
            j=j-1
        if nums[0]!=0:
            ans.append(sf[0]//nums[0])
        else:
            ans.append(sf[1])
        for i in range(1,len(nums)-1):
            ans.append(pf[i-1] * sf[i+1])
        ans.append(pf[-2])
    
    
        return ans
    