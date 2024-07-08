class Solution:
    def reverseString(self, s: List[str]) -> None:
        k=''.join(s)
        ww=[]
     
        for i in k[::-1]:
            ww.append(i)
        for i in range(len(s)):
            s[i]=ww[i]
   

