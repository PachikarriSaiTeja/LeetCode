class Solution:
    def checkPowersOfThree(self, n: int) -> bool:
        powers=[1 ,3 ,9 ,27 ,81 ,243 ,729 ,2187 ,6561 ,19683 ,59049 ,177147 ,531441 ,1594323 ,4782969 ,14348907,43046721]
        i=0
        
        while powers[i]<=n:
            if(n==powers[i]):
                return True
            i+=1
        sum=powers[i-1]
        for j in range(i-2,-1,-1):
            sum=sum+powers[j]
            if(sum==n):
                return True
            elif(sum>n):
                sum=sum-powers[j]
            print(sum)
        return False
            
            