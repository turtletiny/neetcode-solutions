class Solution {
    public void moveZeroes(int[] nums) {
        int zeroCount = 0;
        int l = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            } else {
                nums[l++] = nums[i];
            }
        }
        int k = nums.length - 1;
        while (zeroCount > 0) {
            nums[k--] = 0;
            zeroCount--;
        }
    }
}
