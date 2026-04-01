class Solution:
    def scoreOfString(self, s: str) -> int:
        score = 0
        for index, char in enumerate(s[:-1]):
           score += abs(ord(char) - ord(s[index+1]))
        
        return score
        