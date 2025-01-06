class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        r=len(matrix)
        c=len(matrix[0])
        ans=[]
        for i in range(r):
            for j in range(c):
                if matrix[i][j]==0:
                    ans.append(i)
                    ans.append(j)
        print(ans)
        iv=0
        jv=1
        while(iv<len(ans)-1):
            for i in range(c):
                matrix[ans[iv]][i]=0
            iv+=2
        while(jv<len(ans)):
            for j in range(r):
                matrix[j][ans[jv]]=0
            jv+=2

       
        