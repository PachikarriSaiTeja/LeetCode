class Solution(object):
    def reverse(self, x):
        h=2**31-1
        l=-2**31-1
        ab=abs(x)
        y=int(str(ab)[::-1])
        if(y>h or y<l):
            return 0
        elif(x>0):
            return y
        elif(x<0):
            return -y
        return 0
        