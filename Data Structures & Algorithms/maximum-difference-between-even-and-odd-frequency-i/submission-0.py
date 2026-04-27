class Solution:
    def maxDifference(self, s: str) -> int:
        map = {}
        for char in s:
            if char not in map:
                map[char] = 1
            else:
                map[char] += 1


        max_odd = 0
        min_even = 999
        for key, value in map.items():
            if value%2 != 0 and value > max_odd:
                max_odd = value
            elif value%2 == 0 and value < min_even:
                min_even = value
        return (max_odd - min_even)

