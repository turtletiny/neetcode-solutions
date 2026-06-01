class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int zeroCount = 0, product = 1, zeroIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
                zeroIndex = i;
            } else {
                product *= nums[i];
            }
        }
        if (zeroCount == 0) {
            for (int i = 0; i < nums.length; i++) {
                output[i] = product / nums[i];
            }
        }
        if (zeroCount == 1) {
            output[zeroIndex] = product;
        }
        return output;

    }
}
