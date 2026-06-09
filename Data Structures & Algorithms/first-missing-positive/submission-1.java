class Solution {
    public int firstMissingPositive(int[] nums) {
        int smallestPositive = (int) Math.pow(2,31) -1;
        HashSet<Integer> numSet = new HashSet<>();
        for (int i : nums) {
            if (i >= 0) {
                numSet.add(i);
            }
            if (i < smallestPositive && i > 0) {
                smallestPositive = i;
            }
        }
        int count = 1;
        while (numSet.contains(count)){
            count++;
        }
        return count;
    }
}
