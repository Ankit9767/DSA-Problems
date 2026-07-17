class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length ;

        //transpose : 
        for(int r = 0 ; r < n ; r++){
            for(int c = r + 1 ; c < n ; c++){
                int temp = matrix[r][c] ;
                matrix[r][c] = matrix[c][r] ;
                matrix[c][r] = temp ;
            }
        }

        //reverse :
        for(int r = 0 ; r < n ; r++){
            int l = 0 ;
            int ri = n - 1 ; 
            while(l < ri){
               int temp =  matrix[r][l];
                matrix[r][l] = matrix[r][ri] ;
                matrix[r][ri] = temp ;
                l++ ;
                ri-- ;
            }
        }
    }
}