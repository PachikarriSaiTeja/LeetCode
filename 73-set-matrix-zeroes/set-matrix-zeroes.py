class Solution:
    def setZeroes(self, matrix: List[List[int]]) -> None:
        cList=[]
        rList=[]
        for i in range(len(matrix)):
            for j in range(len(matrix[0])):
                if matrix[i][j]==0:
                    cList.append(i)
                    rList.append(j)

        for i in range(len(matrix)):
            for j in range(len(matrix[0])):
                if i in cList:
                    matrix[i][j]=0
                if j in rList:
                    matrix[i][j]=0

        
        