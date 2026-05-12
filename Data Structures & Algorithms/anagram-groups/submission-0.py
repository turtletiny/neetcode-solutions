class Solution:
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:

        # make hashmap of sorted str
        # if the sorted str is in the hashamp, then append it to the list in that hashamp
        map = {}
        res = []

        for i in strs:
            if "".join(sorted(i)) not in map:
                map["".join(sorted(i))] = [i]
            else:
                map["".join(sorted(i))].append(i)

        for i in map.values():
            res.append(i)
        return res
