class Solution:
    def isPalindrome(self, s: str) -> bool:
        str = ""
        for char in s:
            if char.isalnum():
                str += char.lower()

        l = 0
        r = len(str) - 1
        while l < r:
            if str[l] != str[r]:
                return False
            l += 1
            r -= 1
        return True
