class Solution:
    def addDigits(self, num: int) -> int:
        s=0
        while(num>=10):
            s=0
            while(num>0):
                r=num%10
                s=s+r
                num=num//10
            num=s
            
            
        return num