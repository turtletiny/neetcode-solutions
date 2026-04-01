class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        vals = []
        numslength = len(nums)
        for i in nums:
            if i == val:
                vals.append(i)

        while val in nums:
            nums.remove(val)
        
        return numslength - len(vals)