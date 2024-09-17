class Solution:
    def uncommonFromSentences(self, s1: str, s2: str) -> List[str]:
        s3=s1+" "+s2
        aa=[]
        arr=s3.split(" ")
        ans={}
        for i in arr:
            if i in ans:
                ans[i]=ans[i]+1
            else:
                ans[i]=1
        for i in arr:
            if ans[i]==1:
                aa.append(i)
        return (aa)
        

        