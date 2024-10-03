class Solution:
    def arrayRankTransform(self, arr: List[int]) -> List[int]:
        if len(arr)==0:
            return []
        hm={}
        j=0
        ar=sorted(arr)
        for i in ar:
            if i not in hm:
                j+=1
                hm[i]=j
        for i in range(len(arr)):
            arr[i]=hm[arr[i]]    
        return arr
       
        