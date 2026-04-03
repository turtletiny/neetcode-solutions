class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False           #optimisation - remove the need to compare characters if they are not of equal length

        s = "".join(sorted(s)) #turn s into a string with characters in alphabetical order
        t = "".join(sorted(t)) 
        #sorted(s) is a list
        #"".join turns all elements in the list into a string, with "" space between them (no space)
        
        if s == t:
            return True
        else:
            return False
        