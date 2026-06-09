class Solution {
    public String kthDistinct(String[] arr, int k) {
        Set<String> unique = new HashSet<>();
        Set<String> duplicate = new HashSet<>();
        for (String s : arr) {
            if (unique.contains(s)) {
                unique.remove(s);
                duplicate.add(s);
            } else if (!duplicate.contains(s)){
                unique.add(s);
            }
        }
        for (String s : arr) {
            if (unique.contains(s)){
                k--;
            }
            if (k == 0){
                return s;
            }
        }
        return "";
    }
}