class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int i : nums) {
            count.put(i, count.getOrDefault(i, 0) + 1);
        }
        System.out.println(count);

        int[] res = new int[k];
        int i = 0;
        for (Map.Entry<Integer, Integer> e : count.entrySet()) {
            if (i < k) {
                res[i] = e.getKey();
                i++;
            } else {
                int minIndex = 0;
                for (int j = 0; j < k; j++) {
                    if (count.get(res[j]) < count.get(res[minIndex])) {
                        minIndex = j;
                    }
                }
                if (e.getValue() > count.get(res[minIndex])) {
                    res[minIndex] = e.getKey();
                }
            }
        }
        return res;
    }
}

