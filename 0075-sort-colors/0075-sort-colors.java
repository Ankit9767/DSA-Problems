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

// class Solution {
//     public void sortColors(int[] nums) {
//         int l = 0 ; int mid = 0 ; int r = nums.length -1 ;

//         while(mid <= r){
//             if(nums[mid] == 0 ){
//                 swap(nums, l++, mid++);
//             }
//             else if(nums[mid] == 1){
//                 mid++ ;
//             }
//             else{
//                 swap(nums, mid , r--);
//             }
//         }
//     }

//         public void swap(int[] nums, int i, int j) {

//         int temp = nums[i];
//         nums[i] = nums[j];
//         nums[j] = temp;
//     }
// }