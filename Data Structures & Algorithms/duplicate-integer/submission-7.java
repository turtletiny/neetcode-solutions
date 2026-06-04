class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> numset = new HashSet<>();
        for (int i : nums){
            if (numset.contains(i)){
                return true;
            }
            numset.add(i);
        }
        return false;
    }
}