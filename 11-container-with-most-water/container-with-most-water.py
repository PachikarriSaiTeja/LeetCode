class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxn = 0
        maxs = 0
        i = 0
        j  = len(height)-1
        while i<j:
            maxn = min(height[i],height[j])*(j-i) 
            if(height[i]<height[j]):
                i+=1
            else:
                j-=1
            maxs = max(maxs,maxn)
        return maxs