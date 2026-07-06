class Solution {
    public boolean hasDuplicate(int[] nums) {
    Set<Integer> copy = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(!copy.add(nums[i])){
                return true;
            }
        }
    return false;
}
}