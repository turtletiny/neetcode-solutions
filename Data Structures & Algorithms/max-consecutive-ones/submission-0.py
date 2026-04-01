class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        count = 0
        lengths = []
        for index, num in enumerate(nums):
            if num == 1:
                count += 1
            else:
                lengths.append(count)
                count = 0
            lengths.append(count)
        return max(lengths)

