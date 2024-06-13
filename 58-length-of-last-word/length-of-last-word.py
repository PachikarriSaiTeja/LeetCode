class Solution(object):
    def lengthOfLastWord(self, s):
        a=[]
        for i in s:
            l=list(s.split(" "))
        for j in l:
            a.append(len(j))
        for k in a[::-1]:
            if k>0:
                return k
                    
       