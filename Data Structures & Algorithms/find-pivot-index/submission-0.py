class Solution:
    def pivotIndex(self, nums: list[int]) -> int:
        left_sum = 0
        right_sum = 0

        for i in range(len(nums)):
            right_sum = 0
            for j in nums[i+1:]:
                right_sum += j
            print(right_sum)
            if right_sum == left_sum:
                return i
            left_sum += nums[i]

        return -1
