class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        res = ""
        for i in range(len(strs[0])): #longest common prefix can only be as long as string length. Take the first string arbritrarily
            for s in strs: 
                if i == len(s) or s[i] != strs[0][i]:
                    return res
            res += strs[0][i]

        return res