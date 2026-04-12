class Solution:
    def lengthOfLastWord(self, s: str) -> int:
        sList = s.split(" ");
        while sList[-1] == "":
            sList.remove(sList[-1])
        count = 0
        for char in sList[-1]:
            count += 1
        
        return count



