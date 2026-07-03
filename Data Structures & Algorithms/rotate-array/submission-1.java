class Solution {
    public void rotate(int[] nums, int k) {
        int[] copy = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int index = i + k;
            while (index > nums.length - 1) {
                index -= nums.length;
            }
            copy[index] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = copy[i];
        }
    }
}