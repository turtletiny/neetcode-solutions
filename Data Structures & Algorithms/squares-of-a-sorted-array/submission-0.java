class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int l = 0;
        int r = nums.length - 1;
        int i = nums.length - 1;

        while (l < r || i >= 0) {
            if (Math.abs(nums[l]) > Math.abs(nums[r])) {
                res[i] = nums[l] * nums[l];
                l++;
            } else if (Math.abs(nums[l]) <= Math.abs(nums[r])) {
                res[i] = nums[r] * nums[r];
                r--;
            }
            i--;
        }
        return res;
    }
}
