class Solution(object):
    def largestNumber(self, nums):
        if(len(nums)==1):
            return str(nums[0])
        elif(sum(nums)==0):
            return "0"
        arr = list(map(str, nums))
        for i in range(len(nums)):
            for j in range(1,len(nums)):
                if(arr[j-1]+arr[j]<arr[j]+arr[j-1]):
                    arr[j-1],arr[j]=arr[j],arr[j-1]
        return ''.join(arr)



        
        