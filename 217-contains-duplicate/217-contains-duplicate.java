class Solution {
    public boolean containsDuplicate(int[] nums) {
        /*
        ---------------Using Hashset----------------
        Set<Integer> set = new HashSet();
        for (int i = 0; i<nums.length; i++){
            if(!set.add(nums[i]))
                return true;
        }
        return false;
        */
        //USing sorting
        Arrays.sort(nums);
        for (int i = 1; i<nums.length; i++){
            if(nums[i] == nums[i-1])
                return true;
        }
        return false;
    }
}