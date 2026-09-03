class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer, Integer> numToIndex = new HashMap<>();
       for (int i = 0; i < nums.length; i++) {
        numToIndex.put(nums[i], i);
       } 
       for (int i = 0; i < nums.length; i++) {
        int n = nums[i];
        if (numToIndex.containsKey(target - n) && numToIndex.get(target - n) != i) {
            return new int[] {i, numToIndex.get(target - n)};
        }
       }
       return new int[0];
    }
}
