class Solution:
    def firstUniqChar(self, s: str) -> int:
        ans={}
        out=-1
        for i in s:
            if i not in ans:
                ans[i]=0
            else:
                ans[i]=1
        for i in s:
            if ans[i]==0:
                out=s.index(i)
                break
        return out
        