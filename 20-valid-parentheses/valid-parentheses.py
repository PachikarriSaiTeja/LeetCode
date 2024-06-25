from collections import deque
class Solution:
    def isValid(self, s: str) -> bool:
        stack=deque()
        m={'{':'}','[':']','(':')'}
        for i in s:
            if(i in m.keys()):
                stack.append(i)
            elif(i in m.values()):
                if not stack:
                    return False
                if i==m[stack[-1]]:
                    stack.pop()  
                else:
                    return False   
            else:
                return False   
        return len(stack)==0