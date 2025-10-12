class Solution(object):
    def maximumEnergy(self, energy, k):
        lis = [0]*len(energy)
        for i in range(len(energy)-1,-1,-1):
            if(i+k <= len(energy)-1):
                energy[i] += energy[i+k]    
        print(energy)       
        return max(energy)




        