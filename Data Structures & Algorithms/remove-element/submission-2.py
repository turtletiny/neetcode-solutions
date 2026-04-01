class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        k = len(nums)
        for i in nums:
            if i == val:
                k -= 1
        while val in nums:
            nums.remove(val)
        
        return k