class Solution {

    public int subarraySum(int[] nums, int k) {
        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            int count = nums[i];
            if (count == k) {
                res++;
            }
            for (int j = i + 1; j < nums.length; j++) {
                count += nums[j];
                if (count == k) {
                    res++;
                }
            }
        }
        return res;
    }
}