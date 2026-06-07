class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int longest = 0;
        int cur = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] > nums[i]) {
                cur++;
            } else {
                longest = Math.max(longest, cur);
                cur = 1;
            }
        }
        longest = Math.max(longest, cur);
        cur = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i + 1] < nums[i]) {
                cur++;
            } else {
                longest = Math.max(longest, cur);
                cur = 1;
            }
        }
        longest = Math.max(longest, cur);
        return longest;
    }
}
