class Solution:
    def twoSum(self, nums: list[int], target: int):
        map = {}
        for i in range(len(nums)):
            if target - nums[i] in map and i != map[target - nums[i]]:
                return [map[target - nums[i]], i]
            map[nums[i]] = i

