class Solution {
    public int majorityElement(int[] nums) {
        int c = 0 ; 
        int count = 0 ; 
        for(int i : nums){
            if(count == 0){
               c = i ; 
            }
            count += (i == c) ? 1 : - 1 ;
        }
        return c ;
    }
}