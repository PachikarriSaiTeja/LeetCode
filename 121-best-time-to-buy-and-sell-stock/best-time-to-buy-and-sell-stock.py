class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        max=0
        min=999999999
        val=0
        for i in prices:
            if i<min:
                min=i
            val=i-min
            if val>max:
                max=val
        return max
        