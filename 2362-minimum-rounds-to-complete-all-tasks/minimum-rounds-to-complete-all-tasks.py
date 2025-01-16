class Solution:
    def minimumRounds(self, tasks: List[int]) -> int:
        ans={}
        mx=0
        for i in tasks:
            if i not in ans:
                ans[i]=1
            else:
                ans[i]=ans[i]+1
        for keys in ans.values():
            if keys<2:
                return -1
        for keys in ans.values():
            while keys!=0:
                if keys==3 or keys==5:
                    keys-=3
                    mx+=1
                elif keys==2 or keys==4:
                    keys-=2
                    mx+=1
                else:
                    keys-=3
                    mx+=1
        return mx

                

            

       