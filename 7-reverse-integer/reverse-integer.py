class Solution(object):
    def reverse(self, x):
        if x==0:
            return 0
        r=(str(x)[::-1])
        l=[]
        hi=2**31-1
        lo=-2**31-1
        for i in r:
            l.append(i)
        for j in range(len(l)):
            if l[0]=='0' and l[-1]=='-':
                l.remove('0')
                l.remove('-')
            elif l[0]=='0':
                l.remove('0')
            elif l[-1]=='-':
                l.remove('-')
        rev=int(''.join(l))
        if(rev>hi or rev<lo):
            return 0
        elif(x>0):
            return rev
        elif(x<0):  
            return -rev

