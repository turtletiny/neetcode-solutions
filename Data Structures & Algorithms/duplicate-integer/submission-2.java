class Solution {
    public boolean hasDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++){
            for (int j = 0; j < nums.length; j++){
                if (nums[j] == nums[i] && i != j){
                    return true;
                }
                
            }
        }
        return false;
        
        
    }
}
##brute force sooltion - checking every number against every other number
##inferior solution to java submission 1 - checks some pairs twice
