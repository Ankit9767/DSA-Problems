class Solution {
    public int majorityElement(int[] nums) {
        int c = 0 ; 
        int count = 0 ; 
        for(int n : nums){
            if(count == 0){
               c = n ; 
            }
            count += (n == c) ? 1 : - 1 ;
        }
        return c ;
    }
}