class Solution:
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        map = {}
        for string in strs:
            if "".join(sorted(string)) not in map:
                map["".join(sorted(string))] = [string]
            else:
                map["".join(sorted(string))].append(string)

        res = []
        for array in map.values():
            res.append(array)
        return res
