class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        int top = 0 ; 
        int left = 0 ; 
        int right = matrix[0].length-1 ;
        int bottom = matrix.length-1 ;

        while(top <=bottom && left <= right){

            for(int l = left ; l <= right ; l++){
                res.add(matrix[top][l]);
            }
            top++ ;

            for(int t = top ; t<= bottom ; t++){
                res.add(matrix[t][right]);
            }
            right-- ;

            if(top<=bottom){
                for(int r = right ; r >= left ; r--){
                    res.add(matrix[bottom][r]);
                }
                bottom-- ;
            }

            if(left<=right){
                for(int b = bottom ; b >= top ; b--){
                    res.add(matrix[b][left]);
                }
                left++ ;
            }
        }
        return res ;
    }
}