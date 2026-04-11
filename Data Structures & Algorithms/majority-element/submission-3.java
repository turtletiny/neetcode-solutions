class Solution {
    public int majorityElement(int[] nums) {
       HashMap<Integer, Integer> counter = new HashMap<>();
       for (int i : nums){
            
            if (!counter.containsKey(i)){
                counter.put(i, 1);

            }else{
                int currentCount = counter.get(i);
                counter.put(i, currentCount + 1);
            }
            

       }
       int max = 0;
       int returnKey = 0;
       for(Map.Entry<Integer, Integer> entry : counter.entrySet()){
            if (entry.getValue() > max){
                max = entry.getValue();
                returnKey = entry.getKey();

            }

       }
       return returnKey;
 
    }
}