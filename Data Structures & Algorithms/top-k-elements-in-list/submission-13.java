class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int i : nums) {
            count.put(i, count.getOrDefault(i, 0) + 1);
        }

        List<Integer>[] frequency = new List[nums.length + 1];

        for (int i = 0; i < frequency.length; i++) {
            frequency[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> e : count.entrySet()) {
            frequency[e.getValue()].add(e.getKey());
        }

        int[] res = new int[k];
        int i = 0;
        int highestFreq = frequency.length - 1;
        while (i < k) {
            for (int num : frequency[highestFreq]) {
                if (i == k) {
                    return res;
                }
                res[i++] = num;
            }
            highestFreq--;
        }
        return res;
    }}