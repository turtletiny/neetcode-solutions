class Solution {
    public int removeElement(int[] nums, int val) {
        int[] left = new int[nums.length];
        int i = 0;

        for (int n : nums) {
            if (n != val) {
                left[i] = n;
                i++;
            }
        }

        for (int j = 0; j < i; j++) {
            nums[j] = left[j];
        }
        return i;
    }
}