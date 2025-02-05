class Solution(object):
    def isIsomorphic(self, s, t):
        ans={}
        res={}
        for i in range(len(s)):
            if s[i] in ans and ans[s[i]]!=t[i]:
                return False
            else:
                ans[s[i]]=t[i]
        for i in range(len(t)):
            if t[i] in res and res[t[i]]!=s[i]:
                return False
            else:
                res[t[i]]=s[i]
        return True
                
                
                
        