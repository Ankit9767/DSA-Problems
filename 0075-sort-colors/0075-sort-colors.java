class Solution {
    public void sortColors(int[] nums) {
      int l = 0 ; 
      int r = nums.length - 1 ;
      int m = 0 ;

      while(m <= r){
        if(nums[m] == 0){
          swap(nums , l++ , m++) ;
        }
        else if(nums[m] == 1){
          m++ ;
        }
        else{
          swap(nums , m , r--);
        }
      }
    }

    public void swap(int[] nums , int l , int r){
      int temp = nums[l];
      nums[l] = nums[r] ;
      nums[r] = temp ;
    }
}