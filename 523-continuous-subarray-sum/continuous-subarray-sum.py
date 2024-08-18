from typing import List

class Solution:
    def checkSubarraySum(self, nums: List[int], k: int) -> bool:
        # Edge case where k is 0
        if k == 0:
            # To satisfy the problem's constraint for k = 0, we need at least two zeroes in a row
            return any(nums[i] == 0 and nums[i+1] == 0 for i in range(len(nums) - 1))
        
        # Dictionary to store the first occurrence of a specific remainder
        remainder_map = {0: -1}  # Initial remainder is 0 at index -1
        total_sum = 0
        
        for i in range(len(nums)):
            total_sum += nums[i]
            remainder = total_sum % k
            
            if remainder in remainder_map:
                if i - remainder_map[remainder] > 1:
                    return True
            else:
                remainder_map[remainder] = i
        
        return False
