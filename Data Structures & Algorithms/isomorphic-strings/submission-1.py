class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        test_str = ""
        map = {}
        j = 0
        for index, char in enumerate(s):
            if char in map:
                pass
            if char not in map and t[index] in map.values():
                return False
            else:
                map[char] = t[index]

        for char in s:
            test_str += map[char]


        return test_str == t
