class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        pr=0
        ans={0:1}
        cnt=0
        for i in nums:
            pr+=i
            if pr-k in ans:
                cnt+=ans[pr-k]
            if pr not in ans:
                ans[pr]=1
            else:
                ans[pr]+=1
            
        return cnt
        
          
           

        return cnt