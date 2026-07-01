class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0 ;
        int minL = Integer.MAX_VALUE ;
        int sum = 0 ;

        for(int r = 0 ; r < nums.length ; r++){
            sum += nums[r] ;
            while(sum >= target){
                minL = Math.min(minL , r - l + 1) ;
                sum = sum - nums[l] ;
                l++ ;
            }
        }
        return minL == Integer.MAX_VALUE ? 0 : minL ;
    }
}