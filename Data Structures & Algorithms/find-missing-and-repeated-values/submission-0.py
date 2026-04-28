class Solution:
    def findMissingAndRepeatedValues(self, grid: list[list[int]]) -> list[int]:
        ans = []
        grid_list = []
        missing_num = None
        repeat_num = None


        
        for i in grid:
            for j in i:
                grid_list.append(j)
        grid_list.sort()


        for i in range(1, len(grid_list)):
            if grid_list[i] == grid_list[i-1]:
                repeat_num = grid_list[i]


        for i in range(len(grid) * len(grid)):
            if i+1 not in grid_list:
                missing_num = i+1
        


        ans.append(repeat_num)
        ans.append(missing_num)
        return ans
        