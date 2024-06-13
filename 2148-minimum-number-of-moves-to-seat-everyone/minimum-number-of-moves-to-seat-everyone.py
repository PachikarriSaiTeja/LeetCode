class Solution(object):
    def minMovesToSeat(self, seats, students):
        k=sorted(students)
        l=sorted(seats)
        c=0
        for i in range(len(students)):
            c+=abs(k[i]-l[i])
        return (c)

        