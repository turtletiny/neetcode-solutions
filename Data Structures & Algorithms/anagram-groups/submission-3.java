class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, Integer> sortedStrMap = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            String sortedStr = sortedString(strs[i]);
            if (sortedStrMap.containsKey(sortedStr)) {
            res.get(sortedStrMap.get(sortedStr)).add(strs[i]);
            } else {
                sortedStrMap.put(sortedStr, res.size());
                res.add(new ArrayList<String>(Arrays.asList(strs[i])));
            }
        }
        return res;
        

    }

    private String sortedString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}

