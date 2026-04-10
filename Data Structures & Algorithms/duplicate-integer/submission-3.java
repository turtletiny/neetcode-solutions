class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap <Integer, Integer> numCount = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (numCount.containsKey(nums[i])){
                return true;
            }else{
                numCount.put(nums[i], 1 );
            }

        }
        return false;

    }
}
// utilised hashmaps to count numbers - much more efficient compared to brute force method
