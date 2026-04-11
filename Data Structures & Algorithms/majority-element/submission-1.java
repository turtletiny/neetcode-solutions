class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> numCount = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            if(!numCount.containsKey(nums[i])){
                numCount.put(nums[i], 1);
            }else{
                int count = numCount.get(nums[i]);
                numCount.put(nums[i], count + 1);
            }

        }
        int max = -1;
        int returnval = 0;
        for (Map.Entry<Integer, Integer> entry : numCount.entrySet()) {
            if(entry.getValue() > max){
                max = entry.getValue();
                returnval = entry.getKey();
            }

        }
        return returnval;

    }
}