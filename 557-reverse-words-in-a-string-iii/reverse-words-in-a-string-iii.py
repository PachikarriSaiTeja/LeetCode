class Solution:
    def reverseWords(self, s: str) -> str:
        d=[ ]
        for i in s:
            k=list(s.split(" "))
        for j in k:
            d.append(j[::-1])
        return " ".join(d)
