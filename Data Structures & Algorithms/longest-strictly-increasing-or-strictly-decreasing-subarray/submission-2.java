class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if (nums.length == 0 || nums.length == 1){
            return nums.length;
        }
        int longest = 0;
        int cur = 1;
        boolean isIncreasing = nums[0] > nums[1];
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                cur = 1;
                longest = Math.max(cur, longest);
                continue;
            }
            boolean internal = (nums[i + 1] > nums[i]) ? true : false;
            if (internal != isIncreasing) {
                cur = 1;
                longest = Math.max(cur, longest);
                isIncreasing = internal;
            }
            cur++;
            longest = Math.max(longest, cur);
        }
        return longest;
    }
}
