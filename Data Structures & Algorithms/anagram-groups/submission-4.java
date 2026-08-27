class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, Integer> strMap = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for (String s : strs) {
            String sortedString = sortStr(s);
            if (!strMap.containsKey(sortedString)) {
                strMap.put(sortedString, result.size());
                result.add(new ArrayList<String>(Arrays.asList(s)));
            } else {
                int idx = strMap.get(sortedString);
                result.get(idx).add(s);
            }
        }

        return result;
    }

    private String sortStr(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
