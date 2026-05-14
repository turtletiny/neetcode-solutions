class Solution:
    def sortArray(self, nums: list[int]) -> list[int]:
        res = [nums[0]]
        for i in range(1,len(nums)):
            inserted = False
            for j in range(len(res)): 
                if res[j] == nums[i] or nums[i] < res[j]:
                    res.insert(j, nums[i])
                    inserted = True
                    break
            if not inserted:
                res.append(nums[i])

        return res
        