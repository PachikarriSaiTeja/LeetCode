class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        n = len(ransomNote)
        m = len(magazine)
        ransomNote=sorted(ransomNote)
        magazine=sorted(magazine)
        i=0
        for j in magazine:
            if i<n and ransomNote[i]==j:
                i+=1
        return i==n

        