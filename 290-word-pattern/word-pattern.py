class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        ans={}
        res={}
        an=s.split(" ")
        if(len(an)!=len(pattern)):
            return False
        for i in range(len(pattern)):
            if pattern[i] not in ans:
                ans[pattern[i]]=an[i]
            else:
                if ans[pattern[i]]!=an[i]:
                    return False
        for i in range(len(an)):
            if an[i] not in res:
                res[an[i]]=pattern[i]
            else:
                if res[an[i]]!=pattern[i]:
                    return False
        return True