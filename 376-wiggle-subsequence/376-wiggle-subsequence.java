class Solution {
    public int wiggleMaxLength(int[] nums) {
        int n  = nums.length;
        if (n==1)
            return 1;
        if(n==2)
           if (nums[0]!=nums[1])
                return 2;
            else
                return 1;
        int prevDiff = 0;
        int currDiff;
        int c = 1;
        for (int i =1; i<n;i++){
            currDiff = nums[i] - nums[i-1];
            if ((currDiff < 0 && prevDiff >= 0)  || (currDiff > 0 && prevDiff <= 0)){
                c++;
                prevDiff = currDiff;
            }
            
        }
        return c;
    }
}