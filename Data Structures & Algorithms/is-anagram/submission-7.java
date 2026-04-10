class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }

        HashMap <Character, Integer> sCount = new HashMap<>();

        for (int i = 0; i < s.length(); i++){
            if(!sCount.containsKey(s.charAt(i))){
                sCount.put(s.charAt(i), 1);

            }else{
                int count = sCount.get(s.charAt(i));
                sCount.put(s.charAt(i), count + 1 );
            }
                
        }
        HashMap <Character, Integer> tCount = new HashMap<>();
        for (int i = 0; i < s.length(); i++){

            if(!tCount.containsKey(t.charAt(i))){
                tCount.put(t.charAt(i), 1);

            }else{
                int count = tCount.get(t.charAt(i));
                tCount.put(t.charAt(i), count + 1 );
            }
        }
        
        for (Map.Entry<Character, Integer> entry : sCount.entrySet()){
            char key = entry.getKey();
            if(!sCount.get(key).equals(tCount.get(key))){
                return false;
            }
            }
            return true;
        }
    }
