class Solution {

    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> count= new HashMap<>();
        count.put('b',0);
        count.put('a', 0);
        count.put('l', 0);
        count.put('o', 0);
        count.put('n', 0);
        for (int i = 0; i < text.length(); i++){
            if (count.containsKey(text.charAt(i))){
                if (text.charAt(i) == 'l' || text.charAt(i) == 'o' ){
                    count.put(text.charAt(i), count.get(text.charAt(i)) + 1);
                } else {
                    count.put(text.charAt(i), count.get(text.charAt(i)) + 2);
                }

            }
        }


        int min = count.get('b');
        for (Character c : count.keySet()){
            min = Math.min(min, count.get(c));
        }
        return min / 2;
    }
}