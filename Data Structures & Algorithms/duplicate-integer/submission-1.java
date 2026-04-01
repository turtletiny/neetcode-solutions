class Solution {
    public boolean hasDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){   //j is always i+1; this is so the check is for every number after i **NOTE: j is updated as i increases**
                if (nums[j] == nums[i]){
                    return true;
                }
                
            }
        }
        return false;
        
        
    }
}

//brute force solution - checking every number against every other number
