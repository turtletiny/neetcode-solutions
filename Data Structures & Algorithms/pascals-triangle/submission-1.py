class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        prev = [1]
        current = [1]
        final = [[1]]




        for i in range(numRows-1):
            for j in range(len(prev)-1):
                    current.append(prev[j] + prev[j+1])
            current.append(1)
            final.append(current)
            prev = current
            current = [1]
        
        
        
        return final