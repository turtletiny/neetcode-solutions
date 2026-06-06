class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> e : count.entrySet()){
            if (e.getValue() > nums.length / 3){
                res.add(e.getKey());
            }
        }
        return res;
    }
}