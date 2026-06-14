class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        HashSet<Integer> numSet = new HashSet<>();
        for (int n : nums){
            numSet.add(n);
        }
        for (int i = 1; i < nums.length+1; i++){
            if (!numSet.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}