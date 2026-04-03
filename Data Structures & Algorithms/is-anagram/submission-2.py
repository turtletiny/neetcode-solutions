class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        s = "".join(sorted(s)) #turn s into a string with characters in alphabetical order
        t = "".join(sorted(t)) 
        #sorted(s) is a list
        #"".join turns all elements in the list into a string, with "" space between them (no space)
        
        if s == t:
            return True
        else:
            return False
        