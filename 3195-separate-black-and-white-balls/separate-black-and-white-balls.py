class Solution:
    def minimumSteps(self, s: str) -> int:
        i = 0
        j = len(s) - 1
        cnt = 0
        ans=0
        while j>-1:

            if s[j]=='0':
                cnt+=1
            else:
                 ans+=cnt
            j-=1
        return ans
            

        