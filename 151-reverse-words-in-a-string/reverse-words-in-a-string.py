class Solution(object):
    @staticmethod
    def swap(li,a,b):
        li[a],li[b] = li[b], li[a]
    def reverseWords(self, s):
        li = s.strip().split()
        li.reverse()
        return " ".join(li)
        