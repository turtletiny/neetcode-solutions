class Solution:
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        map = defaultdict(list)
        for s in strs:
            count = 26 * [0]
            for char in s:
                count[ord(char) - 97] += 1
            map[tuple(count)].append(s)

        return list(map.values())
