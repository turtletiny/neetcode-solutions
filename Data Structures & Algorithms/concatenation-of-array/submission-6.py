class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        ans = []
        n = len(nums)
        for i in range(2 * n):
            ans.append(0)

        for i in range(n):
            ans[i] = nums[i]
            ans[i+n]= nums[i] 
        return ans

        