class Solution {
    public boolean hasDuplicate(int[] nums) {
       HashSet<Integer> numSet = new HashSet<>();

       for (int n : nums) {
        numSet.add(n);
       } 

       return numSet.size() != nums.length;
    }
}