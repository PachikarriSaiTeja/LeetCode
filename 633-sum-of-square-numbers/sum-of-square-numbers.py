class Solution:
    def judgeSquareSum(self, c: int) -> bool:
        j=int(c**0.5)
        i=0
        while(i<=j):
            sumz=(i*i)+(j*j)
            if sumz==c:
                return True
            elif sumz>c:
                j-=1
            else:
                i+=1
        return False

