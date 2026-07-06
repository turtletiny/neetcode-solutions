class Solution {
    public int maxArea(int[] heights) {
        int maxArea = 0;
        int l = 0;
        int r = heights.length - 1;

        while (l < r) {
            int curArea = Math.min(heights[l], heights[r]) * (r - l);
            maxArea = Math.max(maxArea, curArea);

            if (heights[l] < heights[r]) {
                l++;
            } else if (heights[l] > heights[r]) {
                r--;
            } else {
                if (heights[l + 1] > heights[r - 1]) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return maxArea;
    }
}