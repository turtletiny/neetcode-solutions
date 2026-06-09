class Solution {
    public String kthDistinct(String[] arr, int k) {
        Set<String> orderedSet = new LinkedHashSet<>();
        ArrayList<String> duplicates = new ArrayList<>();
        for (String s : arr){
            if (orderedSet.contains(s)){
                duplicates.add(s);
            }
            orderedSet.add(s);
        }
        for (String s : duplicates){
            orderedSet.remove(s);
        }
        if (orderedSet.size() < k){
            return "";
        }
        int count = 1;
        for (String s : orderedSet){
            if (count == k){
                return s;
            }
            count++;
        }
        return "";
    }
}