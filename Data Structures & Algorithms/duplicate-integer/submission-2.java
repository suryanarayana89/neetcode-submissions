class Solution {
    public boolean hasDuplicate(int[] nums) {
        
        HashSet set = new HashSet<>();
        Boolean b = false;
        for (int i = 0; i < nums.length; i++) {
                if(set.add(nums[i])){
                    b = false; //setting boolean to false, since adding element is true
                }else{
                    b = true; //setting boolean to false, since adding element is false
                    return true;
                }
        }
        return b;
    }
}