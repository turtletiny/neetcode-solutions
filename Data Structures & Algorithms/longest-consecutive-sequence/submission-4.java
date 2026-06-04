class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int res = 1;
        for (int i : nums) {

            int cur = 1;
            int j = i;
            if (!set.contains(j - 1)) {
                while (set.contains(j + 1)) {
                    cur++;
                    j++;
                }
                if (cur > res) {
                    res = cur;
                }
            }
        }
        return res;
    }
}
