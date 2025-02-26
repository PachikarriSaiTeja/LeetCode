class Solution:
    def subarraySum(self, nums: List[int], k: int) -> int:
        pre=0
        hm={0:1}
        cnt=0
        for i in nums:
            pre=pre+i
            if pre-k in hm:
                cnt+=hm[pre-k]
            if pre in hm:
                hm[pre]+=1
            else:
                hm[pre]=1
        return cnt
