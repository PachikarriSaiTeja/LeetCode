class Solution(object):
    def lemonadeChange(self, bills):
        cnt = 0
        cnt2 = 0
        dic = {5:0,10:0}
        for i in bills:

            if i == 5:
                dic[5] = dic[5]+1

            elif i == 10:
                dic[10] = dic[10]+1
                cnt = dic[5]
                if cnt >= 1:
                    dic[5] = dic[5]-1 
                else:
                    return False
            elif i == 20:
                cnt = dic[5]
                cnt2 = dic[10]
                
                if cnt>=1 and cnt2 >= 1:
                    dic[10] = dic[10]-1
                    dic[5] = dic[5] - 1
                elif cnt >= 3:
                    dic[5] = dic[5]-3
                else:
                    return False
        return True

                    
            

       
