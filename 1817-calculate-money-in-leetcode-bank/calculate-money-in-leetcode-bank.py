class Solution(object):
    def totalMoney(self, n):
        add = 1
        fake = 0
        tot = 0
        i = 0
        while i<n:
            tot = tot + add
            i = i+1
            if(i%7==0):
                fake = fake + 7
                add = (fake//7)+1
                print(add)
            else:
                add = add+1
        return tot
            


