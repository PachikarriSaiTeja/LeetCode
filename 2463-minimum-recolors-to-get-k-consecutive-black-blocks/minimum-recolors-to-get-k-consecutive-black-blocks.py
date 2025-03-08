class Solution:
    def minimumRecolors(self, blocks: str, k: int) -> int:
        cnt=0
        for i in blocks:
            if i=='W':
                cnt+=1
            else:
                cnt-=1
        if(cnt==len(blocks)):
            return k
        elif cnt==-len(blocks):
            return 0
        i=0
        j=k-1
        hm={}
        mv=0
        if(k>len(blocks)):
            return 0
        for i in range(k):
            if blocks[i] in hm:
                hm[blocks[i]]+=1
            else:
                hm[blocks[i]]=1
        if 'W' in hm:
            mv=hm['W']
        if 'B' in hm:
            if(hm['B']==k):
                return 0
        for i in range(k,len(blocks)):
            if blocks[i-k] in hm:
                hm[blocks[i-k]]-=1
            if blocks[i] in hm:
                hm[blocks[i]]+=1
            if hm['W']<mv:
                mv=hm['W']
        return mv
            




        
