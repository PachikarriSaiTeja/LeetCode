class Solution(object):
    def twoSum(self, nums, target):
        k=sorted(nums)
        i=0
        j=len(nums)-1
        con=[]
        l=[]
        while True:
            if(k[i]+k[j]==target):
                l.append(k[i])
                l.append(k[j])
                break
            elif k[i]+k[j]>target:
                j-=1
            elif k[i]+k[j]<target:
                i+=1
        for i in range(len(nums)):
                 if nums[i] in l:
                     con.append(i)
        return(con)

        


        
        
