class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        copy = []
        for i in nums:
            if i in copy:
                return True
            else:
                copy.append(i)
        
        return False